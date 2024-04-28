def max_idx(arr):
    max = 0
    for i in range(len(arr)):
        if arr[i] >= max:
            max = arr[i]
        else:
            max
    return max

def occurence(arr , x):
    last_idx = []
    for i in range(len(arr)):
        if arr[i] == x :
            last_idx.append(i)
    return max_idx(last_idx)


my_list = [5,6,5,3,5,4]
target = 5
output = occurence(my_list , target)
print(f"The last occurence of {target} is in index {output}")