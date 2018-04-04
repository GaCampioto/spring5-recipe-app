package br.com.gabriel.recipeapp.repository;

import br.com.gabriel.recipeapp.domain.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
    Optional<Category> findByDescription(String description);
}