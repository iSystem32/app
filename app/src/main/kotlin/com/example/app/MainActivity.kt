package com.example.app

class MainActivity {

    /**
     * A simple function to validate a Mexican RFC.
     * This is a simplified check and should be expanded for real-world use.
     */
    fun isValidRfc(rfc: String): Boolean {
        return rfc.length == 12 || rfc.length == 13
    }
}
