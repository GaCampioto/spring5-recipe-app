package br.com.gabriel.recipeapp.repository.reactive;

import br.com.gabriel.recipeapp.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String>{
}
