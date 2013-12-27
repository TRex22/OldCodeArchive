cls
c:\
md c:\wordies\temp
cd wordies
move wordiesn*.* c:\wordies\temp
move wordiesw*.* c:\wordies\temp
move gon.bat c:\wordies\temp
move gow.bat c:\wordies\temp
cd temp
erase *.pas
erase *.exe
erase *.bat
cd..
rd temp

rename goc.bat go.bat
Rem Please type go in the \wordies directory to run Wordies
