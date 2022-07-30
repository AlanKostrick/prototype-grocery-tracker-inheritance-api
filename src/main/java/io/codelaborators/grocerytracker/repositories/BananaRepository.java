package io.codelaborators.grocerytracker.repositories;

import io.codelaborators.grocerytracker.models.Banana;
import org.springframework.data.repository.CrudRepository;

public interface BananaRepository extends CrudRepository<Banana, Long> {
}
