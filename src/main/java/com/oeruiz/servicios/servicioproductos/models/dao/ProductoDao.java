package com.oeruiz.servicios.servicioproductos.models.dao;

import com.oeruiz.servicios.servicioproductos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto,Long> {
}
