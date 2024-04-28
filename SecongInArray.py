def findMax(arr):
    max = float("-inf")
    for i in range(len(arr)):
        if(arr[i] > max):
            max = arr[i]
    return max 
def findSecondMax(arr):
    max = findMax(arr)
    for i in range(len(arr)):
        if(arr[i] == max):
            arr[i] = float("-inf")
    secondMax = findMax(arr)
    return secondMax

my_list = [1,5,4,6,9]
print(findSecondMax(my_list))