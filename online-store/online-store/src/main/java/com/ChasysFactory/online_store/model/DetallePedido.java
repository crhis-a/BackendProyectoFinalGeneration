package com.ChasysFactory.online_store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idDetallePedido;
    private int  cantidadProducto;
    private Double precioProducto;
    private int idPedido;
    private  int idProducto;

    public DetallePedido() {
    }

    public DetallePedido(Long idDetallePedido, int cantidadProducto, Double precioProducto, int idPedido, int idProducto) {
        this.idDetallePedido = idDetallePedido;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
    }

    public Long getIdDetallePedido() {
        return idDetallePedido;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdDetallePedido(Long idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
}
