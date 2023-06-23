package episodio22;

public class Endereço {
    private String rua;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;


    //construtores
    public Endereço() {
    }

    public Endereço(String rua, int numero, String complemento, String cep, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Endereço(String rua, int numero, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    //Get Set
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }






}
