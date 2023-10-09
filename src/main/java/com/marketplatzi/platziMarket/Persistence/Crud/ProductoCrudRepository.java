package com.marketplatzi.platziMarket.Persistence.Crud;

import com.marketplatzi.platziMarket.Persistence.Entities.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
