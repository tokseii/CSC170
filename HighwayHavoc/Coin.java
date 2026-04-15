import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    
    public Coin(int speed){
        this.speed = speed;
        GreenfootImage image = getImage();
        image.scale(40, 40);
        setImage(image);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + speed);
        if (getY() == getWorld().getHeight() - 1){
            getWorld().removeObject(this);
        }
    }
}
