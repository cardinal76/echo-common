#### PROJECT DESCRIPTION AND CONFIGURATION ####

With this project you can automatically update platform modules entities by launching a simple maven command.<br/>
Entities are named, generated and annotated automatically. In addition to that, generated classes are copied in the right project package module. 

Classes are generated automatically using these configuration items:<br/>

a) Hibernate configuration file (one per module) placed in the src/main/resources/hibernate-configuration/[target-rdbms-folder]<br/>
b) Hibernate standard reverse engineering strategy XML (one per module) placed in the src/main/resources/reveng/[target-rdbms-folder]<br/>
c) Hibernate custom reverse engineering strategy (one per module) placed in the src/main/java/it/clevercom/echo/hibernate/[module]/reveng/strategy<br/>

In order to run this plugin you must have the following pre-requisites:<br/>
- Oracle Java Development Kit 8<br/>
- Apache Maven 3.3.x or later<br/>
- Echo platform source code (you can get it <a href="https://github.com/cardinal76/echo">here</a>)<br/>
- Echo-hibernate 

Note: this plugin must be checked out from gitlab and placed in the same IDE workspace folder as echo platform<br/>

In order to add a new database table in the automatic generation task, you must edit the following file:<br/>
- src/main/resources/reveng/[target-rdbms-folder]/[module].hibernate.reveng.xml<br/>

And add the new table name like this:<br/>

	<table-filter match-schema="[db_schema]" match-name="[new_table_name]" />

And add this standard portion of XML related to the sequence generator:<br/>

	<table name="[new_table_name]">
		<primary-key>
			<generator class="org.hibernate.id.enhanced.SequenceStyleGenerator">
				<param name="optimizer">none</param>
            	<param name="increment_size">1</param>
            	<param name="sequence_name">[new_sequence_name]</param>
			</generator>
			<key-column name="[field_name_linked_to_the_sequence]"/>
		</primary-key>
	</table>

#### COMMAND USAGE ####

You can generate entities for any platform module (tm=telemedicine, rd=radiology) by launching one of the two main maven task configured for postgresql RDBMS (postgresql-generate-rmdw, postgresql-generate-tmdw).<br/> Entities are generated in the same project and copied to the right module folder if projects are in the same IDE workspace.<br/>

Below are listed the commands that you can use from shell in order to generate entities with echo-hibernate plugin.<br/>

a) Radiology entities generation for postgresql (rd-api):<br/>

	mvn exec:exec@postgresql-generate-rmdw

	Previous task executes the following subcommands:
		mvn antrun:run@pg-rmdw-hbm2java
		mvn resources:copy-resources@copy-temp-rmdw-pg-resources
		mvn com.google.code.maven-replacer-plugin:replacer:replace@pg-rmdw-replacer
		mvn resources:copy-resources@inject-pg-rmdw-resources
		
b) Telemedicine entities generation for postgresql (tm-api):<br/>

	mvn exec:exec@postgresql-generate-tmdw

	Previous task executes the following subcommands:
		mvn antrun:run@pg-tmdw-hbm2java
		mvn resources:copy-resources@copy-temp-tmdw-pg-resources
		mvn com.google.code.maven-replacer-plugin:replacer:replace@pg-tmdw-replacer
		mvn resources:copy-resources@inject-pg-tmdw-resources