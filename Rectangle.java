public class Rectangle extends Shape
{public int width;
	public int heigth;
	public String shapeName= "Rectangle";
	public void Rectangle(int pwidth,int pheigth){
		
		width=pwidth;
		heigth=pheigth;
		
	}
	
	public int getArea(){
		int result= width * heigth;
		return result;
	}
   }
}
