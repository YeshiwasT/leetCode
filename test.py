# from collections import defaultdict
# t = int(raw_input())
# k=int(input())
# graph = defaultdict(list)

# while k:
#     arr=[int(c) for c in input().split()]
#     if arr[0]==1:
#         graph[arr[1]].append(arr[2])
#         graph[arr[2]].append(arr[1])
#     else:
#         print(*graph[arr[1]])


#     k-=1
from collections import defaultdict,Counter,deque
import heapq
t=1
while t>0:
    temp=raw_input()
    if len(temp.split())<3:
        n,m=[int(c) for c in temp.split()]
        k=0
    else:   
        n,m,k=[int(c) for c in temp.split()]
    dic={}
    graph = defaultdict(list)
    while m>0:
        u,v,l=[int(c) for c in raw_input().split()]
        graph[u].append((v,l))
        graph[v].append((u,l))
        
        dic[str(u)+str(v)]=min(dic[str(u)+str(v)],l) if str(u)+str(v) in dic else l
        dic[str(v)+str(u)]=min(dic[str(v)+str(u)],l) if str(v)+str(u) in dic else l
        
        m-=1
    arrK=[]
    q=[]
    if k>0:
        arrK=[int(c) for c in raw_input().split()]
    lookup=set(arrK)
    for x in arrK:
        heapq.heappush(q,(0,x))
    ans=float("inf")
    visited=set()
    while q:
        temp=heapq.heappop(q)
        if temp[1] not in lookup:
            ans=temp[1]
            break
        for x in graph[temp[1]]:
            if x[1] not in visited:
                visited.add(x[1])
                heapq.heappush(q,(x[0]+temp[0],x[1]))

    if ans==float("inf"):
        print(-1)
    else:
        print(ans)

    t-=1