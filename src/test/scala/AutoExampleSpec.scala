import org.specs2._

class AutoExampleSpec extends Specification { def is = s2"""

    The `capitalize` method verifies
      ${ "hello".capitalize       === "Hello" }
      ${ success }
  """

}
