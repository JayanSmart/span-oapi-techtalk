/*
 * SPAN Tenure
 *
 * This is a simple API which is used to as a demo for using OpenAPI to define specifications.
 *
 * API version: 0.0.1
 * Contact: jayan.smart@spandigital.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package main

import (
	"log"
	"net/http"

	// WARNING!
	// Change this to a fully-qualified import path
	// once you place this file into your project.
	// For example,
	//
	//    sw "github.com/myname/myrepo/go"
	//
	sw "https://github.com/JayanSmart/span-oapi-techtalk/server/go/go"
)

func main() {
	log.Printf("Server started")

	router := sw.NewRouter()

	log.Fatal(http.ListenAndServe(":8080", router))
}
