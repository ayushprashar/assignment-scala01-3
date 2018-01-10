class Operations {

  def doubleMembers(domain: List[Int]): List[Int] = {
    domain.map(x=>2*x )
  }

  def printFibonacci(inpNumber: Int): Unit = {
    if (inpNumber >= 0) {
      print(s"${tailFibonacci(inpNumber, 1, 0)} ")
      printFibonacci(inpNumber - 1)
    }
  }
  def tailFibonacci(inpNumber: Int,fibPrev: Int,fibPrevPrev: Int): Int ={
    inpNumber match{
      case 0 => fibPrevPrev
      case 1 => fibPrev
      case _ => tailFibonacci(inpNumber-1,fibPrev+fibPrevPrev,fibPrev)
    }
  }


 def kthElement(domain: List[Int],index: Int): Int = {

   val temp =domain.zipWithIndex.map{
      case (item,index2) if index2 == index => item
      case _ => -1
    }
  }


  def lengthOfList(domain: List[Int]): Int = {
    def lengthCalculator(brokenList: List[Int], sequenceCounter:Int ): Int ={
      brokenList match {
        case head::tail => lengthCalculator(tail,sequenceCounter+1)
        case heal::null => sequenceCounter+1

      }

    }
    lengthCalculator(domain,0)
  }


  def areaCalculator(typeOfShape: String,length: Int,breadth: Int,f:(String,Int,Int)=>Int) ={
    f(typeOfShape,length,breadth)
  }


  def printArea(shape: String,dim1:Int,dim2:Int): Int ={
    shape.toUpperCase match {
      case "RECTANGLE" => areaCalculator("RECTANGLE ",dim1,dim2,(s,a,b)=>(a*b))
      case "RHOMBUS" => areaCalculator("RHOMBUS",dim1,dim2,(s,a,b)=>(a*b))
      case "PARALLELOGRAM" => areaCalculator("PARALELLOGRAM",dim1,dim2,(s,a,b)=>(a*b))
      case _ => -1
    }

  }



  def reverseList(domain: List[Int]):List[Int]={
    def breakAndAdd(inputList: List[Int],resultantList: List[Int]):List[Int]={
      inputList match {
        case head::tail => breakAndAdd(tail,head::resultantList)
        case head::null => head::resultantList
      }
    }
    breakAndAdd(domain,List())
  }
}
