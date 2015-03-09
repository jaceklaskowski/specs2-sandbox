import org.specs2._
import org.specs2.execute.DecoratedResult
import org.specs2.matcher.DataTable

class DataTableSpec extends Specification with matcher.DataTables { def is = s2"""

    adding integers should just work in scala  $e1
    Up to 10 columns                           $e2
  """

  def e1 =
    "a" | "b" | "c" |         // the header of the table, with `|` separated strings
     2  !  2  !  4  |         // an example row
     1  !  1  !  2  |> {      // the > operator to "execute" the table
    (a, b, c) => a + b === c  // the expectation to check on each row
  }

  def t2 =
    "a" | "b" | "c" |
     1  !  1  !  2

  def p2(a: Int, b: Int, c: Int) = ok

  def e2 = t2 |> p2
}
