package br.com.gabriel.recipeapp.repository;

import br.com.gabriel.recipeapp.domain.Category;
import br.com.gabriel.recipeapp.domain.UnitOfMeasure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    Optional<Category> findByDescription(String description);
}
