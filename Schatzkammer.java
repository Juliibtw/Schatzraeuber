import greenfoot.*;


/**
 * Diese Klasse modelliert eine Schatzkammer.
 * 
 * @author 
 * @version 
 */
public class Schatzkammer extends MyWorld
{

    /**
     * Es wird eine Schatzkammer erzeugt.
     */
    public Schatzkammer()
    {    
        super(19, 19, 30);
        setzeWände();
        setzeCoins();
        setzePortal();
        setzeMonster();
        setzeWaechter();
        setzeAbenteurer();
    }
    private void setzeWaechter(){
        int x = Greenfoot.getRandomNumber(19);
            int y = Greenfoot.getRandomNumber(19);
            while(!getObjectsAt(x, y, Schatz.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!getObjectsAt(x, y, Wand.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!getObjectsAt(x, y, Portal.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!getObjectsAt(x, y, Abenteurer.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            addObject(new Waechter(),x, y);
    }
    private void setzeAbenteurer(){
        int x = Greenfoot.getRandomNumber(19);
            int y = Greenfoot.getRandomNumber(19);
            while(!getObjectsAt(x, y, Schatz.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!getObjectsAt(x, y, Wand.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!getObjectsAt(x, y, Portal.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!getObjectsAt(x, y, Waechter.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            addObject(new Abenteurer(),x, y);
    }
    private void setzeMonster(){
        int x = Greenfoot.getRandomNumber(19);
            int y = Greenfoot.getRandomNumber(19);
            while(!getObjectsAt(x, y, Schatz.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!getObjectsAt(x, y, Wand.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!getObjectsAt(x, y, Portal.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            addObject(new monster(),x, y);
    }
    private void setzeCoins(){
        
        for(int i=0; i<5; i++){
            int x = Greenfoot.getRandomNumber(19);
            int y = Greenfoot.getRandomNumber(19);
            while(!getObjectsAt(x, y, Schatz.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!getObjectsAt(x, y, Wand.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            addObject(new Schatz(),x, y);
        }
    }
    private void setzePortal(){
        int x = Greenfoot.getRandomNumber(19);
            int y = Greenfoot.getRandomNumber(19);
            while(!getObjectsAt(x, y, Schatz.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            while(!getObjectsAt(x, y, Wand.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            addObject(new Portal(),x, y);
    }
    private void setzeWände(){
        for(int i=0; i<20; i++){
            int x = Greenfoot.getRandomNumber(19);
            int y = Greenfoot.getRandomNumber(19);
            while(!getObjectsAt(x, y, Wand.class).isEmpty()){
                x = Greenfoot.getRandomNumber(19);
                y = Greenfoot.getRandomNumber(19);
            }
            addObject(new Wand(),x, y);
        }
    }
}
