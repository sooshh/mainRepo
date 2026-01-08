#
# COMP 1701 Fall 2025 Assignment 3 Main
#
# Nelson Wing
#

from homeBrewDatabaseModule import readCSV,printCSV,selectCSV,columnCSV,projectCSV,distrCSV,sortCSV,countCSV,saveCSV #importing functions from the module file

def main()->None:
    csv = [] #list to store the main file imported later
    running = True
    print("starting...")
    while(running): #while loop that doesent stop until the running variable turns false
        currentCommand = str(input("Enter a command: ")).split(" ") #seperates the users input into a list

        #for all of the below if/elif statments they check the first item in the currentcommand list, which would be the users chosen option
        if currentCommand[0] == "exit":
            print("... Exiting")
            running = False #this changes the running value to false, ending the while loop 
        elif currentCommand[0] == "read":
            csv = readCSV(currentCommand[1]) #writes to csv after getting reading from the file chosen by the user
            print(f"{len(csv)-1} rows") #writes the amount of rows in the current stored csv list
        elif currentCommand[0] == "print":
            printCSV(csv)
            print(f"{len(csv)-1} rows")
        elif currentCommand[0] == "select":
            csv = selectCSV(csv, currentCommand[1], currentCommand[2],csv[0])
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
            csv = sortCSV(csv,currentCommand[1])
            print(f"{len(csv)-1} rows")
        elif currentCommand[0] == "count":
            countCSV(csv)
        elif currentCommand[0] == "save":
            saveCSV(csv,currentCommand[1])
        else:
            print(f"{currentCommand[0]}: Command not recognized") #prints if the user inputs an invalid command option

main()
