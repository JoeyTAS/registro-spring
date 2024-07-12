package com.registro.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.entidad.Usuario;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}
