package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

public class Pedido {
    private Integer id;
    private String producto;
    private Double precio;

    

    public Pedido(Integer id, String producto, Double precio) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
    }
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

    

}
