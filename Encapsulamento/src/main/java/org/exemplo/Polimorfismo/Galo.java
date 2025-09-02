package org.exemplo.Polimorfismo;

public class Galo  implements Animal {

    @Override
    public String emitirSom() {
        return "Cocoricó Cocoricó";
    }

    @Override
    public String comer() {
        return "O galo está comendo milho.";
    }
}
