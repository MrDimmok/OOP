/**
 * 
 */
package ua.khpi.oop.Reznichenko07;

public interface Iterator<E> {
	
	public boolean hasNext();
	public PoliceFile next();
	public void remove();
	public PoliceFile begin();
	public PoliceFile end();
}

