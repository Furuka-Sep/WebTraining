package model;
import java.io.Serializable;
import java.util.TreeMap;
public class Data implements Serializable{
	private String name;
	private int raceNum;
	private String[] race= {"人間","エルフ","オーガ","プクリポ"};
	private int jobNum;
	private String[] job= {"戦士","盗賊","僧侶","魔術師"};
	private double[][] ratio= {{1.6,1,1.4,1,1},{1.1,1,1.2,1.3,1.3},{1.3,1.5,1.1,1,1},{1,1.9,1,1,1.1}};
	private int sum=0;
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double[][] getRatio() {
		return ratio;
	}
	private int[] val;
	public int[] getVal() {
		return val;
	}
	public void setVal(int[] val) {
		this.val = val;
	}
	public int getRaceNum() {
		return raceNum;
	}
	public void setRaceNum(int raceNum) {
		this.raceNum = raceNum;
	}
	public int getJobNum() {
		return jobNum;
	}
	public void setJobNum(int jobNum) {
		this.jobNum = jobNum;
	}
	public String getRace(int raceNum) {
		return race[raceNum];
	}
	public String[] getJob() {
		return job;
	}
	private TreeMap<String,Integer> status;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TreeMap<String, Integer> getStatus() {
		return status;
	}
	public void setStatus(TreeMap<String, Integer> status) {
		this.status = status;
	}

}
