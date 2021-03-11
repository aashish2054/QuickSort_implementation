import scala.language.postfixOps
class Sorting {

  def sort(inputList: List[Int]): List[Int] = {
    if(inputList.length <= 1) {
      inputList
    }
    else {

      //it will calculate the pivot element
      val pivot = inputList(inputList.length / 2)

      List.concat(

        //containing elements that are less than the pivot
        sort(inputList filter (pivot >)),

        // contains elements equal to pivot.
        inputList filter (pivot ==),

        sort(inputList filter (pivot <)))
    }
  }

}
