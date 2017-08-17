/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean.cer;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author carlosenriquez
 */
@Named(value = "msgBean")
@RequestScoped

public class MsgBean 
{
   
   private boolean vino1;
   private boolean vino2;        
   private boolean vino3; 
   
   int cantidad1;
   int cantidad2;
   int cantidad3;
   
   double resultado1;
   double resultado2;
   double resultado3;
   
   double total;

    public double getResultado1() 
    {
        resultado1=cantidad1*231.90;
        return resultado1;
    }

    public void setResultado1(double resultado1) {
        this.resultado1 = resultado1;
    }

    public double getResultado2() 
    {
        resultado2=cantidad2*300.40;
        return resultado2;
    }

    public void setResultado2(double resultado2) {
        this.resultado2 = resultado2;
    }

    public double getResultado3() 
    {
        resultado3=cantidad3*450;
        return resultado3;
    }

    public void setResultado3(double resultado3) {
        this.resultado3 = resultado3;
    }

    public double getTotal() 
    {
        total=resultado1+resultado2+resultado3;
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
 

    public int getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(int cantidad1) {
        this.cantidad1 = cantidad1;
    }

    public int getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(int cantidad2) {
        this.cantidad2 = cantidad2;
    }

    public int getCantidad3() {
        return cantidad3;
    }

    public void setCantidad3(int cantidad3) {
        this.cantidad3 = cantidad3;
    }

    public boolean isVino1() {
        return vino1;
    }

    public void setVino1(boolean vino1) {
        this.vino1 = vino1;
    }

    public boolean isVino2() {
        return vino2;
    }

    public void setVino2(boolean vino2) {
        this.vino2 = vino2;
    }

    public boolean isVino3() {
        return vino3;
    }

    public void setVino3(boolean vino3) {
        this.vino3 = vino3;
    }
    
    public String verificar()
    {
        
       return "success";
    }        
            

}

