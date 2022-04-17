userInput = int(input("Enter any positive/negative number and I will count up/down to it: "))

if userInput > 0:
    # For loop:
    print("For Loop: ")
    for i in range(1, userInput + 1):
        print(i, end= " ")

    print()
    # While loop
    j = 1
    print("While Loop: ")
    while j <= userInput:
        print(j, end= " ")
        j += 1
    print()

# REMASTERED: Added an extra challenge for me below!
elif userInput < 0:
    # For loop:
    print("For Loop: ")
    for i in range(-1, userInput - 1, -1):
        print(i, end= " ")
    print()
    # While Loop
    print("While Loop: ")
    j = -1
    while j > userInput - 1:
        print(j, end= " ")
        j -= 1
else:
    print()
    print("It's hard to count up to a number like that. Maybe try something lower/higher?")
    exit()
