/**
 * 
 */
package ua.khpi.oop.Reznichenko08;

public interface Iterator<E> {
	
	public boolean hasNext();
	public PoliceFile next();
	public void remove();
	public PoliceFile begin();
	public PoliceFile end();
}

