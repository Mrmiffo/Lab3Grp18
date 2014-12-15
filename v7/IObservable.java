package v7;
/*Anton Strandman && Maxim Goretskyy
 *Grupp 18 Labb 3
 *Version 1.7
 * 
 */
import java.beans.PropertyChangeListener;
/**
 * Interface that is used by all game models, for listening to events and updating them.
 * 
 *
 */
public interface IObservable{
	public void addObserver(PropertyChangeListener observer);
	public void removeObserver(PropertyChangeListener observer);
	
	
}
