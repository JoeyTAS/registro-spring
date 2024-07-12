package com.registro.repositorio;

import com.registro.entidad.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
    
}
