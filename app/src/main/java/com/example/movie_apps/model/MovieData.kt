package com.example.movie_apps.model

data class MovieData(
    val id      : String,
    val title   : String,
    val year    : String,
    val genre   : String,
    val director: String,
    val actors  : String,
    val plot    : String,
    val poster  : String,
    val images  : List<String>,
    val rating  : String
) {

}
// "Avatar", "Barbie", "Oppenheimer", "Interstellar", "Martian"
fun getMovies(): List<MovieData> {
    return listOf(
        MovieData(
            id = "0001", title = "Avatar: The Way of Water", year = "2022",
            genre = "Sci-Fi", director = "James Cameroon", actors = "Rick Jaffa",

            plot = "The film follows a blue-skinned humanoid Na'vi named Jake Sully (played by Worthington) as he and his family, under renewed threat from humans, seek refuge with the Metkayina, an aquatic clan living on the habitable exomoon Pandora.",

            poster = "https://upload.wikimedia.org/wikipedia/en/5/54/Avatar_The_Way_of_Water_poster.jpg",
            images = listOf(
                "https://www.cnet.com/a/img/resize/c39d4562b00c7c9c0df7dacadf8af44234259ba2/hub/2019/01/11/b251bf04-5bf8-469a-be8d-79489551460b/avatar-2009.jpg?auto=webp&fit=crop&height=236&width=420",
                "https://static01.nyt.com/images/2022/12/14/multimedia/14avatar1-1-6cf3/14avatar1-1-6cf3-mobileMasterAt3x-v3.jpg?quality=75&auto=webp&disable=upscale&width=1200",
                ),
            rating = "7.6/10"
        ),

        MovieData(
            id = "0002", title = "Barbie", year = "2023",
            genre = "Comedy", director = "Greta Gerwig", actors = "Margot Robbie",
            plot = "Stereotypical Barbie and fellow dolls reside in Barbieland, a matriarchal society populated by different versions of Barbies, Kens, and a group of discontinued models, who are treated like outcasts due to their unconventional traits. While the Kens spend their days playing at the beach, considering it their profession, the Barbies hold prestigious jobs such as doctor, lawyer, and politician. Beach Ken (\"Ken\") is only happy when he is with Barbie, and seeks a closer relationship, but she rebuffs him in favor of other activities and female friendships.",

            poster = "https://upload.wikimedia.org/wikipedia/en/0/0b/Barbie_2023_poster.jpg",
            images = listOf(
                "https://girlsbeyond.com/wp-content/uploads/2023/07/barbie-movie-review-world-first-out-ryan-gosling-steals-the-show-margot-robbie-is-a-mystery-film-has-shades-of-clueless-legally-blonde-1140x599.jpg",
                "https://media.vogue.co.uk/photos/64130ed6b969888aada448cb/1:1/w_960,c_limit/rev-1-BARBIE-TP-0002_High_Res_JPEG.jpeg"
            ),
            rating = "6.9/10"
        ),

        MovieData(
            id = "0003", title = "Oppenheimer", year = "2023",
            genre = "Thriller", director = "Christopher Nolan", actors = "Cillian Murphy",
            plot = "In 1926, 22-year-old doctoral student J. Robert Oppenheimer grapples with anxiety and homesickness while studying under experimental physicist Patrick Blackett at the Cavendish Laboratory in Cambridge. Upset with the demanding Blackett, Oppenheimer leaves him a poisoned apple but later retrieves it. Visiting scientist Niels Bohr recommends that Oppenheimer instead study theoretical physics at Göttingen.",

            poster = "https://upload.wikimedia.org/wikipedia/en/4/4a/Oppenheimer_%28film%29.jpg",
            images = listOf(
                "https://media.wired.com/photos/64bae9eedaed59ebbf460ca6/master/w_960,c_limit/Oppenheimer-and-the-Dharma-of-Death-Culture.jpg",
                "https://bloximages.newyork1.vip.townnews.com/stltoday.com/content/tncms/assets/v3/editorial/f/9c/f9c9317e-264e-11ee-9c17-7ba5b6adad83/64b80b497d34e.image.jpg?resize=1200%2C840"
            ),
            rating = "8.4/10"
        ),

        MovieData(
            id = "0004", title = "Interstellar", year = "2014",
            genre = "Sci-Fi", director = "Christopher Nolan", actors = "Matthew McConaughey",
            plot = "In 2067, humanity is facing extinction following a global famine caused by ecocide. Cooper's family, which includes his children, Tom and Murph, and his father-in-law Donald, survive by pursuing farming, much like most of humanity. One evening after a dust storm, Cooper discovers a gravitational anomaly inside Murph's bedroom, which creates patterns of falling particles. The pattern resolves into GPS coordinates, which leads Cooper and Murph to a secret NASA facility.",

            poster = "https://upload.wikimedia.org/wikipedia/en/b/bc/Interstellar_film_poster.jpg",
            images = listOf(
                "https://nypost.com/wp-content/uploads/sites/2/2014/10/film-interstellar-1.jpg?resize=1064,709&quality=75&strip=all",
                "https://thesuffolkjournal.com/wp-content/uploads/2014/11/Interstellar2.jpg"
            ),
            rating = "8.7/10"
        ),

        MovieData(
            id = "0005", title = "The Martian", year = "2015",
            genre = "Sci-Fi", director = "Ridley Scott", actors = "Matt Damon",
            plot = "In 2035, the crew of the Ares III mission to Mars is exploring Acidalia Planitia on Martian solar day (sol) 18 of their 31-sol expedition. A severe dust storm threatens to topple their Mars Ascent Vehicle (MAV). The mission is abandoned, but as the crew evacuates, astronaut Mark Watney is struck by debris. The telemetry from his suit's bio-monitor is damaged, and Watney is erroneously presumed dead. With the MAV on the verge of toppling, the remaining crew takes off for their orbiting vessel, the Hermes, leaving Watney behind.",

            poster = "https://upload.wikimedia.org/wikipedia/en/c/cd/The_Martian_film_poster.jpg",
            images = listOf(
                "https://media.newyorker.com/photos/5909711cebe912338a377172/master/w_960,c_limit/Brody-The-Martian.jpg",
                "https://cdn.theatlantic.com/thumbor/o5E7gzTiBXVbBnFLesnxmSElXUs=/445x99:4405x2326/976x549/media/img/mt/2015/10/the_martian/original.jpg"
            ),
            rating = "8.0/10"
        ),

        MovieData(
            id = "0006", title = "SpiderMan: Across The Spider-Verse", year = "2023",
            genre = "Action/Comedy", director = "Joaquim Dos Santos", actors = "Shameik Moore",
            plot = "On Earth-65, police captain George Stacy is unaware that his daughter Gwen Stacy is Spider-Woman, who the police believe to be a murderer. One night, Gwen encounters a version of the Vulture from an Italian Renaissance–themed alternate universe. Miguel O'Hara and Jess Drew arrive using portal-generating watches and help Gwen neutralize the Vulture. George corners Gwen, who then reveals her identity to him; distraught, he attempts to arrest her. Miguel reluctantly grants Gwen membership into the Spider-Society, allowing her to escape with him and Jess.",

            poster = "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
            images = listOf(
                "https://martinishot898224135.files.wordpress.com/2023/06/1317118-1.jpeg?w=1024&h=666&crop=1",
                "https://hips.hearstapps.com/hmg-prod/images/spider-man-across-the-spiderverse-1670500626.jpg?crop=0.7447916666666666xw:1xh;center,top&resize=1024:*"
            ),
            rating = "8.6/10"
        ),

        MovieData(
            id = "0007", title = "Nimona", year = "2023",
            genre = "Fantasy", director = "Nick Bruno", actors = "Chloe Grace Moretz",
            plot = "The citizens of a medieval-futuristic kingdom are protected by the Institute for Elite Knights, established by the legendary heroine Gloreth. A thousand years ago, Gloreth vanquished a \"Great Black Monster\" and enclosed the kingdom with a high wall.",

            poster = "https://upload.wikimedia.org/wikipedia/en/f/f5/Nimona_poster.png",
            images = listOf(
                "https://www.themarysue.com/wp-content/uploads/2023/06/Nimona-introduces-herself-to-Ballister-Netflix.jpeg?w=1200&resize=1600%2C900",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-JP4r8TRMICiU47EyOqUBwLb9znZe38T5LQ&usqp=CAU"
            ),
            rating = "7.6/10"
        )
    )
}
