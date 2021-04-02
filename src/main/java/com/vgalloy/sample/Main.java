package com.vgalloy.sample;

import eu.europa.esig.dss.pades.PAdESSignatureParameters;

public class Main {

  public static void main(String[] args) {
    new PAdESSignatureParameters().setSignatureFieldId("sample");
  }
}
