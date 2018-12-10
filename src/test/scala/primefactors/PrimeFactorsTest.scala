package primefactors

import org.scalatest.{Matchers, WordSpec}

class PrimeFactorsTest extends WordSpec with Matchers {

  "PrimeFactors" should {
    "return all factors" when {
      "called with 2" in {
        PrimeFactors.primeFactors(2) shouldBe Seq(2)
      }

      "called with 3" in {
        PrimeFactors.primeFactors(3) shouldBe Seq(3)
      }

      "called with 4" in {
        PrimeFactors.primeFactors(4) shouldBe Seq(2, 2)
      }

      "called with 5" in {
        PrimeFactors.primeFactors(5) shouldBe Seq(5)
      }

      "called with 6" in {
        PrimeFactors.primeFactors(6) should contain allElementsOf Seq(2, 3)
      }

      "called with 7" in {
        PrimeFactors.primeFactors(7) shouldBe Seq(7)
      }

      "called with 8" in {
        PrimeFactors.primeFactors(8) shouldBe Seq(2, 2, 2)
      }

      "called with 9" in {
        PrimeFactors.primeFactors(9) shouldBe Seq(3, 3)
      }
    }
  }
}
