/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jenkins.jenkins.servicesImpl;

import com.example.jenkins.jenkins.domain.Persona;
import com.example.jenkins.jenkins.services.IPersona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 15-cd006
 */
public class PersonaServicesImpl implements IPersona{

    @Override
    public Persona getById(String id) {
        Persona p = new Persona("1","Erwin","edeleon2408@gmai.com");
        
        return p;
    }

    @Override
    public List<Persona> getListaPersona() {
        List<Persona> list = new ArrayList<>();
        Persona p1 = new Persona("1","Erwin","edeleon2408@gmai.com");
        Persona p2 = new Persona("2","Ginna","ginna@gmai.com");
        Persona p3 = new Persona("3","Amara","Amara@gmai.com");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        
        return list;
    }
    
}
