```bash
$ mvn clean package azure-functions:run

Functions:

	hello: [GET] http://localhost:7071/api/hello
```

```bash
$ curl http://localhost:7071/api/hello -d "{\"name\":\"Zoltan\"}
{
  "message": "Hello Zoltan!"
}
```

```bash
$ mvn clean package azure-functions:deploy
```

```bash
$ curl https://altfatterz-function-app.azurewebsites.net/api/hello  -d "{\"name\":\"Zoltan\"}"
{
  "message": "Hello Zoltan!"
}
```

Resources:
* https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/getting-started-with-spring-cloud-function-in-azure
* https://github.com/Azure-Samples/azure-functions-samples-java

