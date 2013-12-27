'Program That sounds like a siren
'

FOR time = 1 TO 2

        FOR up = 1000 TO 1500 STEP 25
            SOUND up, 3
        NEXT up

        FOR down = 1500 TO 1000 STEP -25
            SOUND down, 3
        NEXT down

NEXT time  'repeat once

