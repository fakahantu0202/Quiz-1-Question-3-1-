/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Muhammad Fakhruddin
 */
public class Car {
String brand;
int modelYear;

//your constructor with parameter here
Car(String a, int b){
	this.brand = a;
	this.modelYear = b; 
}
//write method getBrand here
public void getBrand() {
	System.out.print(brand);
}
//write method getModel here
public void getModel(){
	System.out.print(modelYear+ " ");
}
void run() {
	System.out.println("Car is running...");
}

public static void main(String[] args) {

			//call all method and print the value	
	Car c = new Car("Proton X50 ", 2020 );
	c.run();
	c.getModel();
	c.getBrand();
}
}