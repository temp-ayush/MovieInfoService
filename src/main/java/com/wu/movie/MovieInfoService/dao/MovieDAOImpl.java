package com.wu.movie.MovieInfoService.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.wu.movie.MovieInfoService.entity.MovieInfo;

@Repository
public class MovieDAOImpl implements MovieDAO {

	@Override
	public MovieInfo getMovieItemByMovieId(int theMovieId) {
		// TODO Auto-generated method stub
		MovieInfo m1 = new MovieInfo(100, "Taarzan");
		MovieInfo m2 = new MovieInfo(200, "Krish");
		
		ArrayList<MovieInfo> arrayMovie = new ArrayList<MovieInfo>();
		arrayMovie.add(m1);
		arrayMovie.add(m2);
		
		for (MovieInfo movie : arrayMovie) {
            if (movie.getMovieId() == theMovieId) {
                return movie;
            }
        }
		return null;
	}

}
