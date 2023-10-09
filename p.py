t = int(input())  # Read the number of test cases

for _ in range(t):
    n, s = map(int, input().split())  # Read n and s for each test case
    a = list(map(int, input().split()))  # Read the list of times for each part
    
    total_gifts = 0  # Total gifts if Vasya doesn't skip any part
    max_gifts = [a[0],1] # Initialize maximum gifts
    skip_part = 0  # Initialize the part to skip
    count=0
    ans=max_gifts[1]
    for i in range(1,n):
        if total_gifts>s and count==0:
            count+=1
            total_gifts-=max_gifts[0]
            ans=max_gifts[1]
        total_gifts+=a[i]
        if a[i]>max_gifts[0]:
            max_gifts=[a[i],i+1]
    if max_gifts[0]<s:
        print(0)
    else:
        print(ans)
