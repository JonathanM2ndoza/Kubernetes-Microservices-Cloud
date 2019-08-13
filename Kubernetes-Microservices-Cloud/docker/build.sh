#!/usr/bin/env bash

TAG=1.0
REGISTRY=us.icr.io/docker_lab1

docker build -t $REGISTRY/springboot-microservice-cloud:$TAG .