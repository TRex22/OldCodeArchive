'shows the days of the week in order
'
OPTION BASE 1
DIM days$(7)            'for elements days(1) through days(7)
FOR ctr = 1 TO 7
        READ days$(ctr)
NEXT ctr
DATA "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"
DATA "Friday", "Saturday"

'print them out
FOR ctr = 1 TO 7
        PRINT "Day"; ctr; "is "; days$(ctr)
NEXT ctr

