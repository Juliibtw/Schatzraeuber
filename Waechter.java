import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Waechter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Waechter extends Person
{
    /**
     * Act - do whatever the Waechter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        bewegen();
        fangen();
    }
    private void fangen()
    {
        World myWorld = getWorld();
        if(getOneObjectAtOffset(0,0, Abenteurer.class) != null){
            myWorld.removeObject(this.getOneObjectAtOffset(0, 0, Abenteurer.class));
            myWorld.addObject(new waechtersieg(), 10, 10);
            
        }
    }
    private void bewegen(){
        if(Greenfoot.isKeyDown("up")){
            move('o');
        }
        else if(Greenfoot.isKeyDown("left")){
            move('l');
        }
        else if(Greenfoot.isKeyDown("down")){
            move('u');
        }
        else if(Greenfoot.isKeyDown("right")){
            move('r');
        }

    }
}
