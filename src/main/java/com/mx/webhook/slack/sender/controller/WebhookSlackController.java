package com.mx.webhook.slack.sender.controller;

import com.mx.webhook.slack.sender.model.WebhookSlackSettings;
import com.mx.webhook.slack.sender.model.controller.response.WebhookSlackResponse;
import com.mx.webhook.slack.sender.service.WebhookSlackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/webhook/slack/sender")
@Slf4j
public class WebhookSlackController {

    @Autowired
    WebhookSlackService webhookSlackService;

    @PostMapping
    public WebhookSlackResponse sendMessage(
            @RequestBody WebhookSlackSettings webhookSlackSettings
    ) throws IOException {

        log.info(webhookSlackSettings.toString());

        webhookSlackService.send(webhookSlackSettings);

        return new WebhookSlackResponse(
            HttpStatus.OK,
            "The msh ["+webhookSlackSettings.getMsgText()+"] was be send",
            "",
            false
        );
    }
}
