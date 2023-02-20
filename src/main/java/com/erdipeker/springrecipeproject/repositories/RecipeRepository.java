package com.erdipeker.springrecipeproject.repositories;

import com.erdipeker.springrecipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
