def parent(j):
    return (j - 1) // 2
def heapify_up(heap,j):
    p = parent(j)
    if j > 0 and heap[j] < heap[p]:
        heap[j],heap[p]=heap[p],heap[j]
        heapify_up(heap,p)
def heapify_down(heap, n, current):
    small_child = current
    left = 2 * current + 1
    right = 2 * current + 2
   
    if left < n and heap[left] < heap[small_child]:
        small_child = left
       
    if right < n and heap[right] < heap[small_child]:
        small_child = right
           
    if small_child != current:
        heap[current],heap[small_child]=heap[current],heap[small_child]
        heapify_down(heap,n,small_child)
heap = [9, 4, 5, 7, 9, 10]
heapify_down(heap,len(heap),0)
print(heap)