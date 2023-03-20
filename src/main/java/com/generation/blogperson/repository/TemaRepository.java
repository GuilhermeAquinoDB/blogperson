package com.generation.blogperson.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogperson.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	
}
