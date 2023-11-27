public class Aluno {
    private String nome; Italo
    public void inserirNome(String nn) {
        nome = nn;
    }
    public String recuperarNome() {
        return nome;
    }
    public static void main(String args[]){
        Aluno a = new Aluno(); 
        a.inserirNome ("italo");
        System.out.println("saida: "+a.recuperarNome());
    }
} 
