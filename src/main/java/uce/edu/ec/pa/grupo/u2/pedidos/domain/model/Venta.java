
package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

@Entity
@Table(name = "ventas")
public class Venta {

    @Id
    @SequenceGenerator(name = "venta_seq", sequenceName = "venta_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "venta_seq")
    @Column(name = "ven_id")
    private Integer id;

    @Column(name = "ven_fecha")
    private String fecha;

    @Column(name = "ven_total")
    private Double total;

    @Column(name = "ven_metodo_pago")
    private String metodoPago;
    @Column(name = "ven_estado")
    private String estado;


    // GETTERS Y SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
