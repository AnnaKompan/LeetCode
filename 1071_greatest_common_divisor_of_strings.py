"""
GCD (greatest common divisor) euclidean algorithm
"""
str1 = "ABCABC"
str2 = "ABC"
str3 = "ABABAB"
str4 = "ABAB"
str5 = "LEET"
str6 = "CODE"
str7 = "TAUXXTAUXXTAUXXTAUXXTAUXX"
str8 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"

def gcdOfStrings(str1, str2):
    if str1 + str2 != str2 + str1:
        return ""
    else:
        def gcd(a, b):
            while b:
                a, b = b, a % b
            return a
        length = gcd(len(str1), len(str2))
        return str1[:length]

print("Test Case 1: ", gcdOfStrings(str1,str2))
print("Test Case 2: ", gcdOfStrings(str3,str4))
print("Test Case 3: ", gcdOfStrings(str5,str6))
print("Test Case 4: ", gcdOfStrings(str7,str8))