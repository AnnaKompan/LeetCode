n1 = 27
n2 = 0
n3 = -1
n4 = 45
def power_of_three(n):
    if n <= 0:
        return False
    while n % 3 == 0:
        n /= 3
    return n == 1
print(power_of_three(n1))
print(power_of_three(n2))
print(power_of_three(n3))
print(power_of_three(n4))