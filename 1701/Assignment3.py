

#columns X
def saveCSV(csv, name):
    with open(name, 'w') as file:
        for row in csv:
            for columb in range(len(row)):
                if columb != len(row)-1:
                    file.write(row[columb]+",")
                elif csv.index(row)!=len(csv)-1:
                    file.write(str(row[columb])+"\n")
                else:
                    file.write(str(row[columb]))
def countCSV(csv):
    print(f"{len(csv)-1} rows")
def sortCSV(csv,item):
    pluckedList = []
    dexItem = csv[0].index(item)
    for x in range(1,len(csv)):
        pluckedList.append(csv[x][dexItem])
    for current in range(len(pluckedList)):
        biggest = current
        for next in range (current, len(pluckedList)):
            if pluckedList[next] < pluckedList[biggest]:
                biggest=next
        pluckedList[current], pluckedList[biggest] = pluckedList[biggest], pluckedList[current]
        csv[current+1], csv[biggest+1] = csv[biggest+1], csv[current+1]
def distrCSV(csv, item):
    thingy = csv[0].index(item)
    track = []
    listy = []
    newList = []
    for x in range(1,len(csv)):
        listy.append(csv[x][thingy])
    for x in range(1,len(csv)):
        if csv[x][thingy] not in track:
            track.append(csv[x][thingy])
    newList.append([item,"Count"])
    for x in range(len(track)):
        newList.append([track[x],listy.count(track[x])])
    return newList
def projectCSV(csv,listy):
    itemsToKeep = []
    keptItems = []
    for input in range(1,len(listy)):
        itemsToKeep.append(listy[input])
    print(itemsToKeep)
    for column in csv:
        temp = []
        for row in range(len(column)):
            for remove in itemsToKeep:
                if row == csv[0].index(remove):
                    temp.append(column[row])
        keptItems.append(temp)
    return keptItems
def columnCSV(objects):
    print("-------")
    for x in objects:
        print(x)
    print("-------")
def selectCSV(csv, column, item, objects):
    print(column)
    scan = csv.copy()
    num = objects.index(column)
    for x in scan:
        if x[num] != item and x[num] != column:
            csv.remove(x)
def printCSV(csv):
    length = []
    for amount in range(len(csv[0])):
        length.append(0)
    
    for x in range(len(csv[0])):
        for y in range(len(csv)):
            if length[x] < len(str(csv[y][x])):
                length[x] = len(str(csv[y][x]))
    total = 0
    for x in length:
        total = x +total + 3
    for x in range(total):
        print("-", end = "")
    print()
    for x in csv:
        for y in x:
            print(y, end='')
            for z in range(length[x.index(y)]-len(str(y))+3):
                print(" ", end='')
        print()
        if csv.index(x) == 0:
            for x in range(total):
                print("-", end = "")
            print()
    for x in range(total):
        print("-", end = "")
    print()
            
def readCSV(csv):
    rawrrr = []
    with open(csv, mode = 'r') as file:
        for lines in file:
            lines = lines.replace("\n","")
            rawrrr.append(lines.split(','))
        if rawrrr[-1] == [""]:
            rawrrr.remove([""])
    return rawrrr
def main()->None:
    csv = []
    csvColumns = []
    print("starting...")
    while(True):
        currentCommand = str(input("Enter a command: ")).split(" ")
        if currentCommand[0] == "exit":
            print("... Exiting")
            break
        elif currentCommand[0] == "read":
            csv = readCSV(currentCommand[1])
            csvColumns = csv[0]
            print(f"{len(csv)-1} rows")
        elif currentCommand[0] == "print":
            printCSV(csv)
            print(f"{len(csv)-1} rows")
        elif currentCommand[0] == "select":
            selectCSV(csv, currentCommand[1], currentCommand[2], csv[0])
            print(f"{len(csv)-1} rows")
        elif currentCommand[0] == "columns":
            columnCSV(csv[0])
        elif currentCommand[0] == "project":
            csv = projectCSV(csv,currentCommand)
            print(f"{len(csv)-1} rows")
        elif currentCommand[0] == "distr":
            csv = distrCSV(csv,currentCommand[1])
            print(f"{len(csv)-1} rows")
        elif currentCommand[0] == "sort":
            sortCSV(csv,currentCommand[1])
            print(f"{len(csv)-1} rows")
        elif currentCommand[0] == "count":
            countCSV(csv)
        elif currentCommand[0] == "save":
            saveCSV(csv,currentCommand[1])
        else:
            print(f"{currentCommand[0]}: Command not recognized")
        
main()