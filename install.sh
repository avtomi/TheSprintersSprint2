docker rm coordsgame
docker rmi coordsgameimg -f
docker build -t coordsgameimg .
docker run -it -P --name coordsgame coordsgameimg
