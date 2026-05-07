// Ingest email transport webhook events returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EmailTransportApi;
import com.datadog.api.client.v2.model.TransportWebhookLog;
import com.datadog.api.client.v2.model.TransportWebhookLogAttributes;
import com.datadog.api.client.v2.model.TransportWebhookLogEmail;
import com.datadog.api.client.v2.model.TransportWebhookLogIpAttribute;
import com.datadog.api.client.v2.model.TransportWebhookLogMessage;
import com.datadog.api.client.v2.model.TransportWebhookLogMessageAuth;
import com.datadog.api.client.v2.model.TransportWebhookLogMessageCustomArgs;
import com.datadog.api.client.v2.model.TransportWebhookLogMessageId;
import com.datadog.api.client.v2.model.TransportWebhookLogMessageResponse;
import com.datadog.api.client.v2.model.TransportWebhookLogMessageTimestamp;
import com.datadog.api.client.v2.model.TransportWebhookLogNetwork;
import com.datadog.api.client.v2.model.TransportWebhookLogNetworkIp;
import com.datadog.api.client.v2.model.TransportWebhookLogOrgMetadata;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createEmailTransportWebhookIntake", true);
    EmailTransportApi apiInstance = new EmailTransportApi(defaultClient);

    List<TransportWebhookLog> body =
        Collections.singletonList(
            new TransportWebhookLog()
                .attributes(
                    new TransportWebhookLogAttributes()
                        .category(Collections.singletonList("transactional"))
                        .email(
                            new TransportWebhookLogEmail()
                                .address("user@example.com")
                                .domain("example.com")
                                .subject("[Monitor Alert] CPU usage is high")
                                .type(Collections.singletonList("transactional")))
                        .emailId("abc123-def456")
                        .emailTypeDisplayName("Monitor Alert")
                        .message(
                            new TransportWebhookLogMessage()
                                .auth(
                                    new TransportWebhookLogMessageAuth()
                                        .deliveredWithTls("TLSv1.2"))
                                .customArgs(
                                    new TransportWebhookLogMessageCustomArgs()
                                        .emailId("abc123-def456")
                                        .emailTypeDisplayName("Monitor Alert")
                                        .orgUuid("8dee7c38-00cb-11ea-a77b-8b5a08d3b091")
                                        .queueTime("2024-01-15T10:29:00Z")
                                        .subject("[Monitor Alert] CPU usage is high"))
                                .id(
                                    new TransportWebhookLogMessageId()
                                        .messageId("<message-id@example.com>")
                                        .smtpId("<abc123@mail.example.com>")
                                        .transportEventId("evt_abc123"))
                                .name("delivered")
                                .response(
                                    new TransportWebhookLogMessageResponse()
                                        .enhancedSmtpCode("2.0.0")
                                        .reason("250 2.0.0 OK")
                                        .smtpCode("250"))
                                .senderIp("192.168.1.1")
                                .timestamp(
                                    new TransportWebhookLogMessageTimestamp()
                                        .eventTimestamp(1705312200.0)
                                        .lifetime(3.2)
                                        .queueTime(1.5)
                                        .scheduledTime(1705312190.0)))
                        .network(
                            new TransportWebhookLogNetwork()
                                .ip(
                                    new TransportWebhookLogNetworkIp()
                                        .attributes(
                                            Collections.singletonList(
                                                new TransportWebhookLogIpAttribute()
                                                    .ip("192.168.1.1")
                                                    .source(Collections.singletonList("sendgrid"))))
                                        .list(Collections.singletonList("192.168.1.1"))))
                        .org(1234L)
                        .orgMetadata(new TransportWebhookLogOrgMetadata())
                        .orgUuid("8dee7c38-00cb-11ea-a77b-8b5a08d3b091")
                        .queueTime("2024-01-15T10:29:00Z")
                        .subject("[Monitor Alert] CPU usage is high")
                        .useragent("Mozilla/5.0"))
                .date(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                .logId("AQAAAZPHnBT0TwJAdgAAAABBWlBIblVlNEFBQ0dFMmVkYTFDSnRR")
                .source("sendgrid")
                .status("info")
                .tags(Collections.singletonList("env:production")));

    try {
      apiInstance.createEmailTransportWebhookIntake(body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling EmailTransportApi#createEmailTransportWebhookIntake");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
