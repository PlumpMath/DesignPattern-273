package Proxy;

class DollarPrinter { // client of proxy
	public static void incrementAndPrintDollar(IDollarAmount dollarAmount) {
		dollarAmount.setCents( dollarAmount.getCents() + 1);
		dollarAmount.print();

		System.out.println();
	}
}