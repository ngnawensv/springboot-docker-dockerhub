# springboot-docker-dockerhub
Simple spring boot app to build a docker image and push it to docker hub  

## How to push a docker image on docker git hub  
a)	Create your spring boot app  
b)	Dockerize your application (Adding Dockerfile and docker-compose files)  
c)	Build your docker image and run your docker-compose file  
docker build -t springboot-docker-dockerhub:latest .   
docker images  
docker-compose up  
  
d)	Format docker image and keep it ready to push to docker hub  
docker tag springboot-docker-dockerhub  ngnawen/springboot-docker-dockerhub:v1.0   
docker images  
e)	Log in to your docker hub  
docker login (enter your username: ngnawens@gmail.com and password:bel****sainte)  
f)	Push to docker hub  
docker push  ngnawen/springboot-docker-dockerhub:v1.0  
g)	Test your image(remove image if exist, pull a new from docker hub and run it)  
docker rmi ngnawen/springboot-docker-dockerhub   
docker pull ngnawen/springboot-docker-dockerhub:v1.0   
docker run -p 8080:8080 ngnawen/springboot-docker-dockerhub:v1.0  
Note: Kitematic is a simple application for managing Docker containers on Mac, Linux and Windows (https://github.com/docker/kitematic)  
