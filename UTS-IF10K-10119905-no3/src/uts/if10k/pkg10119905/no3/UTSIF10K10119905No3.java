/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119905.no3;

/**
 *
 * @author 
 * Nama: Abraham Rumayara
 * Kelas : IF10K
 * NIM : 10119905
 * UTS no 3. Genre Musik
 */
public class UTSIF10K10119905No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MusicGenre musicgenre = new MusicGenre();
        Rnb rnb = new Rnb();
        Folk folk = new Folk();
        Rockabilly rockabilly = new Rockabilly();
        HardRock hardrock = new HardRock();
        Metal metal = new Metal();
        Grindcore grindcore = new Grindcore();
        DeathMetal deathmetal = new DeathMetal();
        Trash trash = new Trash();
        DeathCoreKepiting deathcorekepiting = new DeathCoreKepiting();
        BlackMetal  blackmetal = new BlackMetal();
        NewSkull newskull = new NewSkull();
        
        
        
        rnb.genreBlues("Jimmy Hendric");
        rnb.genreJazz("ChadBaker");
        folk.genreFolk("Bob Dylan");
        rockabilly.genreRockabilly("ElvisPresley");
        hardrock.genreProgresiverock("DreamTheater");
        hardrock.genrePsychdelicRock("The Doors");
        hardrock.genrePopRock("Kiss");
        metal.genrePunk("MXPX");
        metal.GenreHeavyMetal("METALICA");
        grindcore.genreGrindCore("Mesin Tempur");
        deathmetal.genreDeathMetal("JASAD");
        deathcorekepiting.genreDeathDeathCoreKepiting("Revenge The Fate");
        blackmetal.genreBlackMetal("Behemoth");
        newskull.genreNewSkull("HATEBREED");
        
        
        
        
        
    }
    
}
