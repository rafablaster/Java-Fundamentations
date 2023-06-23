package episodio18;

import java.util.ArrayList;
import java.util.Date;

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

        Hospede maria = new Hospede();
        maria.nome = "Maria";
        maria.sobrenome = "da Silva";



        Hospede tiago = new Hospede("Tiago");
        tiago.setSobrenome("Resende");

        System.out.println("Nome...: " + tiago.getNome());
        System.out.println("Sobrenome...: "+ tiago.getSobrenome());



        Hospede julia = new Hospede("Julia", "Silva");

        System.out.println("Nome...: " + julia.getNome());
        System.out.println("Sobrenome...: "+ julia.getSobrenome());

        Hospede fabricio = new Hospede("Fabricio", "Oliveira");
        String nomeRetornado = fabricio.getNome();
        String sobrenomeRetornado = fabricio.getSobrenome();
        System.out.println("Nome...: " + nomeRetornado);
        System.out.println("Sobrenome...: "+ sobrenomeRetornado);

        Hospede florentino = null;
        System.out.println(florentino.getNome());



    }
}
