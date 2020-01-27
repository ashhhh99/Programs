"""
Ashkan D Hariri
10/10/2019
Write a program that calculates the prism volume a trapazoid then reduces it by 25%
"""

def main():

    # Input the length of the trapezoid
    L = eval(input("Enter the length of the trapezoid: "))

    # Input the height of the trapezoid
    H = eval(input("Enter the height of the trapezoid: "))

    # Input the base width of the trapezoid
    P = eval(input("Enter the base width of the trapezoid: "))

    # Input the top width of the trapazoid
    Q = eval(input("Enter the top width of the trapezoid: "))

    V = L * H * (P + Q/2)

    R = L * .75 * H * .75 * (P * .75 + (Q * .75)/2)

    print("The volume of the trapezoidal prisim is " + str(V))

    print("The volume of the reduced trapezoidal prisim is " + str(R))


if __name__ == "__main__":
    main()