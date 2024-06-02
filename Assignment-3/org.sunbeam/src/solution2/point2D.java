package solution2;


	import java.lang.Math;

	import java.util.Scanner;

	public class point2D {
	       int x_axis;
	      int  y_axis;
		public point2D(int x_axis,int  y_axis) {
		
			this.x_axis = x_axis;
			this.y_axis = y_axis;
			
		}
		public point2D()
		{
			
		}
		public int  getX_axis() {
			return x_axis;
		}
		public void setX_axis(int x_axis) {
			this.x_axis = x_axis;
		}
		public int  getY_axis() {
			return y_axis;
		}
		public void setY_axis(int  y_axis) {
			this.y_axis = y_axis;
		}
		public void acceptCoordinate()

		{
			Scanner sc=new Scanner (System.in);
			System.out.println("enter x coordinates=");
			setX_axis(sc.nextInt());
			System.out.println("enter y coordinates=");
			setY_axis(sc.nextInt());
			
		}
		public String getDetails()
		{
			String result= "Point(x,y)=("+x_axis+ "," +y_axis +")";
			System.out.println(result);
			return result;	
		}
		public Boolean isEqual(point2D p1,point2D p2)
		{
		if(p1.getX_axis()==p2.getX_axis()&&p1.getY_axis()==p2.getY_axis()) {
			System.out.println("both points are equal");
			return true;
			
		}else
			return false;
		}
		public void calculateDistance(point2D p1,point2D p2)
		{
			int result=Math.sqrt(Math.pow(p2.getX_axis()-p1.getX_axis()),2)+Math.pow((p2.getY_axis()-p1.getY_axis()),2);
		}
	}
		

	   
	   
	  
	    


