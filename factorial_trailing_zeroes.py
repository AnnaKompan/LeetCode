n1 = 3
n2 = 5
n3 = 0

def trailingZeroes(n):
    calc = 0
    total = 1
    if n <= 1:
        return n
    for i in range(2, n+1):
        total *= i
    # return total
    for char in str(total):
        if char == '0':
            calc += 1
    return calc

print(trailingZeroes(n1))
print(trailingZeroes(n2))
print(trailingZeroes(n3))