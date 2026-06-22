Program 1 - Fixing Duplicate Code with Inheritance (Java)
This is my code submission for Program-1. The main goal of this task was to take a messy, redundant code design for Faculty and Staff and fix it by applying Generalization (Inheritance).

The Problem & Solution
How it looked before:
Initially, the Faculty and Staff classes were created completely separately. Because of this, both classes ended up copying and pasting the exact same private variables (id, name, departmentName, salary, tax, and gpfund) along with all their getter and setter methods.

How I fixed it:
I created a parent class called Employee to hold all of those common variables and methods in one place. Then, I made Faculty and Staff inherit from Employee. Now, the child classes only have to focus on their unique variables and specific math calculations.

Class Setup
1. Employee (Parent Class)
Shared Fields: id, name, departmentName, salary, tax, gpfund

All fields are private with standard public getters and setters to keep the data secure.

2. Faculty (Child Class)
Unique Field: numberOfResearchPublications

Calculations:

Salary = 2000 * numberOfResearchPublications

Tax = 3% of salary

GP Fund = salary * 12 * (numberOfResearchPublications + 10)

3. Staff (Child Class)
Unique Fields: numberOfProjects, bonus

Calculations:

Salary = 3000 * numberOfProjects

Tax = 3% of salary

Bonus = Half of the salary

GP Fund = salary * 12 * (numberOfProjects + 8)

 How the Program Runs
The project uses a Main class to test out the logic:

It creates one Faculty object and one Staff object using their constructors.

It calls their specific calculation methods to handle the math for salaries, taxes, and funds.

It uses displayInfo() to print all the details nicely in the console so you can see the final results.

Tools Used
Language: Java

Concepts: Inheritance (Extends), Encapsulation (Private/Public modifiers)
