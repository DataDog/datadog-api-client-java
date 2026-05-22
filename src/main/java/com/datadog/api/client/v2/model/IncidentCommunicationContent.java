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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The content of a communication. */
@JsonPropertyOrder({
  IncidentCommunicationContent.JSON_PROPERTY_GROUPING_KEY,
  IncidentCommunicationContent.JSON_PROPERTY_HANDLES,
  IncidentCommunicationContent.JSON_PROPERTY_MESSAGE,
  IncidentCommunicationContent.JSON_PROPERTY_STATUS,
  IncidentCommunicationContent.JSON_PROPERTY_SUBJECT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentCommunicationContent {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUPING_KEY = "grouping_key";
  private String groupingKey;

  public static final String JSON_PROPERTY_HANDLES = "handles";
  private List<IncidentCommunicationContentHandle> handles = new ArrayList<>();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public IncidentCommunicationContent() {}

  @JsonCreator
  public IncidentCommunicationContent(
      @JsonProperty(required = true, value = JSON_PROPERTY_HANDLES)
          List<IncidentCommunicationContentHandle> handles,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message) {
    this.handles = handles;
    this.message = message;
  }

  public IncidentCommunicationContent groupingKey(String groupingKey) {
    this.groupingKey = groupingKey;
    return this;
  }

  /**
   * A key used for grouping communications.
   *
   * @return groupingKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPING_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGroupingKey() {
    return groupingKey;
  }

  public void setGroupingKey(String groupingKey) {
    this.groupingKey = groupingKey;
  }

  public IncidentCommunicationContent handles(List<IncidentCommunicationContentHandle> handles) {
    this.handles = handles;
    for (IncidentCommunicationContentHandle item : handles) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentCommunicationContent addHandlesItem(
      IncidentCommunicationContentHandle handlesItem) {
    this.handles.add(handlesItem);
    this.unparsed |= handlesItem.unparsed;
    return this;
  }

  /**
   * The list of handles the communication is sent to.
   *
   * @return handles
   */
  @JsonProperty(JSON_PROPERTY_HANDLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentCommunicationContentHandle> getHandles() {
    return handles;
  }

  public void setHandles(List<IncidentCommunicationContentHandle> handles) {
    this.handles = handles;
  }

  public IncidentCommunicationContent message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message body of the communication.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IncidentCommunicationContent status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The status code of the communication. maximum: 2147483647
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public IncidentCommunicationContent subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * The subject line of the communication.
   *
   * @return subject
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
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
   * @return IncidentCommunicationContent
   */
  @JsonAnySetter
  public IncidentCommunicationContent putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentCommunicationContent object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentCommunicationContent incidentCommunicationContent = (IncidentCommunicationContent) o;
    return Objects.equals(this.groupingKey, incidentCommunicationContent.groupingKey)
        && Objects.equals(this.handles, incidentCommunicationContent.handles)
        && Objects.equals(this.message, incidentCommunicationContent.message)
        && Objects.equals(this.status, incidentCommunicationContent.status)
        && Objects.equals(this.subject, incidentCommunicationContent.subject)
        && Objects.equals(
            this.additionalProperties, incidentCommunicationContent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupingKey, handles, message, status, subject, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentCommunicationContent {\n");
    sb.append("    groupingKey: ").append(toIndentedString(groupingKey)).append("\n");
    sb.append("    handles: ").append(toIndentedString(handles)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
