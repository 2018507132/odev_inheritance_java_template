public class Cube extends Square
{
	   public int yukseklik;     	
	public String shapeName="Cube";
    public void Cube(int pyukseklik){
		
	     yukseklik=pyukseklik;
	     	 	    

    }	  
    public int getVolume(){
         int hacim;
         hacim=yukseklik*yukseklik*yukseklik;
	     return hacim;
    }
}
