import random

def sorty(listy,listwo):
    sortedList = listy
    for current in range(len(sortedList)):
        biggest = current
        for next in range (current, len(sortedList)):
            if sortedList[next] < sortedList[biggest]:
                biggest=next
        sortedList[current], sortedList[biggest] = sortedList[biggest], sortedList[current]
            #print(listwo)
            #listwo[x][current], listwo[x][biggest] = listwo[x][biggest], listwo[x][current]
        listwo[current], listwo[biggest] = listwo[biggest], listwo[current]
    for x in range(len(listwo)):
        print(listwo[x])
    return sortedList


def main():
    listy=[3,2,1,4]
    listwo=[
        [3,"B"],
        [2,"B"],
        [1,"A"],
        [4,"A"]
    ]
    
    print(str(listy)+str(listwo)+"\n")
    for x in range(len(listwo)):
        print(listwo[x])
    print()
    print(sorty(listy,listwo))
main()