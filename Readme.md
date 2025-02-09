\# Android App with Jetpack Compose, Navigation, and Watchmode API




## Table of Contents

* [Features](#features)
* [Technologies Used](#technologies-used)
* [Getting Started](#getting-started)
* [Watchmode token](#watchmode-token)
* [Architecture](#architecture)
* [Navigation](#navigation)
* [API Consumption](#api-consumption)



## Features

* Displays a list of popular movies using data fetched from the Watchmode API.
* Allows users to click on a movie poster to view details about the movie.
* Implements proper navigation between screens using the Navigation component.

## Technologies Used

* **Jetpack Compose:** A modern toolkit for building native Android UI.
* **Navigation component:** Provides a framework for navigating between composables.
* **Watchmode API:** Provides data about movies and TV shows.



## Watchmode token
It's necessary to create your own personal token on Watchmode API:

1. Go to the Watchmode API website: https://api.watchmode. com/
2. Click on the "Sign Up" button.
3. Enter your email address and create a password.
4. Click on the "Create Account" button.
5. Once your account is created, you will be redirected to the dashboard, where you be able to create the Token.
6. Use your personal token to replace in the file **com.stream.finder.Constants**


## Architecture

The app follows the Model-View-ViewModel (MVVM) architectural pattern.

## Navigation

The app uses the Navigation component to navigate between screens. The `NavHost` composable is used to define the navigation graph. The `MainViewModel` class provides the navigation actions that are used to navigate between screens.

## API Consumption

The app uses the `watchModeApi` object to fetch data from the Watchmode API. The `MovieRepository` class uses the `watchModeApi` object to make network requests and retrieve movie data.
