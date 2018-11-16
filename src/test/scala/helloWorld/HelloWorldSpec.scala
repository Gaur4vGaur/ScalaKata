package helloWorld

import org.scalatest.{Matchers, WordSpec}

class HelloWorldSpec extends WordSpec with Matchers {

  "Hello World" should {
    "pass" when {
      "called" in {
        "Hello World" shouldBe "Hello World"
      }
	}
  }

}
