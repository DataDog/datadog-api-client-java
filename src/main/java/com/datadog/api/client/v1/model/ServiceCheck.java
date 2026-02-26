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
   * <p>An object containing service check and status.</p>
 */
@JsonPropertyOrder({
  ServiceCheck.JSON_PROPERTY_CHECK,
  ServiceCheck.JSON_PROPERTY_HOST_NAME,
  ServiceCheck.JSON_PROPERTY_MESSAGE,
  ServiceCheck.JSON_PROPERTY_STATUS,
  ServiceCheck.JSON_PROPERTY_TAGS,
  ServiceCheck.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceCheck {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHECK = "check";
  private String check;

  public static final String JSON_PROPERTY_HOST_NAME = "host_name";
  private String hostName;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ServiceCheckStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public ServiceCheck() {}

  @JsonCreator
  public ServiceCheck(
            @JsonProperty(required=true, value=JSON_PROPERTY_CHECK)String check,
            @JsonProperty(required=true, value=JSON_PROPERTY_HOST_NAME)String hostName,
            @JsonProperty(required=true, value=JSON_PROPERTY_STATUS)ServiceCheckStatus status,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAGS)List<String> tags) {
        this.check = check;
        this.hostName = hostName;
        this.status = status;
        this.unparsed |= !status.isValid();
        this.tags = tags;
  }
  public ServiceCheck check(String check) {
    this.check = check;
    return this;
  }

  /**
   * <p>The check.</p>
   * @return check
  **/
      @JsonProperty(JSON_PROPERTY_CHECK)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getCheck() {
        return check;
      }
  public void setCheck(String check) {
    this.check = check;
  }
  public ServiceCheck hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

  /**
   * <p>The host name correlated with the check.</p>
   * @return hostName
  **/
      @JsonProperty(JSON_PROPERTY_HOST_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getHostName() {
        return hostName;
      }
  public void setHostName(String hostName) {
    this.hostName = hostName;
  }
  public ServiceCheck message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Message containing check status.</p>
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
  public ServiceCheck status(ServiceCheckStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>The status of a service check. Set to <code>0</code> for OK, <code>1</code> for warning, <code>2</code> for critical, and <code>3</code> for unknown.</p>
   * @return status
  **/
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ServiceCheckStatus getStatus() {
        return status;
      }
  public void setStatus(ServiceCheckStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public ServiceCheck tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public ServiceCheck addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>Tags related to a check.</p>
   * @return tags
  **/
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public ServiceCheck timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>Time of check.</p>
   * @return timestamp
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMESTAMP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTimestamp() {
        return timestamp;
      }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
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
   * @return ServiceCheck
   */
  @JsonAnySetter
  public ServiceCheck putAdditionalProperty(String key, Object value) {
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
   * Return true if this ServiceCheck object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCheck serviceCheck = (ServiceCheck) o;
    return Objects.equals(this.check, serviceCheck.check) && Objects.equals(this.hostName, serviceCheck.hostName) && Objects.equals(this.message, serviceCheck.message) && Objects.equals(this.status, serviceCheck.status) && Objects.equals(this.tags, serviceCheck.tags) && Objects.equals(this.timestamp, serviceCheck.timestamp) && Objects.equals(this.additionalProperties, serviceCheck.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(check,hostName,message,status,tags,timestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCheck {\n");
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
