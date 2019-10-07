package fr.dauphine.ja.tiacohalban.shapes;

public class Point {
	private double x;
	private double y;
	private static int nombrePointCree=0;
	public Point()
	{
		this.x=0;
		this.y=0;
		nombrePointCree++;
	}
	public Point(double x,double y)
	{
		this.x=x;
		this.y=y;
		nombrePointCree++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point();
		System.out.println("("+p.x+","+p.y+")");
	}
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}
	public boolean isSameAs(Point p)
	{
		if (this.x==p.x && this.y==p.y) return true;
		else return false;
	}

}
