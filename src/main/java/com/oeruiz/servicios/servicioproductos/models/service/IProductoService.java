package com.oeruiz.servicios.servicioproductos.models.service;

import com.oeruiz.servicios.servicioproductos.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
    public Producto findById(Long id);
}
