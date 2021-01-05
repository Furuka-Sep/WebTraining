package model;
import java.util.Arrays;
public class NumAppLogic {
	public void excute(NumData numdata) {
		System.out.println(Arrays.toString(numdata.getStrs()));
		int[] nums=new int[numdata.getStrs().length];
		int sum=0;
		numdata.setIndex(numdata.getStrs().length);
		for(int i=0;i<nums.length;i++) {
			nums[i]=Integer.parseInt(numdata.getStrs()[i]);
			System.out.println(numdata.getStrs()[i]);
			sum+=Integer.parseInt(numdata.getStrs()[i]);
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(nums.length);
		numdata.setNums(nums);
		numdata.setSum(sum);
		Arrays.sort(nums);
		System.out.println("clear");
		numdata.setMax(nums[nums.length]);
		numdata.setMin(nums[0]);
	}

}
