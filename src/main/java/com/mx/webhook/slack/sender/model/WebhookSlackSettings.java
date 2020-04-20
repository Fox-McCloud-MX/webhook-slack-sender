package com.mx.webhook.slack.sender.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WebhookSlackSettings {
    private String channel;
    private String userName;
    private String iconEmoji;
    private String msgText;
    private String webhookURL;
}
