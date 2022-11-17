
package Model;

public class Animal {
    private String nome; 
    private String porte; 
    private String raça;
    private String cor;
    private String origem;
    private String categoria;
    private String historico;
    private double valor;

    public Animal(String porte, String raça, String cor, String origem, String categoria, String historico, double valor) {
        this.porte = porte;
        this.raça = raça;
        this.cor = cor;
        this.origem = origem;
        this.categoria = categoria;
        this.historico = historico;
        this.valor = valor;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
