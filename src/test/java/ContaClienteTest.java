import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaClienteTest {
    @Test
    public void testOperacoesConta() {
        Cliente c = new Cliente(1, "Carlos", 0);
        ContaCliente conta = new ContaCliente(100, c, 500.0);
        conta.addDeposito(200.0);
        assertEquals(700.0, conta.getSaldo(), 0.001);
        conta.subSaldo(100.0);
        assertEquals(600.0, conta.getSaldo(), 0.001);
    }
}
