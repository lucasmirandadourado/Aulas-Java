package cadastroalunos;

public class Endereco {
    String rua;
    int numero;
    
     public Endereco(){
        
    }
    
    public Endereco(String rua, int numero){
        this.rua = rua;
        this.numero = numero;
    }
    
    void display(){
        System.out.println(rua);
        System.out.println(numero);
    }
}   
