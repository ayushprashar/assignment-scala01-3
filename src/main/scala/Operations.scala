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


 def kth(domain: List[Int],index: Int): Unit = {

   val temp =domain.zipWithIndex.map{
      case (item,index2) if(index2 == index)=> print(item)
      case _ =>
    }
  }
  def lengthOfList(domain: List[Int]): Int = {
    domain.lastIndexOf(domain.last) + 1
  }

  def areaCalculator(typeOfShape: String,length: Int,breadth: Int,f:(String,Int,Int)=>Int) ={
    f(typeOfShape,length,breadth)
  }


  def printArea(shape: String,len:Int,br:Int): Int ={
    shape.toUpperCase match {
      case "SQUARE" => areaCalculator("SQUARE",len,br,(s,a,b)=>(a*b))
      case "RHOMBUS" => areaCalculator("RHOMBUS")
    }
  }



 /* def addToList(num: Int,Templist: List[Int]): List[Int] ={
    num::Templist
  }

  def reverseList(domain: List[Int]):List[Int]={
    for(counter <- 0 to domain.length-1) yield
  }*/
  /*def addTwoLists(list1: List[Int],list2: List[Int]): List[Int] ={
    if(list1.length == list2.length){
      val a:List[Int] = list1.zip(list2)
    }
  }*/
}
