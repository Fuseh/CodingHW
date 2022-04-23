print("*************************************************************************")
exited = False
print("Enter the name of your friends one by one. Type 'exit' once you are done listing your friends: ")

friendList = []
# Adding the user's friends to a list.
while exited == False:
    names = input()
    if names == "exit" or names == "Exit":
        exited = True
    else:
        friendList.append(names)

# Fun, custom messages for the user
if len(friendList) >= 5:
    print("Wow!",len(friendList),"friends is a crap ton! I wish I could have as many friends as you... ")
elif len(friendList) == 1:
    print("Nice! You have a best friend.");
elif len(friendList) == 0:
    print("Damn, you are one lonely person. I can be your friend, pal!")
else:
    print(len(friendList)," friends seems like a nice and small friend group! Good for you pal.");


print(friendList)