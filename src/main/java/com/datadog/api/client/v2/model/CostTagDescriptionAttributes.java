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

/**
 * Human-readable description and metadata attached to a Cloud Cost Management tag key, optionally
 * scoped to a single cloud provider.
 */
@JsonPropertyOrder({
  CostTagDescriptionAttributes.JSON_PROPERTY_CLOUD,
  CostTagDescriptionAttributes.JSON_PROPERTY_CREATED_AT,
  CostTagDescriptionAttributes.JSON_PROPERTY_DESCRIPTION,
  CostTagDescriptionAttributes.JSON_PROPERTY_SOURCE,
  CostTagDescriptionAttributes.JSON_PROPERTY_TAG_KEY,
  CostTagDescriptionAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostTagDescriptionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLOUD = "cloud";
  private String cloud;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private CostTagDescriptionSource source;

  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public CostTagDescriptionAttributes() {}

  @JsonCreator
  public CostTagDescriptionAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLOUD) String cloud,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) String createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) CostTagDescriptionSource source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_KEY) String tagKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) String updatedAt) {
    this.cloud = cloud;
    this.createdAt = createdAt;
    this.description = description;
    this.source = source;
    this.unparsed |= !source.isValid();
    this.tagKey = tagKey;
    this.updatedAt = updatedAt;
  }

  public CostTagDescriptionAttributes cloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  /**
   * Cloud provider this description applies to (for example, <code>aws</code>). Empty when the
   * description is the cross-cloud default for the tag key.
   *
   * @return cloud
   */
  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCloud() {
    return cloud;
  }

  public void setCloud(String cloud) {
    this.cloud = cloud;
  }

  public CostTagDescriptionAttributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the description was created, in RFC 3339 format.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public CostTagDescriptionAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The human-readable description for the tag key.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CostTagDescriptionAttributes source(CostTagDescriptionSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * Origin of the description. <code>human</code> indicates the description was written by a user,
   * <code>ai_generated</code> was produced by AI, and <code>datadog</code> is a default supplied by
   * Datadog.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CostTagDescriptionSource getSource() {
    return source;
  }

  public void setSource(CostTagDescriptionSource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  public CostTagDescriptionAttributes tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * The tag key this description applies to.
   *
   * @return tagKey
   */
  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTagKey() {
    return tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  public CostTagDescriptionAttributes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the description was last updated, in RFC 3339 format.
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
   * @return CostTagDescriptionAttributes
   */
  @JsonAnySetter
  public CostTagDescriptionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostTagDescriptionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostTagDescriptionAttributes costTagDescriptionAttributes = (CostTagDescriptionAttributes) o;
    return Objects.equals(this.cloud, costTagDescriptionAttributes.cloud)
        && Objects.equals(this.createdAt, costTagDescriptionAttributes.createdAt)
        && Objects.equals(this.description, costTagDescriptionAttributes.description)
        && Objects.equals(this.source, costTagDescriptionAttributes.source)
        && Objects.equals(this.tagKey, costTagDescriptionAttributes.tagKey)
        && Objects.equals(this.updatedAt, costTagDescriptionAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, costTagDescriptionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cloud, createdAt, description, source, tagKey, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostTagDescriptionAttributes {\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
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
