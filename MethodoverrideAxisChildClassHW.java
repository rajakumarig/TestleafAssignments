package week2.day3.oopsconceptHW;

public class MethodoverrideAxisChildClassHW extends MethodOverrideBankParentClassHW{
	
	public void Deposit() {
		System.out.println("We have currently 2 types of deposit in our bank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodoverrideAxisChildClassHW moach = new MethodoverrideAxisChildClassHW();
		moach.FixedDeposit();
		moach.Savings();
		moach.Deposit();
	}

}
