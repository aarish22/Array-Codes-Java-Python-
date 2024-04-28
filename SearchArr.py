def searchArr(arr):
    target = int(input("Enter the element you want to search in array: "))
    idx = -1
    for i in range (len(arr)):
        if arr[i] == target:
            idx = i
            break
    return idx
        

arr = [2,3,5,6,5,7]
Element_Idx=searchArr(arr)
print(Element_Idx)