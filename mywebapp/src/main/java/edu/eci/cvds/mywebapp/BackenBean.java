package edu.eci.cvds.mywebapp;

import java.util.ArrayList;
import java.util.Random;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "calculadoraBean")
@ApplicationScoped
public class BackenBean {
    private int numeroAdivinar;
    private ArrayList<Integer> intentos;
    private int premioAcumulado;
    private String estado;

    public BackenBean(){
        restar();
    }

    public void setNumeroAdivinar(int numeroAdivinar){
        this.numeroAdivinar=numeroAdivinar;
    }

    public void setIntentos(ArrayList<Integer> intentos){
        this.intentos=intentos;
    }

    public void setPremioAcumulado(int premioAcumulado){
        this.premioAcumulado=premioAcumulado;
    }

    public void setEstado(String estado){
        this.estado=estado;
    }

    public int getNumeroAdivinar(){
        return numeroAdivinar;
    }

    public ArrayList<Integer> getIntentos(){
        return intentos;
    }

    public int getPremioAcumulado(){
        return premioAcumulado;
    }

    public String getEstado(){
        return estado;
    }

    public int calculateMean(ArrayList<Integer> valores){
        int result=0;
        for(int i=0; i<valores.size(); i++){
            result+=valores.get(i);
        }
        return result/valores.size();
    }

    public int calculateStandarDeviation(ArrayList<Integer> valores){
        int promedio = calculateMean(valores);
        int resultado=0;
        return 0;
    }

    public void restar(){
        intentos = new ArrayList<>();
        numeroAdivinar = createNumeroAdivinar();
        estado = "Aun no haz ganado Bro!";
    }

    private int createNumeroAdivinar(){
        Random random = new Random();
        int nuevoNumeroAdivinar = random.nextInt(10);
        return nuevoNumeroAdivinar;
    }
    
}
