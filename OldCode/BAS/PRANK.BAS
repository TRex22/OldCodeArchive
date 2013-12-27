'checks for answer
'

CLS

'the following ensures that a proper input was typed
DO
        INPUT "do you want to delete your hard drive? (y/n)"; ans$
        IF ((ans$ <> "y") AND (ans$ <> "n")) THEN
                BEEP
                PRINT
                PRINT "you must enter a y or an n! "
                PRINT "please try again......"
                PRINT

ELSE
        PRINT "Thank you."
        PRINT
        PRINT "prossesing your information"
        PRINT
END IF
LOOP UNTIL ((ans$ = "y") OR (ans$ = "n"))

'rest of program would go here
FOR time = 1 TO 200

        note = INT(RND * 2735) + 500  'ramdom note
        dur = INT(RND * 3) + 1        'random duration
        SOUND note, dur               'sound the note

NEXT time      'repeat

