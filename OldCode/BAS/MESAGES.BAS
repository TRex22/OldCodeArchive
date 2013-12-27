'message center
'their deparment is the massege they will get

CLS
PRINT "                             ***Message Center*** "
PRINT
PRINT "                            Copyright Jason Chalom"
PRINT
INPUT "Who are you "; dept$

SELECT CASE dept$
CASE "Jason"
        BEEP: 
        CLS
        PRINT "your computer is working again"
        PRINT "go to dad at 9:00 am"
CASE "Lindi"
        BEEP:
        CLS
        PRINT "Hello Lindi welcome to this program!!!!"
CASE "Susan"
        BEEP
        CLS
        PRINT "Hello Susan meeting at 7:30 at school!!!!"
CASE ELSE
        BEEP: BEEP: BEEP: BEEP: SOUND 440, 20
        PRINT "Go to Jason to get assigned to this program"
        PRINT "or go away if you are playing around on this computer"
        PRINT "and don't do it again"
END SELECT

