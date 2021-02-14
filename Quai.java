/**
 * @(#)Quai.java
 *
 *
 * @author 
 * @version 1.00 2020/3/2
 */


public class Quai {
	
	private int nbQuais;
	private int quaisOcc;

    public Quai() {
    	nbQuais = 3;
    	quaisOcc = 0;
    }
    
    public Quai(int nb) {
    	if(nb>0){
    		nbQuais = nb;
    		quaisOcc = 0;
    	}else{
    		nbQuais = 3;
    		quaisOcc = 0;
    	}	
    }
    
    public boolean ajouterBateau(){
    	if(quaisOcc<nbQuais){
    		quaisOcc++;
    		return true;
    	}else{
    		return false;
    	}
    }
    
    public void retraitBateau(){
    	if(quaisOcc>0){
    		quaisOcc--;
    	}else{
    		System.out.println("Aucune place est reservee");
    	}
    }
    
    public void Affich(){
    	System.out.println(nbQuais);
    	System.out.println(quaisOcc);
    }
}