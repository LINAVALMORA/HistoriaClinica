/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.histoclin.services;

import com.misiontic.histoclin.models.Medico;
import com.misiontic.histoclin.repositories.MedicoRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
@RequiredArgsConstructor
public class MedicoService {
    private final MedicoRepository medicoRepository;
    
    public void save (Medico medico){
        medicoRepository.save(medico);
    }
    public List<Medico>findAll(){
        return medicoRepository.findAll();
    }
    public Optional<Medico> findById(String id){
        return medicoRepository.findById(id);
    }
    public void deleteById(String id){
        medicoRepository.deleteById(id);
    }
}
