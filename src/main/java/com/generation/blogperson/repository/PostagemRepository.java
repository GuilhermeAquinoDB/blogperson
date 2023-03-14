package com.generation.blogperson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogperson.model.Postagem;

@Repository
public interface PostagemRepository  extends JpaRepository<Postagem, Long> {

}
