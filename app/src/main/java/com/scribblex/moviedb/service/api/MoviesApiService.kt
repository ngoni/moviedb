package com.scribblex.moviedb.service.api

import com.scribblex.moviedb.service.api.models.MovieDetailsResponse
import com.scribblex.moviedb.service.api.models.PopularMoviesResponse
import com.scribblex.moviedb.service.api.models.SimilarMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MoviesApiService {

    @GET("/movie/{movie_id}/similar")
    fun getSimilar(
        @Query("api_key") apiKey: String,
        @Path("movie_id") movieId: String
    ): Call<SimilarMoviesResponse>

    @GET("/movie/popular")
    fun getPopular(
        @Query("api_key") apiKey: String
    ): Call<PopularMoviesResponse>

    @GET("/movie/{movie_id}")
    fun getDetails(
        @Query("api_key") apiKey: String,
        @Path("movie_id") movieId: String
    ): Call<MovieDetailsResponse>

}