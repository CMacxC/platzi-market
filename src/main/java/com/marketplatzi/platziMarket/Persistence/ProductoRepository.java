package com.marketplatzi.platziMarket.Persistence;

import com.marketplatzi.platziMarket.Persistence.Crud.ProductoCrudRepository;
import com.marketplatzi.platziMarket.Persistence.Entities.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository crudRepository;

    public List<Producto> getAll()
    {
        return (List<Producto>) crudRepository.findAll();
    }
}
