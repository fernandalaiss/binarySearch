package br.com.fernanda.aula5;

import com.sun.org.apache.regexp.internal.RE;

public class Searcher {
    public int searcher(int[] numeros, int i) {
        return binarySearch(numeros, i, 0, numeros.length - 1);
    }

    private int binarySearch(int[] numeros, int item, int start, int end){
        if(end < start){
            return -1;
        }

        int meio = Math.floorDiv(start + end, 2);

        if(item == numeros[meio]){
            return meio;
        }else if(item > numeros[meio]){
            return binarySearch(numeros, item, meio+1, end);
        }else{ // item < numeros[meio]
            return binarySearch(numeros, item, start, meio-1);
        }
    }
}
