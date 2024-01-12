package aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p) {
       this.modelo = m;
       this.cor = c;
       this.setPonta(p);
       this.tampar();
    }    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }   
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void detampar() {
        this.tampada =  false;  
    }
    public void status() {
        System.out.println("Sobre a Caneta");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponto" + this.getPonta());
        System.out.println("Tampada: " +this.tampada);
    }
}
