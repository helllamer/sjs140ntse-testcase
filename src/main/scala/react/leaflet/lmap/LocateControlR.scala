package react.leaflet.lmap

import japgolly.scalajs.react.{JsComponent, Children}

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js


object LocateControlR {

  def jsConstructor = js.constructorOf[LocateControlC]

  val component = JsComponent[LocateControlPropsR, Children.None, Null]( jsConstructor )

  def apply(props: LocateControlPropsR = new LocateControlPropsR{} ) = component( props )

}


sealed class LocateControlC(_props: LocateControlOptions, _ctx: Context)
  extends MapComponentR[LocateControlOptions](_props, _ctx)
{

  override type Element_t = LocateControl

  override def componentWillMount(): Unit = {
    leafletElement = new LocateControl(props)
  }

}


@JSImport("leaflet.locatecontrol", JSImport.Namespace)
@js.native
class LocateControl(options: LocateControlOptions) extends js.Object {

  def start(): LocateControl = js.native

  def _stopFollowing(): Unit = js.native

}



trait LocateControlOptions extends js.Object {
}

trait LocateControlPropsR extends LocateControlOptions {
}

