/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("modelo :" +this.modelo);
        System.out.println("Uma caneta :" +this.cor);
        System.out.println("Esta tampada ?" +this.tampada);
        System.out.println("Ponta :" +this.ponta);
        System.out.println("Carga :" +this.carga);
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro nao posso rabiscar!");        
            } else {
            System.out.println("Estou rabiscando!");
            }
    }    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
   
}
