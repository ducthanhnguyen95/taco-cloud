package tacos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tacos.entities.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{
	
	List<Ingredient> findAll();
}
