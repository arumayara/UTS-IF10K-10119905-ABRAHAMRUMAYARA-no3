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
public class HardRock extends Rnb implements PopRock, ProgresiveRock, PsychdelicRock {
    public void genreHardRock(String artistName){
           System.out.println(artistName + " adalah musisi HardRock(");
    }

    @Override
    public void genrePopRock(String artistName) {
           System.out.println(artistName + " adalah musisi PopRock");
    }

    @Override
    public void genreProgresiverock(String artistName) {
           System.out.println(artistName + " adalah musisi Progresive Rock");
    }

    @Override
    public void genrePsychdelicRock(String artistName) {
           System.out.println(artistName + " adalah musisi PsychdelicRock");
    }
    
}

