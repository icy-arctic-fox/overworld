package com.turtleboxgames.overworld.entities

import org.jetbrains.exposed.dao.*
import java.util.*

/**
 * Table containing information about known games.
 */
object Games : IdTable<UUID>("games") {
    /**
     * Unique ID of the game.
     */
    override val id = uuid("id").clientDefault { UUID.randomUUID() }.entityId()

    /**
     * Display name of the game.
     */
    val name = varchar("name", 50).index(true)

    /**
     * Brief description of what the game is.
     */
    val description = varchar("description", 250)

    /**
     * Feature flag indicating whether the game is supported.
     */
    val enabled = bool("enabled").default(false)
}