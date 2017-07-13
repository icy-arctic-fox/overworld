package com.turtleboxgames.overworld

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import com.natpryce.hamkrest.*
import com.natpryce.hamkrest.assertion.*
import java.util.*

object UUIDSpec: Spek({
    describe("UUID extensions") {
        val uuid_str   = "dfc78d43-4cb0-46d4-8201-c00171ff383b"
        val uuid_str64 = "38eNQ0ywRtSCAcABcf84Ow"
        val uuid_bytes = byteArrayOf(-33, -57, -115, 67, 76, -80, 70, -44, -126, 1, -64, 1, 113, -1, 56, 59)
        val uuid       = UUID.fromString(uuid_str)

        on("bytes") {
            val bytes = uuid.bytes()

            it("is 16 bytes long") {
                assert.that(bytes.size, equalTo(16))
            }

            it("contains the expected bytes") {
                assert.that(Arrays.equals(bytes, uuid_bytes), equalTo(true))
            }
        }

        on("base64") {
            val str = uuid.base64()

            it("is 22 characters") {
                assert.that(str, has(String::length, equalTo(22)))
            }

            it("contains the expected value") {
                assert.that(str, equalTo(uuid_str64))
            }
        }

        on("getBase64UUID") {
            val ret = uuid_str64.getBase64UUID()

            it("returns the expected value") {
                assert.that(ret, equalTo(uuid))
            }
        }
    }
})