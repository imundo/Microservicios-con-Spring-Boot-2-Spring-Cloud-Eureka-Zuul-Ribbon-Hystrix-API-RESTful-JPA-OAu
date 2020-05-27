package com.formacionbdi.springboot.app.productos.models.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

	Optional<Producto> findById(Long id);

}
