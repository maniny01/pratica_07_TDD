import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FaturaClienteTest {
    @Test
    public void testValorComDesconto() {
        Cliente c = new Cliente(1, "Maria", 20);
        FaturaCliente f = new FaturaCliente(10, c, 1000.0);
        assertEquals(800.0, f.getValorComDesconto(), 0.001);
    }
}
