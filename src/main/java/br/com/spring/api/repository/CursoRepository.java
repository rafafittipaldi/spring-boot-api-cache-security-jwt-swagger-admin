package br.com.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.api.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);
}
