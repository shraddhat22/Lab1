package lab1;

import java.util.Scanner;

/*WAP to accept a choice from the user and accordingly display the output
1:Accept no anc check it is prime no or Not
2:Accept no and find out the SUM OF DIGIT (123 =1+2+3 =6)
3:Accept a no from the user and  display the fibonacci series(0 1 1 2 3 5 .....)
4:Accept no from user and check it is armstrong or not
5: Accept 5 no and find out the greatest
6:Accept a number from user and display the month name
7:accept choise from user and create calssi*/
public class lab1 {

	public static void main(String[] args) {
		int choise;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("1:prime or not \n2:Sum of digit \n3:fibonacci seris \n4:amstrong number \n5:greater number \n6 month name \n7:calssi");
		choise=sc.nextInt();
		switch(choise) {
		case 1 :
			System.out.println("enter the number:");
			int n=sc.nextInt();
			for(int i=2;i<=n;++i) {
				if(n%i==0) {
					flag=true;
					break;
				}
			}
			if(!flag)
				System.out.println(n+"is a prime number");
			else
				System.out.println(n+"is not prime number");
			break;
			
		case 2:
			int sum=0;
			
			System.out.println("enter the numbers:");
			int i=sc.nextInt();
			while(i!=0)
			{
				sum=sum+i%10;
				i=i/10;
			}
			System.out.println("the sum of digit is"+sum);
			break;
			
		case 3:
			int n1=0,n2=1,n3,j,count=10;
			System.out.println(n1+""+n2);
			for(j=2;j<count;j++)
			{
				n3=n1+n2;
				System.out.println(""+n3);
				n1=n2;
				n2=n3;
			}
			break;
			
		case 4:
			int number,temp,total=0;
			System.out.println("enter the number:");
			int num=sc.nextInt();
			number=num;
			while(number!=0)
			{
				temp=number%10;
				total=total+temp*temp*temp;
				number /=10;
				
			}
			if(total==num)
				System.out.println(num+"is armstrong number");
			else
				System.out.println(num+"is not armstrong number");
			break;
			
		case 5:
			System.out.println("enter five number:");
			int max=sc.nextInt();
			for(int k=0;k<5;k++) {
				System.out.println("enter number"+(k+1)+":");
				int current=sc.nextInt();
				if(current>max) {
	            max=current;
				}
			}
			System.out.println("The greatest number is:"+max);
			
		case 6:
						System.out.println("Enter any number equal to or between 1-12 to display the month");
					    int num1=sc.nextInt();

					    switch (num1)
					    {
					    case 1:
					        System.out.println ("The name of month number 1 is January");
					        break;
					    case 2:
					        System.out.println ("The name of month number 2 is February");
					        break;
					    case 3:
					        System.out.println ("The name of month number 3 is March");
					        break;
					    case 4:
					        System.out.println ("The name of month number 4 is April");
					        break;
					    case 5:
					        System.out.println ("The name of month number 5 is May");
					        break;
					    case 6:
					        System.out.println ("The name of month number 6 is June");
					        break;
					    case 7:
					        System.out.println ("The name of month number 7 is July");
					        break;
					    case 8:
					        System.out.println ("The name of month number 8 is August");
					        break;
					    case 9:
					        System.out.println ("The name of month number 9 is September");
					        break;
					    case 10:
					        System.out.println ("The name of month number 10 is October");
					        break;
					    case 11:
					        System.out.println ("The name of month number 11 is November");
					        break;
					    case 12:
					        System.out.println ("The name of month number 12 is December");
					        break;
					        default:
					            System.out.println ("You have entered an invalid number");
					            break;
					    }
					   break; 
					    
		    case 7:
			        System.out.print("Enter the first number: ");
			        int firstNumber = sc.nextInt();
			        System.out.print("Enter the second number: ");
			        int secondNumber = sc.nextInt();

			        System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
			        String operation = sc.next();
			       
			        
			        int result1 = 0;
			        if (operation.equals("+")) {
			            result1 = firstNumber + secondNumber;
			        }
			        else if (operation.equals("-")) {
			            result1 = firstNumber - secondNumber;
			        }
			        else if (operation.equals("*")) {
			            result1 = firstNumber * secondNumber;
			        }
			        else if (operation.equals("%")) {
			            result1 = firstNumber % secondNumber;
			        }
			        else if (operation.equals("/")) {
			            result1 = firstNumber / secondNumber;
			        }
			        else {
			            System.out.println("Invalid operation");
			        }
			        System.out.println("the answer is"+result1);
			        break;
			    }
		
			
			
			
			
		}

	}


