The lib file has been added to the git ignore to avoid uploading spring to github
How to recreate the lib file
1. Go to https://repo.spring.io/
1.  Click on artifacts
1.  Then libs-release>org>springframework>spring>5.3.9>
1.  Click 5.3.9-dist.zip and URL to file
1.  Copy the lib file from spring-5.3.9-dist to the repo lib file
1. Add to build path
	1. right click project and click properties
	2.select javabuild path and then libaries
	3. click classpath and add jars
	4.select all files in lib folder