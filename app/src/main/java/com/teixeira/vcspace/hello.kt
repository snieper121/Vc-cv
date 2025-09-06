package com.simple.codeeditor

import java.io.File

fun hello() {
    println("Hello, World!")

    File("").apply {
        writeText("")
    }
}
