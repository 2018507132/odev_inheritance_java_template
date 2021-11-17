public class Ellipse extends Shape
{
   		final int PI = 3;
	public int r1;
	public int r2;
	public String shapeName="Ellipse";
	public void Ellipse(int pr1,int pr2){
		
		r1=pr1;
		r2=pr2;
		
	}
	
	public int getArea(){
		int result = PI * r1 * r2;
		return result;
	}
   
}
