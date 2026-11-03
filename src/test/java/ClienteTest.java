import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    public void testClienteCriacaoEToString() {
        Cliente cliente = new Cliente(1, "Ana Silva", 10, "f");
        
        assertEquals(1, cliente.getId());
        assertEquals("Ana Silva", cliente.getNome());
        assertEquals(10, cliente.getDesconto());
        assertEquals("f", cliente.getGenero());
        assertEquals("Ana Silva (1) (10%)", cliente.toString());
    }
}