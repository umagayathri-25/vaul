import java.io.*;
import java.util.*;
public class Sa 
{  
public static void main(String[] args)   
{
	int m=100,choice,n=0;
	String students[]=new String[m];
	float grade[]=new float[m];
	students[0]="john";
	grade[0]=5;
	Scanner sc=new Scanner(System.in);


	while (true) {
            	System.out.println("1. Add new student and grade");
            	System.out.println("2. View list of students and grades");
            	System.out.println("3. Calculate and display average grade");
            	System.out.println("4. Exit");
            	System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		if(choice==1){
			System.out.print("Enter no of student including with john as it is already declared:");
			n=sc.nextInt();
			for(int i=1;i<n;i++)
				{
					System.out.print("Enter student name:");
					students[i]=sc.next();
					System.out.print("Enter student grade:");
					grade[i]=sc.nextFloat();
				}
			}
		else if(choice==2){
			if (n == 0) 
				{
                        		System.out.println("No students in the list.");

					System.out.println("Name: " + students[0] + ", Grade: " + grade[0]);
				}
			else {
                        	System.out.println("List of students and grades:");
                        	for (int i = 0; i <=n; i++) 
				{
                            		System.out.println(students[i] + ": " + grade[i]);
                        	}
                        }
                        
		} 
	else if (choice == 3) 
	{
    		if (n == 0) 
		{
        		System.out.println("Number of students is zero; cannot calculate average.");
    		}
 		else 
		{
        	float sum =0; // Initialize sum with the grade of 'john'
        	float avg;
       		for (int k = 0; k < n; k++) 
		{ 
   			sum += grade[k];
                }
        	System.out.println("Sum of all the students' grades: " + sum);

        	avg = sum / n;
        	System.out.println("Average grade of all the students' grades is: " + avg);
             }
          }

	else if(choice==4){
		System.out.println("Exited");
		break;
       }
       else{
		System.out.println("**Invalid option please select valid option**");
	}
     }
   }
}

