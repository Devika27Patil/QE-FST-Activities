numbers = [10, 20, 30, 40, 50]

total = 0
for num in numbers :
    total += num

print("The sum of the list is :",total)


# User input code
user = input("Enter the numbers:")
num = user.split()

total = 0
for n in num:
    total += int(n)

print("Total sum :",total)