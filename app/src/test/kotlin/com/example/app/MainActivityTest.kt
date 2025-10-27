package com.example.app

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MainActivityTest {

    private val mainActivity = MainActivity()

    @Test
    fun `isValidRfc should return true for a valid 12-character RFC`() {
        assertTrue(mainActivity.isValidRfc("AOHH9803252Q5"))
    }

    @Test
    fun `isValidRfc should return true for a valid 13-character RFC`() {
        assertTrue(mainActivity.isValidRfc("AOHH9803252Q5"))
    }

    @Test
    fun `isValidRfc should return false for an invalid RFC`() {
        assertFalse(mainActivity.isValidRfc("INVALID"))
    }
}
