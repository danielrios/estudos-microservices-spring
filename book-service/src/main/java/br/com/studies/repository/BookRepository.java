package br.com.studies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.studies.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}
