//Ian 
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
        addObject(bee1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600)); 
        Lemur lemur1 = new Lemur();
        addObject(lemur1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
        for(int i = 0; i < 2000; i++) {
            
            Cactus cactus1 = new PoisonMushroom();
            addObject(cactus1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
            Cactus cactus2 = new Lemon();
            addObject(cactus2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
            Cactus cactus3 = new PoisonIvy();
            addObject(cactus2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
            Flower flower1 = new Flower1();
            addObject(flower1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
            Flower flower2 = new Flower2();
            addObject(flower2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
            Flower flower3 = new Flower3();
            addObject(flower3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));          
        }

        
    }
}
