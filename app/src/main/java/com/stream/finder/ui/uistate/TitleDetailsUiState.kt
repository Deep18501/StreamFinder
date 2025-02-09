package br.com.cesarsicas.watchmode.presentation.uistate

import com.stream.finder.domain.Title

data class TitleDetailsUiState(
    val title: Title? = null,
    val isLoading: Boolean = false,
    val error: String? = null

)