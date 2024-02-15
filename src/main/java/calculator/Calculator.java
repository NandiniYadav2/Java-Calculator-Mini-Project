package calculator;

import java.util.*;

public class Calculator{
	public static void main(String args[])
	{
		System.out.println("CALCULATOR");
		
		int choice,flag=0;
		double operand1 = 0.0;
                double operand2 = 0.0;
		Scanner scanner= new Scanner(System.in);
		
		do
		{
			System.out.println("Option Menu");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Power");
			System.out.println("6. Square root");
			System.out.println("7. Log(base e)");
			System.out.println("8. Exit");
			System.out.println("Enter your choice");
			
			choice=scanner.nextInt();
			if(choice==8)
				flag=1;
			else
			{
			        
			        if(1 <= choice && choice < 6){
			            System.out.println("Enter 2 numbers");
				    System.out.println("First operand:");
				    operand1=scanner.nextDouble();
				    System.out.println("Second operand:");
				    operand2=scanner.nextDouble();
			        }
			        else if(6 <= choice && choice < 8){
			            System.out.println("Enter a number:");
				    
				    operand1=scanner.nextDouble();
			        }
			        
				
				
				switch(choice)
				{
					case 1:
						System.out.println(operand1+operand2);
						break;
					case 2:
					        System.out.println(operand1-operand2);
						break;
					case 3:
						System.out.println(operand1*operand2);
						break;
					case 4:
						if(operand2==0){
						       System.out.println("Please enter non zero number");
					         }
					         else{
					               System.out.println(operand1/operand2);
					         }
						
						break;
				        case 5:
						System.out.println(Math.pow(operand1,operand2));
						break;
					case 6:
					        System.out.println(Math.sqrt(operand1));
						break;
					case 7:
						if(operand1 <= 1){
						      System.out.println("Please enter a valid number");
						}
						else{
						      System.out.println(Math.log(operand1));
						}
							
						break;
					default:
						System.out.println("Exiting program");
						flag=1;
				}
			}
			System.out.println("");
		}while(flag==0);
	}
	}
					
				
