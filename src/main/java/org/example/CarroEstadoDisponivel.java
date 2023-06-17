package org.example;

public class CarroEstadoDisponivel  implements CarroEstado{
    private CarroEstadoDisponivel() {};
    private static CarroEstadoDisponivel instance = new CarroEstadoDisponivel();
    public static CarroEstadoDisponivel getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Carro Alugado";
    }
}
