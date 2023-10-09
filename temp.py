t=int(raw_input())
while t>0:
    n,k =[c for c in input().split()]
    arr=[int(c) for c in input().split()]
    print(arr)
    print(n+k)
    t-=1
from collections import defaultdict, deque, Counter
from heapq import heapify, heappop, heappush
import sys, threading

def I(): return int(input())
def II(): return map(int, input().split())
def IL(): return list(map(int, input().split()))
def SIL(): return sorted(map(int, input().split()))

def main():
    t = 1
    t = int(input())
    for _ in range(t):
        run_test_case()

def run_test_case():
    n = I()
    string = input()
    def find_good(l, r, string, c):
        if l == r and str
#jhon testcase


















nextInts = lambda: list(map(int, input().split()))
nextInt = lambda: int(input())
Mod = 10**9 + 7

def solution():


def main():

    t = 1
    #t = int(input())
    for _ in range(t):
        solution()
#------------------#
# recursion Region #
#------------------#

#sys.setrecursionlimit(10**6)
#threading.stack_size(1 << 27)
#thread = threading.Thread(target=main)
#thread.start(); thread.join()
main()


from collections import defaultdict, deque, Counter
from heapq import heapify, heappop, heappush
import sys, threading

n,m=[int(c) for c in input().split()]

def main():
    t = 1
    count=float("inf")
    custSet=set()
    def solution(n,c):
        
        nonlocal count
        if n>m or n in custSet:
            return
        if n==m:
            count=min(count,c)
            return 
        custSet.add(n)
        solution(n*2,c+1)
        solution(n*3,c+1)
    #t = int(input())
    for _ in range(t):
        solution(n,0)
    print(count if count!=float("inf") else -1)
#------------------#
# recursion Region #
#------------------#

sys.setrecursionlimit(10**6)
threading.stack_size(1 << 27)
thread = threading.Thread(target=main)
thread.start(); thread.join()
