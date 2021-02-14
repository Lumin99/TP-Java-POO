/**
 * @(#)Port.java
 *
 *
 * @author 
 * @version 1.00 2020/3/2
 */


public class Port extends Quai {
	
	private float x;
	private float y;
	
    public Port(float x1, float y1) {
    	super();
    	x = x1;
    	y = y1;
    }
    
    public Port(float x1, float y1,int nbQuais) {
    	super(nbQuais);
    	x = x1;
    	y = y1;
    }
    
    public float retourneX(){
    	return x;
    }
    
    public float retourneY(){
    	return y;
    }
    
    public boolean ajouterBateau(){
    	if(super.quaisOcc<super.nbQuais){
    		super.quaisOcc++;
    		return true;
    	}else{
    		return false;
    	}
    }
    
    public void retraitBateau(){
    	if(super.quaisOcc>0){
    		super.quaisOcc--;
    	}else{
    		System.out.println("Aucune place est reservee");
    	}
    }
    
    public void Affich(){
    	System.out.println(this.x);
    	System.out.println(this.y);
    	super.Affich();
    }
    
}