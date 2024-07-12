package com.registro.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.entidad.Usuario;
import com.registro.repositorio.UsuarioRepositorio;
import com.registro.servicio.UsuarioServicio;
@Service
public class UsuarioImpl implements UsuarioServicio {
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Override
	public Usuario RegistrarUsuario(Usuario usuario) {
		return usuarioRepositorio.save(usuario);
	}
	


}
