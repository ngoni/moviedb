package com.scribblex.moviedb.service.api.models

data class FavouriteMoviesResponse(
    val page: Int,
    val results: List<Results>,
    val total_pages: Int,
    val total_results: Int
)