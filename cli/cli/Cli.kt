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
    }

}
