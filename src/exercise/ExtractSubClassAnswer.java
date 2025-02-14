package exercise;

public class ExtractSubClassAnswer {
// todo: extract subclass PartsItem & LaborItem from JobItem
	abstract class JobItem {
		private int quantity;

		public JobItem(int quantity) {
			this.quantity = quantity;
		}

		public int getQuantity() {
			return quantity;
		}

		abstract public int getUnitPrice();
		
		public int getTotalPrice() {
			return getQuantity() * getUnitPrice();
		}
		
	}

	class PartsItem extends JobItem {
		private int unitPrice;
		
		public PartsItem(int quantity, int unitPrice) {
			super(quantity);
			this.unitPrice = unitPrice;
		}
		
		public int getUnitPrice() {
			return unitPrice;
		}
	}

	class LaborItem extends JobItem {
		private Employee employee;
		
		public LaborItem(int quantity, Employee employee) {
			super(quantity);
			this.employee = employee;
		}

		public int getUnitPrice() {
			return employee.getRate();
		}
		
		public Employee getEmployee() {
			return employee;
		}
	}

	class Employee {
		private int rate;

		public Employee(int rate) {
			this.rate = rate;
		}

		public int getRate() {
			return rate;
		}
	}

	public void action() {
		Employee kent = new Employee(50);
		JobItem j1 = new LaborItem(5, kent);
		JobItem j2 = new PartsItem(15, 10);
		int total = j1.getTotalPrice() + j2.getTotalPrice();
		System.out.println(total);
	}

	public static void main(String[] args) {
		new ExtractSubClassAnswer().action();
	}
}