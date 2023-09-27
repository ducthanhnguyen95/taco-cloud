package tacos.components;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import tacos.entities.Ingredient;
import tacos.repositories.IngredientRepository;

@Component
@RequiredArgsConstructor
public class IngredientByIdConverter implements Converter<String, Ingredient> {

	private final IngredientRepository ingredientRepository;

	@Override
	public Ingredient convert(String id) {
		return ingredientRepository.findById(id).orElse(null);

	}

}
