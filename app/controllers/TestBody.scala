package controllers

import play.api.libs.json.Json

case class TestBody(bodystr: String) {
  println(bodystr)
}
object TestBody {
  implicit val fmt = Json.format[TestBody]
}
