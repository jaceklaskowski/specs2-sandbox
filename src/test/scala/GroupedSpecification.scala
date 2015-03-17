import org.specs2._
import specification.Grouped

class GroupedSpecification extends Specification with Grouped { def is =  s2"""

  first example in first group    ${g1.e1}
  first example in second group   ${g2.e1}
  first example in third group    ${g3.e1}
  """

  new g3 {
    e1 := success
  }
}
