/usr/libexec/java_home -V

/usr/libexec/java_home -v 1.8

export JAVA_HOME=\$(/usr/libexec/java_home -v 1.8)

export PATH=$JAVA_HOME/bin:$PATH

java -version

gu install native-image

### Instalando R

```sh
gu install R
```

export GRAALVM_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-19.0.0/Contents/Home/

cd /Users/marcus/DESENVOLVIMENTO/BrasiliaDevFestival/Demo 1 - GraalVM/polyglot-javascript-java-r

Executando o exemplo Poliglota
\$GRAALVM_HOME/bin/node --polyglot --jvm server.js

xxxxxxxxxxxx

########
/usr/libexec/java_home -V

/usr/libexec/java_home -v 1.8

~/.bash_profile

///

export JAVA_HOME=\$(/usr/libexec/java_home -v 1.8)

export PATH=$JAVA_HOME/bin:$PATH

java -version

gu install native-image

### Instalando R

```sh
gu install R
```

export GRAALVM_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-19.0.0/Contents/Home/

Executando o exemplo Poliglota
\$GRAALVM_HOME/bin/node --polyglot --jvm server.js

Link: https://blog.softwaremill.com/graalvm-installation-and-setup-on-macos-294dd1d23ca2

Link2: https://www.graalvm.org/docs/examples/polyglot-javascript-java-r/

---

Habilitar o GraalVM

```sh
export JAVA_HOME=\$(/usr/libexec/java_home -v 1.8)
```

```sh
export PATH=$JAVA_HOME/bin:$PATH
```

### Verificando se existe Native-Image

```sh
gu install native-image
```

### Executar o exemplo Poliglota

```sh
export GRAALVM_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-19.0.0/Contents/Home/
```

### Verificando a versão do GraalVM e JVM

```sh
$GRAALVM_HOME/bin/java -version
```

### Instalando R

```sh
gu install R
```

link: https://blog.softwaremill.com/graalvm-installation-and-setup-on-macos-294dd1d23ca2

link2: https://huongdanjava.com/install-graalvm-on-macos.html

---

marcus in /Library/Java/JavaVirtualMachines 
❯ /usr/libexec/java_home -v 1.8
/Library/Java/JavaVirtualMachines/graalvm-ce-19.0.0/Contents/Home
marcus in /Library/Java/JavaVirtualMachines 

❯ export JAVA_HOME=\$(/usr/libexec/java_home -v 1.8)

❯ export JAVA_HOME=\$(/usr/libexec/java_home -v)

❯ export PATH=$JAVA_HOME/bin:\$PATH
marcus in /Library/Java/JavaVirtualMachines 

e
❯ java -version  
openjdk version "1.8.0_212"
OpenJDK Runtime Environment (build 1.8.0_212-20190420112649.buildslave.jdk8u-src-tar--b03)
OpenJDK GraalVM CE 19.0.0 (build 25.212-b03-jvmci-19-b01, mixed mode)
marcus in /Library/Java/JavaVirtualMachines 

Install Native-Image
gu install native-image

Rodando o Primeiro exemplo:

DemoGraalVM.java Polyglot.class Polyglot.java README.md polyglot.js
marcus in BrasiliaDevFestival/Demo 1 - GraalVM on  master [?]
❯ java Polyglot  
42
marcus in BrasiliaDevFestival/Demo 1 - GraalVM on  master [?]
❯
marcus in BrasiliaDevFestival/Demo 1 - GraalVM on  master [?]
❯
