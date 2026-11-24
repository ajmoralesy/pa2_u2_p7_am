package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @SequenceGenerator(name = "pedido_seq", sequenceName = "pedido_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_seq")
    @Column(name = "pdd_id")
    private Integer id;

    @Column(name = "pdd_producto")
    private String producto;

    @Column(name = "pdd_precio")
    private Double precio;

    @Column(name = "pdd_fecha")
    private LocalDateTime fecha;

    @Column(name = "pdd_numero")
    private String numero;

    // Constructor vacio
    public Pedido() {
    }

    // Constructor con parametros
    public Pedido(Integer id, String producto, Double precio,
            LocalDateTime fecha) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id +
                ", producto=" + producto +
                ", precio=" + precio +
                ", fecha=" + fecha + "]";
    }

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}