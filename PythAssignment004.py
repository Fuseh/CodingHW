print("Hello! With a given number and symbol, I can print out a square of any size made of that symbol :)")

numberInput = int(input("Size of the square: "))
symbolInput = input("Contents of the square (enter any symbol): ")

for i in range(0, numberInput):
    j = 0
    while j < numberInput:
        print(symbolInput, end=" ")
        j += 1
    print()
