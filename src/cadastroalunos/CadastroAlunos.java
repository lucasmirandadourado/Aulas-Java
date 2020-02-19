
package cadastroalunos;


public class CadastroAlunos {
    
    Nome nome;
    Endereco endereco;
       
    public CadastroAlunos(){
        
    }
    
    public CadastroAlunos(String nome,String sobrenome,String rua,int numero){
        Nome nome = new Nome();
        Endereco end = new Endereco();
        
    }
    
    public void display(){
        nome.display();
        endereco.display();
    } 
}
