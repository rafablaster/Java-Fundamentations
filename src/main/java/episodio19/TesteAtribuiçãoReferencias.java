package episodio19;

public class TesteAtribuiçãoReferencias {

    public static void main(String[] args) {
        Hospede h1 = new Hospede("Floarentino", "Ariza");
        Hospede h2 = h1;
        System.out.println("exibindo os dados antes da alteração.");
        System.out.println("Hospede h1...:" + h1.getNome() + h1.getSobrenome());

        System.out.println("exibindo os dados antes da alteração.");
        System.out.println("Hospede h2...:" + h2.getNome() + h2.getSobrenome());

        h1.setNome("Fermina");
        h1.setSobrenome("Daza");

        System.out.println("exibindo os dados antes da alteração.");
        System.out.println("Hospede h1...:" + h1.getNome() + h1.getSobrenome());

        System.out.println("exibindo os dados antes da alteração.");
        System.out.println("Hospede h2...:" + h2.getNome() + h2.getSobrenome());

        mudaHospede(h1);
        System.out.println(h1.getNome());


    }

    static void mudaHospede(Hospede h2) {
        h2.setNome("Melquiades");
    }






}
