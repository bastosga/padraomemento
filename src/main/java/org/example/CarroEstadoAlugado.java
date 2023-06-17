package org.example;

public class CarroEstadoAlugado  implements CarroEstado{
    private CarroEstadoAlugado() {};
    private static CarroEstadoAlugado instance = new CarroEstadoAlugado();
    public static CarroEstadoAlugado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Carro Alugado";
    }
}
