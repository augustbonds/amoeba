package com.augustbonds.cli.test

import com.augustbonds.cli.cli.Command
import org.junit.Test
import kotlin.test.assertEquals

class TestCommands {

    @Test
    fun testCommands(){
        val testCommand = Command.Builder("testcommand").arg("anarg").exec({input :String -> TestMethods().methodWithOneStringArg(input)}, "anarg").build()
        val result = testCommand.evaluate(arrayOf("testCommand", "hej"))
        assertEquals("hej", result, "fail")
    }

    class TestMethods {
        fun methodWithOneStringArg(aStringArg: String): String {
            return aStringArg
        }
    }
}
