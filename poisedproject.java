// poisedProject.java
// written by: katleho tsopane
// Date: 29/07/2020
// function: this part of the program is of created methods that will be called or implemented in 'Main.java'

import java.time.LocalDate;
import java.util.scanner;
public class PoisedProject {
   
public static void main(string[] args) {
		//TODO Auto-generated method stub
	System.out.print("client details:\n");

	// declaring private variables
	private String projectName;
	private int projectNum;
	private String typeOfBuilding;
	private String address;
	private int ERFNum;
	private double totProjectFee;
	private double paidAmount;
	private String completion;
	private String projectDueDate;
	private String dateCompleted;
	private Persons architect;
	private Persons client;
	private Persons contractor;
	private double totAmount;
	
	
	// creating a method called 'PoisedProject'
	public PoisedProject(){}
	
	// creating a method called 'PoisedProject' with parameters
	public PoisedProject(String projectName, int projectNum, String typeOfBuilding, String address, int ERFNum, double totProjectFee, double paidAmount, String completion, String projectDueDate, String dateCompleted, Persons architect, Persons client, Persons contractor, double totAmount) {
		
		this.projectName = projectName;
		this.projectNum = projectNum;
		this.typeOfBuilding = typeOfBuilding;
		this.address = address;
		this.ERFNum = ERFNum;
		this.totProjectFee = totProjectFee;
		this.paidAmount = paidAmount;
		this.completion = completion;
		this.projectDueDate = projectDueDate;
		this.dateCompleted = dateCompleted;
		this.architect = architect;
		this.client = client;
		this.totAmount = totAmount;
		
	}
	
	// creating a method called 'getProjectName'
	// which returns 'projectName'
	public String getProjectName() {
		return projectName;
	}
	
	// creating a method called 'setProjectName' with a parameter called 'projectName'
	// which is equated to 'projectName'
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	// creating a method called 'getProjectNum'
	// which returns 'projectNum'
	public int getProjectNum() {
		return projectNum;
	}
	
	// creating a method called 'setProjectNum' with a parameter called 'projectNum'
	// which is equated to 'projectNum'
	public void setProjectNum(int projectNum) {
		this.projectNum = projectNum;
	}
	
	// creating a method called 'typeOfBuilding'
	// which returns 'typeOfBuilding'
	public String typeOfBuilding() {
		return typeOfBuilding;
	}
	
	// creating a method called 'setTypeOfBuilding' with parameter 'typeOfBuilding'
	// which is equated to 'typeOfBuilding'
	public void setTypeOfBuilding(String typeOfBuilding) {
		this.typeOfBuilding = typeOfBuilding;
	}
	
	// creating a method called 'getAddress'
	// which returns 'address'
	public String getAddress() {
		return address;
	}
	
	// creating a method called 'setAddress' with parameter 'address'
	// which is equated to 'address'
	public void setAddress(String address) {
		this.address = address;
	}
	
	// creating a method called 'getERFNum'
	// which returns 'ERFNum'
	public int getERFNum() {
		return ERFNum;
	}
	
	// creating a method called 'setERFNum' with parameter 'ERFNum'
	// which is equated to 'ERFNum'
	public void setERFNum(int ERFNum) {
		this.ERFNum = ERFNum;
	}
	
	// creating a method called 'getTotProjectFee'
	// which returns 'totProjectFee'
	public double getTotProjectFee() {
		return totProjectFee;
	}
	
	// creating a method called 'setTotProjectFee' with parameter 'totProjectFee'
	// which is equated to 'totProjectFee'
	public void setTotProjectFee(double totProjectFee) {
		this.totProjectFee = totProjectFee;
	}
	
	// creating a method called 'getPaidAmount'
	// which returns 'paidAmount'
	public double getPaidAmount() {
		return paidAmount;
	}
	
	// creating a method called 'setPaidAmount' with parameter 'paidAmount'
	// which is equated to 'paidAmount'
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	// creating a method called 'completion'
	// which returns 'completion'
	public String completion() {
		return completion;
	}
	
	// creating a method called 'getCompletion' with parameter 'complete'
	// which is equated to 'completion'
	public void getCompletion(String complete) {
		this.completion = complete;
	}
	
	// creating a method called 'getProjectDueDate'
	// which returns 'projectDueDate'
	public String getProjectDueDate() {
		return projectDueDate;
	}
	
	// creating a method called 'setProjectDueDate' with parameter 'projectDueDate'
	// which is equated to 'projectDueDate'
	public void setProjectDueDate(String projectDueDate) {
		this.projectDueDate = projectDueDate;
	}
	
	// creating a method called 'getDateCompleted'
	// which returns 'dateCompleted'
	public String getDateCompleted() {
		return dateCompleted;
	}
	
	// creating a method called 'setDateCompleted' with parameter 'dateCompleted'
	// which is equated to 'dateCompleted'
	public void setDateCompleted(String dateCompleted) {
		this.dateCompleted = dateCompleted;
	}
	
	// creating a method called 'getArchitect'
	// which returns 'architect'
	public Persons getArchitect() {
		return architect;
	}
	
	// creating a method called 'setArchitect' with parameter 'architect'
	// which is equated to 'architect'
	public void setArchitect(Persons architect) {
		this.architect = architect;
	}
	
	// creating a method called 'getClient'
	// which returns 'client'
	public Persons getClient() {
		return client;
	}
	
	// creating a method called 'setClient' with parameter 'client'
	// which is equated to 'client'
	public void setClient(Persons client) {
		this.client = client;
	}
	
	// creating a method called 'getContractor'
	// which returns 'contractor'
	public Persons getContractor() {
		return contractor;
	}
	
	// creating a method called 'setContractor' with parameter 'contractor'
	// which is equated to 'contractor'
	public void setContractor(Persons contractor) {
		this.contractor = contractor;
	}
	
	// creating a method called 'getTotAmount'
	// which returns 'totAmount'
	public double getTotAmount() {
		return totAmount;
	}
	
	// creating a method called 'setTotAmount' with parameter 'totAmount'
	// which is equated to 'totAmount'
	public void setTotAmount(double totAmount) {
		this.totAmount = totAmount;
	}
	
	
	// creating a 'toString' method
	// which returns the project details
	public String toString() {
		
		return "Project Name:	" + projectName +
				"\nProject Number:	" + projectNum +
				"\nType of Building:	" + typeOfBuilding + 
				"\nAddress:	" + address + "\nERF Number:	" + 
				ERFNum + "\nProject Fee:	R" + 
				totProjectFee + "\nAmount Paid:	R" + 
				paidAmount + "\nCompletion of Project:	" + 
				completion + "\nProject Due Date:	" + 
				projectDueDate + "\nDate of Completion:	" + 
				dateCompleted + "\nTotal Amount:	R" + 
				totAmount;
	}
	
}
