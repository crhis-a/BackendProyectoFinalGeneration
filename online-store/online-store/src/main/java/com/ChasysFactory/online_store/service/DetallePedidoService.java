package com.ChasysFactory.online_store.service;

import com.ChasysFactory.online_store.model.Contactanos;
import com.ChasysFactory.online_store.model.DetallePedido;
import com.ChasysFactory.online_store.repository.IDetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoService implements IDetallePedidoService{

    @Autowired
    private IDetallePedidoRepository detallePedidoRepository;

    @Override
    public void guardarDetallePedido(DetallePedido detallePedido){

    }
    @Override
    public void eliminarDetallePedido(Long idDetallePedido){

    }
    @Override
    public DetallePedido buscarDetallePedido(Long idDetallePedido){

        return null;
    }
    @Override
    public void editarDetallePedido(Long idDetallePedido, int NuevoCantidadProducto, Double nuevoPrecioProducto,
                                    int nuevoIdPedido, int nuevoIdProducto){



    }
    public List<DetallePedido> listarDetallesPedido() {


        List<DetallePedido> listaDetallePedido = detallePedidoRepository.findAll();


        return listaDetallePedido;
    }






}
