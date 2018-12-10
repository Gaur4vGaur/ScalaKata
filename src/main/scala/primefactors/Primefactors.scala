package primefactors

import scala.annotation.tailrec

object PrimeFactors {
  def primeFactors(n: Int): Seq[Int] = {

    @tailrec
    def innerPrimeFactor(n: Int, factors: Seq[Int]): Seq[Int] = {

      val maxFactor = n/2

      (2 to maxFactor).find(n%_ == 0) match {
        case Some(factor) => innerPrimeFactor(n/factor, factor +: factors)
        case None => n +: factors
      }
    }

    innerPrimeFactor(n, Seq.empty[Int])
  }
}
