/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jenkins.jenkins.services;

import com.example.jenkins.jenkins.domain.Persona;
import java.util.List;

/**
 *
 * @author 15-cd006
 */
public interface IPersona {
    Persona getById(String id);
    List<Persona> getListaPersona();
}
