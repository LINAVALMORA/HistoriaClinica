/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.histoclin.models;

import java.util.ArrayList;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="medico")
@Data
public class Medico {
    
    //Atributos
    @Id
    private int id;
    private String nombre;
    private String apellido;
    private int cedula;
    private String direccion;
    private String fechanac;
    private String disponibilidad;
    private ArrayList telefono;
    
}
