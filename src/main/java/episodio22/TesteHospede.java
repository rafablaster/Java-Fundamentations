package episodio22;


public class TesteHospede {
    public static void main(String[] args) {

        Endereço end1 = new Endereço("Rua Paraná", 54, "Apartamento 304");

        Hospede rodrigo = criarHospede("Rodrigo","Martins Pagliares", null);
        rodrigo.setEnd(end1);
        exibirDados(rodrigo);

        Endereço end2 = new Endereço("Avenida Marechal Floriano Peixoto", 200, "");

        Hospede mariana = criarHospede("Mariana", "Pereira", end2);
        exibirDados(mariana);
//
//        Hospede francisco = criarHospede("Francisco", "Ribeiro");
//        exibirDados(francisco);
//
//        Hospede maria = criarHospede("Maria","da Silva");
//        exibirDados(maria);
//
//        Hospede thiago = criarHospede("Thiago", "Resende");
//        exibirDados(thiago);
//
//        Hospede julia = criarHospede("Júlia", "Silva");
//        exibirDados(julia);
//
//        Hospede fabricio = criarHospede("Fabrício", "Dia");
//        exibirDados(fabricio);
//
//        Hospede jair = criarHospede("Jair", "Figueiredo");
//        exibirDados(jair);
    }

    public static Hospede criarHospede(String nome, String sobrenome, Endereço e) {
        if (e == null) {
            return new Hospede(nome, sobrenome);
        } else {
            return new Hospede(nome, sobrenome, e);
        }

    }

    public static void exibirDados(Hospede h) {
        System.out.println("Nome...: " + h.getNome());
        System.out.println("Sobrenome..: " + h.getSobrenome());
        System.out.println("Endereço..: " + h.getEnd().getRua());
    }
}
