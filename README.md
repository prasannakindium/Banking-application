# Banking-application
Developing a banking application using Account hierarchy.  
Create an Account class as base class and derived classes SavingsAccount and CurrentAccount. 

*For each account, allow the user to specify an amount of money to withdraw from the account and an amount of money to deposit into the account. 

* If an account is a SavingsAccount, calculate the amount of interest using the method calculateInterest(7% rate of interest), and add the interest to the account balance. Also, perform withdraw and deposit operation. 

*If an account is a CurrentAccount, deduct the fee during withdrawal when the withdrawal amount exceeds the limit(>Rs.50,000) using the method deductFee (deduct fee of Rs.5 per Rs.10000). 

* After processing an account, print the updated account balance obtained by invoking base class method getBalance. 
