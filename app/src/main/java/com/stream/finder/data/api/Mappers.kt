package com.stream.finder.data.api

import br.com.cesarsicas.watchmode.data.model.ReleaseSuccessResponse
import br.com.cesarsicas.watchmode.data.model.SearchSuccessResponse
import br.com.cesarsicas.watchmode.data.model.TitleDetailsSuccessResponse
import com.stream.finder.domain.Title


fun ReleaseSuccessResponse.Release.toTitle(): Title {
    return Title(
        id = id,
        title = title,
        poster = poster_url,
        plot = null,
        year = null,
        endYear = null,
        genreNames = null,
        userRating = null,
        criticScore = null
    )
}


fun TitleDetailsSuccessResponse.toTitle(): Title {
    return Title(
        id = id,
        title = title,
        poster = poster,
        plot = plot_overview,
        year = year,
        endYear = end_year,
        genreNames = genre_names,
        userRating = user_rating,
        criticScore = critic_score
    )
}

fun SearchSuccessResponse.Result.toTitle(): Title {
    return Title(
        id = id,
        title = name,
        poster = image_url,
        plot = null,
        year = null,
        endYear = null,
        genreNames = null,
        userRating = null,
        criticScore = null
    )
}


