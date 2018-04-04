package br.com.gabriel.recipeapp.service;

import br.com.gabriel.recipeapp.domain.Recipe;
import br.com.gabriel.recipeapp.repository.reactive.RecipeReactiveRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class RecipeService {

    private RecipeReactiveRepository recipeReactiveRepository;

    public RecipeService(RecipeReactiveRepository recipeReactiveRepository) {
        this.recipeReactiveRepository = recipeReactiveRepository;
    }

    public Flux<Recipe> findAllRecipes() {
        return recipeReactiveRepository.findAll();
    }
}
