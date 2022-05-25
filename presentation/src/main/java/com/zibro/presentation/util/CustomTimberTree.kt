package com.zibro.presentation.util

import timber.log.Timber

//Timber.DebugTree Custom
class CustomTimberTree : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement): String {
        return "${element.className}:${element.lineNumber}#${element.methodName}"
    }
}