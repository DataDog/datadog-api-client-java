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

/** Software or hardware component. */
@JsonPropertyOrder({
  SBOMComponent.JSON_PROPERTY_BOM_REF,
  SBOMComponent.JSON_PROPERTY_NAME,
  SBOMComponent.JSON_PROPERTY_PURL,
  SBOMComponent.JSON_PROPERTY_TYPE,
  SBOMComponent.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SBOMComponent {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BOM_REF = "bom-ref";
  private String bomRef;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PURL = "purl";
  private String purl;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SBOMComponentType type;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public SBOMComponent() {}

  @JsonCreator
  public SBOMComponent(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SBOMComponentType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) String version) {
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.version = version;
  }

  public SBOMComponent bomRef(String bomRef) {
    this.bomRef = bomRef;
    return this;
  }

  /**
   * An optional identifier that can be used to reference the component elsewhere in the BOM.
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

  public SBOMComponent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the component. This will often be a shortened, single name of the component.
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

  public SBOMComponent purl(String purl) {
    this.purl = purl;
    return this;
  }

  /**
   * Specifies the package-url (purl). The purl, if specified, MUST be valid and conform to the <a
   * href="https://github.com/package-url/purl-spec">specification</a>.
   *
   * @return purl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PURL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPurl() {
    return purl;
  }

  public void setPurl(String purl) {
    this.purl = purl;
  }

  public SBOMComponent type(SBOMComponentType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The SBOM component type
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SBOMComponentType getType() {
    return type;
  }

  public void setType(SBOMComponentType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public SBOMComponent version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The component version.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
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
   * @return SBOMComponent
   */
  @JsonAnySetter
  public SBOMComponent putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SBOMComponent object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SBOMComponent sbomComponent = (SBOMComponent) o;
    return Objects.equals(this.bomRef, sbomComponent.bomRef)
        && Objects.equals(this.name, sbomComponent.name)
        && Objects.equals(this.purl, sbomComponent.purl)
        && Objects.equals(this.type, sbomComponent.type)
        && Objects.equals(this.version, sbomComponent.version)
        && Objects.equals(this.additionalProperties, sbomComponent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bomRef, name, purl, type, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SBOMComponent {\n");
    sb.append("    bomRef: ").append(toIndentedString(bomRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    purl: ").append(toIndentedString(purl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
