package episodio1;

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


    }
}
