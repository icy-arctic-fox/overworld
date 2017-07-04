package com.turtleboxgames.overworld

import java.nio.ByteBuffer
import java.util.UUID
import java.util.Base64

/**
 * Generates an array of bytes containing the UUID value.
 * @return UUID bytes.
 */
fun UUID.bytes(): ByteArray {
    val buffer = ByteBuffer.wrap(ByteArray(16))
    buffer.putLong(this.mostSignificantBits)
    buffer.putLong(this.leastSignificantBits)
    return buffer.array()
}

/**
 * Computes the base-64 representation of the UUID.
 * The string will be in a URL-safe format with the padding removed.
 * @return UUID in base-64.
 */
fun UUID.base64(): String {
    val encoder = Base64.getUrlEncoder()
    return encoder.encodeToString(this.bytes()).dropLast(2)
}

/**
 * Extracts a UUID from a base-64 formatted string.
 * The string should be the same format produced by @see UUID.base64.
 * @return Parsed UUID.
 */
fun String.getBase64UUID(): UUID {
    val bytes = Base64.getUrlDecoder().decode(this)
    return UUID.nameUUIDFromBytes(bytes)
}