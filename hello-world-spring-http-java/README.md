```bash
$ mvn function:run
```

URL: http://localhost:8080/

```bash
$ gcloud functions deploy hello-world-spring-http-java \
--entry-point org.springframework.cloud.function.adapter.gcp.GcfJarLauncher \
--runtime java11 \
--trigger-http \
--source target/deploy \
--allow-unauthenticated \
--region europe-west6 \ 
--memory 512MB
```

