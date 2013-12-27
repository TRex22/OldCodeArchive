'show where the file is
'
CLS
LINE INPUT "What is the name of the record? "; rec.names$

PRINT
SELECT CASE rec.name$
        CASE IS < "h"
                PRINT "the record is in cabinet 1."
        CASE IS < "q"
                PRINT "the record is in cabinet 2."
        CASE ELSE
                PRINT "the record is in cabinet 3."
END SELECT

