package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class MyUnitTest {

    @Test
    fun testCompareValuesEqual() {
        val result = compareValues("hello", "hello")
        assertEquals("Los valores son iguales", result)
    }

    @Test
    fun testCompareValuesDifferent() {
        val result = compareValues("hello", "world")
        assertEquals("Los valores son diferentes", result)
    }
}
