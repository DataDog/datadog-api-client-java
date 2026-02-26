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

/** Attributes for the AWS on demand task. */
@JsonPropertyOrder({
  AwsOnDemandAttributes.JSON_PROPERTY_ARN,
  AwsOnDemandAttributes.JSON_PROPERTY_ASSIGNED_AT,
  AwsOnDemandAttributes.JSON_PROPERTY_CREATED_AT,
  AwsOnDemandAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AwsOnDemandAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARN = "arn";
  private String arn;

  public static final String JSON_PROPERTY_ASSIGNED_AT = "assigned_at";
  private String assignedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public AwsOnDemandAttributes arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * The arn of the resource to scan.
   *
   * @return arn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public AwsOnDemandAttributes assignedAt(String assignedAt) {
    this.assignedAt = assignedAt;
    return this;
  }

  /**
   * Specifies the assignment timestamp if the task has been already assigned to a scanner.
   *
   * @return assignedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssignedAt() {
    return assignedAt;
  }

  public void setAssignedAt(String assignedAt) {
    this.assignedAt = assignedAt;
  }

  public AwsOnDemandAttributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The task submission timestamp.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public AwsOnDemandAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the status of the task. QUEUED: the task has been submitted successfully and the
   * resource has not been assigned to a scanner yet. ASSIGNED: the task has been assigned. ABORTED:
   * the scan has been aborted after a period of time due to technical reasons, such as resource not
   * found, insufficient permissions, or the absence of a configured scanner.
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
   * @return AwsOnDemandAttributes
   */
  @JsonAnySetter
  public AwsOnDemandAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AwsOnDemandAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsOnDemandAttributes awsOnDemandAttributes = (AwsOnDemandAttributes) o;
    return Objects.equals(this.arn, awsOnDemandAttributes.arn)
        && Objects.equals(this.assignedAt, awsOnDemandAttributes.assignedAt)
        && Objects.equals(this.createdAt, awsOnDemandAttributes.createdAt)
        && Objects.equals(this.status, awsOnDemandAttributes.status)
        && Objects.equals(this.additionalProperties, awsOnDemandAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn, assignedAt, createdAt, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsOnDemandAttributes {\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    assignedAt: ").append(toIndentedString(assignedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
