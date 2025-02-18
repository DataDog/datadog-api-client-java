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

/** A JSON:API resource for an Application Security exclusion filter. */
@JsonPropertyOrder({
  ApplicationSecurityExclusionFilterResource.JSON_PROPERTY_ATTRIBUTES,
  ApplicationSecurityExclusionFilterResource.JSON_PROPERTY_ID,
  ApplicationSecurityExclusionFilterResource.JSON_PROPERTY_META,
  ApplicationSecurityExclusionFilterResource.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityExclusionFilterResource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ApplicationSecurityExclusionFilterAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_META = "meta";
  private ApplicationSecurityExclusionFilterMetadata meta;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ApplicationSecurityExclusionFilterType type =
      ApplicationSecurityExclusionFilterType.EXCLUSION_FILTER;

  public ApplicationSecurityExclusionFilterResource() {}

  @JsonCreator
  public ApplicationSecurityExclusionFilterResource(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          ApplicationSecurityExclusionFilterAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ApplicationSecurityExclusionFilterType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ApplicationSecurityExclusionFilterResource attributes(
      ApplicationSecurityExclusionFilterAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes describing an Application Security exclusion filter.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApplicationSecurityExclusionFilterAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ApplicationSecurityExclusionFilterAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * The identifier of the exclusion filter.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * Extra information about the exclusion filter.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationSecurityExclusionFilterMetadata getMeta() {
    return meta;
  }

  public ApplicationSecurityExclusionFilterResource type(
      ApplicationSecurityExclusionFilterType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the resource. The value should always be <code>exclusion_filter</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApplicationSecurityExclusionFilterType getType() {
    return type;
  }

  public void setType(ApplicationSecurityExclusionFilterType type) {
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
   * @return ApplicationSecurityExclusionFilterResource
   */
  @JsonAnySetter
  public ApplicationSecurityExclusionFilterResource putAdditionalProperty(
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

  /** Return true if this ApplicationSecurityExclusionFilterResource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityExclusionFilterResource applicationSecurityExclusionFilterResource =
        (ApplicationSecurityExclusionFilterResource) o;
    return Objects.equals(this.attributes, applicationSecurityExclusionFilterResource.attributes)
        && Objects.equals(this.id, applicationSecurityExclusionFilterResource.id)
        && Objects.equals(this.meta, applicationSecurityExclusionFilterResource.meta)
        && Objects.equals(this.type, applicationSecurityExclusionFilterResource.type)
        && Objects.equals(
            this.additionalProperties,
            applicationSecurityExclusionFilterResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, meta, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityExclusionFilterResource {\n");
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
