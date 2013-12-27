'finds highest sales totals

'reserve room for up to 25 sales values
DIM sales(25)
'Read all data into the array
subsc = 1       'array subscript
DO
        READ sales(subsc)
        subsc = subsc + 1
LOOP UNTIL (sales(subsc - 1) = -99)
subsc = subsc - 2
high.sales = sales(1)   'store first sales value
FOR ctr = 2 TO subsc    'and compare all others to it
'Store current sales if it were higher than sales so far
        IF sales(ctr) > high.sales THEN
                high.sales = sales(ctr)
        END IF
NEXT ctr
PRINT "The highest sales were"; high.sales
DATA 2900, 5400, 3429, 3744, 7687, 4585, -99

