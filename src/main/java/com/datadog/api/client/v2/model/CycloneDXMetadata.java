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

/** Metadata about the BOM, including the scanned asset and the scanner tool. */
@JsonPropertyOrder({
  CycloneDXMetadata.JSON_PROPERTY_COMPONENT,
  CycloneDXMetadata.JSON_PROPERTY_TOOLS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CycloneDXMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENT = "component";
  private CycloneDXMetadataComponent component;

  public static final String JSON_PROPERTY_TOOLS = "tools";
  private CycloneDXMetadataTools tools;

  public CycloneDXMetadata() {}

  @JsonCreator
  public CycloneDXMetadata(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPONENT)
          CycloneDXMetadataComponent component,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOOLS) CycloneDXMetadataTools tools) {
    this.component = component;
    this.unparsed |= component.unparsed;
    this.tools = tools;
    this.unparsed |= tools.unparsed;
  }

  public CycloneDXMetadata component(CycloneDXMetadataComponent component) {
    this.component = component;
    this.unparsed |= component.unparsed;
    return this;
  }

  /**
   * The asset that was scanned (for example, a host or container image).
   *
   * @return component
   */
  @JsonProperty(JSON_PROPERTY_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CycloneDXMetadataComponent getComponent() {
    return component;
  }

  public void setComponent(CycloneDXMetadataComponent component) {
    this.component = component;
  }

  public CycloneDXMetadata tools(CycloneDXMetadataTools tools) {
    this.tools = tools;
    this.unparsed |= tools.unparsed;
    return this;
  }

  /**
   * Information about the scanner tool that produced this BOM.
   *
   * @return tools
   */
  @JsonProperty(JSON_PROPERTY_TOOLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CycloneDXMetadataTools getTools() {
    return tools;
  }

  public void setTools(CycloneDXMetadataTools tools) {
    this.tools = tools;
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
   * @return CycloneDXMetadata
   */
  @JsonAnySetter
  public CycloneDXMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CycloneDXMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CycloneDXMetadata cycloneDxMetadata = (CycloneDXMetadata) o;
    return Objects.equals(this.component, cycloneDxMetadata.component)
        && Objects.equals(this.tools, cycloneDxMetadata.tools)
        && Objects.equals(this.additionalProperties, cycloneDxMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, tools, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CycloneDXMetadata {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
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
