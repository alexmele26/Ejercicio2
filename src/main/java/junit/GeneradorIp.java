package junit;

import java.util.Random;

public class GeneradorIp {
	
	private Random random = new Random();

    public int generarNumero(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public String generarIp() {
        int[] numeros = new int[4];
        for (int i = 0; i < 4; i++) {
            numeros[i] = generarNumero(0, 255);
        }
        return numeros[0] + "." + numeros[1] + "." + numeros[2] + "." + numeros[3];
    }
}
