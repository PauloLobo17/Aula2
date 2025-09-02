package org.exemplo.Polimorfismo;

public class Main {
    public static void main(String[] args) {
      Cachorro cachorro = new Cachorro();
      Gato gato = new Gato();
      Galo galo = new Galo();
      Pato pato = new Pato();

        System.out.println( cachorro.emitirSom() + " / " + cachorro.comer());
        System.out.println( gato.emitirSom() + " / " + gato.comer());
        System.out.println( galo.emitirSom() + " / " + galo.comer());
        System.out.println(  pato.emitirSom() + " / " + pato.comer());



    }
}
