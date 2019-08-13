# Example Kubernetes - Springboot Microservices Cloud

IBM Cloud is used for this example

# IBM Cloud CLI command

Previously created imagem docker
![Screenshot](prtsc/docker-images.png)


1. $ ibmcloud login
2. $ ibmcloud plugin list
3. $ ibmcloud cr login
4. $ ibmcloud cr namespace-add docker_lab1
5. $ docker push us.icr.io/docker_lab1/springboot-microservice-cloud:1.0

![Screenshot](prtsc/docker-push.png)

6. $ ibmcloud cs clusters


7. $ ibmcloud cs workers cluster-jm


8. $ ibmcloud cs cluster-config cluster-jm




