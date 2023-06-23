package episodio6;

import java.util.*; //importa todas as classes

public class TesteHospede {

    public static void main(String[] args) {

        Hospede rodrigo = new Hospede();  //criado um objeto do tipo Hospede, que possui nome e sobrenome
        rodrigo.setNome("Rodrigo");       //coloca valor para a variavel do tipo Hospede no metodo SET
        rodrigo.setSobrenome("Pagliares");//coloca valor para a variavel do tipo Hospede no metodo SET

        //exibindo o estado dos objetos
        System.out.println("Nome...: " + rodrigo.getNome());
        System.out.println("Sobrenome...: "+ rodrigo.getSobrenome());



        Hospede mariana = new Hospede();  //mariana aponta para um objeto do tipo Hospede
        mariana.setNome("Mariana");       //coloca valor para a variavel do tipo Hospede no metodo SET
        mariana.setSobrenome("Pereira");//coloca valor para a variavel do tipo Hospede no metodo SET

        //exibindo o estado dos objetos
        System.out.println("Nome...: " + mariana.getNome());
        System.out.println("Sobrenome...: "+ mariana.getSobrenome());


        //java.util.Date data = new java.util.Date();
        //java.util.ArrayList lista = new java.util.ArrayList<>();

        Date data = new Date();
        ArrayList lista = new ArrayList<>();

        Hospede francisco = new Hospede();
        francisco.setNome("Francisco");
        francisco.setSobrenome("Ribeiro");

        //francisco.nome;  //exemplo de modificador public


    }
}
