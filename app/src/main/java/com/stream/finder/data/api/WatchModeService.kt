package com.stream.finder.data.api

import br.com.cesarsicas.watchmode.data.model.ReleaseSuccessResponse
import br.com.cesarsicas.watchmode.data.model.SearchSuccessResponse
import br.com.cesarsicas.watchmode.data.model.TitleDetailsSuccessResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WatchModeService {

    @GET("releases/")
    suspend fun getReleases(
        @Query("apiKey") apiKey: String
    ): ReleaseSuccessResponse


    @GET("title/{titleId}/details/")
    suspend fun getTitleDetails(
        @Path("titleId") titleId: Int,
        @Query("apiKey") apiKey: String
    ): TitleDetailsSuccessResponse

    @GET("autocomplete-search/")
    suspend fun getSearch(
        @Query("apiKey") apiKey: String,
        @Query("search_value") searchValue: String,
        @Query("search_type") searchType: Int = 2
    ): SearchSuccessResponse

}