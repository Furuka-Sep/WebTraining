package model;

public class GameLogic {
	public void execute(PlayData pd) {
		String player=pd.getCard()[pd.getCount()].replaceAll("[^0-9]", "");;
		String dealer=pd.getCard()[pd.getCount()+1].replaceAll("[^0-9]", "");;
		String[] judge= {"High","Low"};
		int[] draw= {Integer.parseInt(player),Integer.parseInt(dealer)};
		pd.setCount(pd.getCount()+2);
		if(judge[0]==judge[pd.getChoise()]) {
			if(draw[0]>draw[1]) {
				win;
			}else if(draw[0]<draw[1]) {
				lose;
			}else {

			}
		}else if(judge[1]==judge[pd.getChoise()]) {
		}
		pd.setHighScore(pd.getHighScore()+1);
	}
}
