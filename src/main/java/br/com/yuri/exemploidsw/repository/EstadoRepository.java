package br.com.yuri.exemploidsw.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.yuri.exemploidsw.entidades.Estado;
import jakarta.transaction.Transactional;



@RepositoryRestResource( collectionResourceRel = "estados", path = "estados" )
@Transactional
public interface EstadoRepository extends JpaRepository<Estado, Long> {
  
  Page<Estado> findById( @Param( "id" ) Long id, Pageable pageable );
  Page<Estado> findByNomeContaining( @Param( "nome" ) String nome, Pageable pageable );
  Page<Estado> findBySiglaContaining( @Param( "sigla" ) String sigla, Pageable pageable);
}
