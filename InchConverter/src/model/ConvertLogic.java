package model;

public class ConvertLogic {
	public void execute(NumData numdata) {
		double inch=Double.parseDouble(numdata.getNum());
		numdata.setInch(inch);
		double cm=inch*numdata.getONEINCH();
		numdata.setCm(cm);
	}

}
