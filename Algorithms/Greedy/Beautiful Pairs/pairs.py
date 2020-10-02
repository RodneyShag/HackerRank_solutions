#Hackerone challenges
#python version /pairs/problem

#50 point 

# use two-pointers approach on a sorted array
n, value = map(int, input().split())
points = sorted(list(map(int, input().split())))

run = 0
i = 0
j = 1

while j < n:
    if points[j] - points[i] == value:
        ans += 1
        j += 1
    elif points[j] - points[i] > value:
        i += 1
    elif points[j] - points[i] < value:
        j += 1

print(run)
