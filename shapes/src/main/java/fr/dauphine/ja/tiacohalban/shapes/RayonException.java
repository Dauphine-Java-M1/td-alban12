package fr.dauphine.ja.tiacohalban.shapes;

public class RayonException extends Exception {
	public RayonException()
	{
		System.out.println("Le rayon interne doit être inférieur au rayon pour avoir un anneau!");
	}

}
