JAVA_HOME=/opt/java/jdk1.8.0/
rm dist/* -rvf
$JAVA_HOME/bin/javac App.java
$JAVA_HOME/bin/jar cfm dist/telefonia-brasil.jar MANIFEST.MF App.class app.css app.fxml images/
