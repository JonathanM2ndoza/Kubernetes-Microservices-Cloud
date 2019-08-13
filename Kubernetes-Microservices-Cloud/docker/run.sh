#!/usr/bin/env bash

TAG=1.0
REGISTRY=us.icr.io/docker_lab1

docker run -p 8071:8071 $REGISTRY/springboot-microservice-cloud:$TAG
