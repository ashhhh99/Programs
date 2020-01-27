"""
Ashkan D Hariri
11/30/2019
Assignment 7 Part 1
Write a program that takes user input and displays the 
most frequent character.
"""

# Main function
def main():
    
    # Request user input
    message = input("Enter a sentance: ")
    
    # Removing all white spaces
    message = message.replace(" ", "")
    
    # creating an empty dictionary
    chars = {}

    # Loop to populate dictionary so the keys are the characters
    # and the number of times they appear as the value.
    for keys in message:
       chars[keys] = chars.get(keys, 0) + 1
           
    # Printing the dictionary now that it is filled
    # with the keys (characters) and values (number of times they appeared.)       
    print(chars)

    # for the most frequent character
    maxChar = max(chars.values())
    
    # loop to itirate over dictionary keys and values
    # to find the key with the highest value then printing
    for keys, values in chars.items():
        if values == maxChar:
            # Printing the most frequent character(s).
            print('"',keys,'"', sep="", end=", ")
    print("is/are the most frequently appearing character(s) in your sentence.")

# Calling main
main()



