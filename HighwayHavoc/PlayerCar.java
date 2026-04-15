import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerCar extends Actor
{
    private boolean leftHeld = false;
    private boolean rightHeld = false;
    /**
     * Act - do whatever the PlayerCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left") && !leftHeld) {
            leftHeld = true;
            
            if (getX() == 200) 
            setLocation(110, getY());
            else if (getX() == 295) 
            setLocation(200, getY());
            } else if (!Greenfoot.isKeyDown("left")) {
            leftHeld = false;
        }
    
        if (Greenfoot.isKeyDown("right") && !rightHeld) {
            rightHeld = true;
            
            if (getX() == 110) 
            setLocation(200, getY());
            else if (getX() == 200) 
            setLocation(295, getY());
            } else if (!Greenfoot.isKeyDown("right")) {
            rightHeld = false;
        }
        
        EnemyCar enemy = (EnemyCar) getOneIntersectingObject(EnemyCar.class);
        if (enemy != null){
            getWorld().removeObject(enemy);
            ((Highway) getWorld()).loseLife();
        }
        
        Coin coin = (Coin) getOneIntersectingObject(Coin.class);
        if (coin != null){
            getWorld().removeObject(coin);
            ((Highway) getWorld()).addScore();
        }
    }
}
