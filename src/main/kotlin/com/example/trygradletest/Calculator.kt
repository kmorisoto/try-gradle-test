package com.example.trygradletest

class Calculator {
    fun add(a: Int, b: Int): Int = a + b

    fun div(a: Int, b: Int): Double {
        assert(b != 0) { "Division by Zero" }
        return a / b * 1.0
    }
}
