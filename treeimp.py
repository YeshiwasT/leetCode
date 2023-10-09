t=int(input())
while t>0:
    n=int(input())
    arr=[int(c) for c in input().split()]
    customDic={}
    for x in range(n):
        if arr[x] not in customDic:
            customDic[arr[x]]=[]
        customDic[arr[x]].append(x+1)
    print(customDic)  
    t-=1
t=int(input())

while t>0:
    n=int(input())
    arr=[int(c) for c in input().split()]
    customDic={}
    for x in range(n):
        if x+1==arr[x]:
            customDic[x+1]=-1
        else:
            customDic[x+1]=arr[x]
    visited=set()
    ans=[]
    if len(customDic)==1:
        ans.append([arr[0]])
    def dsf(x,cur):
        if x in visited or x==-1:
            ans.append(cur.copy())
            return
        cur.append(x)
        visited.add(x)
        dsf(customDic[x],cur)
        
    for x in customDic:
        if x not in arr:
            dsf(x,[])
    print(len(ans))
    for j in ans:
        print(len(j))
        print(*j)
    print()
    
    t-=1

        












3
3
3 1 5
1
2
1
4

2
2
1 2
2
4 3

1
7
1 2 3 4 5 6 7

1
1
1

3
3
4 1 5
2
2 6
1
3

3
2
2 1
1
3
1
4
