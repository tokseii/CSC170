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
    
    private int score = 0;
    private int lives = 3;
    private int spawnTimer = 0;
    
    public void loseLife(){
        lives -= 1;
    }
    
    public void addScore(){
        score += 1;
    }
    
    public Highway()
    {    
        super(400, 600, 1);

        GreenfootImage background = new GreenfootImage("highway.png");
        background.scale(400, 600);
        setBackground(background);

        addObject(new PlayerCar(), 200, 500);
        //addObject(new EnemyCar(3), 125, 100);
        //addObject(new EnemyCar(3), 200, 150); 
        //addObject(new Coin(2), 285, 300);
        prepare();
    }
    
    public void act(){
        showText("Score: " + score, 60, 20);
        showText("Lives: " + lives, 340, 20);
        
        spawnTimer += 1;
        
        if (spawnTimer >= 60){
            spawnTimer = 0;
            spawnEnemy();
            spawnCoin();
        }
    }
    
    private int[] lanes = {110, 200, 295};
    
    private void spawnEnemy(){
        int lane = lanes[Greenfoot.getRandomNumber(3)];
        addObject(new EnemyCar(3), lane, 0);
    }
    
    private void spawnCoin(){
        int lane = lanes[Greenfoot.getRandomNumber(3)];
        addObject(new Coin(2), lane, 0);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
