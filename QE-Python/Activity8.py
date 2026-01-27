# numbers = [10, 20, 30, 40, 10]

# if numbers[0] == numbers[-1] :
#     print(True)
# else :
#     print(False)


# User input code 
numbers = list(map(int, input("Enter numbers separated by spaces: ").split()))

if numbers[0] == numbers[-1]:
    print(True)
else:
    print(False)
