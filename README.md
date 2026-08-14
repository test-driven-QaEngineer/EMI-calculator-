# EMI Calculator

A simple Java console application that calculates the **Equated Monthly Installment (EMI)** for a loan based on the loan amount, annual interest rate, and loan term.

## 📌 Project Overview

The **EMI Calculator** allows users to enter:

* Loan amount in dollars
* Annual interest rate
* Loan term in months

The program then calculates and displays the monthly EMI payment.

This project is designed as a beginner-level Java exercise to practice:

* User input with `Scanner`
* Variables and data types
* Mathematical calculations
* The `Math.pow()` method
* Basic Java programming logic

## 🛠️ Technologies Used

* **Java**
* `java.util.Scanner`
* `Math.pow()`

## 📐 EMI Formula

The application uses the standard EMI formula:

```text
EMI = P × R × (1 + R)^N / ((1 + R)^N - 1)
```

Where:

* **P** = Principal loan amount
* **R** = Monthly interest rate
* **N** = Total number of monthly payments

The annual interest rate is converted to a monthly decimal rate using:

```text
Monthly Rate = Annual Interest Rate / (12 × 100)
```

## 💻 Example

Suppose the user enters:

```text
Enter Loan amount in dollars
10000

Enter the annual interest rate
6

Enter Loan term in months
24
```

The program calculates the monthly EMI and displays a result similar to:

```text
Your EMI is 443.206...
```

The actual output may contain more decimal places because the program currently prints the full `double` value.

## 🚀 How to Run

### 1. Install Java

Make sure Java is installed on your computer.

Check your Java installation with:

```bash
java -version
```

### 2. Compile the Program

Navigate to the directory containing the Java file and run:

```bash
javac EmiCalculator.java
```

### 3. Run the Program

```bash
java EmiCalculator
```

## 📂 Project Structure

```text
day3/
└── EmiCalculator.java
```

## 🧮 How the Program Works

The program follows these steps:

1. Creates a `Scanner` object to accept user input.
2. Prompts the user for the loan amount.
3. Prompts the user for the annual interest rate.
4. Converts the annual interest rate into a monthly decimal rate.
5. Prompts the user for the loan term in months.
6. Applies the EMI formula.
7. Displays the calculated monthly payment.

## 🔍 Code Example

```java
package day3;

import java.util.Scanner;

public class EmiCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Loan amount in dollars");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate");
        double annualRate = scanner.nextDouble();

        double monthlyRate = annualRate / (12 * 100);

        System.out.println("Enter Loan term in months");
        int numberOfPayments = scanner.nextInt();

        double emi = principal * monthlyRate *
                Math.pow(1 + monthlyRate, numberOfPayments)
                / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        System.out.println("Your EMI is " + emi);
    }
}
```

## 📚 What I Learned

This project helped reinforce the following Java concepts:

* Declaring and using variables
* `double` and `int` data types
* Reading input using `Scanner`
* Performing mathematical calculations
* Using `Math.pow()`
* Converting percentages into decimal values
* Applying formulas in Java
* Organizing a Java program using a package

## 🔮 Possible Improvements

Future versions of this project could include:

* Formatting the EMI to two decimal places
* Adding validation for negative loan amounts
* Handling a `0%` interest rate
* Calculating total interest paid
* Calculating total amount paid over the life of the loan
* Allowing the user to calculate multiple loans
* Creating a graphical user interface (GUI)

