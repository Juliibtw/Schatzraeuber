import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        port();
    }    

    private void port(){
        World myWorld = getWorld();
        if(getOneObjectAtOffset(0,0, Abenteurer.class) != null){
            int x = Greenfoot.getRandomNumber(19);
            int y = Greenfoot.getRandomNumber(19);
            World world = getWorld();
            while(!world.getObjectsAt(x, y, Wand.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!world.getObjectsAt(x, y, Waechter.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!world.getObjectsAt(x, y, Portal.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            getOneObjectAtOffset(0,0, Abenteurer.class).setLocation(x, y);

        }
        if(getOneObjectAtOffset(0,0, Waechter.class) != null){
            int x = Greenfoot.getRandomNumber(19);
            int y = Greenfoot.getRandomNumber(19);
            World world = getWorld();
            while(!world.getObjectsAt(x, y, Wand.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!world.getObjectsAt(x, y, Abenteurer.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!world.getObjectsAt(x, y, Portal.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            getOneObjectAtOffset(0,0, Waechter.class).setLocation(x, y);

        }
        if(getOneObjectAtOffset(0,0, monster.class) != null){
            int x = Greenfoot.getRandomNumber(19);
            int y = Greenfoot.getRandomNumber(19);
            World world = getWorld();
            while(!world.getObjectsAt(x, y, Wand.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!world.getObjectsAt(x, y, Waechter.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!world.getObjectsAt(x, y, Abenteurer.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!world.getObjectsAt(x, y, Portal.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            getOneObjectAtOffset(0,0, monster.class).setLocation(x, y);

        }

    }
}
