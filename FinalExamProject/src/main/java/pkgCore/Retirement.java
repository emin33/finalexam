package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	//TODO: Build the contructor, getters and setters for the attributes above.

	public Retirement(int ytw, double arw, int yr, double arr, double ri, double ms) {
		this.iYearsToWork = ytw;//new RetirementController(ytw);
		this.dAnnualReturnWorking = arw;//new RetirementController(arw);
		this.iYearsRetired = yr;//new RetirementController(yr);
		this.dAnnualReturnRetired = arr;//new RetirementController(arr);
		this.dRequiredIncome = ri;//new RetirementController(ri);
		this.dMonthlySSI = ms;//new RetirementController(ms);
	}
	
	public int getiYearstoWork() {
		return iYearsToWork;//.get();
	}
	
	public int setiYearstoWork() {
		return iYearsToWork;//.set();
	}
	
	public double getdAnnualReturnWorking() {
		return dAnnualReturnWorking;//.get();
	}
	
	public double setdAnnualReturnWorking() {
		return dAnnualReturnWorking;//.set();
	}
	
	public int getiYearsRetired() {
		return iYearsRetired;//.get();
	}
	
	public int setiYearsRetired() {
		return iYearsRetired;//.set();
	}
	
	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;//.get();
	}
	
	public double setdAnnualReturnRetired() {
		return dAnnualReturnRetired;//.set();
	}
	
	public double getdRequiredIncome() {
		return dRequiredIncome;//.get();
	}
	
	public double setdRequiredIncome() {
		return dRequiredIncome;//.set();
	}
	
	public double getdMonthlySSI() {
		return dMonthlySSI;//.get();
	}
	
	public double setdMonthlySSI() {
		return dMonthlySSI;//.set();
	}
	
	
	public double AmountToSave()
	{
		//formulas found were contradictory and hard to apply
		
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		dAnnualReturnWorking /= 100;
		dAnnualReturnRetired /= 100;
		
		return TotalAmountSaved()*((1-Math.pow(1 + dAnnualReturnWorking, -iYearsToWork)) / dAnnualReturnWorking);
		//return (dRequiredIncome/Math.pow((1+dAnnualReturnWorking), iYearsToWork)) - (12*dMonthlySSI/Math.pow((1+dAnnualReturnRetired), iYearsRetired));
	}
	
	public double TotalAmountSaved()
	{
		dAnnualReturnWorking /= 100;
		dAnnualReturnRetired /= 100;
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		//return dMonthlySSI * iYearsRetired;
		return (dRequiredIncome/Math.pow((1+dAnnualReturnWorking), iYearsToWork)) + (12*dMonthlySSI/Math.pow((1+dAnnualReturnRetired), iYearsRetired));
	}
}
