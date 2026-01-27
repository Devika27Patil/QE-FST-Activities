def sum_num(n) :
    if n == 0 :
        return 0
    else :
        return n + sum_num(n-1)
    
result = sum_num(10)
print("Sum :", result)