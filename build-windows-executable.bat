set APP_VER=1.0-TEST
call mvn install -Dapp-ver=%APP_VER%
XCOPY %HOMEDRIVE%%HOMEPATH%\.m2\repository\com\wheezy\template\javafx-hello-world\%APP_VER% install-artifacts\%APP_VER% /S/I/Y
set datetimef=%date:~-4%%date:~4,2%%date:~7,2%_%time:~0,2%%time:~3,2%%time:~6,2%
set dttmver=%datetimef%_HelloFX
call jpackage --name HelloFX ^
 --type app-image ^
 --dest install-artifacts\%dttmver% ^
 --input install-artifacts\%APP_VER% ^
 --main-class com.wheezy.template.LauncherMain ^
 --main-jar javafx-hello-world-%APP_VER%-shaded.jar ^
 --icon src\main\resources\com\wheezy\template\icon\AppIcon.ico
 