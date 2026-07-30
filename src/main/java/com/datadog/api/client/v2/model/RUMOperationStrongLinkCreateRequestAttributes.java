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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for creating a RUM operation strong link. */
@JsonPropertyOrder({
  RUMOperationStrongLinkCreateRequestAttributes.JSON_PROPERTY_APPLICATION_ID,
  RUMOperationStrongLinkCreateRequestAttributes.JSON_PROPERTY_DESCRIPTION,
  RUMOperationStrongLinkCreateRequestAttributes.JSON_PROPERTY_FEATURE_ID,
  RUMOperationStrongLinkCreateRequestAttributes.JSON_PROPERTY_OPERATION_ID,
  RUMOperationStrongLinkCreateRequestAttributes.JSON_PROPERTY_OPERATION_NAME,
  RUMOperationStrongLinkCreateRequestAttributes.JSON_PROPERTY_STATUS,
  RUMOperationStrongLinkCreateRequestAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMOperationStrongLinkCreateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private UUID applicationId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FEATURE_ID = "feature_id";
  private String featureId;

  public static final String JSON_PROPERTY_OPERATION_ID = "operation_id";
  private String operationId;

  public static final String JSON_PROPERTY_OPERATION_NAME = "operation_name";
  private String operationName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RUMOperationStrongLinkStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public RUMOperationStrongLinkCreateRequestAttributes() {}

  @JsonCreator
  public RUMOperationStrongLinkCreateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_ID) String featureId) {
    this.featureId = featureId;
  }

  public RUMOperationStrongLinkCreateRequestAttributes applicationId(UUID applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * The RUM application ID used when creating a stub operation from <code>operation_name</code>.
   *
   * @return applicationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(UUID applicationId) {
    this.applicationId = applicationId;
  }

  public RUMOperationStrongLinkCreateRequestAttributes description(String description) {
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

  public RUMOperationStrongLinkCreateRequestAttributes featureId(String featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * The unique identifier of the feature to link.
   *
   * @return featureId
   */
  @JsonProperty(JSON_PROPERTY_FEATURE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFeatureId() {
    return featureId;
  }

  public void setFeatureId(String featureId) {
    this.featureId = featureId;
  }

  public RUMOperationStrongLinkCreateRequestAttributes operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * The unique identifier of the RUM operation to link. Either <code>operation_id</code> or <code>
   * operation_name</code> is required.
   *
   * @return operationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public RUMOperationStrongLinkCreateRequestAttributes operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

  /**
   * The name of the RUM operation to link. Either <code>operation_id</code> or <code>operation_name
   * </code> is required. If no operation with this name exists, a stub operation is created.
   *
   * @return operationName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperationName() {
    return operationName;
  }

  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }

  public RUMOperationStrongLinkCreateRequestAttributes status(RUMOperationStrongLinkStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of a RUM operation strong link.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMOperationStrongLinkStatus getStatus() {
    return status;
  }

  public void setStatus(RUMOperationStrongLinkStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public RUMOperationStrongLinkCreateRequestAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RUMOperationStrongLinkCreateRequestAttributes addTagsItem(String tagsItem) {
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
   * @return RUMOperationStrongLinkCreateRequestAttributes
   */
  @JsonAnySetter
  public RUMOperationStrongLinkCreateRequestAttributes putAdditionalProperty(
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

  /** Return true if this RUMOperationStrongLinkCreateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMOperationStrongLinkCreateRequestAttributes rumOperationStrongLinkCreateRequestAttributes =
        (RUMOperationStrongLinkCreateRequestAttributes) o;
    return Objects.equals(
            this.applicationId, rumOperationStrongLinkCreateRequestAttributes.applicationId)
        && Objects.equals(
            this.description, rumOperationStrongLinkCreateRequestAttributes.description)
        && Objects.equals(this.featureId, rumOperationStrongLinkCreateRequestAttributes.featureId)
        && Objects.equals(
            this.operationId, rumOperationStrongLinkCreateRequestAttributes.operationId)
        && Objects.equals(
            this.operationName, rumOperationStrongLinkCreateRequestAttributes.operationName)
        && Objects.equals(this.status, rumOperationStrongLinkCreateRequestAttributes.status)
        && Objects.equals(this.tags, rumOperationStrongLinkCreateRequestAttributes.tags)
        && Objects.equals(
            this.additionalProperties,
            rumOperationStrongLinkCreateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationId,
        description,
        featureId,
        operationId,
        operationName,
        status,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMOperationStrongLinkCreateRequestAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
