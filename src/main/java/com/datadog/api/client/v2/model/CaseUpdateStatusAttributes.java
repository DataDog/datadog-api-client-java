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

/** Case update status attributes */
@JsonPropertyOrder({
  CaseUpdateStatusAttributes.JSON_PROPERTY_STATUS,
  CaseUpdateStatusAttributes.JSON_PROPERTY_STATUS_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseUpdateStatusAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_STATUS = "status";
  private CaseStatus status;

  public static final String JSON_PROPERTY_STATUS_NAME = "status_name";
  private String statusName;

  public CaseUpdateStatusAttributes status(CaseStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Deprecated way of representing the case status, which only supports OPEN, IN_PROGRESS, and
   * CLOSED statuses. Use <code>status_name</code> instead.
   *
   * @return status
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CaseStatus getStatus() {
    return status;
  }

  @Deprecated
  public void setStatus(CaseStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public CaseUpdateStatusAttributes statusName(String statusName) {
    this.statusName = statusName;
    return this;
  }

  /**
   * Status of the case. Must be one of the existing statuses for the case's type.
   *
   * @return statusName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
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
   * @return CaseUpdateStatusAttributes
   */
  @JsonAnySetter
  public CaseUpdateStatusAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseUpdateStatusAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseUpdateStatusAttributes caseUpdateStatusAttributes = (CaseUpdateStatusAttributes) o;
    return Objects.equals(this.status, caseUpdateStatusAttributes.status)
        && Objects.equals(this.statusName, caseUpdateStatusAttributes.statusName)
        && Objects.equals(
            this.additionalProperties, caseUpdateStatusAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseUpdateStatusAttributes {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
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
