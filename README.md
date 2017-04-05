Commands for entity generation:

Generate RD entities for postgresql:

mvn exec:exec@postgresql-generate

Executes the following subcommands:
	mvn antrun:run@pg-rmdw-hbm2java
	mvn resources:copy-resources@copy-temp-pg-resources
	mvn com.google.code.maven-replacer-plugin:replacer:replace@pg-replacer
	mvn resources:copy-resources@inject-pg-resources