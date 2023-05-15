package org.bank;

public class AxisBank extends BankInfo {
	public void despoit() {
		System.out.println("Despoit Account");
	}
	public static void main(String[] args) {
		AxisBank type =new AxisBank();
		type.saving();
		type.despoit();
		type.Fixed();

	}

}
