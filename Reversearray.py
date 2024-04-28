def reverseArray(arr):
    ans = []
    for i in range(len(arr)-1,-1,-1):
        ans.append(arr[i])
    return ans
        
my_list = [0,1,7,5,4,8]
print(reverseArray(my_list))