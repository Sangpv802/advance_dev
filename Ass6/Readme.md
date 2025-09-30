javac -cp "lib/mysql-connector-j-8.0.xx.jar;src" -d out src/db/*.java src/model/*.java src/dao/*.java src/ui/*.java src/App.java

java -cp "out;lib/mysql-connector-j-8.0.xx.jar" App      