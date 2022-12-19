import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Abenteurer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Abenteurer  extends Person
{
    /**
     * Act - do whatever the Abenteurer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        bewegen();
        einsammeln();
        randomjump();
        removewall();
        info();
        einsammeln();
    }
    // Attriute:
    int myCoins = 0;
    private void einsammeln(){
        World myWorld = getWorld();
        if(getOneObjectAtOffset(0,0,Schatz.class)!=null){
            myWorld.removeObject(getOneObjectAtOffset(0, 0, Schatz.class));
            myCoins++;
        }
        myWorld.showText("#"+ myCoins, 0, 0);
        if(0 == myWorld.getObjects(Schatz.class).size()){
            myWorld.addObject(new abenteurersieg(), 10, 10);
            
        }
    }
    private void randomjump(){
        if(Greenfoot.isKeyDown("j")){
            int x = Greenfoot.getRandomNumber(19);
            int y = Greenfoot.getRandomNumber(19);
            World world = getWorld();
            while(!world.getObjectsAt(x, y, Wand.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            setLocation(x, y);
        }
    }

    private void info(){
        if(Greenfoot.isKeyDown("i")){
            World world = getWorld();
            int height = world.getHeight();
            int width = world.getWidth();
            int actorX = getX();
            int actorY = getY();
            int numCoins = world.getObjects(Schatz.class).size();
            int numWalls = world.getObjects(Wand.class).size();
            //System.out.println("----------------------------------------");
            //System.out.println("////////////////////////////////////////");
            //System.out.println("----------------------------------------");
            //System.out.println("Höhe der Welt: "+ height + ", Breite der Welt: " + width);
            //System.out.println("Position des Abenteurers: x: "+ actorX + ", y: "+ actorY);
            //System.out.println("Anzahl der Schaetze: " + schaetze);
            //System.out.println("Anzahl Waende: "+ waende);
            //System.out.println("----------------------------------------");
            //System.out.println("////////////////////////////////////////");
            //System.out.println("----------------------------------------");
            String info_str = "Actor X,Y: "+ actorX+","+actorY+"; #Coins="+numCoins+"; #Walls="+numWalls;
            world.showText(info_str, 10, 0);
        }
    }

    private void removewall(){
        if(Greenfoot.isKeyDown("r")){
            World world = getWorld();
            world.removeObject(getOneObjectAtOffset(0,-1, Wand.class));
            world.removeObject(getOneObjectAtOffset(1,0, Wand.class));
            world.removeObject(getOneObjectAtOffset(0,1, Wand.class));
            world.removeObject(getOneObjectAtOffset(-1,0, Wand.class));
        }
    }

    private void bewegen(){
        if(Greenfoot.isKeyDown("w")){
            move('o');
        }
        else if(Greenfoot.isKeyDown("a")){
            move('l');
        }
        else if(Greenfoot.isKeyDown("s")){
            move('u');
        }
        else if(Greenfoot.isKeyDown("d")){
            move('r');
        }

    }


}
