program jason;

uses crt;
begin
textmode (co40);
textbackground (3);
{clrscr}      {1}
gotoxy(35,1);
textcolor(15);
{lowvideo;}   {2}
write( 'right' );
gotoxy (1,25);
write( 'bottom left' );
textmode (co80);
textbackground (0);
gotoxy (35,12) ;
textcolor (6);
highvideo;
write( 'centre' );
normvideo;
readln;
end.




















