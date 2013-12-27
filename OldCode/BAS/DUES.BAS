'program to tell dues of money
'useful
'

DIM family$(500), dues(500)             'reserve the array elements

CLS
subsc = 1                         'initial subscript to get loop started
'the following loop asks for family names and dues until the
'users prosses enter without typing a name. Whenever a null
'input is given (just an enter key press), the do-loop exits
'early with subsc holding the number input to that point.

DO
        PRINT "Please type the next family's names"
        PRINT "(Press ENTER without typing a name if you are done)"
        INPUT family$(subsc)
        IF (family$(subsc) = "") THEN EXIT DO   'this triggers early exit
        INPUT "What are their dues"; dues(subsc)
        subsc = subsc + 1                 'Add one to the subscrip Variable
LOOP UNTIL (subsc > 500)
'when the last loop finishes, subsc holds the actual number input

FOR ctr = 1 TO (subsc - 1) 'loop through each family entered
        PRINT "Family"; ctr; "is "; family$(ctr)
        PRINT "their dues are"; dues(ctr)
NEXT ctr                'prints all the input data



