package projetointegrador.com.projetointegrador;

/**
 * Created by Marcello Icaro on 25/09/2017.
 */

public class Cadastro {

    private long id;
    private String nome;
    private String alturaM;
    private String peso;
    private String imc;


    public Cadastro(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlturaM() {
        return alturaM;
    }

    public void setAlturaM(String altura) {
        this.alturaM = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }
}
