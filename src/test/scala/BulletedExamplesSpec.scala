import org.specs2._
import specification._

class BulletedExamplesSpec extends Example { def is = """
  This is an introduction

  First section
  =============

  A bit more text there.
   + and the first example
   + and the second example
"""
}

trait Example extends script.Specification with Groups {
  "first section" - new group {
    eg := failure
  }
}