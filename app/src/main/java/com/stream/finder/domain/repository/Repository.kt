package com.stream.finder.domain.repository

import com.stream.finder.Constants
import com.stream.finder.data.api.WatchModeService
import com.stream.finder.data.api.toTitle
import com.stream.finder.data.datasource.watchModeApi
import com.stream.finder.domain.Title
import okhttp3.ResponseBody
import retrofit2.Response

class Repository() {
    var apiKey=Constants.API_KEY
    private val service = watchModeApi.create(WatchModeService::class.java)

    suspend fun getReleases(): List<Title> {
        return service.getReleases(apiKey).releases.map { it.toTitle() }
    }

    suspend fun getTitleDetails(titleId: Int): Title {
        return service.getTitleDetails(titleId, apiKey).toTitle()
    }

    suspend fun getSearch(search: String): List<Title> {
        return service.getSearch(apiKey, search).results.map { it.toTitle() }
    }
}



