package com.scribblex.moviedb.service.api.models

// TODO: 2020/08/24 use jackson to annotate object properties

data class PopularMoviesResponse(
    val page: Int,
    val total_results: Int,
    val total_pages: Int,
    val results: List<Results>
)