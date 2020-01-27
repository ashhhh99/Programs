"""
Ashkan D Hariri
10/10/2019
Assignment 1 Part 2
Write a program that converts fahrenheit to kelvin
formula is k=(f+459.67)*5/9

"""


def main():
# Input the temprature in fahrenheit

    F = eval(input("Enter the temprature in fahrenheit: "))

# F Is the user input, K is the calculation to convert.

    K = (F + 459.67) * 5/9

# Print will display the converted temprature to the user

    print("The temprature in kelvin is " + str(K))





if __name__ == "__main__":
    main()