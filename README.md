## Play Java AWS Elastic Beanstalk

This is an **Play Java Framework Example** that generate a **Docker Image** to deploy in AWS Elastic Beanstalk

#### MySQL Database Instance

1. Create a new database. For example **awsdemo**

2. Create a root user and password for this database

3. Run the script **1.sql** located in ``conf/evolutions/default``

#### Environment Variables

1. Modify the file **/etc/profile** and create the next **Environment Variables** replacing all brackets for your personal values:

```
    export DB_DEFAULT_URL=[URL Database]:[Port Database]/[Database Name]
    export DB_DEFAULT_USERNAME=[Your Root Username]
    export DB_DEFAULT_PASSWORD=[Your Root Password]
    export APPLICATION_SECRET=[Your Application Secret]
```

For the application secret use a Random String.

2. Restart the computer before the next section

#### Docker Image

1. Clone this repository ``git clone https://github.com/leandropg/play-java-aws-elastic-beanstalk``

2. Enter to directory **play-java-aws-elastic-beanstalk** ``cd play-java-aws-elastic-beanstalk``

3. Execute **SBT** with the command ``sbt``

4. Into **SBT Shell** execute the next task in order:

    1. ``clean``
    2. ``compile``
    3. ``docker:stage``
    4. ``exit``

5. Copy **Dockerfile** file into the directory **target/docker/stage** ``cp Dockerfile target/docker/stage``

6. Enter to directory **target/docker/stage** ``cd target/docker/stage``

7. Generate the **Docker Image** with the command ``docker build -t deploy-aws-image .``

8. Verify that the Docker Image was generated with the command ``docker images | grep deploy-aws-image``

9. Run the Docker Image with the command ``docker run -p 9000:9000 -e DB_DEFAULT_URL -e DB_DEFAULT_USERNAME -e DB_DEFAULT_PASSWORD -e APPLICATION_SECRET deploy-aws-image``

10. Into the directory ``target/docker/stage``, create a ZIP file with the command ``zip -r ../deploy-aws-image.zip .``

11. The ZIP **deploy-aws-image.zip** is stored in the directory ``play-java-aws-elastic-beanstalk/target/docker``