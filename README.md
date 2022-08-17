# Springboot-k8s-example

In this project we will deploy a sample spring boot application to kubernetes cluster and see how we can use skaffold in our local envioment 


# K8S Files
- Deployment file.
- Service file.
- Ingress file.

## Steps to deploy:

1. mvn package
2. docker build -t springboot-k8s-example .
3. kubectl apply -f k8s/deployment.yml
4. kubectl apply -f k8s/service.yml
