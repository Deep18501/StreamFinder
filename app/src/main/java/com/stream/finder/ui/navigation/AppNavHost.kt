package com.stream.finder.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.navOptions
import br.com.cesarsicas.watchmode.presentation.navigation.favoritesScreen
import br.com.cesarsicas.watchmode.presentation.navigation.favoritesScreenRoute
import br.com.cesarsicas.watchmode.presentation.navigation.navigateToFavoritesScreen
import br.com.cesarsicas.watchmode.presentation.navigation.navigateToReleasesList
import br.com.cesarsicas.watchmode.presentation.navigation.navigateToSearchScreen
import br.com.cesarsicas.watchmode.presentation.navigation.navigateToTitleDetails
import br.com.cesarsicas.watchmode.presentation.navigation.releasesListNavigationRoutes
import br.com.cesarsicas.watchmode.presentation.navigation.releasesListScreen
import br.com.cesarsicas.watchmode.presentation.navigation.searchScreen
import br.com.cesarsicas.watchmode.presentation.navigation.searchScreenRoute
import br.com.cesarsicas.watchmode.presentation.navigation.titleDetailsScreen
import com.stream.finder.ui.components.BottomAppBarItem


@Composable
fun AppNavHost(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = releasesListNavigationRoutes
    ) {

        releasesListScreen(
            onMovieClick = {
                navController.navigateToTitleDetails(it.id)
            }
        )

        searchScreen(){
            navController.navigateToTitleDetails(it.id)
        }

        favoritesScreen()

        titleDetailsScreen(){
            //navController.popBackStack()
        }

    }

}


fun NavController.navigateSingleTopWithPopUpTo(
    item: BottomAppBarItem
) {
    val (route, navigate) = when (item) {
        BottomAppBarItem.Releases -> Pair(
            releasesListNavigationRoutes,
            ::navigateToReleasesList
        )

        BottomAppBarItem.Search -> Pair(
            searchScreenRoute,
            ::navigateToSearchScreen
        )

        BottomAppBarItem.Favorites -> Pair(
            favoritesScreenRoute,
            ::navigateToFavoritesScreen
        )
    }

    val navOptions = navOptions {
        launchSingleTop = true
        popUpTo(route)
    }
    navigate(navOptions)
}