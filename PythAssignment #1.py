userInput = int(input("Enter a number: "))

for i in range(0, userInput):
    if i != userInput:
        print("*", end ="")

print()
print("Worked!")