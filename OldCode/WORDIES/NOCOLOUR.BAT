c:\
md c:\wordies\temp
cd wordies
move wordies.exe c:\wordies\temp
move wordies.pas c:\wordies\temp
move wordiesw.exe c:\wordies\temp
move wordiesw.pas c:\wordies\temp
move goc.bat c:\wordies\temp
move gow.bat c:\wordies\temp
cd temp
erase *.pas
erase *.exe
erase *.bat
cd..
rd temp

rename gon.bat go.bat
rem Please type go in the \wordies directory to run Wordies
