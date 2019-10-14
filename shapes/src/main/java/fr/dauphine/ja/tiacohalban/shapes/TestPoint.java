package fr.dauphine.ja.tiacohalban.shapes;

import java.util.ArrayList;

public class TestPoint {

	public static void main(String[] args) throws RayonException {
		// TODO Auto-generated method stub
		/*Point p=new Point();
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		System.out.println("("+p.getX()+","+p.getY()+")");
		System.out.println(p.isSameAs(p2));
		ArrayList<Point> list = new ArrayL(Mist<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));*/
		Point p0=new Point(5,0);
		Point p1=new Point(5,1);
		Point p2=new Point(5,2);
		Point p3=new Point(5,3);
		Point p4=new Point(5,4);
		BrokenLine bl = new BrokenLine();
		bl.add(p0);
		bl.add(p1);
		bl.add(p2);
		//System.out.println(bl.contains(null));
		/*Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		System.out.println(c+" "+c2);*/
		Circle c = new Circle(new Point(1,1),2);
		System.out.println(c.contains(new Point(1,3)));
		
		
		Ring ring = new Ring(new Point(1,1),3,2);
		System.out.println(ring.getCenter());
		System.out.println(ring);
	}

}
