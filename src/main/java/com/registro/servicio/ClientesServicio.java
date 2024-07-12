
package com.registro.servicio;

import com.registro.entidad.Cliente;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ClientesServicio {
      public List<Cliente> ListaCliente();
      public Cliente RegistrarCliente(Cliente cliente);
      
      public void EliminarCliente(Cliente cliente);
      
      public Cliente BuscarCliente(Cliente cliente);
    
}
