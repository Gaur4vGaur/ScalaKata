package primefactors

import org.scalatest.{Matchers, WordSpec}

class PrimeFactorsTest extends WordSpec with Matchers {

  "PrimeFactors" should {
    "return" when {
      "called with 2" in {
        PrimeFactors.primeFactors(2) shouldBe Seq(2)
      }

      "called with 3" in {
        PrimeFactors.primeFactors(3) shouldBe Seq(3)
      }

      "called with 4" in {
        PrimeFactors.primeFactors(4) shouldBe Seq(2, 2)
      }
    }
  }
}
