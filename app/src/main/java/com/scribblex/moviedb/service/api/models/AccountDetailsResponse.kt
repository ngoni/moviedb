package com.scribblex.moviedb.service.api.models

data class AccountDetailsResponse(
    val avatar: Avatar,
    val id: Int,
    val iso_639_1: String,
    val iso_3166_1: String,
    val name: String,
    val include_adult: Boolean,
    val username: String
)

data class Avatar(
    val gravatar: Gravatar
)

data class Gravatar(
    val hash: String
)