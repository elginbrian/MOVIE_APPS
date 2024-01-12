package com.example.movie_apps.screen.home

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
//import com.example.movie_apps.MovieRow
import com.example.movie_apps.model.MovieData
import com.example.movie_apps.model.getMovies
import com.example.movie_apps.navigation.MovieNavigationA
import com.example.movie_apps.widgets.MovieRow

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                        Text(text = "MOVIE APPS", color = androidx.compose.ui.graphics.Color.White, fontWeight = FontWeight(500))
                        },
                colors = TopAppBarDefaults.largeTopAppBarColors(containerColor = MaterialTheme.colorScheme.primary)
            )
        },
        content = { MainContent(navController = navController) }
    )
}

@Composable
fun MainContent(
    navController: NavController,
    movieList: List<MovieData> = getMovies()
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 65.dp, start = 15.dp, end = 15.dp, bottom = 0.dp)
            ){
                items(items = movieList){
                    MovieRow(movie = it){ movie ->
                        navController.navigate(route = MovieNavigationA.DetailsScreen.name+"/$movie")
                    }
                }
            }
        }
    }
}
