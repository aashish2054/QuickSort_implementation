import org.scalatest.flatspec.AnyFlatSpec

  class SortingTest extends AnyFlatSpec {
    val quickSort = new Sorting

    "quickSort" should "show correct result" in {
      val result = quickSort.sort(List(5,12,88,44,77))
      assertResult(List(5,12,44,77,88))(result)
    }

     it should "return empty list" in {
      val result = quickSort.sort(List())
      assertResult(List())(result)
    }
  }
