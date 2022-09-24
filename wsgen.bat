@echo off
echo WSGEN is running
C:
cd \
cd C:\Ach\out\artifacts\Ach_war_exploded\WEB-INF\classes
"c:\Program Files\Java\jdk1.7.0_05\bin\wsgen.exe" -verbose -keep -cp . aminParsian.service.implementation.DarmanWebService

pause

