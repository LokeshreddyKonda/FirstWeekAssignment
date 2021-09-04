import java.util.Scanner;

public class GuessTheCar {
	public static void main(String[] args) {

		CarModel c1 = new CarModel("SWIFT","MARUTHI");
		CarModel c2 = new CarModel("HARRIER","TATA");
		CarModel c3 = new CarModel("ECOSPORT","FORD");
		CarModel c4 = new CarModel("SONET","KIA");
		CarModel c5 = new CarModel("MICRA","NISSAN");
		CarModel c6 = new CarModel("KWID","RENAULT");
		CarModel c7 = new CarModel("RAPID","SCODA");
		CarModel c8 = new CarModel("POLO","VOLKSWAGEN");
		CarModel c9 = new CarModel("READYGO","DATSUN");
		CarModel c10 = new CarModel("A8","AUDI");
		Object[] a = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
		Scanner sc = new Scanner(System.in);
		System.out.println("Lokesh's Game ");
		System.out.println("Lets Start the Game (Y / N):");
		String start = sc.next();
		int score=0;
		if(start.equalsIgnoreCase("y")) {
			for(int i=1;i<=10;i++) {
				System.out.println(i+".) Guess the Company of the Car "+((CarModel) a[i-1]).getCarName());
				System.out.println("1. MARUTHI , 2. TATA , 3. FORD , 4. KIA , 5. NISSAN , 6. RENAULT , 7. SCODA , 8. VOLKSWAGEN , 9. DATSUN , 10. AUDI");
				int ans = sc.nextInt();
				if(ans == i) {
					System.out.println("Correct");
					System.out.println();
					
					score++;
				}else {
					System.out.println("Not Correct");
					System.out.println();
				}
				
			}
			System.out.println("Your Score:"+score+" / 10");
			System.out.println("Thanks !");
		}else {
			System.out.println("Thanks !");
			System.exit(0);
		}
	}  

}

class CarModel {
	private String carName;
	private String carCompany;
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarCompany() {
		return carCompany;
	}
	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}
	
	CarModel(String carName,String carCompany){
		this.carName=carName;
		this.carCompany=carCompany;
	}
	

}

