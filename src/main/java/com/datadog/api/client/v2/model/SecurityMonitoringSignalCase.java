/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A case linked to a security signal. */
@JsonPropertyOrder({
  SecurityMonitoringSignalCase.JSON_PROPERTY_ASSIGNEE_ID,
  SecurityMonitoringSignalCase.JSON_PROPERTY_ASSIGNEE_NAME,
  SecurityMonitoringSignalCase.JSON_PROPERTY_ID,
  SecurityMonitoringSignalCase.JSON_PROPERTY_KEY,
  SecurityMonitoringSignalCase.JSON_PROPERTY_STATUS,
  SecurityMonitoringSignalCase.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalCase {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE_ID = "assigneeId";
  private String assigneeId;

  public static final String JSON_PROPERTY_ASSIGNEE_NAME = "assigneeName";
  private String assigneeName;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public SecurityMonitoringSignalCase assigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }

  /**
   * The UUID of the user assigned to the case.
   *
   * @return assigneeId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNEE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
  }

  public SecurityMonitoringSignalCase assigneeName(String assigneeName) {
    this.assigneeName = assigneeName;
    return this;
  }

  /**
   * The name of the user assigned to the case.
   *
   * @return assigneeName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNEE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssigneeName() {
    return assigneeName;
  }

  public void setAssigneeName(String assigneeName) {
    this.assigneeName = assigneeName;
  }

  public SecurityMonitoringSignalCase id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the case.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecurityMonitoringSignalCase key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the case.
   *
   * @return key
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SecurityMonitoringSignalCase status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the case.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SecurityMonitoringSignalCase title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the case.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return SecurityMonitoringSignalCase
   */
  @JsonAnySetter
  public SecurityMonitoringSignalCase putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringSignalCase object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalCase securityMonitoringSignalCase = (SecurityMonitoringSignalCase) o;
    return Objects.equals(this.assigneeId, securityMonitoringSignalCase.assigneeId)
        && Objects.equals(this.assigneeName, securityMonitoringSignalCase.assigneeName)
        && Objects.equals(this.id, securityMonitoringSignalCase.id)
        && Objects.equals(this.key, securityMonitoringSignalCase.key)
        && Objects.equals(this.status, securityMonitoringSignalCase.status)
        && Objects.equals(this.title, securityMonitoringSignalCase.title)
        && Objects.equals(
            this.additionalProperties, securityMonitoringSignalCase.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigneeId, assigneeName, id, key, status, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalCase {\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    assigneeName: ").append(toIndentedString(assigneeName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
