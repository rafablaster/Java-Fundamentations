package episodio11;

import java.util.Date;

public class Hospede {

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

    /**
     * Este metodo é crucial para a estabilidade da classe Hospede
     * Caso queira entender melhor detalhes da sua logica de implementação
     * consulte o documento de especificação de requisitos do sistema
     * @param numero de acordo com a especificação IEEE para numeros flutuantes
     * @deprecated favor utilizar este metodo apenas na ultima instancia
     * prefira o metodo metedoComplexoAtualizado
     */
    public void metodoComplexo(double numeroGrande){
        Date hoje = new Date();

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
