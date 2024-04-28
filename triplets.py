def tripleSum(arr , x):
    count = 0
    n = len(arr)
    for i in range(0, n-2):
        for j in range(i+1, n-1):
            for k in range(j+1, n):
                if arr[i] + arr[j] + arr[k] == x:
                    count += 1
    return count

my_list = [1,4,5,6,3]
target = 12
output = tripleSum(my_list , target)
print(output)
