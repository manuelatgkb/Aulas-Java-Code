package com.capgemnini.manu.Filmes.repository;

import java.util.List;

import com.capgemnini.manu.Filmes.model.Filme;

import org.springframework.data.repository.PagingAndSortingRepository;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public interface FilmeRepository extends PagingAndSortingRepository<Filme, Integer>{
   @Override
    default Iterable<Filme> findAll(){
        return findAll( Sort.by(Sort.by.Direction.ASC, "id"));
}
    List<Filme> FindByNome(String nome);

}
