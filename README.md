temporary command

RD for postgresql:

mvn antrun:run@pg-rmdw-hbm2java
mvn resources:copy-resources@copy-temp-pg-resources
mvn com.google.code.maven-replacer-plugin:replacer:replace@pg-replacer
mvn resources:copy-resources@inject-pg-resources