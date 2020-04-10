/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

/**
 *
 * @author ara_b
 */
public class Paciente extends Persona{

    public Paciente() {
    }
    
    public void esperar(){
        System.out.println("Esperando...");
    }
    
    public void entregarPapeles(){
        System.out.println("Entregando papeles");
    }
    
    public void entrar(){
        System.out.println("Entrando");
    }
}
