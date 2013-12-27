program testing_for_invalid_characters;
uses crt;

type st50 = string[50];
var st : st50;
    eat : string;
function invalid (fst : st50 ) : boolean;
var found : boolean;
    count : byte;

begin
     found := false;
     count := 0;
     while (count < length(fst)) and (not found) do
     begin
          count := count + 1;
          fst[count] := upcase(fst[count] );
          if (fst[count] = 'I') or (fst[count] = 'O')
                     then found := true;
     end;
     InValid := found;
end;

begin                   {main Program}

repeat
textcolor (2);
clrscr;
writeln( 'Please enter the code to be checked ... ' );
writeln( 'To exit type ''checked'' ');
read(st);

   if InValid(st) then
   begin
   readln;
   writeln( st,' does contain Is and Os' );
   readln;
   end;

   if not InValid(st) then begin
   readln;
   writeln(st,' does not contain any Is or Os' );
   readln;
   end;

   if (st = '' ) then
   begin
   writeln( 'Please type some code in.' );
   readln;
   end;

until (st = 'checked') or (st = 'Checked' ) or (st = 'checked.' );
end.
