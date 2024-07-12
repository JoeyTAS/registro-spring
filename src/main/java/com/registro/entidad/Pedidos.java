
package com.registro.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "PEDIDOS")
public class Pedidos{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PEDIDO") 
    private Integer idPedido;
    @Column(name = "RAZON_SOCIAL_PEDIDOS") 
    private String razonSocialP;
    @Column(name = "RUC_DNI") 
    private String rucDniP;
    @Column(name = "DIRECCION") 
    private String direccionP;
    @Column(name = "TELEFONO") 
    private Integer telefonoP;
    @Column(name = "CORREO") 
    private String correoP;
    @Column(name = "COMENTARIOS")
    private String comentariosP; 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PROVEEDORP")
    private Cliente cliente;
    
}
