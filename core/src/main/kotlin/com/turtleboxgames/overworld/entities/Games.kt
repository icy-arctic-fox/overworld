package com.turtleboxgames.overworld.entities

import org.jetbrains.exposed.dao.*

/**
 * Table containing information about known games.
 */
object Games : IntIdTable("games") {
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