package scalatron.botwar.botPlugin

import $package$.$name;format="Camel"$

class ControlFunctionFactory {
  def create: String => String = {
    val bot = new $name;format="Camel"$
    bot.step _
  }
}
