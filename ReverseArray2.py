def reverseArray(arr):
    i = 0
    j = len(arr) - 1
    while(i < j):
        temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        i = i + 1
        j = j - 1
    return arr

my_list = [3,5,4,3,6,5,4]
output = reverseArray(my_list)
print(output)