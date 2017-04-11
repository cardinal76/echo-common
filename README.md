#### BASE PROJECT DESCRIPTION ####

With this project you can automatically update platform module entities by launching a simple maven command.<br/>
Entities are generated automatically by using:

a) hibernate configuration file (one per module) placed in the src/main/resources/hibernate-configuration/[target-rdbms-folder]
b) hibernate reverse engineering strategy (one per module) placed in the src/main/resources/reveng/[target-rdbms-folder]

In order to run this plugin you must have the following requisites:
- Oracle Java Development Kit 8
- Apache Maven 3.3.x or later
- echo platform source code downloadable from gitlab <a href="http://dev.neclab.it:8181/a.matteo/echo">here</a>
- echo-hibernate must be checked out and placed in the same IDE workspace as echo platform 

In order to add a new entity to generate you must edit

#### USAGE ####
Below are listed the commands in order to generate entities with echo-hibernate plugin.<br>

You can generate entities for any platform module (tm=telemedicine, rd=radiology) by launching one of the two main maven task configured for postgresql RDBMS (postgresql-generate-rmdw, postgresql-generate-tmdw). Entities are generated in the same project and copied to the right module folder if projects are in the same IDE workspace.

a) Generate radiology entities for postgresql (rd-api):

	mvn exec:exec@postgresql-generate-rmdw

	Executes the following subcommands:
		mvn antrun:run@pg-rmdw-hbm2java
		mvn resources:copy-resources@copy-temp-pg-resources
		mvn com.google.code.maven-replacer-plugin:replacer:replace@pg-replacer
		mvn resources:copy-resources@inject-pg-resources
		
b) Generate telemedicine entities for postgresql (tm-api):

	mvn exec:exec@postgresql-generate-tmdw

	Previous task executes the following subcommands:
		mvn antrun:run@pg-tmdw-hbm2java
		mvn resources:copy-resources@copy-temp-pg-resources
		mvn com.google.code.maven-replacer-plugin:replacer:replace@pg-replacer
		mvn resources:copy-resources@inject-pg-resources