class Sorting {
  //Method for implementing Quick sort
  def Sorting(inputList: List[Int]): List[Int] = {
    if(inputList.length <= 1) inputList
    else {

      //it will calculate the pivot element
      val pivot = inputList(inputList.length / 2)

      List.concat( //the input is divided about the pivot element into two sub-lists and then merged together:

        //containing elements that are less than the pivot
        Sorting(inputList filter (pivot >)),

        // contains elements equal to pivot.
        inputList filter (pivot ==),

        Sorting(inputList filter (pivot <)))
    }
  }

}
