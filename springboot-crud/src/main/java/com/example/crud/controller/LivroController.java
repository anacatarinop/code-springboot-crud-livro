package com.example.crud.controller;

import com.example.crud.model.Livro;
import com.example.crud.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "http://localhost:*")
@RequestMapping("/livros")
public class LivroController {

    private final LivroRepository livroRepository;

    @Autowired
    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @GetMapping
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public List<Livro> listarLivros(@RequestParam(required = false) String autor, @RequestParam(required = false) String titulo) {
        if (autor != null && titulo != null) {
            return livroRepository.findByAutorContainingAndTituloContaining(autor, titulo);
        } else if (autor != null) {
            return livroRepository.findByAutorContaining(autor);
        } else if (titulo != null) {
            return livroRepository.findByTituloContaining(titulo);
        } else {
            return livroRepository.findAll();
        }
    }

    @PostMapping
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public Livro adicionarLivro(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    @PutMapping("/{id}")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public Livro atualizarLivro(@PathVariable UUID id, @RequestBody Livro livroAtualizado) {
        Livro livro = livroRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Livro não encontrado: " + id));
        livro.setTitulo(livroAtualizado.getTitulo());
        livro.setAutor(livroAtualizado.getAutor());
        livro.setEditora(livroAtualizado.getEditora());
        livro.setAno(livroAtualizado.getAno());
        livro.setPreco(livroAtualizado.getPreco());
        return livroRepository.save(livro);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public void removerLivro(@PathVariable UUID id) {
        livroRepository.deleteById(id);
    }
}
