package react.leaflet.lmap

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport


@JSImport("react-leaflet", "MapComponent")
@js.native
class MapComponentR[Props <: js.Any](
  val props: Props,
  val context: Context
)
  extends js.Object
{

  type Element_t <: js.Object

  var leafletElement: Element_t = js.native

  def componentWillMount(): Unit = js.native

}


@js.native
trait Context extends js.Object {
}
