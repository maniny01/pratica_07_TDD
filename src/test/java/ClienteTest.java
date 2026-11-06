import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    public void testCriacaoCliente() {
        Cliente c = new Cliente(1, "Joao", 10);
        assertEquals(1, c.getId());
        assertEquals("Joao", c.getNome());
        assertEquals(10, c.getDesconto());
        assertEquals("nd", c.getGenero());
    }

    @Test
    public void testToString() {
        Cliente c = new Cliente(1, "Joao", 10);
        assertEquals("Joao (1) (10%)", c.toString());
    }
}
