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

/** Summary of the protocol and its selected subject type and primary metric. */
@JsonPropertyOrder({
  ExperimentsPublicProtocolListResponseDataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsPublicProtocolListResponseDataAttributes.JSON_PROPERTY_NAME,
  ExperimentsPublicProtocolListResponseDataAttributes.JSON_PROPERTY_PRIMARY_METRIC,
  ExperimentsPublicProtocolListResponseDataAttributes.JSON_PROPERTY_PRIMARY_METRIC_ID,
  ExperimentsPublicProtocolListResponseDataAttributes.JSON_PROPERTY_STATUS,
  ExperimentsPublicProtocolListResponseDataAttributes.JSON_PROPERTY_SUBJECT_TYPE,
  ExperimentsPublicProtocolListResponseDataAttributes.JSON_PROPERTY_SUBJECT_TYPE_ID,
  ExperimentsPublicProtocolListResponseDataAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPublicProtocolListResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRIMARY_METRIC = "primary_metric";
  private ExperimentsPublicProtocolResponseDataAttributesSubjectType primaryMetric;

  public static final String JSON_PROPERTY_PRIMARY_METRIC_ID = "primary_metric_id";
  private String primaryMetricId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ExperimentsPublicProtocolResponseDataAttributesStatus status;

  public static final String JSON_PROPERTY_SUBJECT_TYPE = "subject_type";
  private ExperimentsPublicProtocolResponseDataAttributesSubjectType subjectType;

  public static final String JSON_PROPERTY_SUBJECT_TYPE_ID = "subject_type_id";
  private String subjectTypeId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public ExperimentsPublicProtocolListResponseDataAttributes() {}

  @JsonCreator
  public ExperimentsPublicProtocolListResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          ExperimentsPublicProtocolResponseDataAttributesStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) String updatedAt) {
    this.name = name;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.updatedAt = updatedAt;
  }

  public ExperimentsPublicProtocolListResponseDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Text that explains the protocol.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExperimentsPublicProtocolListResponseDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the protocol.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExperimentsPublicProtocolListResponseDataAttributes primaryMetric(
      ExperimentsPublicProtocolResponseDataAttributesSubjectType primaryMetric) {
    this.primaryMetric = primaryMetric;
    this.unparsed |= primaryMetric.unparsed;
    return this;
  }

  /**
   * Subject type selected by the protocol.
   *
   * @return primaryMetric
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsPublicProtocolResponseDataAttributesSubjectType getPrimaryMetric() {
    return primaryMetric;
  }

  public void setPrimaryMetric(
      ExperimentsPublicProtocolResponseDataAttributesSubjectType primaryMetric) {
    this.primaryMetric = primaryMetric;
    if (primaryMetric != null) {
      this.unparsed |= primaryMetric.unparsed;
    }
  }

  public ExperimentsPublicProtocolListResponseDataAttributes primaryMetricId(
      String primaryMetricId) {
    this.primaryMetricId = primaryMetricId;
    return this;
  }

  /**
   * ID of the primary metric supplied by the protocol.
   *
   * @return primaryMetricId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrimaryMetricId() {
    return primaryMetricId;
  }

  public void setPrimaryMetricId(String primaryMetricId) {
    this.primaryMetricId = primaryMetricId;
  }

  public ExperimentsPublicProtocolListResponseDataAttributes status(
      ExperimentsPublicProtocolResponseDataAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Publication status of the protocol.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsPublicProtocolResponseDataAttributesStatus getStatus() {
    return status;
  }

  public void setStatus(ExperimentsPublicProtocolResponseDataAttributesStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public ExperimentsPublicProtocolListResponseDataAttributes subjectType(
      ExperimentsPublicProtocolResponseDataAttributesSubjectType subjectType) {
    this.subjectType = subjectType;
    this.unparsed |= subjectType.unparsed;
    return this;
  }

  /**
   * Subject type selected by the protocol.
   *
   * @return subjectType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsPublicProtocolResponseDataAttributesSubjectType getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(
      ExperimentsPublicProtocolResponseDataAttributesSubjectType subjectType) {
    this.subjectType = subjectType;
    if (subjectType != null) {
      this.unparsed |= subjectType.unparsed;
    }
  }

  public ExperimentsPublicProtocolListResponseDataAttributes subjectTypeId(String subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
    return this;
  }

  /**
   * ID of the subject type used by this configuration.
   *
   * @return subjectTypeId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubjectTypeId() {
    return subjectTypeId;
  }

  public void setSubjectTypeId(String subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
  }

  public ExperimentsPublicProtocolListResponseDataAttributes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * RFC3339 update time. Preserve all fractional seconds when passing this value as
   * expected_updated_at.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return ExperimentsPublicProtocolListResponseDataAttributes
   */
  @JsonAnySetter
  public ExperimentsPublicProtocolListResponseDataAttributes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this ExperimentsPublicProtocolListResponseDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPublicProtocolListResponseDataAttributes
        experimentsPublicProtocolListResponseDataAttributes =
            (ExperimentsPublicProtocolListResponseDataAttributes) o;
    return Objects.equals(
            this.description, experimentsPublicProtocolListResponseDataAttributes.description)
        && Objects.equals(this.name, experimentsPublicProtocolListResponseDataAttributes.name)
        && Objects.equals(
            this.primaryMetric, experimentsPublicProtocolListResponseDataAttributes.primaryMetric)
        && Objects.equals(
            this.primaryMetricId,
            experimentsPublicProtocolListResponseDataAttributes.primaryMetricId)
        && Objects.equals(this.status, experimentsPublicProtocolListResponseDataAttributes.status)
        && Objects.equals(
            this.subjectType, experimentsPublicProtocolListResponseDataAttributes.subjectType)
        && Objects.equals(
            this.subjectTypeId, experimentsPublicProtocolListResponseDataAttributes.subjectTypeId)
        && Objects.equals(
            this.updatedAt, experimentsPublicProtocolListResponseDataAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties,
            experimentsPublicProtocolListResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        name,
        primaryMetric,
        primaryMetricId,
        status,
        subjectType,
        subjectTypeId,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPublicProtocolListResponseDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryMetric: ").append(toIndentedString(primaryMetric)).append("\n");
    sb.append("    primaryMetricId: ").append(toIndentedString(primaryMetricId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    subjectTypeId: ").append(toIndentedString(subjectTypeId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
