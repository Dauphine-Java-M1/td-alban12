package fr.dauphine.ja.tiacohalban.shapes;

public class Circle {
	private Point centre;
	private double rayon;
	public Circle()
	{
		this.centre=new Point();
		rayon=0;
	}
	public Circle(Point p, double rayon)
	{
		this.centre=p;
		this.rayon=rayon;
	}
	public void translate(double dx,double dy)
	{
		this.centre.translate(dx, dy);
	}
	
	@Override
	public String toString()
	{
		return "centre :"+this.centre.toString()+" de rayon "+this.rayon;
	}

}
