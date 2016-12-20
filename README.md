A [Giter8][g8] template for [Scalatron] Bots.

Prerequisites
-------------

- have a current version [sbt] installed (>= 0.13.13 recommended)

Usage
-----

- initialize via `sbt new jmhofer/scalatron-bot.g8`
- put the JARs from the Scalatron distribution (bin directory) into a directory called `lib`
- create a directory for your bots (defaults to `bots`), and maybe copy some other bots into there
- go into the `sbt` console
- test your bot using [Specs2] and `test`
- run your bot using `play`

Template license
----------------
Written in 2017 by Joachim Hofer (jmhofer.github@johoop.de)

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[sbt]: http://www.scala-sbt.org/
[g8]: http://www.foundweekends.org/giter8/
[Scalatron]: https://github.com/jcranky/scalatron
[Specs2]: http://etorreborre.github.io/specs2/
