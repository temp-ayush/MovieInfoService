package com.wu.movie.MovieInfoService.dao;

import com.wu.movie.MovieInfoService.entity.MovieInfo;

public interface MovieDAO {
	public MovieInfo getMovieItemByMovieId(int theMovieId);
}
