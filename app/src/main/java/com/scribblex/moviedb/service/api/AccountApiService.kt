package com.scribblex.moviedb.service.api

import com.scribblex.moviedb.service.api.models.AccountDetailsResponse
import com.scribblex.moviedb.service.api.models.FavouriteMoviesResponse
import com.scribblex.moviedb.service.api.models.DefaultPostResponse
import retrofit2.Call
import retrofit2.http.*

interface AccountApiService {

    @GET("/account")
    fun getDetails(@QueryMap(encoded = true) options: Map<String, String>
    ): Call<AccountDetailsResponse>

    @GET("/account/{account_id/favorite/movies}")
    fun getFavouriteMovies(@QueryMap(encoded = true) options: Map<String, String>,
                           @Path("account_id") accountId: String
    ): Call<FavouriteMoviesResponse>

    // TODO: 2020/08/24 add headers
    @POST("/account/{account_id/favorite")
    fun markAsFavourite(@QueryMap(encoded = true) options: Map<String, String>,
                        @Path("account_id") accountId: String
    ): Call<DefaultPostResponse>

    // TODO: 2020/08/24 add headers
    @POST("/account/{account_id/watchlist")
    fun addToWatchList(@QueryMap(encoded = true) options: Map<String, String>,
                       @Path("account_id") accountId: String
    ): Call<DefaultPostResponse>
}