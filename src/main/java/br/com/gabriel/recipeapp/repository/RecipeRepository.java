package br.com.gabriel.recipeapp.repository;

import br.com.gabriel.recipeapp.domain.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends MongoRepository<Recipe, String> {
}
