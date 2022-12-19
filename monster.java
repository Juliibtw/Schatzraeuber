import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monster extends Person
{
    /**
     * Act - do whatever the monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        bewegen();
        abenteurerfangen();
        waechterfangen();
    }    
    private void abenteurerfangen()
    {
        World myWorld = getWorld();
        if(getOneObjectAtOffset(0,0, Abenteurer.class) != null){
            myWorld.removeObject(this.getOneObjectAtOffset(0, 0, Abenteurer.class));
            myWorld.addObject(new waechtersieg(), 10, 10);
            Greenfoot.stop();
        }
    }
    private void waechterfangen()
    {
        World myWorld = getWorld();
        if(getOneObjectAtOffset(0,0, Waechter.class) != null){
            myWorld.removeObject(this.getOneObjectAtOffset(0, 0, Waechter.class));
            myWorld.addObject(new abenteurersieg(), 10, 10);
            
        }
    }
    private void bewegen(){
        int num = Greenfoot.getRandomNumber(25);
        switch(num){
            case 0 : 
                move('o');
                break;
            case 1 :
                move('l');
                break;
            case 2 :
                move('u');
                break;
            case 3 :
                move('r');
                break;
            default:
                break;
        }
    }
}
