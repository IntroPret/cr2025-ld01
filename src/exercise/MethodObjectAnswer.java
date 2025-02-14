package exercise;

public class MethodObjectAnswer {

	class Account {
		private int delta() {
			return 10;
		}

		// TODO: replace this gamma method with method object (make a class for the
		// gamma logic)
		public int gamma(int inputVal, int quantity, int yearToDate) {
			return new GammaCalculator(this, inputVal, quantity, yearToDate).compute();
		}

	}

	class GammaCalculator {
		private Account account;
		private int inputVal;
		private int quantity;
		private int yearToDate;

		private int importantValue1;
		private int importantValue2;
		private int importantValue3;

		public GammaCalculator(Account account, int inputVal, int quantity, int yearToDate) {
			this.account = account;
			this.inputVal = inputVal;
			this.quantity = quantity;
			this.yearToDate = yearToDate;
		}

		public int compute() {
			importantValue1 = (inputVal * quantity) + account.delta();
			importantValue2 = (inputVal * yearToDate) + 100;
			if ((yearToDate - importantValue1) > 100) {
				importantValue2 -= 20;
			}
			importantValue3 = importantValue2 * 7;
			// and so on�
			return importantValue3 - 2 * importantValue1;
		}
	}

	private void test() {
		Account account = new Account();
		System.out.println(account.gamma(15, 10, 2010));

	}

	public static void main(String[] args) {
		MethodObjectAnswer p = new MethodObjectAnswer();
		p.test();
	}

}
