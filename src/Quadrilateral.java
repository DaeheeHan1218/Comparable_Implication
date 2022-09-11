import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Quadrilateral 
{

	Quadrilateral () {}
	Quadrilateral (Point a, Point b, Point c, Point d)
	{
		// it is assumed that sides of the Quadrilateral do not cross
		points.add(a);
		points.add(b);
		points.add(c);
		points.add(d);
		Collections.sort(points);
	}

	
	private ArrayList <Point> points = new ArrayList<Point>(4);
	
	
	public String toString()
	{
		String value = "------------------------------ \n";
		for(int i = 0; i < 4; i++) {
			value = value + points.get(i) + "\n";
		}
		return value;
	}
	
	
}
