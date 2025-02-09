package br.com.cesarsicas.watchmode.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.cesarsicas.watchmode.presentation.components.MoviesVerticalList
import br.com.cesarsicas.watchmode.presentation.components.SearchTextField
import br.com.cesarsicas.watchmode.presentation.uistate.SearchUiState
import com.stream.finder.domain.Title

@Composable
fun SearchScreen(
    uiState: SearchUiState,
    onTitleClick: (Title) -> Unit,
) {
    val text = uiState.searchText
    val searchResult = uiState.result

    Column {

        SearchTextField(
            searchText = text,
            onSearchChange = uiState.onSearchChange,
            Modifier
                .padding(16.dp)
                .fillMaxWidth(),
        )

        MoviesVerticalList(titles = searchResult, onTitleClick)
    }


}


@Preview(showBackground = true)
@Composable
private fun SearchScreenPreview() {
    SearchScreen(SearchUiState()){}
}







