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

/** A single result entry returned by the bulk subscription endpoint. */
@JsonPropertyOrder({
  SampleLogGenerationBulkSubscriptionResultItem.JSON_PROPERTY_ATTRIBUTES,
  SampleLogGenerationBulkSubscriptionResultItem.JSON_PROPERTY_ID,
  SampleLogGenerationBulkSubscriptionResultItem.JSON_PROPERTY_META,
  SampleLogGenerationBulkSubscriptionResultItem.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SampleLogGenerationBulkSubscriptionResultItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SampleLogGenerationSubscriptionAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_META = "meta";
  private SampleLogGenerationBulkSubscriptionItemMeta meta;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SampleLogGenerationSubscriptionResourceType type =
      SampleLogGenerationSubscriptionResourceType.SUBSCRIPTIONS;

  public SampleLogGenerationBulkSubscriptionResultItem() {}

  @JsonCreator
  public SampleLogGenerationBulkSubscriptionResultItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          SampleLogGenerationSubscriptionAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_META)
          SampleLogGenerationBulkSubscriptionItemMeta meta,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SampleLogGenerationSubscriptionResourceType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SampleLogGenerationBulkSubscriptionResultItem attributes(
      SampleLogGenerationSubscriptionAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The attributes describing a sample log generation subscription.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SampleLogGenerationSubscriptionAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SampleLogGenerationSubscriptionAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public SampleLogGenerationBulkSubscriptionResultItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the subscription, when one was created.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SampleLogGenerationBulkSubscriptionResultItem meta(
      SampleLogGenerationBulkSubscriptionItemMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Per-item status returned for a bulk subscription request.
   *
   * @return meta
   */
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SampleLogGenerationBulkSubscriptionItemMeta getMeta() {
    return meta;
  }

  public void setMeta(SampleLogGenerationBulkSubscriptionItemMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
    }
  }

  public SampleLogGenerationBulkSubscriptionResultItem type(
      SampleLogGenerationSubscriptionResourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the resource. The value should always be <code>subscriptions</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SampleLogGenerationSubscriptionResourceType getType() {
    return type;
  }

  public void setType(SampleLogGenerationSubscriptionResourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return SampleLogGenerationBulkSubscriptionResultItem
   */
  @JsonAnySetter
  public SampleLogGenerationBulkSubscriptionResultItem putAdditionalProperty(
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

  /** Return true if this SampleLogGenerationBulkSubscriptionResultItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SampleLogGenerationBulkSubscriptionResultItem sampleLogGenerationBulkSubscriptionResultItem =
        (SampleLogGenerationBulkSubscriptionResultItem) o;
    return Objects.equals(this.attributes, sampleLogGenerationBulkSubscriptionResultItem.attributes)
        && Objects.equals(this.id, sampleLogGenerationBulkSubscriptionResultItem.id)
        && Objects.equals(this.meta, sampleLogGenerationBulkSubscriptionResultItem.meta)
        && Objects.equals(this.type, sampleLogGenerationBulkSubscriptionResultItem.type)
        && Objects.equals(
            this.additionalProperties,
            sampleLogGenerationBulkSubscriptionResultItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, meta, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampleLogGenerationBulkSubscriptionResultItem {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
