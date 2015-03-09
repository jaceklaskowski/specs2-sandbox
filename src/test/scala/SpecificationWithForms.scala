import org.specs2._
import form.Form

class SpecificationWithForms extends Specification with specification.Forms { def is = s2"""

  The address must be retrieved from the database with the proper street and number
    ${Form("Address").
        tr(prop("street", actualStreet(123), "Oxford St")).
        tr(prop("number", actualNumber(123), 20))}
  """

  def actualStreet(no: Int) = "Oxford St"
  def actualNumber(no: Int) = 20
}