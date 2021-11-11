public class Main
{
   public static void main(String[] args)
   {
	    //yapman gereken gorevler sirasiyla asagida yaziyor.
		//shape->sinifini icerisinde yazdigi sekilde abstract a donustur 		
		//shape->Rectangle->sinifini icerisinde yazdigi sekilde tanimla
		//shape->Rectangle->Square sinifini icerisinde yazdigi sekilde tanimla
		//shape->Rectangle->Square->Cube sinifini icerisinde yazdigi sekilde tanimla 
		//shape->Rectangle->Triangle sinifini icerisinde yazdigi sekilde tanimla
		//shape->Ellipse sinifini icerisinde yazdigi sekilde tanimla
		//shape->Circle sinifini icerisinde yazdigi sekilde tanimla
		//bu sinif icerisinde bir degisikilik yapman gerekmiyor
		
		/*
		derleme
		C:\Users\YBS\Desktop\java-inheritance>javac *.java
		calistirma
		C:\Users\YBS\Desktop\java-inheritance>java Main
		
		asagidaki ciktiyi elde etmen gerekiyor
		
		Rectangle area: 30.0
		Square area: 25.0
		Cube Volume: 125.0
		Triangle area: 15.0
		Ellipse area: 36.0
		Circle area: 27.0
		
		github uzerinde bir kontrol mekanizmasi bu odevde yok yukaridaki ciktiyi elde etmen yeterli
		
		*/
	  Rectangle myRect = new Rectangle(5,6);	  
      System.out.println( myRect.shapeName + " area: " + myRect.getArea());
	  
	  Square mySquare = new Square(5);	  
      System.out.println( mySquare.shapeName + " area: " + mySquare.getArea());
	  
      Cube myCube = new Cube(5);
      System.out.println(myCube.shapeName +" Volume: " + myCube.getVolume());
	  
	  Triangle myTriangle = new Triangle(5,6);	  
      System.out.println( myTriangle.shapeName + " area: " + myTriangle.getArea());
	  
	  Ellipse myEllipse = new Ellipse(3,4);	  
      System.out.println( myEllipse.shapeName + " area: " + myEllipse.getArea());
	    	  
	  Circle myCircle = new Circle(3);	  
      System.out.println( myCircle.shapeName + " area: " + myCircle.getArea());
	  
	  
   }
}