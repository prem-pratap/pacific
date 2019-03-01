def merge(left,right,A):
    (i,j,k)=(0,0,0)
    while (i < len(left) and j <len(right)):
        if (left[i]<right[j]):
            A[k]=left[i]
            i =i+1
            k=k+1
        else:
            A[k]=right[j]
            j=j+1
            k=k+1

    while (i < len(left)):
        A[k]=left[i]
        i =i+1
        k =k+1
    while (j < len(right)):
        A[k]=right[j]
        j =j+1
        k =k+1

def mergesort(A):
    if(len(A))<2:
        return A
    mid=len(A)//2
    left=[]
    right=[]
    for i in range(mid):
        left.append(A[i])
    for j in range(mid,len(A)):
        right.append(A[j])
    mergesort(left)
    mergesort(right)
    merge(left,right,A)
#A=[56,21,98,34,25,82,71,66]
li=[]
li=input("Enter elements:").split(",")
#print(li)
#print(type(li))
mergesort(li)
print("Sorted list:",li)
