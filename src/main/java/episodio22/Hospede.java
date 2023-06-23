package episodio22;

public class Hospede {

    private String nome; //campo ou variavel de instancia, atributo
    private String sobrenome;
    private Endereço end;


    //Get Set
    public Endereço getEnd() {
        return end;
    }

    public void setEnd(Endereço end) {
        this.end = end;
    }

    public String getNome() {
        int idade = 0;
        return nome;
    }

    void setNome(String nome) {
        int idade = 10;
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //construtor é feito default
    public Hospede(){
        System.out.println("Criando um hospede ...");
    }

    public Hospede(String nome) {
        this.nome = nome;
    }

    public Hospede(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Hospede(String nome, String sobrenome, Endereço end) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.end = end;
    }





}
