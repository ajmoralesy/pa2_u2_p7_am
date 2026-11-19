
package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @SequenceGenerator(name = "proveedor_seq", sequenceName = "proveedor_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proveedor_seq")
    @Column(name = "prov_id")
    private Integer id;

    @Column(name = "prov_nombre")
    private String nombre;

    @Column(name = "prov_ruc")
    private String ruc;

    @Column(name = "prov_telefono")
    private String telefono;

    @Column(name = "prov_direccion")
    private String direccion;

    // GETTERS Y SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
