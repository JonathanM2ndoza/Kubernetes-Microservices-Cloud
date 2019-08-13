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

IBM Cloud - Registry

![Screenshot](prtsc/ibm-cloud-kubernetes-01.png)

6. $ ibmcloud cs clusters

![Screenshot](prtsc/ibm-cloud-kubernetes-02.png)

7. $ ibmcloud cs workers cluster-jm

![Screenshot](prtsc/ibm-cloud-kubernetes-03.png)

8. $ ibmcloud cs cluster-config cluster-jm

![Screenshot](prtsc/ibm-cloud-kubernetes-04.png)

9. $ kubectl apply

![Screenshot](prtsc/ibm-cloud-kubernetes-05.png)

10. $ kubectl get pods

![Screenshot](prtsc/ibm-cloud-kubernetes-06.png)

11. $ kubectl get all

![Screenshot](prtsc/ibm-cloud-kubernetes-07.png)

IBM Cloud - Kubernetes Dashborad

![Screenshot](prtsc/ibm-cloud-kubernetes-08.png)


IBM Cloud - Kubernetes Clusters

![Screenshot](prtsc/ibm-cloud-kubernetes-09.png)


Postman - Create Customer

![Screenshot](prtsc/postman-create-customer.png)


Postman - Get Customer 

![Screenshot](prtsc/postman-get-customer.png)










