class Point implements Comparable<Point>
{

	private float xPoint;
	private float yPoint;

	// constructors
	Point() {}
	Point( float newX, float newY) { xPoint = newX; yPoint = newY; }

	// accessors/getters
	public float getXPoint() { return xPoint; }
	public float getYPoint() { return yPoint; }        

	// mutators/setters
	public void setXPoint(float newX) { xPoint = newX; }
	public void setYPoint(float newY) { yPoint = newY; }        

	public int compareTo(Point newPT)
	{
		// if compared (and printed) left to right, top to bottom in increasing value fashion
		if(this.yPoint == newPT.getYPoint()) {//y is same
			if(this.xPoint == newPT.getXPoint()) {//x is same
				return 0;
			}
			else if(this.xPoint > newPT.getXPoint()) {//newPT's x is smaller
				return 1;
			}
			else {//newPT's x is larger
				return -1;
			}
		}
		else if(this.yPoint > newPT.getYPoint()) {//newPT's y is smaller
			if(this.xPoint == newPT.getXPoint()) {//x is same
				return -3;
			}
			else if(this.xPoint > newPT.getXPoint()) {//newPT's x is smaller
				return -2;
			}
			else {//newPT's x is larger
				return -4;
			}
		}
		else {//newPT's y is larger
			if(this.xPoint == newPT.getXPoint()) {//x is same
				return 3;
			}
			else if(this.xPoint > newPT.getXPoint()) {//newPT's x is smaller
				return 4;
			}
			else {//newPT's x is larger
				return 2;
			}
		}
	}
	
	public boolean equals(Point newPT)
	{
		return (xPoint == newPT.getXPoint()) && (yPoint == newPT.getYPoint());
	}

	// toString
	public String toString() { return "X: " + getXPoint() + "\t\tY: " + getYPoint(); }

	// other methods
	public int getQuadrant() 
	{
		if(xPoint == 0 || yPoint == 0) {
			return 0;
		}
		else if(xPoint > 0) {//x > 0; 1 or 2
			if(yPoint > 0) {// y > 0; 1
				return 1;
			}
			else {//y < 0; 2
				return 2;
			}
		}
		else {//x < 0; 3 or 4
			if(yPoint > 0) {//y > 0; 4
				return 4;
			}
			else {//y < 0; 3
				return 3;
			}
		}
	}




}
