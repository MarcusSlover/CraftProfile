package com.marcusslover.craftprofile.manager

import java.util.*

data class Profile(
    val id: String,
    val gameDir: String,
    val created: Date,
    val icon: String,
    val javaArgs: String,
    val lastUsed: Date,
    val lastVersionId: String,
    val name: String,
    val type: String
)