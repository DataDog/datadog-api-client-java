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

/** The asset component represents the system or host being scanned. */
@JsonPropertyOrder({
  CycloneDXAssetComponent.JSON_PROPERTY_BOM_REF,
  CycloneDXAssetComponent.JSON_PROPERTY_NAME,
  CycloneDXAssetComponent.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CycloneDXAssetComponent {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BOM_REF = "bom-ref";
  private String bomRef;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public CycloneDXAssetComponent() {}

  @JsonCreator
  public CycloneDXAssetComponent(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public CycloneDXAssetComponent bomRef(String bomRef) {
    this.bomRef = bomRef;
    return this;
  }

  /**
   * Optional reference to a component in the components list.
   *
   * @return bomRef
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOM_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBomRef() {
    return bomRef;
  }

  public void setBomRef(String bomRef) {
    this.bomRef = bomRef;
  }

  public CycloneDXAssetComponent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the asset.
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

  public CycloneDXAssetComponent type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the asset component.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
   * @return CycloneDXAssetComponent
   */
  @JsonAnySetter
  public CycloneDXAssetComponent putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CycloneDXAssetComponent object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CycloneDXAssetComponent cycloneDxAssetComponent = (CycloneDXAssetComponent) o;
    return Objects.equals(this.bomRef, cycloneDxAssetComponent.bomRef)
        && Objects.equals(this.name, cycloneDxAssetComponent.name)
        && Objects.equals(this.type, cycloneDxAssetComponent.type)
        && Objects.equals(this.additionalProperties, cycloneDxAssetComponent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bomRef, name, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CycloneDXAssetComponent {\n");
    sb.append("    bomRef: ").append(toIndentedString(bomRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
