package net.magbdigital.sudapractic.util

import java.security.MessageDigest
import javax.xml.bind.DatatypeConverter

class EncryptPassword {

    fun sha1(input: String) = hashString("SHA-1", input)
    fun md5(input: String) = hashString("MD5", input)

    private fun hashString(type: String, input: String): String {
        val bytes = MessageDigest
                .getInstance(type)
                .digest(input.toByteArray())
        return DatatypeConverter.printHexBinary(bytes).toUpperCase()
    }
}