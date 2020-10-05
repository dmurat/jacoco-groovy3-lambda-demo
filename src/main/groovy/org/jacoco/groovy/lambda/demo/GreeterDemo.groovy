package org.jacoco.groovy.lambda.demo

import groovy.transform.CompileStatic

@CompileStatic
class GreeterDemo {
  String greetPlain() {
    Greeter greeter = new Greeter()
    String greet = greeter.greet("John")
    return greet
  }

  String greetFromLambda() {
    Greeter greeter = new Greeter()

    String greet = greeter.greet("John", () -> {
      String greetPrefix = "Hi from Lambda, "
      return greetPrefix
    })

//    String greet = greeter.greet("John", {
//      String greetPrefix = "Hi from Lambda, "
//      return greetPrefix
//    })

    return greet
  }

  String greetFromClosure() {
    Greeter greeter = new Greeter()

    String greet = greeter.greet("John", {
      String greetPrefix = "Hi from Closure, "
      return greetPrefix
    })

    return greet
  }
}
