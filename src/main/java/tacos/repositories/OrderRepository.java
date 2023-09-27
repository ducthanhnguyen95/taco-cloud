package tacos.repositories;

import org.springframework.data.repository.CrudRepository;

import tacos.entities.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
	

}
