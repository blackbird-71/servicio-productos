package com.oeruiz.servicios.servicioproductos;

import com.github.javafaker.Faker;
import com.oeruiz.servicios.servicioproductos.models.dao.ProductoDao;
import com.oeruiz.servicios.servicioproductos.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServicioProductosApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServicioProductosApplication.class, args);
	}

	@Autowired
	private Faker faker;
	@Autowired
	private ProductoDao repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		for (int i = 0; i < 10; i++) {
			Producto producto = new Producto();
			producto.setNombre(faker.name().username());
			producto.setPrecio(faker.random().nextDouble());
			producto.setCreateAt(faker.date().birthday());
			repository.save(producto);
		}
	}

}
