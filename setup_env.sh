export PATH=$PATH:~/apache-maven-3.5.2/bin/
export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)

alias mvn_in='mvn clean install'
alias mvn_server='mvn wildfly:run'


export MAVEN_OPTS="-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=5005,server=y,suspend=n"



