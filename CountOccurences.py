def CountOccurences(arr , x ):
    count = 0
    for i in range (len(arr)):
        if x == arr[i]:
            count = count + 1
    return count

my_list = [5,6,5,1,5]
target = 5
count = CountOccurences(my_list , target)
print(count)    