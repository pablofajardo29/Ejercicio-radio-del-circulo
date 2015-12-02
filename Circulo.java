
public class Circulo {

	
	    
	    private double radio;
	    public double mostrar;
	   
	   
public static int control=12;
public static void mostrar(){
 	System.out.println("llamando mostrar");

}
	    
	    Circulo(){
	        
	    }
	    public void setRadio(double radioParam){
	        this.radio=radioParam;
	        
	    }
	    public double getRadio(){
	        return this.radio;
	    }
	    public Circulo(double radioParam){
	        this.radio=radioParam;
	    }
	    public double getArea(){
	        return Math.PI*radio*radio;
	    }

	}


