def solve(A, B, C):
    i , j, k = 0, 0, 0
    m, n, p = len(A), len(B), len(C)
    min_diff = abs(max(A[i], B[j], C[k]) - min(A[i], B[j], C[k]))
    while i < m and j < n and k < p:
        curr_diff = abs(max(A[i],B[j],C[k])-min(A[i],B[j],C[k]))
        if curr_diff < min_diff:
            min_diff = curr_diff
        min_term = min(A[i], B[j], C[k])
        if A[i] == min_term:
            i += 1
        elif B[j] == min_term:
            j += 1
        else:
            k += 1
    return min_diff
A = [1,4,5,8,10]
B = [6,9,15]
C = [2,3,6,6]
print(solve(A, B, C))