package episodio27;

public class TestePassagemValores {
    public static void main(String[] args) {
        Data hoje;
        int valor;
        TestePassagemValores t = new TestePassagemValores();

        // atribuir um int
        valor = 12;
        // vamos alterá-lo
        t.alterarInt(valor);
        System.out.println("O valor original 12, foi alterado?");
        System.out.println(valor);

        // Atribuir uma data
        hoje = new Data(5, 5, 2011);
        // Vamos tentar mudar a data
        t.alterarAtributoObjeto(hoje);
        System.out.println("O dia original 3, foi alterado?");
        System.out.println(hoje.getDia());

        t.alterarReferenciaObjeto(hoje);
        System.out.println("O dia original 15, foi alterado?");
        System.out.println(hoje.getDia());

    }

    // método que altera o valor do método int
    public void alterarInt(int valor) { // provado que a passagem foi feita por valor.
        valor = 78;
    }


    public void alterarAtributoObjeto(Data ref) { // isso não é passar por referência? NÃO
        ref.setDia(15);
    }

    public void alterarReferenciaObjeto(Data d) { // recebe 15/5/2011
        d = new Data(30, 11, 1970);
    }

}