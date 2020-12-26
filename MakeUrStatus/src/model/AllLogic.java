package model;

import java.util.Random;
import java.util.TreeMap;

public class AllLogic {
	String[] para= {"体力","魔力","筋力","器用","敏捷"};
	int[][] raceStatus= {{10,10,10,10,10},{0,20,0,10,20},{30,0,20,0,0},{10,0,0,25,20}};
	public void nameStatus(Data data) {
		String name=data.getName();
		int seed=calcSeed(name);
		int[] maxArr= {100,100,50,50,50};
		int[] val=makeStatus(seed,maxArr);
		TreeMap<String,Integer> status=new TreeMap<>();
		for(int i=0;i<para.length;i++) {
			status.put(para[i], val[i]);
		}
		data.setVal(val);
		data.setStatus(status);
	}
	public void raceStatus(Data data) {
		int val[]=data.getVal();
		for(int i=0;i<data.getVal().length;i++){
			data.getStatus().replace(para[i],data.getVal()[i]+raceStatus[data.getRaceNum()][i]);
			val[i]+=raceStatus[data.getRaceNum()][i];
		  }
		data.setVal(val);
	}
	public void jobStatus(Data data) {
		for(int i=0;i<data.getVal().length;i++){
		    data.getVal()[i]=(int)(data.getVal()[i]*data.getRatio()[data.getJobNum()][i]);
		    data.getStatus().replace(para[i],data.getVal()[i]+raceStatus[data.getRaceNum()][i]);
		  }
	}
	static int calcSeed(String name){
		  int seed=0;
		  for(int i=0;i<name.length();i++){
		    seed+=name.charAt(i);
		  }
		  return seed;
		}
	static int[] makeStatus(int seed,int[] maxArr){
		int[] vals=new int[maxArr.length];
		Random rand=new Random(seed);
		for(int i=0;i<vals.length;i++){
			vals[i]=rand.nextInt(maxArr[i])+1;
		}
		return vals;
	}
	public void sumStatus(Data data) {
		int sum=0;
		for(int i=0;i<data.getVal().length;i++) {
			sum+=data.getVal()[i];
		}
		data.setSum(sum);
	}
}
