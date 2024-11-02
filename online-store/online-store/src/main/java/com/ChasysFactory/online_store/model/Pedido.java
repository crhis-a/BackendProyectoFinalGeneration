package com.ChasysFactory.online_store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPedido;
    private LocalDate fechaPedido;
    private String estadoPedido;
    private Double totalPrecio;
    private int idUsuarioRegistrado;
    private String direccionPedido;
    private String ciudadPedido;
    private String departamentoPedido;
    private String detallesAdiccionalesPedido;

    public Pedido() {
    }

    public Pedido(Long idPedido, LocalDate fechaPedido, String estadoPedido, Double totalPrecio, int idUsuarioRegistrado, String direccionPedido, String ciudadPedido, String departamentoPedido, String detallesAdiccionalesPedido) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.estadoPedido = estadoPedido;
        this.totalPrecio = totalPrecio;
        this.idUsuarioRegistrado = idUsuarioRegistrado;
        this.direccionPedido = direccionPedido;
        this.ciudadPedido = ciudadPedido;
        this.departamentoPedido = departamentoPedido;
        this.detallesAdiccionalesPedido = detallesAdiccionalesPedido;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public Double getTotalPrecio() {
        return totalPrecio;
    }

    public int getIdUsuarioRegistrado() {
        return idUsuarioRegistrado;
    }

    public String getDireccionPedido() {
        return direccionPedido;
    }

    public String getCiudadPedido() {
        return ciudadPedido;
    }

    public String getDepartamentoPedido() {
        return departamentoPedido;
    }

    public String getDetallesAdiccionalesPedido() {
        return detallesAdiccionalesPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public void setTotalPrecio(Double totalPrecio) {
        this.totalPrecio = totalPrecio;
    }

    public void setIdUsuarioRegistrado(int idUsuarioRegistrado) {
        this.idUsuarioRegistrado = idUsuarioRegistrado;
    }

    public void setDireccionPedido(String direccionPedido) {
        this.direccionPedido = direccionPedido;
    }

    public void setCiudadPedido(String ciudadPedido) {
        this.ciudadPedido = ciudadPedido;
    }

    public void setDepartamentoPedido(String departamentoPedido) {
        this.departamentoPedido = departamentoPedido;
    }

    public void setDetallesAdiccionalesPedido(String detallesAdiccionalesPedido) {
        this.detallesAdiccionalesPedido = detallesAdiccionalesPedido;
    }
}
