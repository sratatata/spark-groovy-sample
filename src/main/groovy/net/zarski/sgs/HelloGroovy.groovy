package net.zarski.sgs

import net.zarski.sgs.HelloWorld
import spark.Request
import spark.Response
import spark.Route;

@Grab('com.sparkjava:spark-core:2.0.0')

import static spark.Spark.*;

get('/hellogroovy'){ req, res ->
    println 'Hell-o Groovy'
    return "Hello Groovy & "+HelloWorld.test()
};
