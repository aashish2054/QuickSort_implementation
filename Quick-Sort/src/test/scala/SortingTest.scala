import org.scalatest.flatspec.AnyFlatSpec

  class SortingTest extends AnyFlatSpec {
    val sorting_operation = new Sorting
    val item1 = 5
    val item2 = 108
    val item3 = 45
    val item4 = 30
    "Bubble_sort" should "successfully sort all the items" in {
      val sortResult = Array(item1,item4,item3,item2)
      val sortingInput = sorting_operation.bubble_sorting(Array(item1,item2,item3,item4))
      assert(sortingInput===sortResult)
    }
  }
