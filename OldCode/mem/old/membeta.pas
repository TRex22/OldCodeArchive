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
   p4: pointer;
   p1,p2,p3 : ^Integer;
 begin

   if MaxAvail < SizeOf(TFriendRec) then
     Writeln('Not enough memory')

   else
   begin



  GetMem(p, SizeOf(TFriendRec));
     { ...}
     { ...Use the memory... }
     { ...}
     { Then free it when done }
     FreeMem(p, SizeOf(TFriendRec));



   end;
    begin
    New(p1); { Allocate an Integer }
   Mark(p4); { Save heap state }
   New(p2); { Allocate two more Integers }
   New(p3);
   Release(p4); { Memory reserved for p2^ and
                 p3^ has been released; p1^
                 may still be used }
  end;
 end.


