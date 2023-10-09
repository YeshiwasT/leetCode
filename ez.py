import math

def prime_divisors(x):
    divisors = []
    for i in range(2, int(math.sqrt(x)) + 1):
        while x % i == 0:
            divisors.append(i)
            x //= i
    if x > 1:
        divisors.append(x)
    return divisors

n = int(input())

c = [0] * (n + 2)  

color = 1

for i in range(2, n + 2):
    divisors = prime_divisors(i)
    used_colors = set()
    
    for d in divisors:
        if c[d] != 0:
            used_colors.add(c[d])
    
    if not used_colors:
        c[i] = color
        color += 1
    else:
        for c in range(1, n + 2):
            if c not in used_colors:
                c[i] = c
                break

min_colors = max(c)
print(min_colors)
print(" ".join(map(str, c[2:])))
