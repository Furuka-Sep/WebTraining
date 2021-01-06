package model;
import java.io.Serializable;
public class NumData implements Serializable{
	private String num;
	private double inch;
	private double cm;
	private final double ONEINCH=2.54;
	public NumData() {}
	public NumData(String num) {
		this.setNum(num);
	}
	public double getInch() {
		return inch;
	}
	public void setInch(double inch) {
		this.inch = inch;
	}
	public double getCm() {
		return cm;
	}
	public void setCm(double cm) {
		this.cm = cm;
	}
	public double getONEINCH() {
		return ONEINCH;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
}
