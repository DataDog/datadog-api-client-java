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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a RUM operation strong link response. */
@JsonPropertyOrder({
  RUMOperationStrongLinkResponseAttributes.JSON_PROPERTY_CREATED_AT,
  RUMOperationStrongLinkResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  RUMOperationStrongLinkResponseAttributes.JSON_PROPERTY_FEATURE_ID,
  RUMOperationStrongLinkResponseAttributes.JSON_PROPERTY_OPERATION_ID,
  RUMOperationStrongLinkResponseAttributes.JSON_PROPERTY_STATUS,
  RUMOperationStrongLinkResponseAttributes.JSON_PROPERTY_TAGS,
  RUMOperationStrongLinkResponseAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMOperationStrongLinkResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FEATURE_ID = "feature_id";
  private String featureId;

  public static final String JSON_PROPERTY_OPERATION_ID = "operation_id";
  private String operationId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RUMOperationStrongLinkStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

  public RUMOperationStrongLinkResponseAttributes() {}

  @JsonCreator
  public RUMOperationStrongLinkResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_ID) String featureId,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATION_ID) String operationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          RUMOperationStrongLinkStatus status) {
    this.featureId = featureId;
    this.operationId = operationId;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  /**
   * The timestamp when the strong link was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public RUMOperationStrongLinkResponseAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * A description of the strong link.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  /**
   * The unique identifier of the linked feature.
   *
   * @return featureId
   */
  @JsonProperty(JSON_PROPERTY_FEATURE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFeatureId() {
    return featureId;
  }

  /**
   * The unique identifier of the linked RUM operation.
   *
   * @return operationId
   */
  @JsonProperty(JSON_PROPERTY_OPERATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOperationId() {
    return operationId;
  }

  public RUMOperationStrongLinkResponseAttributes status(RUMOperationStrongLinkStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of a RUM operation strong link.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RUMOperationStrongLinkStatus getStatus() {
    return status;
  }

  public void setStatus(RUMOperationStrongLinkStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public RUMOperationStrongLinkResponseAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RUMOperationStrongLinkResponseAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags associated with the strong link.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The timestamp when the strong link was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getUpdatedAt() {

    if (updatedAt == null) {
      updatedAt = JsonNullable.<OffsetDateTime>undefined();
    }
    return updatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getUpdatedAt_JsonNullable() {
    return updatedAt;
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  private void setUpdatedAt_JsonNullable(JsonNullable<OffsetDateTime> updatedAt) {
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
   * @return RUMOperationStrongLinkResponseAttributes
   */
  @JsonAnySetter
  public RUMOperationStrongLinkResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMOperationStrongLinkResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMOperationStrongLinkResponseAttributes rumOperationStrongLinkResponseAttributes =
        (RUMOperationStrongLinkResponseAttributes) o;
    return Objects.equals(this.createdAt, rumOperationStrongLinkResponseAttributes.createdAt)
        && Objects.equals(this.description, rumOperationStrongLinkResponseAttributes.description)
        && Objects.equals(this.featureId, rumOperationStrongLinkResponseAttributes.featureId)
        && Objects.equals(this.operationId, rumOperationStrongLinkResponseAttributes.operationId)
        && Objects.equals(this.status, rumOperationStrongLinkResponseAttributes.status)
        && Objects.equals(this.tags, rumOperationStrongLinkResponseAttributes.tags)
        && Objects.equals(this.updatedAt, rumOperationStrongLinkResponseAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties,
            rumOperationStrongLinkResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        description,
        featureId,
        operationId,
        status,
        tags,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMOperationStrongLinkResponseAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
