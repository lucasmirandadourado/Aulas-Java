
package cadastroalunos;


public class Nome {
    String nome;
    String sobrenome;
    
    public Nome(){
        
    }
    
    public Nome(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = "silva";
    }
    
    void display(){
        System.out.println(nome);
        System.out.println(sobrenome);
    }
}
