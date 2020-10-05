package org.jacoco.groovy.lambda.demo

import groovy.transform.CompileStatic

import java.util.function.Supplier

@CompileStatic
class Greeter {
  static final String GREET_DEFAULT = "Hello, "

  String greet(String name) {
    return "${GREET_DEFAULT}$name"
  }

  String greet(String name, Supplier<String> greetSupplier) {
    return "${greetSupplier.get()}$name"
  }
}
