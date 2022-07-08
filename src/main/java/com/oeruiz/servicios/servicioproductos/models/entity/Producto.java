package com.oeruiz.servicios.servicioproductos.models.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name="productos")
public class Producto implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="precio")
    private Double precio;

    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;
}
