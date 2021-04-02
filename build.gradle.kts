plugins {
  id ("java-library")
}

java {
  modularity.inferModulePath.set(true)
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
//  toolchain.languageVersion.set(JavaLanguageVersion.of(11))
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
