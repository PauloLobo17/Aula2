package org.exemplo.Polimorfismo;

public class Cachorro implements Animal {
    @Override
    public String emitirSom() {
        return "Au Au";
    }

    @Override
    public String comer() {
        return "O cachorro está comendo ração.";
    }

}
