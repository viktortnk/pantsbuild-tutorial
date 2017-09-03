package com.example.app1

import com.example.greeter.Greeter
import spark.Spark

object Main extends App {

  Spark.port(8080)
  Spark.get("/hello", (req, res) => {
    val name = Option(req.queryParams("name")).getOrElse("World")
    Greeter.greet(name)
  })
}
