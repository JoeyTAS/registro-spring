
package com.registro.modelo;

import com.registro.entidad.Cliente;
import com.registro.repositorio.ClienteRepositorio;
import com.registro.servicio.ClientesServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class ClienteImpl implements ClientesServicio {
    @Autowired
    private ClienteRepositorio clienteRepositorio ;

    @Override
    public List<Cliente> ListaCliente() {
        return clienteRepositorio.findAll();
        
    }

	@Override
	public Cliente RegistrarCliente(Cliente cliente) {
		 return clienteRepositorio.save(cliente);
	}

	@Override
	public void EliminarCliente(Cliente cliente) {
		clienteRepositorio.delete(cliente);
		
	}

	@Override
	public Cliente BuscarCliente(Cliente cliente) {
		cliente = clienteRepositorio.getById(cliente.getIdCliente());
		return cliente;
	}
    
}
