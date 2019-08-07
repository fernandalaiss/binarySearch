package br.com.fernanda.aula5;

import javax.crypto.SealedObject;

public class Main {

    public static void main(String[] args) {
	    int[] numeros = {10, 20, 30, 40, 50};

        Searcher s = new Searcher();
        int pos = s.searcher(numeros, 10);
        if(pos > 0){
            System.out.println("Elemento encontrado");

        }
    }
}
