package com.marketplatzi.platziMarket.Persistence.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private Integer celular;
    private String direccion;
    @Column(name = "correo_electronico")
    private String email;
}