package cadastroalunos;

public class TesteCadastroAlunos {
     public static void main(String[] args){
        CadastroAlunos cad = new CadastroAlunos();
        cad.nome = new Nome();
        cad.nome.nome = "Lucas";
        cad.nome.sobrenome = "Matias";
        cad.endereco = new Endereco();
        cad.endereco.rua = "Rua pirapora";
        cad.endereco.numero = 154;
        cad.display();
    }
}
