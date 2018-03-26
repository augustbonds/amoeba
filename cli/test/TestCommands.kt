package com.augustbonds.cli.test

import com.augustbonds.cli.cli.Command
import org.junit.Test
import kotlin.test.assertEquals

class TestCommands {

    @Test
    fun testStringCommand(){
        val testCommand = Command.Builder("testcommand").arg("anarg").exec({input :String -> TestMethods().methodWithOneStringArg(input)}, "anarg").build()
        val result = testCommand.evaluate(arrayOf("testCommand", "hej"))
        assertEquals("hej", result, "fail")
    }

    @Test
    fun testStringAndBooleanCommand(){
        val testCommand = Command.Builder("testcommand").arg("anarg").flag("--isTrue").exec({ aStringArg: String, aBooleanArg: Boolean -> TestMethods().methodWithOneStringAndOneBooleanArg(aStringArg, aBooleanArg) }, "anarg", "--isTrue").build()
    }

    class TestMethods {
        fun methodWithOneStringArg(aStringArg: String): String {
            return aStringArg
        }

        fun methodWithOneStringAndOneBooleanArg(aStringArg: String, aBooleanArg: Boolean) : String {
            return "$aStringArg $aBooleanArg"
        }
    }
}
