package com.capgemnini.manu.Filmes.repository;

import com.capgemnini.manu.Filmes.model.Serie;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface GeneroRepository extends PagingAndSortingRepository<Serie, Integer>{
    
}
