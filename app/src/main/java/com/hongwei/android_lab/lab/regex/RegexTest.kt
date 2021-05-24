package com.hongwei.android_lab.lab.regex

import android.util.Log
import java.lang.Exception
import java.util.regex.Pattern

class RegexTest {
    companion object {
        // Test each keyword one by one.
//        const val PatternString = "\\\$"
//        const val PatternString = "\\{"
//        const val PatternString = "\\}"
//        const val PatternString = "_"
//        const val PatternString = "-"
//        const val PatternString = "[\\w-_]+"

        const val PatternString = "\\\$\\{[\\w_-]+\\}"

        const val TestString = "Good morning! You have transferred money: -\${amount_new-ha}"
    }


    fun test() {
        try {
            val pattern = Pattern.compile(PatternString)
            val matcher = pattern.matcher(TestString)
            Log.d("bbbb", "test string: $TestString")

            while (matcher.find()) {
                val matchedItem = matcher.group()
                Log.d("bbbb", "matchedItem: $matchedItem")
            }
        } catch (e: Exception) {
            Log.d("bbbb", "exception: ${e.localizedMessage}")
            throw e
        }

    }
}