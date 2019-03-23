package com.exorfer.Codetrain

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("No Args!!!111")
        System.exit(0)
    } else
        if (args.size == 1) {
            args.forEach { println(it) }
            System.exit(1)
        }
            else
            if (args.size == 2) {
                args.forEach { println(it) }
                System.exit(2)
            }
            else {
                args.forEach { println(it) }
                System.exit(100)
            }
}