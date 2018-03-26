package com.augustbonds.cli.cli

class Command private constructor(private val name: Any, private val args: List<String>, private val flags: List<String>, private val function: (String) -> (String)) {

    fun matches(args: Array<String>): Boolean{
        if (!args.isEmpty()){
            return name == (args[0])
        }
        return false
    }

    fun evaluate(args: Array<String>) : String {
        return function(args[1])
    }

    class Builder(val name: String) {

        private val args = ArrayList<String>()
        private val flags = ArrayList<String>()
        private var function : (String) -> String = { _ -> "default"}

        fun arg(s: String): Builder {
            args.add(s)
            return this
        }

        fun flag(s: String): Builder {
            flags.add(s)
            return this
        }

        fun build(): Command {
            return Command(name, args, flags, function)
        }


        fun exec(function: (String) -> String, arg1: String): Builder {
            this.function = function
            return this
        }

        fun exec(function: (String, Boolean) -> String, arg1: String, s: String): Command.Builder {
            return this
        }
    }

}

class Cli{
    private val commands = arrayListOf<Command2>()

    fun addCommand(command: Command2) {
        commands.add(command)
    }

    fun match(args: Array<String>) : Command2 {
        for (command in commands) {
            if (match(args, command)){
                return command
            }
        }
        throw RuntimeException()
    }

    private fun match(args: Array<String>, command: Command2) : Boolean{
        return true
    }

}




class Command2(private val parts: List<String>,
               private val args: List<Arg>,
               private val flags: List<String>,
               private val flagsWithArguments: List<FlagWithArgument>){

    class Builder {
        val parts = arrayListOf<String>()
        val args = arrayListOf<Arg>()
        val flags = arrayListOf<String>()
        val flagsWithArguments = arrayListOf<FlagWithArgument>()


        fun part(arg: String) : Builder {
            parts.add(arg)
            return this
        }

        fun flag(flag: String) : Builder {
            flags.add(flag)
            return this
        }


        fun arg(arg: String, type: ArgType) : Builder {
            args.add(Arg(arg, type))
            return this
        }

        fun flagWithArgument(flag: String, type: ArgType) : Builder {
            flagsWithArguments.add(FlagWithArgument(flag, type))
            return this
        }

        fun build() : Command2 {
            return Command2(parts, args, flags, flagsWithArguments)
        }
    }

    data class FlagWithArgument(val name: String, val type: ArgType)

    data class Arg(val name: String, val type: ArgType)


}

enum class ArgType {
    STRING,
    BOOLEAN,
    INT,
    DECIMAL
}
