"""
Ashkan D Hariri
11/02/2019
Assignment 4 part 2
Write a program that determines the volume of a cone using function with 2 parameters
"""

import math
# Importing math so as to use pi and powers.

# Function for determining volume of a cone with 2 parameters.
def coneVolumeFunction(height, baseRadius):
    volume = 1/3 * math.pi * pow(baseRadius, 2) * height  # Formula for calculating the volume of a cone.
    volume = str(round(volume, 2)) # Rounding the calculations to 2 decimal places.
    print("The volume is: ", volume) # Printing the volume.

# Main function
def main():
    height = eval(input("Enter the height: "))  # Input for the height.
    baseRadius = eval(input("Enter the base radius: ")) # Input for the base radius.
    coneVolumeFunction(height, baseRadius) # Calling the cone volume function.



# Calling main function.
 
main()