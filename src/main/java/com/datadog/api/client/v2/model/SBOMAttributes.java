/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The JSON:API attributes of the SBOM.</p>
 */
@JsonPropertyOrder({
  SBOMAttributes.JSON_PROPERTY_BOM_FORMAT,
  SBOMAttributes.JSON_PROPERTY_COMPONENTS,
  SBOMAttributes.JSON_PROPERTY_DEPENDENCIES,
  SBOMAttributes.JSON_PROPERTY_METADATA,
  SBOMAttributes.JSON_PROPERTY_SERIAL_NUMBER,
  SBOMAttributes.JSON_PROPERTY_SPEC_VERSION,
  SBOMAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SBOMAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BOM_FORMAT = "bomFormat";
  private String bomFormat;

  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private List<SBOMComponent> components = new ArrayList<>();

  public static final String JSON_PROPERTY_DEPENDENCIES = "dependencies";
  private List<SBOMComponentDependency> dependencies = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SBOMMetadata metadata;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serialNumber";
  private String serialNumber;

  public static final String JSON_PROPERTY_SPEC_VERSION = "specVersion";
  private SpecVersion specVersion;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SBOMAttributes() {}

  @JsonCreator
  public SBOMAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_BOM_FORMAT)String bomFormat,
            @JsonProperty(required=true, value=JSON_PROPERTY_COMPONENTS)List<SBOMComponent> components,
            @JsonProperty(required=true, value=JSON_PROPERTY_DEPENDENCIES)List<SBOMComponentDependency> dependencies,
            @JsonProperty(required=true, value=JSON_PROPERTY_METADATA)SBOMMetadata metadata,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERIAL_NUMBER)String serialNumber,
            @JsonProperty(required=true, value=JSON_PROPERTY_SPEC_VERSION)SpecVersion specVersion,
            @JsonProperty(required=true, value=JSON_PROPERTY_VERSION)Long version) {
        this.bomFormat = bomFormat;
        this.components = components;
        this.dependencies = dependencies;
        this.metadata = metadata;
        this.unparsed |= metadata.unparsed;
        this.serialNumber = serialNumber;
        this.specVersion = specVersion;
        this.unparsed |= !specVersion.isValid();
        this.version = version;
  }
  public SBOMAttributes bomFormat(String bomFormat) {
    this.bomFormat = bomFormat;
    return this;
  }

  /**
   * <p>Specifies the format of the BOM. This helps to identify the file as CycloneDX since BOM do not have a filename convention nor does JSON schema support namespaces. This value MUST be <code>CycloneDX</code>.</p>
   * @return bomFormat
  **/
      @JsonProperty(JSON_PROPERTY_BOM_FORMAT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getBomFormat() {
        return bomFormat;
      }
  public void setBomFormat(String bomFormat) {
    this.bomFormat = bomFormat;
  }
  public SBOMAttributes components(List<SBOMComponent> components) {
    this.components = components;
    for (SBOMComponent item : components) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SBOMAttributes addComponentsItem(SBOMComponent componentsItem) {
    this.components.add(componentsItem);
    this.unparsed |= componentsItem.unparsed;
    return this;
  }

  /**
   * <p>A list of software and hardware components.</p>
   * @return components
  **/
      @JsonProperty(JSON_PROPERTY_COMPONENTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<SBOMComponent> getComponents() {
        return components;
      }
  public void setComponents(List<SBOMComponent> components) {
    this.components = components;
  }
  public SBOMAttributes dependencies(List<SBOMComponentDependency> dependencies) {
    this.dependencies = dependencies;
    for (SBOMComponentDependency item : dependencies) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SBOMAttributes addDependenciesItem(SBOMComponentDependency dependenciesItem) {
    this.dependencies.add(dependenciesItem);
    this.unparsed |= dependenciesItem.unparsed;
    return this;
  }

  /**
   * <p>List of dependencies between components of the SBOM.</p>
   * @return dependencies
  **/
      @JsonProperty(JSON_PROPERTY_DEPENDENCIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<SBOMComponentDependency> getDependencies() {
        return dependencies;
      }
  public void setDependencies(List<SBOMComponentDependency> dependencies) {
    this.dependencies = dependencies;
  }
  public SBOMAttributes metadata(SBOMMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * <p>Provides additional information about a BOM.</p>
   * @return metadata
  **/
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SBOMMetadata getMetadata() {
        return metadata;
      }
  public void setMetadata(SBOMMetadata metadata) {
    this.metadata = metadata;
  }
  public SBOMAttributes serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * <p>Every BOM generated has a unique serial number, even if the contents of the BOM have not changed overt time. The serial number follows <a href="https://datatracker.ietf.org/doc/html/rfc4122">RFC-4122</a></p>
   * @return serialNumber
  **/
      @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSerialNumber() {
        return serialNumber;
      }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }
  public SBOMAttributes specVersion(SpecVersion specVersion) {
    this.specVersion = specVersion;
    this.unparsed |= !specVersion.isValid();
    return this;
  }

  /**
   * <p>The version of the CycloneDX specification a BOM conforms to.</p>
   * @return specVersion
  **/
      @JsonProperty(JSON_PROPERTY_SPEC_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SpecVersion getSpecVersion() {
        return specVersion;
      }
  public void setSpecVersion(SpecVersion specVersion) {
    if (!specVersion.isValid()) {
        this.unparsed = true;
    }
    this.specVersion = specVersion;
  }
  public SBOMAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * <p>It increments when a BOM is modified. The default value is 1.</p>
   * @return version
  **/
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getVersion() {
        return version;
      }
  public void setVersion(Long version) {
    this.version = version;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SBOMAttributes
   */
  @JsonAnySetter
  public SBOMAttributes putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SBOMAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SBOMAttributes sbomAttributes = (SBOMAttributes) o;
    return Objects.equals(this.bomFormat, sbomAttributes.bomFormat) && Objects.equals(this.components, sbomAttributes.components) && Objects.equals(this.dependencies, sbomAttributes.dependencies) && Objects.equals(this.metadata, sbomAttributes.metadata) && Objects.equals(this.serialNumber, sbomAttributes.serialNumber) && Objects.equals(this.specVersion, sbomAttributes.specVersion) && Objects.equals(this.version, sbomAttributes.version) && Objects.equals(this.additionalProperties, sbomAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(bomFormat,components,dependencies,metadata,serialNumber,specVersion,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SBOMAttributes {\n");
    sb.append("    bomFormat: ").append(toIndentedString(bomFormat)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    specVersion: ").append(toIndentedString(specVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
