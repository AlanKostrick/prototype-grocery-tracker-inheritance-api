package io.codelaborators.grocerytracker.repositories;

import io.codelaborators.grocerytracker.models.Apple;
import org.springframework.data.repository.CrudRepository;

public interface AppleRepository extends CrudRepository<Apple, Long> {
}
