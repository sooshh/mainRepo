def sorty(listy):
    sortedList = listy
    for current in range(len(sortedList)):
        biggest = current
        for next in range (current, len(sortedList)):
            if sortedList[next] < sortedList[biggest]:
                biggest=next
        sortedList[current], sortedList[biggest] = sortedList[biggest], sortedList[current]

    return sortedList

def towerMaker(boxList,totalHeight):
    hits = []
    for x in boxList:
        for y in boxList:
            for z in boxList:
                if x != y and x != z and y != z:
                    scan = int(x)+int(y)+int(z)
                    if scan == int(totalHeight[0]):
                        print(f"hit on {x} {y} {z} for {totalHeight[0]}")
                        hits.append([x,y,z])
                    elif scan == int(totalHeight[1]):
                        print(f"hit on {x} {y} {z} for {totalHeight[1]}")
                        hits.append([x,y,z])

def main():
    userIn = input().split()
    totHeight = []
    finalList = []
    totHeight.append(userIn.pop(-1))
    totHeight.append(userIn.pop(-1))
    print(userIn,totHeight)
    towerMaker(userIn,totHeight)
main()
