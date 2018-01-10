def kth(domain: List[Int],index: Int): Unit = {

  val temp =domain.zipWithIndex.map{
    case (item,index2) if(index2 == index)=> print(item)
    case _ =>
  }
}
kth(List(1,2,3,4,5,6),4)

def addToList(num: Int,Templist: List[Int]): List[Int] ={
  num::Templist
}
var r = addToList(93,List(1,2,3,4,5,6))
addToList(87,r)