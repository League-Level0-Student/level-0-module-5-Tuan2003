package extra;

public class ForLoopGauntlet {
	public static void main(String[] args) {
int year = 2003;	
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		
		for (int i = 2; i <= 100; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 1; i <= 99; i++) {
			if (i%2 == 0) {
			
			}else {
				System.out.println(i);
			}
		}
		for (int i = 1; i <= 500; i++) {
		if (i%2 == 0) {
			System.out.println(i + " is even ");
		}else {
			System.out.println(i + " is odd ");
		}
		
}
		for (int i = 7; i <= 777; i++) {
			if (i%7 == 0) {
				System.out.println(i);
			}
		}
	
		for (int i = 0; i <= 15; i++) {
			
			System.out.println("In " + year + " I was " + i);
			year += 1;
			
			
		}
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				System.out.print(i);
				System.out.println(j);
			}
		}
		for (int i = 0; i < 3; i++) {
		
			for (int j = 1; j < 4; j++) {
				System.out.print((i+i+i+j)+(" "));
			}
					System.out.println("");		
				
			}
	for(int i=0; i<10; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.print((j+i*10) + " ");
		}
		System.out.println("");
	
	}
	
for(int i=0; i<6; i++) {
	
	for (int j = 0; j <= i; j++) {
		System.out.print(" * ");			
}
System.out.println(" ");
}



for (int i = 0; i > -100; i--) {
System.out.println(i+100);

}
}
}


