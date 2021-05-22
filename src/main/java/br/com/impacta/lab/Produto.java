package br.com.impacta.lab;

public class Produto {
    public int codigo;
    public String descricao;
    public double valor;

    public String montarResumo() {
        String retorno = "codigo: " + String.valueOf(this.codigo) + ", descricao: " + this.descricao + ", valor: " + String.valueOf(valor);

        return retorno;  
    }
}
