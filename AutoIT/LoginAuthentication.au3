WinWaitActive("","Authentication Required","10")
WinFlash("", "Authentication Required",4,500)
If WinExists("","Authentication Required") Then
 Send("abhijitbhawarlal.ja{TAB}")
  Send("ArhaanAbhi@2104{Enter}")
   Send("{Enter}")
ElseIf WinExists("","Chrome Legacy Window")Then
  Send("abhijitbhawarlal.ja{TAB}")
  Send("ArhaanAbhi@2104{Enter}")
   Send("{Enter}")
ElseIf WinExists("","Windows Security") Then
 Send("abhijitbhawarlal.ja{TAB}")
  Send("ArhaanAbhi@2104{Enter}")
   Send("{Enter}")
EndIf