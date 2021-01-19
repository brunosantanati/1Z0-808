package me.brunosantana.exam4.package1;

public class Test05 {
    public static void main(String[] args) {
        int i;
        for(i=0; i<=2; i++){} //OK inicializar i em uma linha diferente da declaração
        //for(i=0; i<=2; i++){System.out.println(i);}
        System.out.println(i);
        
        int x, y, z;
        x = 10;
        y = 15; //se comentar essa linha ou a linha de cima da erro de compilação
        z = x + y; //se tentar usar a variável sem inicializa-la, da erro
        System.out.println(z);
    }
}
