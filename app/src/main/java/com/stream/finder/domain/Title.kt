package com.stream.finder.domain

data class Title(
    val id: Int,
    val title: String,
    val poster: String?,
    val plot:String?,
    val year:Int?,
    val endYear: Int?,
    val genreNames: List<String>?,
    val userRating: Double?,
    val criticScore: Int?)
