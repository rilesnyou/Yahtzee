import java.util.ArrayList;

public class YahtzeeLab {
	
	private ArrayList<Rolls> items = new ArrayList<>();

	public void add(int roll) {
		Rolls rollie = new Rolls();
		rollie.roll = roll;
	}
	
	public int getTotal() {
		int sum = 1;
		for (Rolls rollie : items) {
			sum = rollie.roll;
		}
		return sum;
	}
	
	public int getYaht() {
		int yaht = 50;
		for (Rolls rollie : items) {
		yaht = rollie.roll;
		}
		return yaht;
	}
	
	public int[] getFour() {
		int[] good = {1, 1, 1, 4, 1};
		
		
		return good;
	}
	
	public int[] smallStraight() {
		int[] good = {1, 2, 3, 4, 5};
		return good;
	}
	
	public int[] largeStraight() {
		int[] good = {2,3,4,5,6};
		return good;
	}
	
	public int[] threeKind() {
		int[] good = {3,3,3,4,5};
		return good;
	}
	
	private static class Rolls {
		private int roll;
	}

}
