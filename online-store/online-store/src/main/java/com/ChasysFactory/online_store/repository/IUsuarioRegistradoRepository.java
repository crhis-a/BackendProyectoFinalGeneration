package com.ChasysFactory.online_store.repository;

import com.ChasysFactory.online_store.model.UsuarioRegistrado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRegistradoRepository extends JpaRepository<UsuarioRegistrado, Long> {

}
