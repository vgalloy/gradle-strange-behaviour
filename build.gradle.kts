plugins {
  id ("java-library")
}

dependencies {
  api("eu.europa.ec.joinup.sd-dss:dss-pades:5.7")
}

repositories {
  mavenCentral()
  maven {
    url = uri("https://ec.europa.eu/cefdigital/artifact/content/repositories/esignaturedss/")
  }
}

// ################# OPTION 1:  Failure
//
// Main.java:8: error: cannot access CAdESSignatureParameters
//    new PAdESSignatureParameters().setSignatureFieldId("sample");
//                                  ^
//  class file for eu.europa.esig.dss.cades.CAdESSignatureParameters not found
java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}


// ################# OPTION 2:  Build success
//
//java {
//  toolchain.languageVersion.set(JavaLanguageVersion.of(11))
//}


// ################# OPTION 3:  Build success with JDK 11 [11 (Oracle Corporation 11+28)] but fail with JDK 16 [16.0.1 (Oracle Corporation 16.0.1+9-24)]
//
// tasks.compileJava {
//   options.release.set(11)
// }
