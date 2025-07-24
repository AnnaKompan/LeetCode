word1 = "abc"
word2 = "pqr"
word3 = "ab"
word4 = "pqrs"
word5 = "abcd"
word6 = "pq"

# def mergeAlternately(self, word1, word2):
#     merged = ""
#     i, j = 0, 0
#     while i < len(word1) and j < len(word2):
#         merged += word1[i]
#         merged += word2[j]
#         i += 1
#         j += 1
#     merged += word1[i:]
#     merged += word2[j:]
#     return merged

def mergeAlternately(word1, word2):
    merged = "".join(a + b for a, b in zip(word1, word2))
    return merged + word1[len(word2):] + word2[len(word1):]

print("Test Case 1: ", mergeAlternately(word1,word2))
print("Test Case 2: ", mergeAlternately(word3,word4))
print("Test Case 3: ", mergeAlternately(word5,word6))