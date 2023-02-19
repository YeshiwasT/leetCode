from sys import stdin, stdout
n=int(input())
i=0
li = [int(x) for x in stdin.readline().split()]

ans=[]
for j,val in enumerate(li):
    #print(val)
    temp=set()
    lower=0
    while lower<3:
        value=val-lower
        if value in li:
            temp.add(value)
        lower=lower+1
    ans.append(temp)
   # print(temp)
z=True
for item in range(len(ans)):
    if len(ans[item])==3:
        z=False
        print("YES")
        break
if z:
    print("NO")
    