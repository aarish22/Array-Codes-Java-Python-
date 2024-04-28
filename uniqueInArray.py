def uniqueElement(arr):
    flag = False
    ans = 0
    for i in range(len(arr)):
        for j in range(i+1,len(arr)):
            if arr[i] == arr[j]:
                arr[i] = -1
                arr[j] = -1
    for i in range(len(arr)):
        if (arr[i] > 0):
            ans = arr[i]
    return ans    

my_list = [1,3,4,3,1]
output = uniqueElement(my_list)
print(output)