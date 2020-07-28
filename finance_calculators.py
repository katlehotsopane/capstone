# task12
# written by: katleho
# date written: 13/02/20

import math
# asks then user to choose either investment and bond
selected_calculator = input("choose either 'investment,' or 'bond,'from the menu below to proceed:\n investment - to calculate the amount of interest you will earn on interest \n bond - to calculate the amount you will have to pay on the home loan.\n: ")
# here it displays if the user choose or select investment
if selected_calculator.lower() == "investment":
    principle = float(input("please enter the amount:"))
    rate  = float(input("please enter the interest rate:"))
    time = int(input("please enter the years of the investment:"))
    interest = input("which interest type would you like? please choose simple interest and compound interest:")

# if the user wants simple interest
    if interest.lower() == "simple interest":
        rate = rate / 100
        amount = principle * (1 + rate * time)
        print(amount)

# if the user decides to go for compound interest
    if interest.lower() == "compound interest":
        rate = rate / 100
        amount = principle * math.pow((1 + rate), time)
        print(amount)

elif selected_calculator.lower() == "bond":
    present_val = float(input("Please enter the present value of the house: "))
    rate = float(input("Please enter the interest rate: "))
    num_months = int(input("Please enter the number of months it will take you to repay the bond: "))

    rate = rate / 100

    repayment = ((present_val * math.pow((rate / 12) + 1, num_months)) * (rate / 12)) / ((math.pow(rate / 12 + 1, num_months) - 1))
    print(repayment)
    
# it should print out this as the results
else: 
    print("You have not entered a valid option. Please choose either 'Investment' or 'Bond'.")
