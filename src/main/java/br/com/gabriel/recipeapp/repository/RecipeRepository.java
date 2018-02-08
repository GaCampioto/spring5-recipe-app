package br.com.gabriel.recipeapp.repository;

import br.com.gabriel.recipeapp.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{
}
