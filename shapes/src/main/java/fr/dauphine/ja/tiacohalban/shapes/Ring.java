package fr.dauphine.ja.tiacohalban.shapes;

import java.util.List;

public class Ring extends Circle {
	private Point centre;
	private double rayon;
	private double rayoninterne;
	public Ring(Point p,double rayon,double rayoninterne)
		throws RayonException
		{
			if (rayoninterne>rayon) throw new RayonException();
				this.centre=p;
				this.rayon=rayon;
				this.rayoninterne=rayoninterne;
		
		}
	public Ring() {
		// TODO Auto-generated constructor stub
	}
	public boolean equals(Object r)
	{
		if (!(r instanceof Ring)) return false;
		Ring c = (Ring)r;
		return this.rayon==c.rayon && this.rayoninterne==c.rayoninterne && this.centre.equals(c.centre);
	}
	public boolean contains(Point p)
	{
		
		return false;
	}
	}

