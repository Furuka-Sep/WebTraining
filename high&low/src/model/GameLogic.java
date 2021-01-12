package model;

public class GameLogic {
	public void execute(PlayData pd) {
		String player=pd.getCard()[pd.getCount()].replaceAll("[^0-9]", "");;
		String dealer=pd.getCard()[pd.getCount()+1].replaceAll("[^0-9]", "");;
		String[] judge= {"High","Low"};
		int[] draw= {Integer.parseInt(player),Integer.parseInt(dealer)};
		pd.setCount(pd.getCount()+2);
		if(judge[0]==judge[pd.getChoise()]) {
			//Playerの選択がHighの場合
			if(draw[0]>draw[1]) {
				//勝ち
				pd.setHighScore(pd.getHighScore()+1);
			}else if(draw[0]<draw[1]) {
				//負け
				//結果を出して最初の画面に戻るボタン
			}else {
				//同じ値(スコアは増やさずもう一度)
			}
		}else if(judge[1]==judge[pd.getChoise()]) {
			//Playerの選択がLowの場合
			if(draw[0]<draw[1]) {
				//勝ち
				pd.setHighScore(pd.getHighScore()+1);
			}else if(draw[0]>draw[1]) {
				//負け
				//結果を出して最初の画面に戻るボタン
			}else {
				//同じ値(スコアは増やさずもう一度)
			}
		}
	}
}
