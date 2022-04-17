print("Hello! Enter 3 numbers and I will store it in a list and print out the sum of the numbers!")

numberOne = int(input("First Number: "))
numberTwo = int(input("Second Number: "))
numberThree = int(input("Third Number: "))

list = [numberOne, numberTwo, numberThree]
print(list)

sum = 0
for i in range(0, len(list)):
    sum += list[i]

print(sum)