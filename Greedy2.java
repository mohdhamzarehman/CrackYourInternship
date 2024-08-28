class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;  // Initialize counters for $5 and $10 bills
        
        for (int i = 0; i < bills.length; i++) {  // Use bills.length instead of bills.size()
            if (bills[i] == 5) {
                five++;  // Increment the count of $5 bills
            } 
            else if (bills[i] == 10) {
                if (five > 0) {
                    five--;  // Use one $5 bill as change
                    ten++;   // Collect the $10 bill
                } else {
                    return false;  // No $5 bill to give change
                }
            } 
            else {  // When the bill is $20
                if (five > 0 && ten > 0) {
                    five--;  // Use one $5 bill
                    ten--;   // Use one $10 bill
                } 
                else if (five >= 3) {
                    five -= 3;  // Use three $5 bills as change
                } 
                else {
                    return false;  // Not enough bills to give change
                }
            }
        }
        return true;  // Successfully provided change for all customers
    }
}
