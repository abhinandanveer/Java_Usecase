package usecase;
import java.util.ArrayList;

public class BankLoanEligibility {



    public static void main(String[] args) {

        
        Integer age = 25;          
        Integer cibil = 720;       
        Double income = 70000.0;   
        
        ArrayList<Double> incomes = new ArrayList<>();
        
        incomes.add(income);     

        
        if (age >= 21 && cibil >= 700 && incomes.get(0) >= 25000) {
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan Rejected");
        }

       
        String incomeStr = Double.toString(income);
        System.out.println("Income: " + incomeStr);
    }
}

