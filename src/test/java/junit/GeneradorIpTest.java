package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneradorIpTest {

	@Test
    public void testGenerarNumero() {
        GeneradorIp generadorIp = new GeneradorIp();
        for (int i = 0; i < 10; i++) {
            int numero = generadorIp.generarNumero(0, 254);
            assertTrue(numero >= 0 && numero <= 254);
        }
    }

    @Test
    public void testGenerarIp() {
        GeneradorIp generadorIp = new GeneradorIp();
        for (int i = 0; i < 10; i++) {
            String ip = generadorIp.generarIp();
            String[] partes = ip.split("\\.");
            assertNotEquals("0", partes[0]);
            assertNotEquals("0", partes[3]);
        }
    }
}
