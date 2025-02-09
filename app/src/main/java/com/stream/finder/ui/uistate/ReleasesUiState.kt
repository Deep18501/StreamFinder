package br.com.cesarsicas.watchmode.presentation.uistate

import com.stream.finder.domain.Title


data class ReleasesUiState(
    val releases: List<Title> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null

)