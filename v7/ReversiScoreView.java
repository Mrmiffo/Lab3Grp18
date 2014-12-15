package v7;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

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
