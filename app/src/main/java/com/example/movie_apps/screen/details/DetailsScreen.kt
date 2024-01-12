package com.example.movie_apps.screen.details

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.movie_apps.model.getMovies
import com.example.movie_apps.navigation.MovieNavigationA
import com.example.movie_apps.widgets.MovieRow

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController, id: String?){
    val newMovieList = getMovies().filter { movieData -> movieData.id == id }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(15.dp),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = Modifier.clickable { navController.navigate(route = MovieNavigationA.HomeScreen.name) },
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                        Spacer(modifier = Modifier.padding(5.dp))
                        Text(text = "MOVIE APPS", color = Color.White, fontWeight = FontWeight(500))
                    }
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(containerColor = MaterialTheme.colorScheme.primary)
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp)
                    .padding(top = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(top = 20.dp),
                    verticalArrangement = Arrangement.Top
                ) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        shape = RoundedCornerShape(15.dp),
                        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 10.dp)
                    ){
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(10.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                modifier = Modifier
                                    .width(80.dp)
                                    .height(100.dp),
                                shape = RoundedCornerShape(15.dp),
                                shadowElevation = 5.dp
                            ) {
                                Image(contentScale = ContentScale.FillBounds,painter = rememberImagePainter(data = newMovieList[0].poster), contentDescription = newMovieList[0].title)
                                //Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = MaterialTheme.colorScheme.primary)
                            }
                            Spacer(modifier = Modifier.padding(10.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .width(220.dp),
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = newMovieList[0].title, fontSize = 20.sp, fontWeight = FontWeight(500))
                                Spacer(modifier = Modifier.padding(3.dp))
                                Text(text = "${newMovieList[0].year} - Rating: ${newMovieList[0].rating}", fontSize = 14.sp, fontWeight = FontWeight(500))
                            }
                        }
                    }

                    Spacer(modifier = Modifier.padding(5.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                        ,
                        shape = RoundedCornerShape(15.dp),
                        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 10.dp),
                        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.secondary)
                    ){
                        Column(
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .padding(20.dp),
                            horizontalAlignment = Alignment.Start,
                            verticalArrangement = Arrangement.Top
                        ) {
                            Text(text = "Director: ${newMovieList[0].director}", fontSize = 18.sp, fontWeight = FontWeight(500))
                            Text(text = "Main Actors: ${newMovieList[0].actors}", fontSize = 18.sp, fontWeight = FontWeight(500))
                            Spacer(modifier = Modifier.padding(8.dp))
                            Text(text = "${newMovieList[0].plot}", fontSize = 12.sp, fontWeight = FontWeight(450), maxLines = 7, lineHeight = 15.sp, textAlign = TextAlign.Justify)
                            Spacer(modifier = Modifier.padding(8.dp))
                            Text(text = "Genre: ${newMovieList[0].genre}", fontSize = 15.sp, fontWeight = FontWeight(500))
                        }
                    }

                    Spacer(modifier = Modifier.padding(5.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(160.dp),
                        shape = RoundedCornerShape(15.dp),
                        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 10.dp),
                        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.secondary)
                    ){
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(10.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                modifier = Modifier
                                    .width(160.dp)
                                    .height(130.dp),
                                shape = RoundedCornerShape(15.dp),
                                shadowElevation = 5.dp
                            ) {
                                Image(contentScale = ContentScale.Crop,painter = rememberImagePainter(data = newMovieList[0].images[0]), contentDescription = newMovieList[0].title)
                            }
                            Spacer(modifier = Modifier.padding(5.dp))
                            Surface(
                                modifier = Modifier
                                    .width(160.dp)
                                    .height(130.dp),
                                shape = RoundedCornerShape(15.dp),
                                shadowElevation = 5.dp
                            ) {
                                Image(contentScale = ContentScale.Crop,painter = rememberImagePainter(data = newMovieList[0].images[1]), contentDescription = newMovieList[0].title)
                            }
                        }
                    }
                }
            }
        }
    )
}

