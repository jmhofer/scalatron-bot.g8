A [Giter8][g8] template for [Scalatron] Bots. [![Build Status](https://travis-ci.org/jmhofer/scalatron-bot.g8.svg?branch=master)](https://travis-ci.org/jmhofer/scalatron-bot.g8)

Prerequisites
-------------

- have a current version of [sbt] installed (>= 0.13.13 recommended)
- have [Scalatron] installed (use `sbt dist` to create a distribution)

Usage
-----

- initialize via `sbt new jmhofer/scalatron-bot.g8` (this only works for sbt >= 0.13.13, otherwise please see the [Giter8][g8] docs) - 
  set `scalatronDirectory` to the path to your Scalatron distribution
- go into the `sbt` console
- test your bot using [Specs2] and `test`
- assemble your bot using `assembly` - you will find it ready for upload 
  in the `target` directory, named `ScalatronBot.jar`
- run your bot using `play` (you don't need to explicitly test or package it for this)

Template license
----------------
Written in 2016 by Joachim Hofer (jmhofer.github@johoop.de)

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[sbt]: http://www.scala-sbt.org/
[g8]: http://www.foundweekends.org/giter8/
[Scalatron]: https://github.com/jcranky/scalatron
[Specs2]: http://etorreborre.github.io/specs2/
