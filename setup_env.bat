set PATH=%PATH%;~\apache-maven-3.5.2\bin\
set JAVA_HOME="C:\Program Files\Java\jdk1.8.0_151"

alias mvn_in='mvn clean install'
alias mvn_server='mvn wildfly:run'

"C:\Program Files\Git\bin\bash.exe"


set MAVEN_OPTS=-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=5005,server=y,suspend=n

set MAVEN_OPTS=-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=4000,server=y,suspend=n

