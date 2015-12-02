
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo cr1=new Circulo();
		cr1.setRadio(10);
		

		
		 	Circulo cr2=cr1;
		 	Circulo cr3=new Circulo(8);
		 	cr3=cr1;
		 	cr3.setRadio(45);
		 	System.out.println("radiocr1:"+cr1.getRadio());
		 	System.out.println("radiocr2:"+cr2.getRadio());
		 	System.out.println("radiocr3:"+cr3.getRadio());
		 	
		 	
		 	int i=12;
		 	int j=17;
		 	 int z=20;
		 	 
		 	 j=i;
		 	 i=100;
			 	System.out.println("i:"+i);
			 	System.out.println("j:"+j);
			 	System.out.println("z:"+z);
			 	
			 	 Circulo.control++;
				 	System.out.println("control"+Circulo.control);
				 	Circulo.mostrar();
				 	cr1.mostrar();
				 	System.out.println(cr1.control);
				 	 System.out.println(cr2.control);
				 	 System.out.println(cr3.control);


			 	 

	}

}
