cd /Users/aswin/Documents/GitHub/TestSel/TestRepoJenkins/chrome
ls
docker ps
docker kill $(docker ps -q)
docker build . -t selenium-chrome
docker run -p 4444:4444 selenium-chrome
cd ../com.coda.terminal
docker build -t "selenium-script-java" .
pwd
ls
docker run selenium-script-java

