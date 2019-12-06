package com.movieservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movieservices.domain.MovieInfo;



@Repository
public interface MovieInfoRepository extends JpaRepository<MovieInfo,Integer>{

}
