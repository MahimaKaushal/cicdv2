FROM openjdk:8
EXPOSE 8087
ADD target/docker-auto-build-image-through-git.jar docker-auto-build-image-through-git.jar
ENTRYPOINT ["java","-jar","docker-auto-build-image-through-git.jar"]