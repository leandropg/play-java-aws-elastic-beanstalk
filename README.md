## Play Java AWS Elastic Beanstalk

This is an **Play Java Framework Example** that generate a Docker Image to deploy in AWS Elastic Beanstalk

**Steps**

1. Clone the repository from [here](https://github.com/leandropg/play-java-aws-elastic-beanstalk)

2. Execute **SBT**e in a Linux Console with the command ``sbt``

3. Into SBT Console execute the next task in order:

    1. ``clean``
    2. ``compile``
    3. ``docker:stage``
    4. ``exit``

4. Copy **Dockerfile** file into the directory ``target/docker/stage``

5. Generate the Docker Image with the command ``docker build -t deploy-aws-image``

6. Verify that the Docker Image was generated with the command ``docker images | grep deploy-aws-image``

7. Run the Docker Image with the command ``docker run -p 9000:9000 deploy-aws-image``

8. Create a ZIP file from the directory ``target/docker/stage`` with the command ``zip -r ../deploy-aws-image.zip .``