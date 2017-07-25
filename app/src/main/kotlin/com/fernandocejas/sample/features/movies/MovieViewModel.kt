package com.fernandocejas.sample.features.movies
class MovieViewModel(movie: Movie) {
    val id = movie.id
    val title = movie.title
    val year = movie.year
    val poster = movie.poster
//    val color = Color.parseColor(movie.color)
}
