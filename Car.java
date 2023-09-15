package week1.day1;
 
 public class Car {

	public void ApplyBreak() {
		System.out.println("ApplyBreak");
	}
		public void soundhorn() {
			System.out.println("soundhorn");
		}
		public void turnonAc() {
			System.out.println("TurnonAc");
		
	}
	public static void main(String[] args) {
		Car bmw = new Car();

		bmw.ApplyBreak();
		bmw.soundhorn();
		bmw.turnonAc();
	}
}
	
		

	


