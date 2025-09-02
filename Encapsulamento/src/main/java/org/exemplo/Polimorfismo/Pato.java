package org.exemplo.Polimorfismo;

public class Pato implements Animal {

    @Override
    public String emitirSom() {
        return "Quack Quack";
    }

    @Override
    public String comer() {
        return "O pato está comendo grãos.";
    }
}
