(cd /articles-back; mvn clean package -Dmaven.test.skip)
(cd /articles-front; ng build)
docker-compose up -d --build
start http://localhost:9000