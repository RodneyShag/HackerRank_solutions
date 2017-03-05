//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
   String userRole() default "GUEST";
   int budgetLimit() default 0; // edited line
}

class FamilyMember {
   @FamilyBudget(userRole = "SENIOR", budgetLimit = 100) // added line
   public void seniorMember(int budget, int moneySpend) {
      System.out.println("Senior Member");
      System.out.println("Spend: " + moneySpend);
      System.out.println("Budget Left: " + (budget - moneySpend));
   }

   @FamilyBudget(userRole = "JUNIOR", budgetLimit = 50) // added line
   public void juniorUser(int budget, int moneySpend) {
      System.out.println("Junior Member");
      System.out.println("Spend: " + moneySpend);
      System.out.println("Budget Left: " + (budget - moneySpend));
   }
}

public class Solution {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while (testCases > 0) {
         String role = in.next();
         int spend = in.nextInt();
         try {
            Class annotatedClass = FamilyMember.class;
            Method[] methods = annotatedClass.getMethods();
            for (Method method : methods) {
               if (method.isAnnotationPresent(FamilyBudget.class)) {
                  FamilyBudget family = method
                        .getAnnotation(FamilyBudget.class);
                  String userRole = family.userRole();
                  int budgetLimit = family.budgetLimit(); // edited line
                  if (userRole.equals(role)) {
                     if(spend <= budgetLimit){ // edited line
                        method.invoke(FamilyMember.class.newInstance(),
                              budgetLimit, spend);
                     }else{
                        System.out.println("Budget Limit Over");
                     }
                  }
               }
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
         testCases--;
      }
   }
}