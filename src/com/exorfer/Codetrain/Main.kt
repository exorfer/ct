package com.exorfer.Codetrain

fun main(args: Array<String>) {
    when {
        args.isEmpty() -> {
            println("No Args!!!111")
            System.exit(0)
        }
        args.size == 1 -> {
            args.forEach { println(it) }
            System.exit(1)
        }
        args.size == 2 -> {
            args.forEach { println(it) }
            System.exit(2)
        }
        else -> {
            args.forEach { println(it) }
            System.exit(100)
        }
    }
}