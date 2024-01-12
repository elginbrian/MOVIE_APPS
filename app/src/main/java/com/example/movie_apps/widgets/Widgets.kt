package com.example.movie_apps.widgets

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
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.movie_apps.model.MovieData
import com.example.movie_apps.model.getMovies

@Preview
@Composable
fun MovieRow(movie: MovieData = getMovies()[0], whenItemClicked: (String) -> Unit = {}){
    var expanded = remember {
        mutableStateOf(true)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(
                if (expanded.value == true) {
                    300.dp
                } else {
                    150.dp
                }
            )
            .padding(top = 20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .clickable {
                    whenItemClicked(movie.id)
                },
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
                    Image(contentScale = ContentScale.FillBounds,painter = rememberImagePainter(data = movie.poster), contentDescription = movie.title)
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
                    Text(text = movie.title, fontSize = 20.sp, fontWeight = FontWeight(500))
                    Spacer(modifier = Modifier.padding(3.dp))
                    Text(text = "${movie.year} - Rating: ${movie.rating}", fontSize = 14.sp, fontWeight = FontWeight(500))
                }
                Icon(
                    modifier = Modifier
                        .size(40.dp)
                        .clickable { expanded.value = !expanded.value },
                    imageVector =
                        if (expanded.value == false) {
                            Icons.Default.KeyboardArrowDown
                        } else {
                            Icons.Default.KeyboardArrowUp
                        },
                    contentDescription = "Down Arrow"
                )
            }
        }
        if (expanded.value == true){
            Spacer(modifier = Modifier.padding(5.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(138.dp)
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
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Director: ${movie.director}", fontSize = 15.sp, fontWeight = FontWeight(500))
                    Spacer(modifier = Modifier.padding(3.dp))
                    Text(text = "${movie.plot}", fontSize = 12.sp, fontWeight = FontWeight(500), maxLines = 3, lineHeight = 13.sp)
                }
            }
        }
    }
}

