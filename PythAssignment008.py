print("****************************************************************************************************")
userInput = input("Enter a country name and I will tell you the capital of it: ")

countries = "USA", "UK", "Australia", "Japan", "Singapore", "Sri Lanka", "France", "Canada"
capitals = "Washington DC", "London", "Canberra", "Tokyo", "Singapore", "Colombo", "Paris", "Ottawa"

countryExists = False
for i in range(0, len(countries)):
    if userInput == countries[i]:
        print()
        print("The capital of " + userInput + " is " + capitals[i])
        countryExists = True

if countryExists == False:
    print()
    print("This country is not recognized in our database. Please select from one of the countries below: ")
    print(countries)
print("****************************************************************************************************")
