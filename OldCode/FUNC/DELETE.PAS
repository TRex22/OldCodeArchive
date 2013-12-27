Function deleteme : string;

uses crt, dos;

var stg : string;

begin
     clrscr;
     writeln( '12 letter word or sentence' );
     read(stg);
     delete (stg, 2, 6);
     writeln (stg);
     delete (stg, 5 , 3);
     writeln (stg);
     delete (stg, 3, 1);
     writeln (stg);
     readln;
end;