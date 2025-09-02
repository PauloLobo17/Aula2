package org.exemplo.Polimorfismo;

public class Gato implements Animal {

    @Override
    public String emitirSom() {
        return "Miau Miau";
    }

    @Override
    public String comer() {
        return "O gato está comendo ração.";
    }
}
