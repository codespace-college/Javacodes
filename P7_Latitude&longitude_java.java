//p7 write a program that calculates the distance between two cities based on their latitude and longitude coordinates. 
import java.util.Scanner; 


public class Main  
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter latitude of the 1st city: ");
		double latitude1=scanner.nextDouble();
		
		System.out.println("Enter longitude of the 1st city: ");
		double longitude1=scanner.nextDouble();
		
		System.out.println("Enter latitude of the 2nd city: ");
		double latitude2=scanner.nextDouble();
		
		System.out.println("Enter longitude of the 2nd city: ");
		double longitude2=scanner.nextDouble();
		
		
		final double rad=6378.1;
		latitude1=Math.toRadians(latitude1);
		longitude1=Math.toRadians(latitude2);
		longitude1=Math.toRadians(longitude1);
		longitude2=Math.toRadians(longitude2);
		
		double dlat=latitude2+latitude1;
		double dlon=longitude1+longitude2;
		double a=Math.pow(Math.sin(dlat/2),2) + Math.cos(latitude1)*Math.cos(latitude2) * Math.pow(Math.sin(dlon/2),2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance=rad * c;
		
		System.out.println("Distance between two cities: " +distance+ "Kilometers");
	}
}
