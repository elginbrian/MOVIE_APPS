package com.example.movie_apps.navigation

import java.lang.IllegalArgumentException

enum class MovieNavigationA {
    HomeScreen,
    DetailsScreen;
    companion object {
        fun fromRoute(route: String?): MovieNavigationA
        = when(route?.substringBefore("/")){
            HomeScreen.name  -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}