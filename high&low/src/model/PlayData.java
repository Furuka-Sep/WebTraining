package model;
import java.io.Serializable;

public class PlayData implements Serializable{
	private String[] card;
	private String name="名無しのギャンブラさん";
	private int count;
	private int highScore;
	private int choice;
	public PlayData(String name) {
		this.name=name;
		this.count=0;
		this.highScore=0;
	}
	public String getName() {
		return name;
	}
	public String[] getCard() {
		return card;
	}
	public void setCard(String[] string) {
		this.card=string;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getHighScore() {
		return highScore;
	}
	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
	public int getChoise() {
		return choice;
	}
	public void setChoise(int choice) {
		this.choice=choice;
	}
}
