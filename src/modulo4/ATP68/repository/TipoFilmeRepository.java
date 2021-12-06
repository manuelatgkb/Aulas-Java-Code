package repository;

import com.superdevs.filmes.model.TipoFilme;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TipoFilmeRepository extends PagingAndSortingRepository<TipoFilme, Integer>{
    
}
