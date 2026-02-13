-injars target/arrays-project-1.0-SNAPSHOT.jar
-outjars target/arrays-project-obf.jar

-libraryjars "C:/Program Files/Java/jdk-11.0.30/jmods/java.base.jmod"

-keep public class com.tarea1.App {
    public static void main(java.lang.String[]);
}

-keepattributes Main-Class,Signature,*Annotation*

-printmapping docs/mapping.txt

-ignorewarnings
-dontwarn
-dontoptimize
-dontpreverify

