package chap03

import scala.actors.Actor

abstract class AuctionMessage {

}

case class Offer(bid: Int, client: Actor) extends AuctionMessage
case class Inquire(client: Actor) extends AuctionMessage
