package com.turtleboxgames.overworld.tests

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import java.util.*
import com.turtleboxgames.overworld.*

object UUIDSpec: Spek({
    describe("UUID extensions") {
        val uuid_str   = "dfc78d43-4cb0-46d4-8201-c00171ff383b"
        val uuid_bytes = arrayOf(0xdf, 0xc7, 0x8d, 0x43, 0x4c, 0xb0, 0x46, 0xd4, 0x82, 0x01, 0xc0, 0x01, 0x71, 0xff, 0x38, 0x3b).map { it.toByte() }.toByteArray()
        val uuid       = UUID.fromString(uuid_str)

        on("bytes") {
            val bytes = uuid.bytes()

            it("is 16 bytes long") {
                assert(bytes.size == 16)
            }

            it("contains the expected bytes") {
                assert(Arrays.equals(bytes, uuid_bytes))
            }

            it("fails") {
                assert(false)
            }
        }
    }
})