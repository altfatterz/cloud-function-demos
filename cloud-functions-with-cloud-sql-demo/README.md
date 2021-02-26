```bash
$ gcloud services enable compute.googleapis.com
$ gcloud services enable sql-component.googleapis.com
$ gcloud services enable sqladmin.googleapis.com
```

Create a Cloud SQL (Postgres) instance using the console.

```bash
$ gcloud sql instances list
NAME        DATABASE_VERSION  LOCATION        TIER               PRIMARY_ADDRESS  PRIVATE_ADDRESS  STATUS
myinstance  POSTGRES_13       europe-west6-a  db-custom-4-26624  34.65.87.62      -                RUNNABLE
```

```bash
$ gcloud sql connect myinstance --user=postgres 
Password: Eks8cktGiFkkiPfn
````

```bash
$ CREATE DATABASE mydatabase
$ \connect mydatabase
Password:
You are now connected to database "mydatabase" as user "postgres".
mydatabase=>
```

1. Authenticate with Cloud SDK (your credentials will be automatically found by the Spring Boot Starter for Google Cloud SQL.)

Acquire new user credentials to use for Application Default Credentials

```bash
$ gcloud auth application-default login
```

There will be a `~/.config/gcloud/application_default_credentials.json` created

```yaml
{
  "client_id": "764086051850-6qr4p6gpi6hn506pt8ejuq83di341hur.apps.googleusercontent.com",
  "client_secret": "d-FL95Q19q7MQmFpd7hHD0Ty",
  "quota_project_id": "cloud-functions-demo-305519",
  "refresh_token": "1//09XB-8p1rpxeOCgYIARAAGAkSNwF-L9IrsOg4IkJPHInCFrXmAb3ZNKpnKKzcr2Nn_VnxcrpillPPcRqSQ9xKLl21OfkbBs7jrTU",
  "type": "authorized_user"
}
```
To delete it use:

```bash
$ gcloud auth application-default revoke
```

After that you will get: `Caused by: java.lang.RuntimeException: Unable to obtain credentials to communicate with the Cloud SQL API`

2. Create a service account and download its private key (this did not work yet)




```bash
$ mvn function:run
```


Locally:

```bash
$ docker run --name mypostgres -e POSTGRES_PASSWORD=secret -p 5432:5432 -d postgres:13.2 
```
