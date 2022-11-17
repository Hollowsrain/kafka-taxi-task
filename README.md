# kafka-taxi-task

### Springboot app that receives taxi data (id, latitude, longitude) and writes
### to kafka topics that are defined in [application.properties.](https://github.com/Hollowsrain/kafka-taxi-task/blob/master/src/main/resources/application.properties)
### Contains [docker-compose.yml](https://github.com/Hollowsrain/kafka-taxi-task/blob/master/src/main/resources/docker-compose.yml) file to setup docker environment with 2 
### kafka servers and 2 zookeepers.

### Application has one endpoint "/vehicle/send-signal".
### Application accepts json with these values.
* id
* latitude
* longitude
### Example:
#### 
#### {
#### "id":"Taxi_555151",
#### "latitude":"39.9496",
#### "longitude":"-75.1503"
#### }