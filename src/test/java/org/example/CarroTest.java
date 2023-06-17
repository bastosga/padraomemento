import org.example.Carro;
import org.example.CarroEstadoAlugado;
import org.example.CarroEstadoDisponivel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveArmazenarEstados() {
        Carro carro = new Carro();
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        carro.setEstado(CarroEstadoAlugado.getInstance());
        assertEquals(2, carro.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Carro carro = new Carro();
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        carro.setEstado(CarroEstadoAlugado.getInstance());
        carro.restauraEstado(0);
        assertEquals(CarroEstadoDisponivel.getInstance(), carro.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Carro carro = new Carro();
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        carro.setEstado(CarroEstadoAlugado.getInstance());
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        carro.restauraEstado(1);
        assertEquals(CarroEstadoAlugado.getInstance(), carro.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Carro carro = new Carro();
            carro.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}