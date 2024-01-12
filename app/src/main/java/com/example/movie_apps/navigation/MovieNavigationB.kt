package com.example.movie_apps.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movie_apps.screen.details.DetailsScreen
import com.example.movie_apps.screen.home.HomeScreen

@Composable
fun MovieNavigationB(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MovieNavigationA.HomeScreen.name
    ) {
        composable(MovieNavigationA.HomeScreen.name){
            HomeScreen(navController = navController)
        }
        composable(
            MovieNavigationA.DetailsScreen.name+"/{movie}",
            arguments = listOf(navArgument(name = "movie"){type = NavType.StringType})
            ){
            backStackEntry ->
            DetailsScreen(navController = navController, backStackEntry.arguments?.getString("movie"))
        }
    }
}