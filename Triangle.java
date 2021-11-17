public class Triangle extends Rectangle
{   
	public String shapeName= "Triangle";	
	public void Triangle(int pwidth, int pheigth){
		
		width=pwidth;
		heigth=pheigth;
		
		 
	}	
	
	public int getArea(){
		int result= width * heigth / 2;
		return result;
	}
}
