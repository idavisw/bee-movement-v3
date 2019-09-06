//Ian D
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1, false);
        bee bee1 = new bee();            
        addObject(bee1, 0, 300); 
        Lemur lemur1 = new Lemur();
        addObject(lemur1, 0, 300);
        for(int i = 0; i < 8; i++) {
            Cactus cactus1 = new PoisonMushroom();
            addObject(cactus1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(570));
            Cactus cactus2 = new Lemon();
            addObject(cactus2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(570));
            Cactus cactus3 = new PoisonIvy();
            addObject(cactus2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(570));
            Flower flower1 = new Flower1();
            addObject(flower1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(570));
            Flower flower2 = new Flower2();
            addObject(flower2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(570));
            Flower flower3 = new Flower3();
            addObject(flower3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(570));          
        }
        if(numberOfObjects()==2) {
            TieWorld tiescreen = new TieWorld();
            Greenfoot.setWorld(tiescreen);
        
    }
}
}