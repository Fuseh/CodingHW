userInput = int(input("Enter a number between one and ten: "))

# Error handling for if the user inputted-number is out of range.
if userInput < 1 or userInput > 10:
    print("Error, number is out of range. Please try again!")
    exit()
else:
    n = userInput
    count = 0
    # range function has the syntax : range(start, end, step). No step means step = 1.
    for i in range(0, userInput):
        print("*" * n)
        count += n
        n -= 1

print("Number of Asteriks:", count)






print()
# Redoing the code above by counting downwards, rather than upwards:
userInput2 = int(input("Enter a number between one and ten: "))

if userInput2 < 1 or userInput2 > 10:
    print("Error, number is out of range. Please try again!")
    exit()
else:
    count2 = 0
    for i in range(userInput2, 0, -1):
        print("*" * i)
        count2 += i

print("Number of Asteriks:", count2)
