package org.example.atividade1;

public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        Livro2 l2 = new Livro2();

        l1.titulo="O pequeno Principe";
        l1.autor="Antoine de Saint-Exupéry";
        l1.npaginas= 176;
        l1.preco = 50;

        l2.titulo="O principe";
        l2.autor="Maquiavel";
        l2.npaginas= 280;
        l2.preco = 60;


        System.out.println("titulo"+ l1.titulo);
        System.out.println("autor"+l1.autor);
        System.out.println("npaginas"+l1.npaginas);
        System.out.println("preco"+l1.preco);

        System.out.println("titulo"+ l2.titulo);
        System.out.println("autor"+l2.autor);
        System.out.println("npaginas"+l2.npaginas);
        System.out.println("preco"+l2.preco);

    }
}
