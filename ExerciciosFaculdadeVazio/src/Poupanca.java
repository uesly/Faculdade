
import javax.swing.JOptionPane;


public class Poupanca extends Conta {
    private double juros;
    private double novoSaldo;
    private double credito;
    private double debito;
    
    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    public double getNovoSaldo() {
        return novoSaldo;
    }

    public void setNovoSaldo(double novoSaldo) {
        this.novoSaldo = novoSaldo;
    }
        
    public void nConta(){
        conta = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta: "));
    }
    
    public void nSaldo(){
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual o saldo da conta: "));
    }
    
    public void pJuros(){
        juros = Double.parseDouble(JOptionPane.showInputDialog("Qual o juros da poupança: "));
    }
    
    public void Creditar(){
        credito = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja creditar: "));
        saldo = saldo + credito;
        JOptionPane.showMessageDialog(null, "Seu novo saldo é de: " + saldo);
    }
    
    public void Debitar(){
        debito = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja debitar: "));
        saldo = saldo - debito;
        JOptionPane.showMessageDialog(null, "Seu novo saldo é de: " + saldo);
    }
        
    public void aplicarJuros(){
        novoSaldo = (saldo * juros);
        JOptionPane.showMessageDialog(null, "Seu novo saldo é de: " + novoSaldo);
    }
    
}
