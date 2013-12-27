'member or not
'
CLS
INPUT "what is the person's name"; nam$

' test it against all club members in the DATA
DO

READ members$
LOOP UNTIL (members$ = "-99")

'build the message string from the result of the if-then-else
message$ = nam$ + " " + "Welcome" + mess$ + " " + "you are" + " " + "a Member."
PRINT message$

'club members' last names
DATA "Chalom", "Fineburg", "Galgut", "Sher", "Kalmon"
DATA "Jason", "Raymond", "Lindi", "Susan", "Diana", "Jake", "Lilian"
DATA "-99"

