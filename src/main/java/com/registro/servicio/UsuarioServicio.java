package com.registro.servicio;

import org.springframework.stereotype.Service;

import com.registro.entidad.Usuario;
@Service
public interface UsuarioServicio {
	
	  public Usuario RegistrarUsuario(Usuario usuario);
}
