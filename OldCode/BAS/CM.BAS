'calc

COLOR 7, 1
CLS
PRINT "***CalcMalator**"
PRINT
PRINT "Copyright Jason Chalom"
PRINT
PRINT "Please type two numbers, separated by a comma"
PRINT "(for example , 8, 5) and press ENTER"
INPUT num1, num2

DO              'display the menu, and ensure that they enter a
                'correct option
PRINT "choose your option:"
PRINT "1. add"; num1; "to"; num2
PRINT "2. subtract"; num2; "from"; num1
PRINT "3. multiply"; num1; "and"; num2
PRINT "4. divide"; num1; "by"; num2
PRINT "5.  stop the program"
PRINT
INPUT choice
LOOP UNTIL ((choice >= 1) AND (choice <= 5))

'Execute the appropriate math operation and print its result
SELECT CASE (choice)
        CASE 1
                PRINT num1; "plus"; num2; "is:"; (num1 + num2)
        CASE 2
                PRINT num1; "minus"; num2; "is:"; (num1 - num2)
        CASE 3
                PRINT num1; "times"; num2; "is"; (num1 * num2)
        CASE 4
                PRINT num1; "divded by"; num2; "is"; (num1 / num2)
        CASE 5
                STOP
END SELECT         'done

