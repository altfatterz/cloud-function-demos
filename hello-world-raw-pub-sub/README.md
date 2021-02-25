
```bash
$ gcloud functions deploy hello-world-raw-pub-sub \
--entry-point com.example.HelloWorldPubSub \
--runtime java11 \
--memory 512MB \
--trigger-topic people \
--region europe-west6 
```


```bash
$ gcloud pubsub topics publish people --message="Zoltan" --attribute=foo=bar,x=y
```

In the logs you will see:

```bash
Payload:{"@type":"type.googleapis.com/google.pubsub.v1.PubsubMessage","attributes":{"foo":"bar","x":"y"},"data":"Wm9sdGFu"}
```