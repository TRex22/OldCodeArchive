'Stores 12 months of salaries and month names,
'Printing selected ones at the user's request.
'Jason Chalom
DIM sal(12)             'reserve enough elements for the 12 slalaries
DIM months$(12)         'and the 12 month names

'Fill up  the month names
FOR ctr = 1 TO 12
        READ months$(ctr)       'save the next month name
NEXT ctr

'The data can go at the bottom of the program
DATA "January", "Febuary", "March", "April", "May", "June"
DATA "July", "August", "September", "October", "November"
DATA "December"

CLS
FOR subsc = 1 TO 12
        PRINT "What is the salary for "; months$(subsc);
        INPUT sal(subsc)        'The previous trailing semicolon keeps
                                'the question mark after the month name
NEXT subsc

'Clear the screen, and wait for a requested month
CLS
PRINT "***Salary Printing Program***"
PRINT "Prints any salary from the last 12 months"
'request the month number
DO
        INPUT "What month (1 - 12) do you want to see"; month.num
        PRINT
        PRINT "The salary for "; months$(month.num); " is";
        PRINT
        sal(month.num)
        PRINT
        INPUT "Do you want to see another (Y/N)"; ans$
LOOP WHILE ((ans$ = "Y") OR (ans$ = "y"))

