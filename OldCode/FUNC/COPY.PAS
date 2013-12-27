Function copyme : string;

uses crt , dos;

var loop : byte;
    wrd,temp : string[20];

begin

     clrscr;
     write( 'Enter a word : ' );
     readln(wrd);
     writeln;
     temp := copy(wrd,1,3);                                     {1}
     writeln( 'The first three letters are : ',temp);
     readln;
end;