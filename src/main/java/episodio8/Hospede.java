package episodio8;

class Hospede {

    String nome; //campo ou variavel de instancia, atributo
    String sobrenome;

    public String getNome() {
        return nome;
    }

    void setNome(String nome) {
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

    //dentro da propria classe de dominio, pode-se haver o metodo "main"

    /*public static void main(String[] args) {

        Hospede rodrigo = new Hospede();  //criado um objeto do tipo Hospede, que possui nome e sobrenome
        rodrigo.setNome("Rodrigo");       //coloca valor para a variavel do tipo Hospede no metodo SET
        rodrigo.setSobrenome("Pagliares");//coloca valor para a variavel do tipo Hospede no metodo SET

        //exibindo o estado dos objetos
        System.out.println("Nome...: " + rodrigo.getNome());
        System.out.println("Sobrenome...: "+ rodrigo.getSobrenome());

    }*/




}
