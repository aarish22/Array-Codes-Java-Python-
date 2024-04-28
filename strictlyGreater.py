def greater(arr , target):
    count = 0
    for i in range(len(arr)):
        if arr[i] > target:
            count = count + 1 
    return count

my_list = [5,3,7,4,6,45,5,6,4]
target = 5
output = greater(my_list , target)
print(f"The number of elements greater than {target} is {output}")