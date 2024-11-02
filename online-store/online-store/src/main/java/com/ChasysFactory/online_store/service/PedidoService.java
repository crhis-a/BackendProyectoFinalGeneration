package com.ChasysFactory.online_store.service;

import com.ChasysFactory.online_store.model.Pedido;
import com.ChasysFactory.online_store.model.UsuarioRegistrado;
import com.ChasysFactory.online_store.repository.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PedidoService implements IPedidoService {

    @Autowired
    private IPedidoRepository pedidoRepository;

    @Override
    public void guardarPedido(Pedido pedido){
        pedidoRepository.save(pedido);

    }
    @Override
    public void eliminarPedido(Long idPedido){
       pedidoRepository.deleteById(idPedido);
    }
    public Pedido buscarPedido(Long idPedido){

        Pedido pedido=pedidoRepository.findById(idPedido).orElse(null);

        return pedido;


    }

    @Override
    public void editarPedido(Long idPedido, LocalDate nuevafechaPedido,
                             String nuevoestadoPedido, Double nuevototalPrecio,
                             String nuevadireccionPedido,
                             String nuevaciudadPedido, String nuevodepartamentoPedido,
                             String nuevodetallesAdiccionalesPedido){
        Pedido pedido=this.buscarPedido(idPedido);
        pedido.setFechaPedido(nuevafechaPedido);
        pedido.setEstadoPedido(nuevoestadoPedido);
        pedido.setTotalPrecio(nuevototalPrecio);
        pedido.setDireccionPedido(nuevadireccionPedido);
        pedido.setCiudadPedido(nuevaciudadPedido);
        pedido.setDepartamentoPedido(nuevodepartamentoPedido);
        pedido.setDetallesAdiccionalesPedido(nuevodetallesAdiccionalesPedido);
        this.guardarPedido(pedido);

    }
    @Override
    public List<Pedido> listarPedido(){
        List<Pedido> listaPedido=pedidoRepository.findAll();

        return listaPedido;


    }
}
