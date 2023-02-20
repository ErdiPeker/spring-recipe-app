package com.erdipeker.springrecipeproject.repositories;

import com.erdipeker.springrecipeproject.domain.Category;
import com.erdipeker.springrecipeproject.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
