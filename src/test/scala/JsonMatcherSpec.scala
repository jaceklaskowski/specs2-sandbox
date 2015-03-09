import org.specs2._
import specification.Grouped

class JsonMatcherSpec extends Specification with Grouped { def is = s2"""

  This is a specification for JsonMatcher

  The JsonMatcher should
    handle empty JSON inputs         ${g1.e1}
                                                      """
}