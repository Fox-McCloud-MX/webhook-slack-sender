# Webhook Slack Sender
Webhook slack sender msg to channel.

Consume this endpoint by POST method..

```h
http://localhost:8088/webhook/slack/sender
```

Body.

```json
{
    "channel": "{CHANNEL}",
    "userName": "{USERNAME}",
    "iconEmoji": "{ICON}",
    "msgText": "{MESSAGE}",
    "webhookURL": "https://hooks.slack.com/services/{WEBHOOK_ID}"
}
```

cURL.

```shell
curl --location --request POST 'http://localhost:8088/webhook/slack/sender' \
--header 'Content-Type: application/json' \
--data-raw '{
    "channel": "{CHANNEL}",
    "userName": "{USERNAME}",
    "iconEmoji": "{ICON}",
    "msgText": "{MESSAGE}",
    "webhookURL": "{WEBHOOK_ID}"
}'
```

