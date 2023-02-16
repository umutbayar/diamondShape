import java.util.Scanner;

/*
 * Our aim in this project is to create a diamond shape with the letter received from the user.
 *  The diamond shape is to create a horizontally and vertically symmetrical shape according to the alphabet order
 *   of the entered letter. The first row and the last row contain 'A'.
 *    For this, we first get a letter from the user as input. Then another We create our diamond shape in the method.
 *     In another method, we print our shape on the screen.
 *     Name and Surname = Umut Bayar   Student ID=150120043
 */
public class HW_4_Q3_150120043 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Letter: ");
		String letters=scan.next();
		char letter = letters.charAt(0);
		if((((((int)letters.charAt(0))<=90)&&(int)letters.charAt(0)>=65)||((int)(letters.charAt(0))<=122&&(int)(letters.charAt(0))>=97))&&letters.length()==1) {
		char[][] diamond1 = constructDiamond(letter);
		System.out.println("Diamond for letter '"+ letter +"':");
		printDiamond(diamond1);
		}
		else
			System.out.println("Invalid Input !");
		scan.close();
	}
	public static char[][] constructDiamond (char letter){
		int i=0;
		int j=0;
		char[][] diamond = new char[2*(letter-'A')+1][2*(letter-'A')+1]; 
		if((int)letter>=65&&(int)letter<=90) {
		for (i = 0; i<=2*(letter-'A') ; i++) {
			for(j = 0; j<=2*(letter-'A') ; j++) {
				if(i==0) {
					if(j==(letter-'A')) {
						diamond[i][j] = 'A';
					}
					else {
						diamond[i][j] = '.';
					}
				}
				else if((i!=0)&&i<=(letter-'A')) {
					if(i+j == (letter-'A') || j-i == (letter-'A')) {
						diamond[i][j] = (char)(i+65);
					}
					else {
						diamond[i][j] = '.';
					}
				}
				else if((i!=2*(letter-'A'))&&(i<2*(letter-'A'))) {
					if((i-j==(letter-'A'))||i+j==3*(letter-'A')) {
						diamond[i][j] = (char)(letter-(i-(letter-'A')));
					}
					else {
						diamond[i][j] = '.';
					}		
				}
				else if(i==2*(letter-'A')) {
					if(j==(letter-'A')) {
						diamond[i][j] = 'A';
					}
					else diamond[i][j]='.';
				}
			}
		}
		}
		else if((int)letter>=97&&(int)letter<=122) {
			for (i = 0; i<=2*(letter-'a') ; i++) {
				for(j = 0; j<=2*(letter-'a') ; j++) {
					if(i==0) {
						if(j==(letter-'a')) {
							diamond[i][j] = 'A';
						}
						else {
							diamond[i][j] = '.';
						}
					}
					else if((i!=0)&&i<=(letter-'a')) {
						if(i+j == (letter-'a') || j-i == (letter-'a')) {
							diamond[i][j] = (char)(i+65);
						}
						else {
							diamond[i][j] = '.';
						}
					}
					else if((i!=2*(letter-'a'))&&(i<2*(letter-'a'))) {
						if((i-j==(letter-'a'))||i+j==3*(letter-'a')) {
							diamond[i][j] = (char)(i+65);
						}
						else {
							diamond[i][j] = '.';
						}		
					}
					else if(i==2*(letter-'a')) {
						if(j==(letter-'a')) {
							diamond[i][j] = 'A';
						}
						else diamond[i][j]='.';
					}
				}
			}
			}
		return diamond;
	}
	public static void printDiamond (char[][] diamond ) {
		for (int a = 0; a<=((diamond.length-1)) ; a++) {
			for(int b = 0; b<=((diamond.length-1)) ; b++) {
				if(b==(diamond.length-1)) {
					System.out.println(diamond[a][b]);
				}
				else {
					System.out.print(diamond[a][b]);
				}		
			}
		}
	}	
}
							