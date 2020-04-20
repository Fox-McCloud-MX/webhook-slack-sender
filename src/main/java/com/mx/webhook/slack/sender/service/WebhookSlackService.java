package com.mx.webhook.slack.sender.service;

import com.mx.webhook.slack.sender.model.WebhookSlackSettings;
import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WebhookSlackService {
    public void send(WebhookSlackSettings webhookSlackSettings) throws IOException {
        Payload payload = Payload.builder()
                .channel(webhookSlackSettings.getChannel())
                .username(webhookSlackSettings.getUserName())
                .iconEmoji(webhookSlackSettings.getIconEmoji())
                .text(webhookSlackSettings.getMsgText())
                .build();

        Slack.getInstance().send(
                webhookSlackSettings.getWebhookURL(),
                payload
        );
    }
}
