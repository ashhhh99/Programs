
"""
Ashkan D Hariri
11/24/2019
Assignment 6 
Design a program to process tempratures and intilize dictionary.

"""

# Main function
def main():
    # creating dictionary with days as keys and values set to 0
    weeklyTemps = {"Monday": 0, "Tuesday": 0, "Wednesday": 0, "Thursday": 0, "Friday": 0, "Saturday": 0, "Sunday": 0}
   
    
    # Setting minimum, maximum temp values as well as the min/max days, the sum and cnt for the loop
    # to assign min/max values to equal temp in
    minimumTemp = 0
    minimumDay = ""
    maximumTemp = 0
    maximumDay = ""
    
    
    # creating a for loop to gather temp values for each day
    for d in weeklyTemps:
        # request temp for corresponding day from the days in dictionary and formatting it properly 
       
        weeklyTemps[d] = eval(input("Enter the temp for {d}: ".format(d=d)))
        # adding the user inputed data into the dictionary as values
        d = list(weeklyTemps.keys())
        
        # Finding the minimum, maximum and average tempratures from the user input.
    minimumTemp = min(weeklyTemps.values())

    maximumTemp = max(weeklyTemps.values())

    average = sum(weeklyTemps.values()) / 7

    # printing the weeklyTemps dictionary
    print(weeklyTemps)

    # getting the key for the minimum value so the day can be printed.
    minTemp = list(weeklyTemps.values()).index(minimumTemp)
    day = d[minTemp]

    

    
    
    # Printing the coldest day
    print("The coldest day was", day, "with a temprature of", minimumTemp, "degree(s) farhenheit")

    # getting the key for the maximum value so the day can be printed.
    maxTemp = list(weeklyTemps.values()).index(maximumTemp)

    day = d[maxTemp]
    #printing the warmest day
    print("The warmest day was", day, "with a temprature of", maximumTemp, "degree(s) farhenheit")
    
    
    

   # writing for loop to get the days that were above average and printing them

    for d in weeklyTemps:
        if weeklyTemps.get(d) > average:
            
            print(d, end=", ")
    print("were the day(s) above the average temprature.")

    # Rounding the average to remove decimals as weather reports dont 
    # typically show temps with decimals, and printing the average. 
    average = str(round(average))
    print("The average temprature was", average, "degree(s) farhenheit")
   
        


# Calling main function
main()
