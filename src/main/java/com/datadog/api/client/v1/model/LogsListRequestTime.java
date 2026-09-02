/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Timeframe to retrieve the log from. */
@JsonPropertyOrder({
  LogsListRequestTime.JSON_PROPERTY_FROM,
  LogsListRequestTime.JSON_PROPERTY_TIMEZONE,
  LogsListRequestTime.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsListRequestTime {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private OffsetDateTime from;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TO = "to";
  private OffsetDateTime to;

  public LogsListRequestTime() {}

  @JsonCreator
  public LogsListRequestTime(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) OffsetDateTime from,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) OffsetDateTime to) {
    this.from = from;
    this.to = to;
  }

  public LogsListRequestTime from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

  /**
   * Minimum timestamp for requested logs.
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getFrom() {
    return from;
  }

  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }

  public LogsListRequestTime timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Timezone can be specified both as an offset (for example "UTC+03:00") or a regional zone (for
   * example "Europe/Paris").
   *
   * @return timezone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public LogsListRequestTime to(OffsetDateTime to) {
    this.to = to;
    return this;
  }

  /**
   * Maximum timestamp for requested logs.
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getTo() {
    return to;
  }

  public void setTo(OffsetDateTime to) {
    this.to = to;
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
   * @return LogsListRequestTime
   */
  @JsonAnySetter
  public LogsListRequestTime putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsListRequestTime object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsListRequestTime logsListRequestTime = (LogsListRequestTime) o;
    return Objects.equals(this.from, logsListRequestTime.from)
        && Objects.equals(this.timezone, logsListRequestTime.timezone)
        && Objects.equals(this.to, logsListRequestTime.to)
        && Objects.equals(this.additionalProperties, logsListRequestTime.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, timezone, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsListRequestTime {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
