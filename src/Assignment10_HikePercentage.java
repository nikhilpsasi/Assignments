/*
Assignment (Conditional Statements & Loops)

Employee Table
S.No Name Base Salary Experience (Years) Year-End Rating (Out of 5)

1 Alice
  Johnson       75000.0  5.1  4.2
2 Bob Smith     68000.0  3.2  3.8
3 Carol Davis   82000.0  7.1  4.5
4 David Brown   90000.0  10.2 2.5
5 Eva Green     60000.0  2.4  3.5

Hike

Rating           % of base Salary as variable pay        Bonus
> =4.0           15.0                                    1500
>=3 && < 4       10.0                                    1200
< 3.0            3.0                                     300

Extra Perks
Employees with Experience >= 5 Years get extra Reward of 5000;

There are 5 Employee records. Now Calculate the Hike percentage of each Employee and store the
Values in Map with EmployeeName and HikePercentagevalue and Print them.

Ex: Map<String, Double> output ;

Hike = ( Base Salary * variable pay % ) + Bonus + Reward ;
Hike % = Hike / Base Salary .

*/

import java.util.HashMap;
import java.util.Map;

public class Assignment10_HikePercentage {

	public static void main(String[] args) 
	{
	// Map to store Employee Name and Hike Percentage
    Map<String, Double> output = new HashMap<>();

    // Employee data
    String[] names = {"Alice", "Bob", "Carol", "David", "Eva"};
    double[] salaries = {75000, 68000, 82000, 90000, 60000};
    double[] experience = {5.1, 3.2, 7.1, 10.2, 2.4};
    double[] ratings = {4.2, 3.8, 4.5, 2.5, 3.5};

    for (int i = 0; i < names.length; i++) {

        double variablePayPercent;
        double bonus;

        // Determine variable pay & bonus
        if (ratings[i] >= 4.0) {
            variablePayPercent = 0.15;
            bonus = 1500;
        } else if (ratings[i] >= 3.0) {
            variablePayPercent = 0.10;
            bonus = 1200;
        } else {
            variablePayPercent = 0.03;
            bonus = 300;
        }

        // Extra reward based on experience
        double reward = experience[i] >= 5 ? 5000 : 0;

        // Calculate hike
        double hike = (salaries[i] * variablePayPercent) + bonus + reward;

        // Calculate hike percentage
        double hikePercentage = hike / salaries[i] *100;

        // Store in map
        output.put(names[i], hikePercentage);
    }

    // Print results
    for (Map.Entry<String, Double> entry : output.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
}