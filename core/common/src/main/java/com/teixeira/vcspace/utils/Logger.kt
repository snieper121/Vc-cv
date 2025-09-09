package com.simple.codeeditor.utils

import android.util.Log
import com.simple.codeeditor.extensions.doIf
import com.simple.codeeditor.core.common.BuildConfig
import java.util.WeakHashMap

class Logger private constructor(private val tag: String) {
    fun d(message: String) {
        doIf(BuildConfig.DEBUG) {
            log(Priority.DEBUG, tag, message)
        }
    }

    fun d(message: String, vararg format: Any) {
        doIf(BuildConfig.DEBUG) {
            log(Priority.DEBUG, tag, String.format(message, *format))
        }
    }

    fun w(message: String) {
        log(Priority.WARNING, tag, message)
    }

    fun w(message: String, vararg format: Any) {
        log(Priority.WARNING, tag, String.format(message, *format))
    }

    fun e(message: String) {
        log(Priority.ERROR, tag, message)
    }

    fun e(message: String, vararg format: Any) {
        log(Priority.ERROR, tag, String.format(message, *format))
    }

    fun e(message: String, e: Throwable) {
        log(Priority.ERROR, tag, "$message\n${Log.getStackTraceString(e)}")
    }

    fun e(e: Throwable) {
        log(Priority.ERROR, tag, Log.getStackTraceString(e))
    }

    fun i(message: String) {
        log(Priority.INFO, tag, message)
    }

    fun i(message: String, vararg format: Any) {
        log(Priority.INFO, tag, String.format(message, *format))
    }

    fun v(message: String) {
        log(Priority.VERBOSE, tag, message)
    }

    fun v(message: String, vararg format: Any) {
        log(Priority.VERBOSE, tag, String.format(message, *format))
    }

    private fun log(priority: Priority, tag: String, message: String) {
        when (priority) {
            Priority.DEBUG -> Log.d(tag, message)
            Priority.WARNING -> Log.w(tag, message)
            Priority.ERROR -> Log.e(tag, message)
            Priority.VERBOSE -> Log.v(tag, message)
            Priority.INFO -> Log.i(tag, message)
        }
    }

    enum class Priority {
        DEBUG,
        WARNING,
        ERROR,
        INFO,
        VERBOSE,
    }

    companion object {
        private val map: MutableMap<String, Logger> = WeakHashMap()

        val newInstance: (String) -> Logger by lazy {
            { tag -> map[tag] ?: Logger(tag).also { map[tag] = it } }
        }
    }
}
