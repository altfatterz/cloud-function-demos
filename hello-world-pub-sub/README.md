```bash
$ echo -n 'Zoltan' | base64
Wm9sdGFu
```

```bash
curl localhost:8080 \
  -X POST \
  -H "Content-Type: application/json" \
  -d '{
        "data": {
          "@type": "type.googleapis.com/google.pubsub.v1.PubsubMessage",
          "attributes": {
             "attr1":"attr1-value"
          },
          "data": "Wm9sdGFu"
        }
      }'
```

Create a topic:

```bash
$ gcloud pubsub topics create people
$ gcloud pubsub topics list
$ gcloud pubsub topics publish people --message Zoltan
```


Deployment

```bash
$ gcloud functions deploy hello-world-pub-sub \
--entry-point com.example.HelloWorldPubSub \
--runtime java11 \
--memory 512MB \
--trigger-topic people \
--region europe-west6 
```

Delete function
```bash
$ gcloud functions delete hello-world-pub-bus --region europe-west6
```


