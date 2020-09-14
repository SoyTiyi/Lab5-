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

    /* This is the contructor of the class */
    public BackenBean(){
        restar();
    }

    /* This method set numeroAdivinar, is the number that the client have to know 
     * @param numeroAdivinar is a Integer
    */
    public void setNumeroAdivinar(int numeroAdivinar){
        this.numeroAdivinar=numeroAdivinar;
    }

    /* This method set Intentos, is the number of  releases in the game
     * @param intentos is a ArrayList of Integers
    */
    public void setIntentos(ArrayList<Integer> intentos){
        this.intentos=intentos;
    }

    /* This method set premioAcumulado, is the value that the client have in the game
     * @param premioAcumulado is a Integer
    */
    public void setPremioAcumulado(int premioAcumulado){
        this.premioAcumulado=premioAcumulado;
    }

    /* This method set estado
     * @param estado is a String
    */
    public void setEstado(String estado){
        this.estado=estado;
    }

    /* This method return numeroAdivinar
     * @return numeroAdivianar
    */
    public int getNumeroAdivinar(){
        return numeroAdivinar;
    }

    /* This method return the arrayList with the releases that the player did
     * @return intentos
    */
    public ArrayList<Integer> getIntentos(){
        return intentos;
    }

    /* This method return premioAcumulado
     * @retunr premioAcumulado
    */
    public int getPremioAcumulado(){
        return premioAcumulado;
    }

    /* This method return estado    
     * @return estado 
    */
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
        int varianza = calculateVariance(valores);
        return (int) Math.pow(varianza, 1/2);
    }

    public int calculateVariance(ArrayList<Integer> valores){
        int promedio = calculateMean(valores);
        int sumatoria=0;
        for(int i=0;i<valores.size();i++){
            sumatoria+=Math.pow(valores.get(i)-promedio, 2);
        }
        return sumatoria/(valores.size()-1);
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

    public int calculateMode(ArrayList<Integer> valores){
        int maximoNumRepeticiones = 0;
        int moda = 0;
        for(int i=0; i<valores.size(); i++){
            int numRepeticiones = 0;
            for(int j=0; j<valores.size(); j++){
                if(valores.get(i)==valores.get(j)){
                    numRepeticiones++;
                }
                if(numRepeticiones>maximoNumRepeticiones){
                    moda = valores.get(i);
                    maximoNumRepeticiones = numRepeticiones;
                }
            }
        }
        return moda;
    }
    
}
