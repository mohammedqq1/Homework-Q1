package homework;

public class Homework {

	public static void main(String[] args) {

	double[] mylist = {4, -10, -15, 5, 10};
	//Q1 find the sum of all negative numbers in array 
	
	double numberN = 0;
	for (int i = 0; i< mylist.length; i++) {
		if(mylist[i]<0)
			numberN += mylist[i];
	}
	System.out.println("sum of all negative numbers :" + numberN);
	
	//Q2 find the sum of all positive numbers in array 
	
	double numberP = 0;
	for(int i = 0; i < mylist.length; i++) {
		if(mylist[i]>0)
			numberP += mylist[i];
	}
	System.out.println("sum of all positive numbers:" + numberP);
	
	//Q3 find the average of all negative numbers 
	
	System.out.println("average of all negative numbers :" + numberN/2);
	
	//Q4 find the average of all positive numbers 
	
	System.out.println("average of all positive numbers :" + numberP/3);
	 //Q5 find the maximum value in array 
	
	double max = mylist[0];
	for(int i = 1; i < mylist.length; i++) {
		if(mylist[i] > max) max = mylist[i];
	}
	//Q6 find the minimum value in array 
	
	double min = mylist[0];
	for(int i = 1; i < mylist.length; i++) {
		if (mylist[i] < min) min = mylist[i];
	}
	
	System.out.println("min value in array :" +min);
	}
	}
	


