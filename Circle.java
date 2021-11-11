public class Circle extends Ellipse
{
	//icerisine r yi parametre olarak alan bir constructor tanimla
   constructor
   {
	   //atasinin constructorunu calistir
      super(r, r); 
	  //shapeName icerisine "Circle" yaz
	  this.shapeName = "Circle";
   }
   
}