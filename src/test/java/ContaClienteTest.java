import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContaClienteTest {

    @Test
    public void testContaEfetuarDepositoESaque() {
        Cliente cliente = new Cliente(1, "Ana Silva", 10, "f");
        ContaCliente conta = new ContaCliente(10, cliente, 500.0);

        assertEquals(10, conta.getId());
        assertEquals(cliente, conta.getCliente());
        assertEquals(500.0, conta.getSaldo());

        conta.depositar(100.0);
        assertEquals(600.0, conta.getSaldo());

        conta.sacar(50.0);
        assertEquals(550.0, conta.getSaldo());

        assertEquals("Conta [id=10, cliente=Ana Silva (1) (10%), saldo=550.0]", conta.toString());
    }
}