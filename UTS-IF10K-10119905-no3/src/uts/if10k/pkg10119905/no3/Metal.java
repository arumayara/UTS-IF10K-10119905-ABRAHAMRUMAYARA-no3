/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119905.no3;

/**
 *
 * @author aruma
 */
public class Metal implements HeavyMetal{
    public void genreMetal (String artistName){
        System.out.println(artistName + " adalah musisi Metal");
    }

    @Override
    public void GenreHeavyMetal(String artistName) {
        System.out.println(artistName + " adalah musisi Heavy Metal");
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName + " adalah musisi Punk");
    }
    
    public void genreGrunk(String artistName){
        System.out.println(artistName + " adalah musisi Grunk");
    }
    
}