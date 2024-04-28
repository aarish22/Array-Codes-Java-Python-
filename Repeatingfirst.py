def firstRepeat(arr):
    for i in range(len(arr)):
        for j in range(i+1,len(arr)):
            if arr[i] == arr[j]:
                return arr[i]
    return -1

my_list = [1,2,2,4,6,5,4]
print(firstRepeat(my_list))