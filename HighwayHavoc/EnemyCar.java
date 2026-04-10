import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyCar extends Actor
{
    /**
     * Act - do whatever the EnemyCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public EnemyCar()
    {
        int randomNumber = (Greenfoot.getRandomNumber(3) + 1);
        String carChosen = ("car0"+randomNumber+"-n.png");
        setImage(carChosen);
        getImage().rotate(180);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
