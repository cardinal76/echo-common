Below are listed the commands in order to generate entities with echo-hibernate plugin.
You can generate entities for any platform module (tm=telemedicine, rd=radiology) by launching two main maven task configured for postgresql (postgresql-generate-rmdw, postgresql-generate-tmdw).

a) Generate RD entities for postgresql:

	mvn exec:exec@postgresql-generate-rmdw

	Executes the following subcommands:
		mvn antrun:run@pg-rmdw-hbm2java
		mvn resources:copy-resources@copy-temp-pg-resources
		mvn com.google.code.maven-replacer-plugin:replacer:replace@pg-replacer
		mvn resources:copy-resources@inject-pg-resources
		
b) Generate TM entities for postgresql:

	mvn exec:exec@postgresql-generate-tmdw

	Previous task executes the following subcommands:
		mvn antrun:run@pg-tmdw-hbm2java
		mvn resources:copy-resources@copy-temp-pg-resources
		mvn com.google.code.maven-replacer-plugin:replacer:replace@pg-replacer
		mvn resources:copy-resources@inject-pg-resources