# 1 - Criar uma aplicação Quarkus

mvn io.quarkus:quarkus-maven-plugin:0.21.1:create \
 -DprojectGroupId=com.mp \
 -DprojectArtifactId=bsbdevfestival \
 -DclassName="br.com.mp.bsbdevfestival.MainResource" \
 -Dpath="/main"

## Executar a aplicação

```bash
mvn compile quarkus:dev
```

### Navegador:

http://localhost:8080

---

# 2 - Verificar as extensões para o Quarkus

```bash
mvn io.quarkus:quarkus-maven-plugin:0.16.0:list-extensions
```

---
