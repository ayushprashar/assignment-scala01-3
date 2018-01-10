def lengthOfList(domain: List[Int]): Int = {
  def lengthCalculator(brokenList: List[Int], sequenceCounter:Int ): Int ={
    brokenList match {
      case head::tail => lengthCalculator(tail,sequenceCounter+1)
      case heal::null => sequenceCounter+1

    }

  }
  lengthCalculator(domain,0)
}
lengthOfList(List(1,2,3,4))