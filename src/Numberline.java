import java.util.*;

class Numberline implements Comparator<Point>
{
	// Comparator interface requires defining comparison method.
	public int compare(Point pt1, Point pt2) {
		if(pt1.getXPoint() > pt2.getXPoint()) {
			return 1;
		}
		else if (pt1.getXPoint() < pt2.getXPoint()){
			return -1;
		}
		else {
			return 0;
		}
	}
}
