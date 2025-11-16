/**
 * @author Kaitlyn Morris
 * CS 491 Homework 1
 * Program to do the calculations
 */

public class BMICalculations {
    public double calculator (int feet, double inches, double pounds) {
        double height = (feet * 12) + inches;
        double BMI = (pounds * 703) / (height * height);
        return BMI;
    }
}
