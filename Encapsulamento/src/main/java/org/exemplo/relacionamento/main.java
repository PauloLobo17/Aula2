package org.exemplo.relacionamento;

public class main {
    public static void main(String[] args) {
        pet pet1 = new pet("Rex", "Salsicha", 5);
        cliente cliente1 = new cliente("João", "123456789", pet1);

        System.out.println(cliente1);
    }
}
