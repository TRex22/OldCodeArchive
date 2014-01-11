{Copyright 2008 Jason Chalom}
 program memcleanexperi;
{ For Windows: }
uses winCrt;


 type
   TFriendRec = record
                 Name: string[250];
                 Age : Byte;
                 more: string[250];
                 gore: byte;
               end;
 var
   p: pointer;

 begin

   if MaxAvail < SizeOf(TFriendRec) then
     Writeln('Not enough memory')

   else
   begin

     { Allocate memory on heap }
     GetMem(p, SizeOf(TFriendRec));
     { ...}
     { ...Use the memory... }
     { ...}
     { Then free it when done }
     release(p, SizeOf(TFriendRec));


   end;

 end.


