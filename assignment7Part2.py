"""
Ashkan D Hariri
11/30/2019
Assignment 7 Part 2
Write a program that takes user input and translates it
into pig Latin. First letter is moved to the end and "ay"
is added at the end
"""

# Main function
def main():
    # request user input, a string and splitting it
    message = input("Please enter a sentence in English to be translated to Pig Latin: ").split()

    # For loop to itirate through the user input,
    # then slicing or moving first letter to the
    # end and adding "ay" to the suffix.
    print("Pig Latin:", end=" ")
    for word in message:
        print(word[1:] + word[:1] + "ay", end=" ")
    
# Calling main     
main()