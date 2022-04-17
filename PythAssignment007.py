userInput = int(input("Enter any integer number (0-10) and I will display it in word form: "))

# Case-Switch statements do not exist in Python, so you have to use one of three methods:
# 1. If-elif-else statements.
# 2. Dictionary Mapping (Just creating a bunch of functions and calling them)
# 3. Using Classes (Got a bit complicated so I did not implement this).

# Method 1: If-elif-else (Only one I will use)
if userInput == 0:
    print("0 -> Zero")
elif userInput == 1:
    print("1 -> One")
elif userInput == 2:
    print("2 -> Two")
elif userInput == 3:
    print("3 -> Three")
elif userInput == 4:
    print("4 -> Four")
elif userInput == 5:
    print("5 -> Five")
elif userInput == 6:
    print("6 -> Six")
elif userInput == 7:
    print("7 -> Seven")
elif userInput == 8:
    print("8 -> Eight")
elif userInput == 9:
    print("9 -> Nine")
elif userInput == 10:
    print("10 -> Ten")
