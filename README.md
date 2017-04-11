Commands for entity generation:

a) Generate RD entities for postgresql:

	mvn exec:exec@postgresql-generate-rmdw

	Executes the following subcommands:
		mvn antrun:run@pg-rmdw-hbm2java
		mvn resources:copy-resources@copy-temp-pg-resources
		mvn com.google.code.maven-replacer-plugin:replacer:replace@pg-replacer
		mvn resources:copy-resources@inject-pg-resources
		
b) Generate TM entities for postgresql:

	mvn exec:exec@postgresql-generate-tmdw

	Executes the following subcommands:
		mvn antrun:run@pg-tmdw-hbm2java
		mvn resources:copy-resources@copy-temp-pg-resources
		mvn com.google.code.maven-replacer-plugin:replacer:replace@pg-replacer
		mvn resources:copy-resources@inject-pg-resources