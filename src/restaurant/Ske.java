package restaurant;
import java.util.Scanner;
public class Ske {
	public static void main(String[]args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("---------Welcome to SKE Restaurant---------\n");
		System.out.printf("1.) Pizza\t %5d Bath.%n",250);
		System.out.printf("2.) Chickens\t %5d Bath.%n",120);
		System.out.printf("3.) Coke\t %5d Bath.%n",45);
		System.out.printf("4.) Total\n");
		System.out.printf("5.) Exit\n");
	int c=0;
	int p = 0;
	int ch = 0;
	int ck = 0;
	int t = 0;
	while (true) {
		System.out.print("Enter your Choice: ");
		c=sc.nextInt();
		if(c==5) {
			break;	
		}
		else if (c==4) {
			menu(p,ck,ch);
		}
		else{
			System.out.print("Enter Quantity");
			
			int q=sc.nextInt();
			if (c==1) {
				p=p+q;	
			}
			else if (c==2) {
				ch=ch+q;
			}
			else if (c==3) {
				ck=ck+q;
			}
		}
	}
	System.out.print("=====Thank you=====");
	}
	public static void menu(int p,int ck,int ch) {
		System.out.print("+------Menu------+----Quantity---+-----Price----+\n");
		if (p>0)
			System.out.printf("|\tPizza\t |\t%2d\t |\t%5d\t|\n",p,p*250);
		if (ch>0)
			System.out.printf("|\tChickens\t |\t%2d\t |\t%5d\t|\n",ch,ch*120);
		if (ck>0)
			System.out.printf("|\tCoke\t |\t%2d\t |\t%5d\t|\n",ck,ck*45);
		System.out.print("+----------------+--------------+---------------+\n");
		System.out.printf("|\tTotal\t\t\t %11d\t|\n",p*250+ch*120+ck*45);
		System.out.print("+-----------------------------------------------+\n");
		}

	}

