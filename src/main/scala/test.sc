def areaCalculator(typeOfShape: String,length: Int,breadth: Int,f:(String,Int,Int)=>Int) ={
  f(typeOfShape,length,breadth)
}

def printArea(shape: String,len:Int,br:Int): Int ={
  shape.toUpperCase match {
    case "SQUARE" => areaCalculator("SQUARE",len,br,(s,a,b)=>(a*b))
  }
}
printArea("Square",10,10)