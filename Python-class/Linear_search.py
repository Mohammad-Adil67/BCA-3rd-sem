def linear_search(arr , elem):
    for i in range(len(arr)):
        if arr[i]==elem:
            print(f"element {elem} found at index {i}")
    return -1

print("---BCA Python  Linear Searching---")
numbers=[43,27,98,54,32,54,79]
elem=32

linear_search(numbers,elem)

