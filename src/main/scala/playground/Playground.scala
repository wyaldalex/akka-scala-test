package org.tudux.scala
package playground

import akka.actor.ActorSystem

object Playground extends  App {

  val actorSystem = ActorSystem("HelloAkka47")
  println(actorSystem.name)

}
