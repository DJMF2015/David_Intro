package miscellaneous;

public class InterestRate implements InterfaceInterest {

	// method to calc interest rate
	@Override
	public double rate() {

		// method to calculate basic interest rate at 4%
		double am = rate / 100;
		System.out.println(am);
		double partial1 = Math.pow((1 + rate), -numPeriods);
		double denominator = (1 - partial1) / rate;
		double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
		return answer;

	}

}
