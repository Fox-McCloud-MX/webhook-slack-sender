package com.mx.webhook.slack.sender.model.controller.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class WebhookSlackResponse {
    private HttpStatus status;
    private String text;
    private String error;
    private boolean hasError;
}
