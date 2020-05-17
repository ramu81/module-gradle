Gradle set-up

downlode the gradle form https://gradle.org/install/

set path;

>path=.;C:\softwares\jdk-14.0.1\bin;C:\softwares\gradle-6.4.1\bin;C:\Program Files\Notepad++;

create the gradle wraper 

>gradle wrapper --gradle-version 6.4.1

add java home @ gradlew.bat file  @ line 54

>set JAVA_HOME=C:\softwares\jdk-14.0.1

create source and test folders

>mkdir src\main\java\edu\chinna\kadhira
>mkdir src\test\java\edu\chinna\kadhira

create a canary test 

>start Notepad++ src\test\java\edu\chinna\kadhira\UtilTest.java

>start Notepad++ src\main\java\edu\chinna\kadhira\Util.java

>start Notepad++ src\main\java\module-info.java
