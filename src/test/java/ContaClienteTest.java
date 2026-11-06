import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaClienteTest {
    @Test
    public void testOperacoesContaEDeposito() {
        Cliente c = new Cliente(10, "Carlos", 0);
        ContaCliente conta = new ContaCliente(100, c, 500.0);
        assertEquals(700.0, conta.addDeposito(200.0), 0.001);
        assertEquals(700.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testLimiteSaqueInsuficiente() {
        Cliente c = new Cliente(10, "Carlos", 0);
        ContaCliente conta = new ContaCliente(100, c, 100.0);
        // Tenta sacar mais do que tem: saldo não deve negativar
        assertEquals(100.0, conta.subSaldo(200.0), 0.001);
        assertEquals(100.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testToStringFormato() {
        Cliente c = new Cliente(10, "Carlos", 0);
        ContaCliente conta = new ContaCliente(100, c, 500.0);
        assertEquals("Carlos (100) saldo=R$500.00", conta.toString());
    }
}
