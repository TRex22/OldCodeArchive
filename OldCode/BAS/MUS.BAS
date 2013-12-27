' plays all possible c-scale notes in background
'and prints a repeating musical message.
'
DIM note$(6)
CLS

FOR ctr = 0 TO 6
        READ note$(ctr)    'put note names in the array
NEXT

PLAY "mb"
FOR octave = 0 TO 6
        PLAY "o" + RIGHT$(STR$(octave), 1)   'set the octave
        FOR ctr = 0 TO 6
            PLAY "l16" + note$(ctr)          'play the next 16th note
        NEXT ctr
NEXT octave

DATA "c", "d", "e", "f", "g", "a", "b"

' print a musical message randomly on the screen
FOR ctr = 1 TO 1000
        LOCATE INT(RND * 24) + 1, INT(RND * 60) + 1'compute random row and
                                                   'column
        PRINT "Music has charm to tame the savage beast! ";
NEXT ctr

