
package com.registro.controller;

import com.registro.entidad.Cliente;
import com.registro.entidad.Usuario;
import com.registro.servicio.ClientesServicio;
import com.registro.servicio.UsuarioServicio;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class RegistroController {
    @Autowired
    private ClientesServicio clientesServicio;
    @Autowired
    private UsuarioServicio usuarioServicio;
     
    @GetMapping("/")
    public String login(Usuario usuario, Model modelo){
    	modelo.addAttribute("usuario", usuario);
    return "vistas/Login";
    }
    @GetMapping("/agregar")
    public String AniadirProveedor(Cliente cliente, Model modelo) {
        modelo.addAttribute("cliente", cliente);
        return "vistas/RegistroProveedores";
    }
    @PostMapping("/registrar-user")
    public String LoginUser(Usuario usuario){
    	usuarioServicio.RegistrarUsuario(usuario);
    	return "redirect:/ver";
    }
    @PostMapping("/registro")
    public String RegistrarProveedor(Cliente cliente){
    	clientesServicio.RegistrarCliente(cliente);
    	return "redirect:/ver";
    	
    }
    
    @GetMapping("/pruebascrack")
    public String EnviarDatos(Model modelo){
    Cliente cliente = new Cliente();
    cliente.setIdCliente(1);
    cliente.setNombre("Pañuelos sac");
    cliente.setRucC("12312312");
    cliente.setDireccion("Calle mercedes");
    cliente.setTelefono(1232131231);
    cliente.setCorreo("alguien@gmail.com");
    cliente.setComentarios("Empacadora de pañuelos");
    modelo.addAttribute("cliente", cliente);
    return "vistas/Verbase";
    }
    
    @GetMapping("/ver")
    public String ListaCliente(Cliente cliente, Model modelo){
    	List<Cliente> ListaCliente = new ArrayList<>();
    	ListaCliente = clientesServicio.ListaCliente();
    modelo.addAttribute("ListaCliente", ListaCliente);
    return "vistas/ListaClientes";
    }
    
    @GetMapping("/eliminar/{idCliente}")
    public String ElimnarCliente(Cliente cliente) {
    	clientesServicio.EliminarCliente(cliente);
        return "redirect:/ver";
    }
    @GetMapping("/actualizar/{idCliente}")
    public String ActualizarCliente(Cliente cliente, Model modelo) {
    	cliente = clientesServicio.BuscarCliente(cliente);
    	modelo.addAttribute("cliente", cliente);
    	return "vistas/RegistroProveedores";
    	
    }
  
   
    
    
    
    
}
