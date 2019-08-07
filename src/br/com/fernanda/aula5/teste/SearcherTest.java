package br.com.fernanda.aula5.teste;

import br.com.fernanda.aula5.Searcher;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearcherTest {
    private Searcher searcher;

    @org.junit.Before
    public void setUp() throws Exception {
        searcher = new Searcher();
    }

    @Test
    public void retornaMenos1SeArrayEstaVazio(){
        //Arrange
        int[] items = {};

        //Act
        int pos = searcher.searcher(items,10);

        //assert
        assertEquals(-1, pos);
    }

    @Test
    public void retornaMenos1SeElementoNaoEncontrado(){
        //Arrange
        int[] items = {10,20,30,40,50};

        //Act
        int pos = searcher.searcher(items,60);

        //assert
        assertEquals(-1, pos);
    }

    @Test
    public void retornaPosicaoSeElementoEncontrado(){
        //Arrange
        int[] items = {10,20,30,40,50};

        //Act
        int pos1 = searcher.searcher(items,10);
        int pos2 = searcher.searcher(items,20);
        int pos3 = searcher.searcher(items,30);
        int pos4 = searcher.searcher(items,40);

        //assert
        assertEquals(0, pos1);
        assertEquals(1, pos2);
        assertEquals(2, pos3);
        assertEquals(3, pos4);
    }
}