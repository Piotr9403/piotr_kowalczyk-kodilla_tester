cd C:\Users\fryde\OneDrive\Pulpit\Kodilla-course\build\libs
DEL *.jar
cd C:\Users\fryde\OneDrive\Pulpit\Kodilla-course
call gradle build
cd C:\Users\fryde\OneDrive\Pulpit\Kodilla-course\build\libs

IF EXIST *.jar (mkdir project
copy *.jar project
) ELSE (
	echo compilation error
)