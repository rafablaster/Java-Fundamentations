package episodio21;

public class TesteHospede {

    public static void main(String[] args) {

        Endereço end1 = new Endereço("Rua Paraná", 99 , "apto. 201");

        Hospede rodrigo = criarHospede("Rodrigo", "Martins Pagliares");  //criado um objeto do tipo Hospede, que possui nome e sobrenome
        rodrigo.setEnd(end1);
        exibirDados(rodrigo);

//        Hospede francisco = criarHospede("Francisco", "Ribeiro");
//        exibirDados(francisco);
//
//        Hospede mariana = criarHospede("Mariana", "Pereira");  //mariana aponta para um objeto do tipo Hospede
//        exibirDados(mariana);



    }

    public static Hospede criarHospede(String nome, String sobrenome){
          return new Hospede(nome, sobrenome);
    }

    public static void exibirDados(Hospede h){
        System.out.println("Nome ...: " + h.getNome());
        System.out.println("Sobrenome ...: "+ h.getSobrenome());
        System.out.println("Endereçõ ...: " + h.getEnd().getRua());
    }



}
