package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carro  {
    private CarroEstado estado;
    private List<CarroEstado> memento = new ArrayList<CarroEstado>();

    public CarroEstado getEstado() {
        return this.estado;
    }

    public void setEstado(CarroEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<CarroEstado> getEstados() {
        return this.memento;
    }
}
