Brasília DevFestival

Script apresentação

Warmup

Iniciar o Docker

```sh
docker run --name mariadb -p 3306:3306 -e MYSQL_ROOT_PASSWORD=admin -d mariadb:10.3
```

#Encontrar o IP do Docker

```sh
$ docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' mariadbtest
```

ou

```sh
docker start mariadb
```

## Demo 1 -

```sh
$ cd /Users/marcus/DESENVOLVIMENTO/BrasiliaDevFestival/Demo_1 - GraalVM
```

```sh
$ source /etc/profile
```

```sh
node --polyglot --jvm server.js
```

## Demo 2 - Polyglota

```sh
$ cd /Users/marcus/DESENVOLVIMENTO/BrasiliaDevFestival/Demo 2 - polyglot-javascript-java-r
```

# Fazendo o build

```sh
./build.sh
```

## Demo 3 - Native Image

```sh
$ cd /Users/marcus/DESENVOLVIMENTO/BrasiliaDevFestival/Demo 3 - Native Image/src
```

Compilando

```sh
$ javac Testando.java
```

### Gerando uma imagem nativa

```sh
$ native-image Testando
```

### Executando a imagem nativa

```sh
$ ./testando
```

## Demo 4 - Quarkus - Panache

```
Press Ctrl+Shift+A .
In the popup frame, start typing Increase font size or Decrease font size, and press Enter as soon as the corresponding command gets the focus.
The font will grow larger or smaller.
```

### Aumentar a fonte do IntelliJ

# CMD + =

### Resetar a o tamanho da fonte:

# CMD + \

### Warmup: Iniciar o banco de dados

```sh
$ docker start mariadb
```

# 1 - Criar uma aplicação Quarkus

```sh
mvn io.quarkus:quarkus-maven-plugin:0.21.1:create \
 -DprojectGroupId=com.mp \
 -DprojectArtifactId=bsbdevfestival \
 -DclassName="br.com.mp.bsbdevfestival.resource.CarResource" \
 -Dpath="/car"
```

### Diretório da Aplicação

```sh
$ cd /Users/marcus/DESENVOLVIMENTO/BrasiliaDevFestival/quarkus
```

## Configurações do Pom.xml

```xml
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-hibernate-orm-panache</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-resteasy-jsonb</artifactId>
        </dependency>
<!--        <dependency>-->
<!--            <groupId>io.quarkus</groupId>-->
<!--            <artifactId>quarkus-jdbc-postgresql</artifactId>-->
<!--        </dependency>-->

        <!-- JDBC driver dependencies -->
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-jdbc-mariadb</artifactId>
        </dependency>
```

## Executar a aplicação

```sh
mvn compile quarkus:dev
```
