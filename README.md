 _______   ________  ___  ___  ________                 ___  ___  ___  ________  _______   ________  ________   ________  _________  _______      
|\  ___ \ |\   ____\|\  \|\  \|\   __  \               |\  \|\  \|\  \|\   __  \|\  ___ \ |\   __  \|\   ___  \|\   __  \|\___   ___\\  ___ \     
\ \   __/|\ \  \___|\ \  \\\  \ \  \|\  \  ____________\ \  \\\  \ \  \ \  \|\ /\ \   __/|\ \  \|\  \ \  \\ \  \ \  \|\  \|___ \  \_\ \   __/|    
 \ \  \_|/_\ \  \    \ \   __  \ \  \\\  \|\____________\ \   __  \ \  \ \   __  \ \  \_|/_\ \   _  _\ \  \\ \  \ \   __  \   \ \  \ \ \  \_|/__  
  \ \  \_|\ \ \  \____\ \  \ \  \ \  \\\  \|____________|\ \  \ \  \ \  \ \  \|\  \ \  \_|\ \ \  \\  \\ \  \\ \  \ \  \ \  \   \ \  \ \ \  \_|\ \ 
   \ \_______\ \_______\ \__\ \__\ \_______\              \ \__\ \__\ \__\ \_______\ \_______\ \__\\ _\\ \__\\ \__\ \__\ \__\   \ \__\ \ \_______\
    \|_______|\|_______|\|__|\|__|\|_______|               \|__|\|__|\|__|\|_______|\|_______|\|__|\|__|\|__| \|__|\|__|\|__|    \|__|  \|_______|
    
#### BASE PROJECT DESCRIPTION ####


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