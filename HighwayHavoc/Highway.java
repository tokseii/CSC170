import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Highway extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Highway()
    {    
        super(400, 600, 1);

        GreenfootImage background = new GreenfootImage("highway.png");
        background.scale(400, 600);
        setBackground(background);

        addObject(new PlayerCar(), 200, 500);
        addObject(new EnemyCar(), 125, 100);
        addObject(new EnemyCar(), 200, 150); 
        addObject(new Coin(), 285, 300);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
