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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Per-finding outcome of an assign or unassign operation. */
@JsonPropertyOrder({
  AssignmentResult.JSON_PROPERTY_DETAIL,
  AssignmentResult.JSON_PROPERTY_FINDING_ID,
  AssignmentResult.JSON_PROPERTY_STATUS,
  AssignmentResult.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AssignmentResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public static final String JSON_PROPERTY_FINDING_ID = "finding_id";
  private String findingId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public AssignmentResult() {}

  @JsonCreator
  public AssignmentResult(
      @JsonProperty(required = true, value = JSON_PROPERTY_DETAIL) String detail,
      @JsonProperty(required = true, value = JSON_PROPERTY_FINDING_ID) String findingId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) Integer status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.detail = detail;
    this.findingId = findingId;
    this.status = status;
    this.title = title;
  }

  public AssignmentResult detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Human-readable explanation of the outcome.
   *
   * @return detail
   */
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public AssignmentResult findingId(String findingId) {
    this.findingId = findingId;
    return this;
  }

  /**
   * Unique identifier of the security finding.
   *
   * @return findingId
   */
  @JsonProperty(JSON_PROPERTY_FINDING_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFindingId() {
    return findingId;
  }

  public void setFindingId(String findingId) {
    this.findingId = findingId;
  }

  public AssignmentResult status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP-like status code describing the outcome for this finding.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public AssignmentResult title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Short label describing the outcome for this finding.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return AssignmentResult
   */
  @JsonAnySetter
  public AssignmentResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AssignmentResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentResult assignmentResult = (AssignmentResult) o;
    return Objects.equals(this.detail, assignmentResult.detail)
        && Objects.equals(this.findingId, assignmentResult.findingId)
        && Objects.equals(this.status, assignmentResult.status)
        && Objects.equals(this.title, assignmentResult.title)
        && Objects.equals(this.additionalProperties, assignmentResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, findingId, status, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentResult {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    findingId: ").append(toIndentedString(findingId)).append("\n");
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
