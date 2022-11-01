package com.example.composeuioptimizationprep.optimization2

import com.plcoding.external_module.ExternalUser

data class User(
    val id: String,
    val email: String,
    val username: String
)

fun ExternalUser.toUser(): User {
    return User(
        id = id,
        email = email,
        username = username
    )
}

fun User.toExternalUser(): ExternalUser {
    return ExternalUser(
        id = id,
        email = email,
        username = username
    )
}