/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A single email transport webhook log event. */
@JsonPropertyOrder({
  TransportWebhookLog.JSON_PROPERTY_ATTRIBUTES,
  TransportWebhookLog.JSON_PROPERTY_DATE,
  TransportWebhookLog.JSON_PROPERTY_LOG_ID,
  TransportWebhookLog.JSON_PROPERTY_SOURCE,
  TransportWebhookLog.JSON_PROPERTY_STATUS,
  TransportWebhookLog.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TransportWebhookLog {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private TransportWebhookLogAttributes attributes;

  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_LOG_ID = "log_id";
  private String logId;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public TransportWebhookLog() {}

  @JsonCreator
  public TransportWebhookLog(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          TransportWebhookLogAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATE) OffsetDateTime date,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOG_ID) String logId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.date = date;
    this.logId = logId;
    this.source = source;
    this.status = status;
    this.tags = tags;
  }

  public TransportWebhookLog attributes(TransportWebhookLogAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Top-level attributes for the webhook log event, including delivery status, recipient details,
   * and provider metadata.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TransportWebhookLogAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(TransportWebhookLogAttributes attributes) {
    this.attributes = attributes;
  }

  public TransportWebhookLog date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * The ISO 8601 timestamp of the event.
   *
   * @return date
   */
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public TransportWebhookLog logId(String logId) {
    this.logId = logId;
    return this;
  }

  /**
   * The unique log event identifier.
   *
   * @return logId
   */
  @JsonProperty(JSON_PROPERTY_LOG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public TransportWebhookLog source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The email transport provider.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public TransportWebhookLog status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The log status level.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TransportWebhookLog tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public TransportWebhookLog addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags associated with the event.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return TransportWebhookLog
   */
  @JsonAnySetter
  public TransportWebhookLog putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this TransportWebhookLog object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportWebhookLog transportWebhookLog = (TransportWebhookLog) o;
    return Objects.equals(this.attributes, transportWebhookLog.attributes)
        && Objects.equals(this.date, transportWebhookLog.date)
        && Objects.equals(this.logId, transportWebhookLog.logId)
        && Objects.equals(this.source, transportWebhookLog.source)
        && Objects.equals(this.status, transportWebhookLog.status)
        && Objects.equals(this.tags, transportWebhookLog.tags)
        && Objects.equals(this.additionalProperties, transportWebhookLog.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, date, logId, source, status, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportWebhookLog {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
