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
 * Resource envelope carrying the tag key description being upserted. The <code>id</code> is
 * informational; the authoritative tag key is taken from the URL path.
 */
@JsonPropertyOrder({
  CostTagDescriptionUpsertRequestData.JSON_PROPERTY_ATTRIBUTES,
  CostTagDescriptionUpsertRequestData.JSON_PROPERTY_ID,
  CostTagDescriptionUpsertRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostTagDescriptionUpsertRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private CostTagDescriptionUpsertRequestDataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CostTagDescriptionType type = CostTagDescriptionType.COST_TAG_DESCRIPTION;

  public CostTagDescriptionUpsertRequestData() {}

  @JsonCreator
  public CostTagDescriptionUpsertRequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          CostTagDescriptionUpsertRequestDataAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CostTagDescriptionType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CostTagDescriptionUpsertRequestData attributes(
      CostTagDescriptionUpsertRequestDataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Mutable attributes set when creating or updating a Cloud Cost Management tag key description.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CostTagDescriptionUpsertRequestDataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CostTagDescriptionUpsertRequestDataAttributes attributes) {
    this.attributes = attributes;
  }

  public CostTagDescriptionUpsertRequestData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the tag key the description applies to. Matches the <code>tag_key</code> path
   * parameter.
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

  public CostTagDescriptionUpsertRequestData type(CostTagDescriptionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Cloud Cost Management tag description resource.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CostTagDescriptionType getType() {
    return type;
  }

  public void setType(CostTagDescriptionType type) {
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
   * @return CostTagDescriptionUpsertRequestData
   */
  @JsonAnySetter
  public CostTagDescriptionUpsertRequestData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostTagDescriptionUpsertRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostTagDescriptionUpsertRequestData costTagDescriptionUpsertRequestData =
        (CostTagDescriptionUpsertRequestData) o;
    return Objects.equals(this.attributes, costTagDescriptionUpsertRequestData.attributes)
        && Objects.equals(this.id, costTagDescriptionUpsertRequestData.id)
        && Objects.equals(this.type, costTagDescriptionUpsertRequestData.type)
        && Objects.equals(
            this.additionalProperties, costTagDescriptionUpsertRequestData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostTagDescriptionUpsertRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
