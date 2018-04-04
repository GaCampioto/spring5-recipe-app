package br.com.gabriel.recipeapp.repository.reactive;

import br.com.gabriel.recipeapp.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String>{

    Mono<Category> findByDescription(String description);
}
