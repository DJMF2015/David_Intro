package miscellaneous;

class Rate extends InterestRate implements InterfaceCompound {

	@Override
	public Object compoundinterest() {

		double ci = loanAmt*Math.pow(1.0+rate/100.00,years)-loanAmt;
		return ci;
	}

	public static void main(String[] args) {
		InterestRate ra = new InterestRate();
		System.out.println("The interest rate is: ");
		ra.rate();
	
		Rate rp = new Rate();

		System.out.printf("The compound interest total is\n");
		System.out.printf("%.2f\n",rp.compoundinterest());
	}
}