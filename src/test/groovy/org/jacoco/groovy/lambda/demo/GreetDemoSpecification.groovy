package org.jacoco.groovy.lambda.demo


import spock.lang.Specification

class GreetDemoSpecification extends Specification {
  void "should work with plain greeter"() {
    given:
    String greet = new GreeterDemo().greetPlain()

    expect:
    greet == "Hello, John"
  }

  void "should work with lambda greeter"() {
    given:
    String greet = new GreeterDemo().greetFromLambda()

    expect:
    greet == "Hi from Lambda, John"
  }

  void "should work with closure greeter"() {
    given:
    String greet = new GreeterDemo().greetFromClosure()

    expect:
    greet == "Hi from Closure, John"
  }
}
