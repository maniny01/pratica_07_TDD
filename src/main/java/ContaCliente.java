public class ContaCliente {
    private int id;
    private Cliente cliente;
    private double saldo = 0.0;

    public ContaCliente(int id, Cliente cliente, double saldo) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public ContaCliente(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public ContaCliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos do diagrama
    public double addDeposito(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public double subSaldo(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        return this.saldo;
    }

    // Métodos alternativos chamados nos testes
    public double sacar(double valor) {
        return subSaldo(valor);
    }

    public double depositar(double valor) {
        return addDeposito(valor);
    }

    @Override
    public String toString() {
        String nome = (cliente != null) ? cliente.getNome() : "";
        return nome + " (" + id + ") saldo=R$" + String.format("%.2f", saldo);
    }
}