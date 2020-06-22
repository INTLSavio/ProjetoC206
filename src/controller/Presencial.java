/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;

/**
 *
 * @author savio
 */
public class Presencial extends Ideia implements Serializable{
    
    private String materiaisNecessarios;

    public String getMateriaisNecessarios() {
        return materiaisNecessarios;
    }

    public void setMateriaisNecessarios(String materiaisNecessarios) {
        this.materiaisNecessarios = materiaisNecessarios;
    }
    
    
    
}
