numbers = (10, 15, 20, 23, 25, 33, 40, 42)

for num in numbers:
    if num % 5 == 0:
        print(num)


# User input code 
numbers = tuple(map(int, input("Enter numbers separated by spaces: ").split()))

for num in numbers:
    if num % 5 == 0:
        print(num)
