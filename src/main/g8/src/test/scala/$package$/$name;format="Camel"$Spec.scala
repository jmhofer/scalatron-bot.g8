package $package$

import org.specs2.Specification

class $name;format="Camel"$Spec extends Specification { def is = "My Scalatron Bot".title ^ s2"""
  This is my Scalatron Bot.

  It must return a status message. \$e1

  """.stripMargin

  def e1 = {
    val bot = new $name;format="Camel"$
    bot.step("meep") must beMatching("""Status\(text=.*\)""")
  }
}
