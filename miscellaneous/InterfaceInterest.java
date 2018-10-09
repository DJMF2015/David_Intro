package miscellaneous;

interface InterfaceInterest {
	// static constants
	double rate = .4;
	double loanAmt = 10000;
	double futureValue =100000;
     int numPeriods =3;
		
     double rate(); // abstract method
 }

interface InterfaceCompound{
	double compound = 0.3;
	double years = 5.0;

	Object compoundinterest(); // abstract method

}


