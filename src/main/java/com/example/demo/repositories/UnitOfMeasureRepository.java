package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

	Optional<UnitOfMeasure> findByDescription(String description);
}
