/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>A one-time downtime definition.</p>
 */
@JsonPropertyOrder({
  DowntimeScheduleOneTimeResponse.JSON_PROPERTY_END,
  DowntimeScheduleOneTimeResponse.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeScheduleOneTimeResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_END = "end";
  private JsonNullable<OffsetDateTime> end = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public DowntimeScheduleOneTimeResponse() {}

  @JsonCreator
  public DowntimeScheduleOneTimeResponse(
            @JsonProperty(required=true, value=JSON_PROPERTY_START)OffsetDateTime start) {
        this.start = start;
  }
  public DowntimeScheduleOneTimeResponse end(OffsetDateTime end) {
    this.end = JsonNullable.<OffsetDateTime>of(end);
    return this;
  }

  /**
   * <p>ISO-8601 Datetime to end the downtime.</p>
   * @return end
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getEnd() {
        return end.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getEnd_JsonNullable() {
    return end;
  }
  @JsonProperty(JSON_PROPERTY_END)public void setEnd_JsonNullable(JsonNullable<OffsetDateTime> end) {
    this.end = end;
  }
  public void setEnd(OffsetDateTime end) {
    this.end = JsonNullable.<OffsetDateTime>of(end);
  }
  public DowntimeScheduleOneTimeResponse start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * <p>ISO-8601 Datetime to start the downtime.</p>
   * @return start
  **/
      @JsonProperty(JSON_PROPERTY_START)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getStart() {
        return start;
      }
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return DowntimeScheduleOneTimeResponse
   */
  @JsonAnySetter
  public DowntimeScheduleOneTimeResponse putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this DowntimeScheduleOneTimeResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeScheduleOneTimeResponse downtimeScheduleOneTimeResponse = (DowntimeScheduleOneTimeResponse) o;
    return Objects.equals(this.end, downtimeScheduleOneTimeResponse.end) && Objects.equals(this.start, downtimeScheduleOneTimeResponse.start) && Objects.equals(this.additionalProperties, downtimeScheduleOneTimeResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(end,start, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeScheduleOneTimeResponse {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
