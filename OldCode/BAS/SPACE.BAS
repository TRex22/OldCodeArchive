' Space sounds
'

FOR time = 1 TO 200

        note = INT(RND * 2735) + 500  'ramdom note
        dur = INT(RND * 3) + 1        'random duration
        SOUND note, dur               'sound the note

NEXT time      'repeat

