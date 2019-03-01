def merge(A,B):
    (C,m,n)=([],len(A),len(B))
    (i,j)=(0,0)
    while i+j < m+n:
        if i==m :  #if A list is empty
            C.append(B[j])
            j+1
        elif j==n:  #if B list is empty
            C.append(A[i])
            i=i+1
        elif A[i] > B[j]: #element of B is smaller
            C.append(B[j])
            j+1
        elif  A[i] <= B[j]: #element of A is smaller
            C.append(A[i])
            i=i+1
    return C
def mergesort(A,left,right):
    if right - left <=1:
        return(A[left:right])
    if right - left > 1:  #recursive call to sort two list using divide & conquer
        mid = (left+ right)//2
        L=mergesort(A,left,mid)
        R=mergesort(A,mid,right)
        return(merge(L,R))
         
         
