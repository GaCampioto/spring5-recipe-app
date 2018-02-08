package br.com.gabriel.recipeapp.controller;

import br.com.gabriel.recipeapp.domain.Recipe;
import br.com.gabriel.recipeapp.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndex(Model model) {
        List<Recipe> allRecipes = recipeService.findAllRecipes();
        model.addAttribute("recipes", allRecipes);
        return "index";
    }
}
