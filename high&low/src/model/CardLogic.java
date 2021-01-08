package model;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CardLogic {
	public void execute(PlayData playdata) {
		String[] deck=new String[52];
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=13;j++) {
				if(i==1) {
					deck[j]="s"+j;
				}else if(i==2){
					deck[i*j]="c"+j;
				}else if(i==3){
					deck[i*j]="h"+j;
				}else{
					deck[i*j]="d"+j;
				}
			}
		}
	 Random rnd = ThreadLocalRandom.current();
	    for (int i = deck.length - 1; i > 0; i--) {
	        int index = rnd.nextInt(i + 1);
	        String tmp = deck[index];
	        deck[index] = deck[i];
	        deck[i] = tmp;
	    }
	    playdata.setCard(deck);
	}
}
