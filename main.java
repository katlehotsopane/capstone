// Main.java
// Written by: Katleho
// Date: 29/02/2020
// Function: this program helps a small structural engineering firm called 'Poised' to keep track
//			of many projects that they work on.


// importing java.util and java.text
import java.util.*;
import java.text.*;

public class Main {

	public static void main(String[] args) throws ParsonsException {
		
		// this part of the program asks for the client's details,
		// and stores the details in 'Persons' method with object called 'client'
		System.out.println("PLEASE ENTER THE CLIENT'S DETAILS:\n");
		
		// creating 'Persons' object called 'client'
		Persons client = new Persons();
		
		// creating Scanner object called 'input'
		Scanner input = new Scanner(System.in);
		
		// client's Name
		System.out.println("Name: ");
		client.setName(input.nextLine());
		
		input = new Scanner(System.in);

		// client's Surname
		System.out.println("\nSurname: ");
		client.setSurname(input.nextLine());
		
		// client's Telephone number
		System.out.println("\nTelephone Number: ");
		client.setTelNum(input.nextLine());
		
		input = new Scanner(System.in);
		
		// client's Email address
        System.out.print("\nEmail Address: ");
        client.setEmailAddress(input.nextLine());
		
        input = new Scanner(System.in);
        
        // client's home address
        System.out.print("\nAddress: ");
        client.setHomeAddress(input.nextLine());

        
        
        // this part of the program asks for the architect's details,
        // and stores the details in 'Persons' method with object called 'architect'
        System.out.print("\nPlEASE ENTER THE ARCHITECT'S DETAILS:\n");
        
        // creating 'Persons' object called 'architect'
        Persons architect = new Persons();
        
        // creating Scanner object called 'architectInput'
        Scanner architectInput = new Scanner(System.in);
        
        // architect's Name
        System.out.print("Name: ");
        architect.setName(architectInput.nextLine());
        
        architectInput = new Scanner(System.in);
        
        // architect's Surname
        System.out.print("\nSurname: ");
        architect.setSurname(architectInput.nextLine());
        
       
        architectInput = new Scanner(System.in);
        
        // architect's Telephone Number
        System.out.print("\nTelephone Number: ");
        architect.setTelNum(architectInput.nextLine());

        
        architectInput = new Scanner(System.in);
        
        // architect's Email Address
        System.out.print("\nEmail Address: ");
        architect.setEmailAddress(architectInput.nextLine());

        
        architectInput = new Scanner(System.in);
        
        // architect's Address
        System.out.print("\nAddress: ");
        architect.setHomeAddress(architectInput.nextLine());

        
        
        // this part of the program asks for the contractor's details,
        // and stores the details in 'Persons' method with object called 'contractor'
        System.out.print("\nPLEASE ENTER THE CONTRACTOR'S DETAILS:\n");
        
        // creating a 'Persons' object called 'contractor'
        Persons contractor = new Persons();
        
        // creating a Scanner object called 'contratorInput'
        Scanner contractorInput = new Scanner(System.in);
        
        // contractor's Name
        System.out.print("Name: ");
        contractor.setName(contractorInput.nextLine());

        
        contractorInput = new Scanner(System.in);
        
        // contractor's Surname
        System.out.print("\nSurname: ");
        contractor.setSurname(contractorInput.nextLine());

        
        contractorInput = new Scanner(System.in);
        
        // contrator's Telephone number
        System.out.print("\nTelephone Number: ");
        contractor.setTelNum(contractorInput.nextLine());

        
        contractorInput = new Scanner(System.in);
        
        // contractor's Email address
        System.out.print("\nEmail Address: ");
        contractor.setEmailAddress(contractorInput.nextLine());

        contractorInput = new Scanner(System.in);
        
        // contractor's Home address
        System.out.print("\nAddress: ");
        contractor.setHomeAddress(contractorInput.nextLine());


        
        // this part of the program asks for the project details,
        // and stores the details in 'PoisedProject' method with object called 'project'
        System.out.print("\nPLEASE ENTER THE PROJECT DETAILS: \n");
        
        // creating a 'PoisedProject' called 'project'
        PoisedProject project = new PoisedProject();

        // creating a Scanner object called 'projectInput'
        Scanner projectInput = new Scanner(System.in);
        
        // Project name
        System.out.print("Project Name: ");
        project.setProjectName(projectInput.nextLine());

       
        projectInput = new Scanner(System.in);
        
        // Project number
        System.out.print("\nProject Number: ");
        project.setProjectNum(projectInput.nextInt());

        
        projectInput = new Scanner(System.in);
        
        // Building type
        System.out.print("\nWhat type of building is being designed? E.g. House, apartment block or store, etc: ");
        project.setTypeOfBuilding(projectInput.nextLine());

        
        projectInput = new Scanner(System.in);
        
        // Building address
        System.out.print("\nAddress: ");
        project.setAddress(projectInput.nextLine());

        
        projectInput = new Scanner(System.in);
        
        // ERF number
        System.out.print("\nERF Number: ");
        project.setERFNum(projectInput.nextInt());

       
        projectInput = new Scanner(System.in);
        
        // Project fee
        System.out.print("\nProject Fee: R");
        project.setTotProjectFee(projectInput.nextDouble());

       
        projectInput = new Scanner(System.in);
        
        // Paid amount
        System.out.print("\nAmount paid: R");
        project.setPaidAmount(projectInput.nextDouble());

        // Project Completion
        project.getCompletion("NO");

        
        projectInput = new Scanner(System.in);
        
        // Project's due date
        System.out.print("\nThe Project's due date: ");
        project.setProjectDueDate(projectInput.nextLine());
        
        projectInput = new Scanner(System.in);
        
        // Project's date of completion
        System.out.print("\nThe Date of Completion: ");
        project.setDateCompleted(projectInput.nextLine());
        

        // storing architect details
        project.setArchitect(architect);

        // storing client details
        project.setClient(client);
        
        // storing contractor details
        project.setContractor(contractor);
        
        
        projectInput = new Scanner(System.in);
        
        // The total amount
        System.out.print("\nThe Total Amount: R");
        project.setTotAmount(projectInput.nextDouble());

        
        // displaying the output to the user
        System.out.println("\nTHE CLIENT'S DETAILS\n");
        System.out.println(client.toString());
        
        System.out.println("\nTHE ARCHITECT'S DETAILS\n");
        System.out.println(architect.toString());
        
        System.out.println("\nTHE CONTRACTOR'S DETAILS\n");
        System.out.println(contractor.toString());
        
        System.out.println("\nTHE PROJECT DETAILS\n");
        System.out.println(project.toString());

        // the editing part of the project is put inside a loop 
        // to allow the user to choose if they want to change specific details of the project.
        
        // creating a boolean variable called 'editControl' which is initialized to true
        Boolean editControl = true;
        
        //while loop with boolean 'editControl'
        while (editControl) {
        	
        	// creating a Scanner object called 'userInput'
            Scanner userInput = new Scanner(System.in);
            
            // displaying a message to the user
            System.out.print("\nWould you like to edit the project? (Yes or No) ");
            
            // declaring a variable called 'projectEditInput' that stores the user's input
            String projectEditInput = userInput.nextLine();
            
            // the user's input changed to lower case in a variable called ''projectEditLower'
            String projectEditLower = projectEditInput.toLowerCase();

            // if 'projectEditLower' is equal to 'yes'
            // A Scanner object called 'input1'
            // the user gets to choose an option and the input is stored in a variable called 'editOption'
            
            if (projectEditLower.equals("yes")) {
            	
                Scanner input1 = new Scanner(System.in);
                
                System.out.print("\nPlease enter the letter of what you would like to edit: d - deadline, a - paid amount, u - update contractor, f - finalize: ");
                
                String editOption = input1.nextLine();
                
                String editOptionLower = editOption.toLowerCase();

                // if the user chooses to edit the deadline, they are asked to enter the new details and the necessary changes are made
                if (editOptionLower.equals("d")) {
                	
                    Scanner newDeadlineInput = new Scanner(System.in);
                    
                    System.out.print("\nPlease enter the new deadline in the form of DD-MM-YYYY (e.g. 12-02-2020): ");
                    
                    project.setProjectDueDate(newDeadlineInput.nextLine()); // getting the new date from the user as a string
                    
                    System.out.println("\nNew deadline is: " + project.getProjectDueDate());

                }
                
                // if user chooses to edit amount paid, they are asked to put the new details and the necessary changes are made.
                else if (editOptionLower.equals("a")) {
                	
                    Scanner newPaidAmountInput = new Scanner(System.in);
                    
                    System.out.print("\nPlease enter the new paid amount: R");
                    
                    project.setPaidAmount(newPaidAmountInput.nextInt()); // adding new amount entered to not overwrite current amount paid.
                    
                    System.out.println(project.getPaidAmount());

                } 
                
                // if user chooses to update the contractor's details, they are asked to enter the new details and the necessary changes are made.
                else if (editOptionLower.equals("u")) {

                    System.out.print("\nThe details of the contractor named: " + contractor.getName() + " to be changed.\n");
                   
                    Scanner contractorNewNumInput = new Scanner(System.in);
                    
                    System.out.print("\nFor Contractor " + contractor.getName() + ", please enter their contact number: ");
                    
                    contractor.setTelNum(contractorNewNumInput.nextLine());
                    
                    Scanner contractorNewEmailInput = new Scanner(System.in);
                    
                    System.out.print("\nFor Contractor " + contractor.getName() + ", please enter their email: ");
                    
                    contractor.setEmailAddress(contractorNewEmailInput.nextLine());

                    System.out.print("\n\nNew details of the contractor\n" + contractor.toString() + "\n\n");

                    
                } 
                
                // if user chooses to finalize the project, if the user still owes the company, an invoice is generated and printed in a text file
                else if (editOptionLower.equals("f")) {
                	
                    if (project.getTotProjectFee() > project.getPaidAmount()) {
                    	
                        double owedAmount = project.getTotProjectFee() - project.getPaidAmount();
                        
                        try {
                            Formatter file = new Formatter("invoice.txt");

                            // prints formatted strings to the file
                            file.format("Invoice" + "\nClient:" + client + "\nProject Fee: R" + project.getTotProjectFee() + "\nPaid Amount: R" + project.getPaidAmount() + "\nOwed Amount: R" + owedAmount);
                            
                            System.out.println("\nInvoice has been saved in the text file called 'invoice.txt'.");
                            
                            file.close();
                            
                        } 
                        
                        catch (Exception e) {
                        	
                            System.out.println("Error.");
                            
                        } 
                        
                    } 
                    
                    // if the customer has already fully paid, no invoice is generated.
                    else if (project.getTotProjectFee() <= project.getPaidAmount()) {
                    	
                        System.out.println("\nNo invoice to be generated, the client settled the balance.");
                    }
                    
                    
                    Scanner markAsComplete = new Scanner(System.in);
                    
                    System.out.print("\nWould you like to mark this task as complete? (Yes or No) ");
                    
                    String taskComplete = markAsComplete.nextLine();
                    
                    String taskCompleteLower = taskComplete.toLowerCase();
                    
                    
                    // if the user chooses to mark the task complete, we mark it with a Yes and assign the current date to the completion date.
                    if (taskCompleteLower.equals("yes")) {
                    	
                        project.getCompletion("YES");
                        
                        // setting the current date
                        SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");
                        
                        String date = sdf.format(new Date());
                        
                        Date today = sdf.parse(date);
                       
                        System.out.println(project.toString());
                        
                        editControl = false;
                    }
                    
                }
                
            } 
            
            // if user chooses not to edit the project, we exit the program.
            else if (projectEditLower.equals("no")) {
            	
                System.out.print("\n		Exit successful, thank you.			");
                
			                editControl = false;
			            }
			 }
		

	}

}
