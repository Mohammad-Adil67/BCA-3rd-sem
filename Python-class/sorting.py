def bubble_sort(arr):
    n=len(arr)
    for i in range(n):
        for j in range(0,n-i-1):
            if arr[j]>arr[j+1]:
                arr[j],arr[j+1]=arr[j+1],arr[j]

print("-------BCA Python Bubble Sort-------")
numbers=[64,56,33,65,32,41,98,53]
print("Original Array: ", numbers)
bubble_sort(numbers)
print("Sorted Array: ", numbers)