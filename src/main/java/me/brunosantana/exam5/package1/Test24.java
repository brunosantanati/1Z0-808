package me.brunosantana.exam5.package1;

/*
Meu rascunho, depois precisa conferir:
i = 2
j = 4
k = 6

i = 2
j = 3
k = 11

i = 2
j = 2
k = 15
 */

public class Test24 {
    public static void main(String[] args) {
        int i = 1;
        int j = 5;
        int k = 0;
        A: while(true) {
            i++;
            B: while(true) {
                j--;
                C: while(true) {
                    k += i + j;
                    if(i == j)
                        break A;
                    else if (i > j)
                        continue A;
                    else 
                        continue B;
                }
            }
        }
        System.out.println(k);
    }
}
