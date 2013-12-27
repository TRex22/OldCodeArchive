'program tell legal vehicle age to drive
'
CLS
INPUT "How old are you"; age

SELECT CASE age
        CASE 1 TO 13
                PRINT "you can only ride a bike"
        CASE 14 TO 17
                PRINT "you can ride a motocycle"
        CASE 18 TO 99
                PRINT "you can drive a car"
        CASE 100 TO 999
                PRINT "You are to old to ride a bike, a motocycle or a car!"
        CASE ELSE
                PRINT "you typed a bad age. Please ask for assistance."
END SELECT

