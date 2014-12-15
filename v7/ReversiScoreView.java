package v7;
/*Anton Strandman && Maxim Goretskyy
 *Grupp 18 Labb 3
 *Version 1.7
 * 
 */
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
/**
 * Class that prints the score and turn color. 
 *
 *
 */
public class ReversiScoreView implements PropertyChangeListener{

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName() == "ScoreUpdate"){
			System.out.println("Black's score is " + ((ReversiModel)evt.getSource()).getBlackScore());
			System.out.println("White's score is " + ((ReversiModel)evt.getSource()).getWhiteScore());
			
			System.out.println("It's " + ((ReversiModel)evt.getSource()).getTurnColor() + "'s turn");
		}
	}
	
}
