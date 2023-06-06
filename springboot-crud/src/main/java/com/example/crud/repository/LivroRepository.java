package com.example.crud.repository;

import com.example.crud.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LivroRepository extends JpaRepository<Livro, UUID> {

    List<Livro> findByAutorContainingAndTituloContaining(String autor, String titulo);

    List<Livro> findByAutorContaining(String autor);

    List<Livro> findByTituloContaining(String titulo);
}
