print("enter 1 to add\nenter 2 to subtract \n enter 3 to multiply\n enter 4 to divide")
bi= int(raw_input())
#bi=2
print("enter first number")
first= int(raw_input())
#first=8
print("enter second number")
second= int(raw_input())
#second=5

if bi==1:
    print(first+second)
elif bi==2:
    print(first-second)
elif bi==3:
    print(first*second)
elif bi==4:
    print(first/second)
else:
    print("You enter a wrong number")
    

