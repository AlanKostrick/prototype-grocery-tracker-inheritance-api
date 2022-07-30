package io.codelaborators.grocerytracker.repositories;

import io.codelaborators.grocerytracker.models.Perishable;
import org.springframework.data.repository.CrudRepository;

public interface PerishableRepository extends CrudRepository<Perishable, Long> {
}
