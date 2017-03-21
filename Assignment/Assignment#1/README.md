Consider the following program description:

“Write a program that determines the change to be dispensed from a vending machine. An item in the machine can cost between 50 kuruş and 2 liras, in 25 kuruş increments (50, 75, 100,…, 150, 175, 200), and the machine only accepts one lira coins to pay for the item. The machine accepts a maximum of 2 one lira coins. The change should be in as less coins as possible using 1 lira, 50 and 25 kuruş coins. For instance, a possible dialogue with the user might be:

Enter the price of the item in kuruş: 125

Enter the number of 1 lira coins you have inserted into the machine: 2

You bought an item for 125 kuruş and gave me 2 liras, so your change is:

0*1 lira

1*50 kuruş

1*25 kuruş

Display the change only if a valid price or a valid number of coins is entered (no less than 50 kuruş, no more than 200 kuruş, an integer multiple of 25 kuruş, and inserted 1 or 2 one lira coins). Otherwise display a separate error message for any of the following invalid inputs:

a cost under 50 kuruş
a cost more than 200 kuruş
a cost  that is not a multiple of 25 kuruş
less than one 1 lira coin
more than 2 lira coins
