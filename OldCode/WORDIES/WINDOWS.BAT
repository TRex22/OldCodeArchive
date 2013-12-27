cls
c:\
md c:\wordies\temp
cd wordies
move wordiesn*.* c:\wordies\temp
move wordies.exe c:\wordies\temp
move wordies.pas c:\wordies\temp
move nocolour.bat c:\wordies\temp
move colour.bat c:\wordies\temp
move gon.bat c:\wordies\temp
move goc.bat c:\wordies\temp
cd temp
move wordiesw*.* c:\wordies
erase *.pas
erase *.exe
erase *.bat
cd..
rd temp
rename gow.bat go.bat
Rem Please type go in the \wordies directory to run Wordies
