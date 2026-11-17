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
 * The reviewed endpoint mapping used to identify a custom provider. Omitted when the provider and
 * model identity matched exactly.
 */
@JsonPropertyOrder({
  AiGatewayModelAutomaticPricingMapping.JSON_PROPERTY_ID,
  AiGatewayModelAutomaticPricingMapping.JSON_PROPERTY_REVISION,
  AiGatewayModelAutomaticPricingMapping.JSON_PROPERTY_SCOPE,
  AiGatewayModelAutomaticPricingMapping.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelAutomaticPricingMapping {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REVISION = "revision";
  private String revision;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public AiGatewayModelAutomaticPricingMapping() {}

  @JsonCreator
  public AiGatewayModelAutomaticPricingMapping(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_REVISION) String revision,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE) String scope,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.id = id;
    this.revision = revision;
    this.scope = scope;
    this.version = version;
  }

  public AiGatewayModelAutomaticPricingMapping id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Mapping identifier.
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

  public AiGatewayModelAutomaticPricingMapping revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Mapping revision.
   *
   * @return revision
   */
  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public AiGatewayModelAutomaticPricingMapping scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Mapping scope, such as <code>provider</code>.
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public AiGatewayModelAutomaticPricingMapping version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Mapping version.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return AiGatewayModelAutomaticPricingMapping
   */
  @JsonAnySetter
  public AiGatewayModelAutomaticPricingMapping putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelAutomaticPricingMapping object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelAutomaticPricingMapping aiGatewayModelAutomaticPricingMapping =
        (AiGatewayModelAutomaticPricingMapping) o;
    return Objects.equals(this.id, aiGatewayModelAutomaticPricingMapping.id)
        && Objects.equals(this.revision, aiGatewayModelAutomaticPricingMapping.revision)
        && Objects.equals(this.scope, aiGatewayModelAutomaticPricingMapping.scope)
        && Objects.equals(this.version, aiGatewayModelAutomaticPricingMapping.version)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelAutomaticPricingMapping.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, revision, scope, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelAutomaticPricingMapping {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
