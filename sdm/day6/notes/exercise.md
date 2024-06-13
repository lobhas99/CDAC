## create a container to store data using mysql image

```bash

# pull mysql image
> docker image pull mysql

# create a volume to store the data permanantly
> docker volume create myvolume

# create a container
> docker container run -itd --name mydb -e MYSQL_ROOT_PASSWORD=root -v myvolume:/var/lib/mysql mysql

```
