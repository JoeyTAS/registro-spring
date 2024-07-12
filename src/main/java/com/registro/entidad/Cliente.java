
package com.registro.entidad;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "PROVEEDORES")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PROVEEDOR") 
    private Integer idCliente;
    @Column(name = "RAZON_SOCIAL_PROVEEDORES")
    private String nombre;
    @Column(name = "RUC") 
    private String rucC;
    @Column(name = "DIRECCION") 
    private String direccion;
    @Column(name = "TELEFONO") 
    private Integer telefono;
    @Column(name = "CORREO") 
    private String correo;
    @Column(name = "COMENTARIOS")
    private String comentarios;
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<Pedidos> pedidos;
    
    
    
    
    
    
}
