
package Model;


public class Pagamento {
    private double valor;
    private boolean operação;

    public Pagamento(double valor, boolean operação) {
        this.valor = valor;
        this.operação = operação;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isOperação() {
        return operação;
    }

    public void setOperação(boolean operação) {
        this.operação = operação;
    }
    
}
