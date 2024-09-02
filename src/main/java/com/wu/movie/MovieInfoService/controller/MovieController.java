package com.wu.movie.MovieInfoService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wu.movie.MovieInfoService.dao.MovieDAO;
import com.wu.movie.MovieInfoService.entity.MovieInfo;



@RestController
@RequestMapping("/movie")
public class MovieController {
	
	private MovieDAO movieDao;
	public MovieController(MovieDAO theMovieDao) {
		this.movieDao = theMovieDao;
	}
	
	@GetMapping("/movieinfo/{theMovieId}")
	public MovieInfo getMovieItemByMovieId(@PathVariable int theMovieId) {
		return movieDao.getMovieItemByMovieId(theMovieId);
	}
}
