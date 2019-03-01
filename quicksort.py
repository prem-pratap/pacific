li=[]
li=input("Enter elements:").split(",")
def quicksort(A,l,r):  #sort A[l:r]
    if r-l <=1:
        return(A)
    #partition with respesct to pivot A[l]
    smaller=l+1
    for larger in range(l+1,r):
        if (A[larger]<=A[l]):
            (A[smaller],A[larger])=(A[larger],A[smaller])
            smaller=smaller+1

    #Move pivot to right place
    (A[l],A[smaller-1])=(A[smaller-1],A[l])
    quicksort(A,l,smaller-1)   #yellow-1 becoz yellow pointer is one ahead pivot
    quicksort(A,smaller,r)
quicksort(li,0,len(li))
print("Sorted list:",li)
    
