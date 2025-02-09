package br.com.cesarsicas.watchmode.presentation.screens

import androidx.compose.runtime.Composable

import br.com.cesarsicas.watchmode.presentation.components.MovieGrid
import br.com.cesarsicas.watchmode.presentation.uistate.ReleasesUiState
import com.stream.finder.domain.Title


@Composable
fun ReleasesScreen(
    uiState: ReleasesUiState,
    onMovieClick: (Title) -> Unit = {}
) {
    MovieGrid(
        uiState.releases,
        onMovieClick = onMovieClick
    )

}



