#
# COMP 1701 Fall 2025 Assignment 3 Module
#
# Nelson Wing
#

def saveCSV(csv, name): #this function saves the current stored csv list to a new file with a name of the users choice
    with open(name, 'w') as file: #opens the new file in write mode
        for row in csv:
            for column in range(len(row)):
                if column != len(row)-1: #checks if the current column is not at the end and will only add a , to seperate data
                    file.write(row[column]+",")
                elif csv.index(row)!=len(csv)-1: #if the current index is at the end, but not the very last data entry, this will add a new line indicator (\n) for the csv program
                    file.write(str(row[column])+"\n")
                else: # this else statment only triggers when the very last data point is called and its added with no , or \n to prevent an empty point
                    file.write(str(row[column]))
    file.close() #closes the file
                
def countCSV(csv):#this function uses len to print the amount of rows the stored csv file has excluding the header
    print(f"{len(csv)-1} rows") 

def sortCSV(csv,item): #this function takes a selected column from the user and seperates it out into its own list, its then sorted and main stored csv list uses the same swaps to sort itself in accordance with the users choice of column
    pluckedList = [] #seperated list
    dexItem = csv[0].index(item) #indexing the user chosen column
    for x in range(1,len(csv)): #basic swap sort algorithm 
        pluckedList.append(csv[x][dexItem])
    for current in range(len(pluckedList)):
        biggest = current
        for next in range (current, len(pluckedList)):
            if pluckedList[next] < pluckedList[biggest]:
                biggest=next
        pluckedList[current], pluckedList[biggest] = pluckedList[biggest], pluckedList[current] #the two values are swapped if one is bigger than the other
        csv[current+1], csv[biggest+1] = csv[biggest+1], csv[current+1] #the two rows are swapped the same way the plucked list is 
    return csv

def distrCSV(csv, item): #this takes a column from the user and checks how many times each entry in that column appears
    dexItem = csv[0].index(item) #indexing the users choice
    track = [] #list for unique items in the column
    chosenColumn = [] #list for all the items in the chosen list
    newList = []#list for a properly formatted list to be returned at the end of the function
    for row in range(1,len(csv)):
        chosenColumn.append(csv[row][dexItem]) #adds all the list items in the same column to the same list
    for row in range(1,len(csv)):
        if csv[row][dexItem] not in track:
            track.append(csv[row][dexItem]) #gets a list of all unique items
    newList.append([item,"Count"]) #adds a header to the new list
    for x in range(len(track)): 
        newList.append([track[x],chosenColumn.count(track[x])]) #adds the name of the current data point and then uses the count function to see how many times it occurs
    return newList

def projectCSV(csv,chosenOptions): #this gets the columns the user wants to keep then deletrs the ones that are not listed
    itemsToKeep = [] #a list for storing the users choices
    keptItems = [] #a list for the newly formatted list according to the user
    for input in range(1,len(chosenOptions)):
        itemsToKeep.append(chosenOptions[input]) #adds the chosen column to the list
    for row in csv:
        temp = [] #temp list for storing data before adding to the final list
        for column in range(len(row)):
            for keep in itemsToKeep:
                if column == csv[0].index(keep): #checks if the current item being scanned is apart of the whitelist
                    temp.append(row[column]) #adds the whitelisted item to the temp list
        keptItems.append(temp) #adds the temp list to the main list
    return keptItems

def columnCSV(columnRow): #prints the current columns in the stored csv file
    print("-------")
    for columns in columnRow:
        print(columns)
    print("-------")

def selectCSV(csv, column, item,header): #this function gets a column and item from the user, then it deletes all rows that do not have that same value in the choses column
    scan = csv 
    num = header.index(column)
    for row in scan:
        if row[num] != item and row[num] != column: #checks if the row does not have the chosen value in the current selected column, it also checks if its not the header
            csv.remove(row) #removes the row from the list
    return scan

def printCSV(csv): #prints the current stored csv file formatted to the size
    length = [] #this is a list for storing the max length of a value in a column
    for amount in range(len(csv[0])):
        length.append(0) # adds as many zeros as there are columns to the list
    
    for column in range(len(csv[0])):
        for row in range(len(csv)):
            if length[column] < len(str(csv[row][column])): #checks if the current value aligned with the index of the csv and length list is larger than the currently stored value
                length[column] = len(str(csv[row][column])) #updates largest value if its bigger
    total = 0 #a value for a max total length of the row
    for max in length: 
        total = max +total + 3 #adds the length list together with a spacing of 3
    for i in range(total):
        print("-", end = "") #prints dashes according to the total max length of a row
    print()
    for row in csv:
        for column in row:
            print(column, end='') #prints the current value with no line break
            for space in range(length[row.index(column)]-len(str(column))+3):
                print(" ", end='') #prints spaces to align the next data entry with a consistant format with the size of the largest entry plus 3
        print()
        if csv.index(row) == 0: #checks if the last row printed was the header
            for i in range(total): 
                print("-", end = "") #prints dashes according to the total max length of a row
            print()
    for x in range(total): #prints dashes according to the total max length of a row
        print("-", end = "")
    print()
            
def readCSV(csv):
    read = [] #list to store the read csv file
    with open(csv, mode = 'r') as file: #opens the file in read mode
        for lines in file:
            lines = lines.replace("\n","") #removes the \n from any data entries
            read.append(lines.split(',')) #splits the line into a list using the , as a seperator
        if read[-1] == [""]: #checks if the last data entry is empty
            read.remove([""]) #removes the empty data entry
    file.close() #closes the file
    return read