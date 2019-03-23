@file:Suppress("IMPLICIT_CAST_TO_ANY")

package com.exorfer.Codetrain

fun main(args: Array<String>) {
    val status = when (args.size){
        0 -> getStatus(0, {println("No args!!!")})
        1 -> getStatus(1, {})
        2 -> getStatus(2, {})
        else -> getStatus(100,{ args.forEach { println(it) } })
    }
    System.exit(status);
}

fun getStatus(status: Int, callback: () -> Unit): Int {
    callback()
    return status
}