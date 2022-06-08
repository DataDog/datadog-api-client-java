/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Update request of a Webhooks integration object.
 *
 * <p><em>All properties are optional.</em>
 */
@JsonPropertyOrder({
  WebhooksIntegrationUpdateRequest.JSON_PROPERTY_CUSTOM_HEADERS,
  WebhooksIntegrationUpdateRequest.JSON_PROPERTY_ENCODE_AS,
  WebhooksIntegrationUpdateRequest.JSON_PROPERTY_NAME,
  WebhooksIntegrationUpdateRequest.JSON_PROPERTY_PAYLOAD,
  WebhooksIntegrationUpdateRequest.JSON_PROPERTY_URL
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebhooksIntegrationUpdateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_HEADERS = "custom_headers";
  private String customHeaders;

  public static final String JSON_PROPERTY_ENCODE_AS = "encode_as";
  private WebhooksIntegrationEncoding encodeAs = WebhooksIntegrationEncoding.JSON;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private JsonNullable<String> payload = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public WebhooksIntegrationUpdateRequest customHeaders(String customHeaders) {
    this.customHeaders = customHeaders;
    return this;
  }

  /**
   * If <code>null</code>, uses no header. If given a JSON payload, these will be headers attached
   * to your webhook.
   *
   * @return customHeaders
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomHeaders() {
    return customHeaders;
  }

  public void setCustomHeaders(String customHeaders) {
    this.customHeaders = customHeaders;
  }

  public WebhooksIntegrationUpdateRequest encodeAs(WebhooksIntegrationEncoding encodeAs) {
    this.encodeAs = encodeAs;
    this.unparsed |= !encodeAs.isValid();
    return this;
  }

  /**
   * Encoding type. Can be given either <code>json</code> or <code>form</code>.
   *
   * @return encodeAs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCODE_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WebhooksIntegrationEncoding getEncodeAs() {
    return encodeAs;
  }

  public void setEncodeAs(WebhooksIntegrationEncoding encodeAs) {
    if (!encodeAs.isValid()) {
      this.unparsed = true;
    }
    this.encodeAs = encodeAs;
  }

  public WebhooksIntegrationUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the webhook. It corresponds with <code>&lt;WEBHOOK_NAME&gt;</code>. Learn more on
   * how to use it in <a href="https://docs.datadoghq.com/monitors/notify">monitor
   * notifications</a>.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WebhooksIntegrationUpdateRequest payload(String payload) {
    this.payload = JsonNullable.<String>of(payload);
    return this;
  }

  /**
   * If <code>null</code>, uses the default payload. If given a JSON payload, the webhook returns
   * the payload specified by the given payload. <a
   * href="https://docs.datadoghq.com/integrations/webhooks/#usage">Webhooks variable usage</a>.
   *
   * @return payload
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getPayload() {
    return payload.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPayload_JsonNullable() {
    return payload;
  }

  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  public void setPayload_JsonNullable(JsonNullable<String> payload) {
    this.payload = payload;
  }

  public void setPayload(String payload) {
    this.payload = JsonNullable.<String>of(payload);
  }

  public WebhooksIntegrationUpdateRequest url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the webhook.
   *
   * @return url
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /** Return true if this WebhooksIntegrationUpdateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksIntegrationUpdateRequest webhooksIntegrationUpdateRequest =
        (WebhooksIntegrationUpdateRequest) o;
    return Objects.equals(this.customHeaders, webhooksIntegrationUpdateRequest.customHeaders)
        && Objects.equals(this.encodeAs, webhooksIntegrationUpdateRequest.encodeAs)
        && Objects.equals(this.name, webhooksIntegrationUpdateRequest.name)
        && Objects.equals(this.payload, webhooksIntegrationUpdateRequest.payload)
        && Objects.equals(this.url, webhooksIntegrationUpdateRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customHeaders, encodeAs, name, payload, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksIntegrationUpdateRequest {\n");
    sb.append("    customHeaders: ").append(toIndentedString(customHeaders)).append("\n");
    sb.append("    encodeAs: ").append(toIndentedString(encodeAs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
