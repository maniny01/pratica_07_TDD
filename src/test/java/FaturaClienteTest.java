import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FaturaClienteTest {

    @Test
    public void testFaturaComDescontoEToString() {
        Cliente cliente = new Cliente(1, "Ana Silva", 10, "f");
        FaturaCliente fatura = new FaturaCliente(100, cliente, 200.0);

        assertEquals(100, fatura.getId());
        assertEquals(cliente, fatura.getCliente());
        assertEquals(200.0, fatura.getValor());
        
        // 10% de desconto sobre 200.0 deve dar 180.0
        assertEquals(180.0, fatura.getValorComDesconto(), 0.0001);
        
        // Verifica o formato do toString() exigido no diagrama: "Fatura [id=?, cliente nome (id) (desconto%), valor=? ]"
        assertEquals("Fatura [id=100, cliente=Ana Silva (1) (10%), valor=200.0]", fatura.toString());
    }
}