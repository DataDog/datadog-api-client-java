/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Response with the list of muted host for your organization.</p>
 */
@JsonPropertyOrder({
  HostMuteResponse.JSON_PROPERTY_ACTION,
  HostMuteResponse.JSON_PROPERTY_END,
  HostMuteResponse.JSON_PROPERTY_HOSTNAME,
  HostMuteResponse.JSON_PROPERTY_MESSAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMuteResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_END = "end";
  private Long end;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public HostMuteResponse action(String action) {
    this.action = action;
    return this;
  }

  /**
   * <p>Action applied to the hosts.</p>
   * @return action
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAction() {
        return action;
      }
  public void setAction(String action) {
    this.action = action;
  }
  public HostMuteResponse end(Long end) {
    this.end = end;
    return this;
  }

  /**
   * <p>POSIX timestamp in seconds when the host is unmuted.</p>
   * @return end
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_END)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getEnd() {
        return end;
      }
  public void setEnd(Long end) {
    this.end = end;
  }
  public HostMuteResponse hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * <p>The host name.</p>
   * @return hostname
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOSTNAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHostname() {
        return hostname;
      }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }
  public HostMuteResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Message associated with the mute.</p>
   * @return message
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMessage() {
        return message;
      }
  public void setMessage(String message) {
    this.message = message;
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
   * @return HostMuteResponse
   */
  @JsonAnySetter
  public HostMuteResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this HostMuteResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMuteResponse hostMuteResponse = (HostMuteResponse) o;
    return Objects.equals(this.action, hostMuteResponse.action) && Objects.equals(this.end, hostMuteResponse.end) && Objects.equals(this.hostname, hostMuteResponse.hostname) && Objects.equals(this.message, hostMuteResponse.message) && Objects.equals(this.additionalProperties, hostMuteResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(action,end,hostname,message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMuteResponse {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
