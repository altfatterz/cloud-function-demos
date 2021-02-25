Enable APIs

```bash
$ gcloud services enable cloudfunctions.googleapis.com
$ gcloud services enable cloudbuild.googleapis.com
```


```bash
$ mvn function:run
```

```bash
curl :8080
Hello world!
```

```bash
$ gcloud functions deploy hello-world-java \
--entry-point com.example.HelloWorldJavaCloudFunction \
--runtime java11 \
--memory 512MB --trigger-http --allow-unauthenticated \
--region europe-west6 
```

```bash
$ gcloud functions list
```

```bash
$ gcloud functions describe hello-world-java --region europe-west6
```

```bash
$ gcloud functions logs read hello-world-java
```

```bash
$ curl https://europe-west6-cloud-functions-demo-305519.cloudfunctions.net/hello-world-java
```

