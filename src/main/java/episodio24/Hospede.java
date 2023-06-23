package episodio24;

class Hospede {
    private String nome; // campo, variável de instância, atributo
    private String sobrenome;
    private double salario;
    private Endereco endereco;
    private boolean fumante;

    public Hospede() {
        this("");
    }

    public Hospede(String nome) {
        this(nome, "");
    }

    public Hospede(String nome, String sobrenome) {
        this(nome, sobrenome, null);
    }

    public Hospede(String nome, String sobrenome, Endereco endereco) {
        this(nome, sobrenome, 0.0, endereco);
    }

    public Hospede(String nome, String sobrenome, double salario, Endereco endereco) {
        this(nome, sobrenome, salario, endereco, true);
    }

    public Hospede(String nome, String sobrenome, double salario, Endereco endereco, boolean fumante) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.endereco = endereco;
        this.fumante = fumante;
    }

    public static void main(String[] args) {
        Hospede rodrigo = new Hospede();
        rodrigo.setNome("Rodrigo");
        rodrigo.setSobrenome("Martins Pagliares");

        // exibindo o estado do objeto
        System.out.println("Nome...: " + rodrigo.getNome());
        System.out.println("Sobrenome..: " + rodrigo.getSobrenome());
    }

    public String getNome() {
        // int idade = 10;
        return nome;
    }

    void setNome(String nome) {
        // idade = 20;
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }
}