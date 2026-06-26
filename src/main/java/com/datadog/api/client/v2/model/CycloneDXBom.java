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

/** A CycloneDX 1.5 Bill of Materials (BOM) document containing vulnerability data. */
@JsonPropertyOrder({
  CycloneDXBom.JSON_PROPERTY_BOM_FORMAT,
  CycloneDXBom.JSON_PROPERTY_COMPONENTS,
  CycloneDXBom.JSON_PROPERTY_METADATA,
  CycloneDXBom.JSON_PROPERTY_SPEC_VERSION,
  CycloneDXBom.JSON_PROPERTY_VERSION,
  CycloneDXBom.JSON_PROPERTY_VULNERABILITIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CycloneDXBom {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BOM_FORMAT = "bomFormat";
  private String bomFormat;

  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private List<CycloneDXComponent> components = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private CycloneDXMetadata metadata;

  public static final String JSON_PROPERTY_SPEC_VERSION = "specVersion";
  private String specVersion;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public static final String JSON_PROPERTY_VULNERABILITIES = "vulnerabilities";
  private List<CycloneDXVulnerability> vulnerabilities = new ArrayList<>();

  public CycloneDXBom() {}

  @JsonCreator
  public CycloneDXBom(
      @JsonProperty(required = true, value = JSON_PROPERTY_BOM_FORMAT) String bomFormat,
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPONENTS)
          List<CycloneDXComponent> components,
      @JsonProperty(required = true, value = JSON_PROPERTY_METADATA) CycloneDXMetadata metadata,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPEC_VERSION) String specVersion,
      @JsonProperty(required = true, value = JSON_PROPERTY_VULNERABILITIES)
          List<CycloneDXVulnerability> vulnerabilities) {
    this.bomFormat = bomFormat;
    this.components = components;
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    this.specVersion = specVersion;
    this.vulnerabilities = vulnerabilities;
  }

  public CycloneDXBom bomFormat(String bomFormat) {
    this.bomFormat = bomFormat;
    return this;
  }

  /**
   * The BOM format identifier. Must be <code>CycloneDX</code>.
   *
   * @return bomFormat
   */
  @JsonProperty(JSON_PROPERTY_BOM_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBomFormat() {
    return bomFormat;
  }

  public void setBomFormat(String bomFormat) {
    this.bomFormat = bomFormat;
  }

  public CycloneDXBom components(List<CycloneDXComponent> components) {
    this.components = components;
    for (CycloneDXComponent item : components) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CycloneDXBom addComponentsItem(CycloneDXComponent componentsItem) {
    this.components.add(componentsItem);
    this.unparsed |= componentsItem.unparsed;
    return this;
  }

  /**
   * The list of scanned software components. Cannot be empty.
   *
   * @return components
   */
  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CycloneDXComponent> getComponents() {
    return components;
  }

  public void setComponents(List<CycloneDXComponent> components) {
    this.components = components;
  }

  public CycloneDXBom metadata(CycloneDXMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * Metadata about the BOM, including the scanned asset and the scanner tool.
   *
   * @return metadata
   */
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CycloneDXMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(CycloneDXMetadata metadata) {
    this.metadata = metadata;
  }

  public CycloneDXBom specVersion(String specVersion) {
    this.specVersion = specVersion;
    return this;
  }

  /**
   * The CycloneDX specification version. Must be <code>1.5</code>.
   *
   * @return specVersion
   */
  @JsonProperty(JSON_PROPERTY_SPEC_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSpecVersion() {
    return specVersion;
  }

  public void setSpecVersion(String specVersion) {
    this.specVersion = specVersion;
  }

  public CycloneDXBom version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version number of the BOM document.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public CycloneDXBom vulnerabilities(List<CycloneDXVulnerability> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
    for (CycloneDXVulnerability item : vulnerabilities) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CycloneDXBom addVulnerabilitiesItem(CycloneDXVulnerability vulnerabilitiesItem) {
    this.vulnerabilities.add(vulnerabilitiesItem);
    this.unparsed |= vulnerabilitiesItem.unparsed;
    return this;
  }

  /**
   * The list of detected vulnerabilities. Cannot be empty.
   *
   * @return vulnerabilities
   */
  @JsonProperty(JSON_PROPERTY_VULNERABILITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CycloneDXVulnerability> getVulnerabilities() {
    return vulnerabilities;
  }

  public void setVulnerabilities(List<CycloneDXVulnerability> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
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
   * @return CycloneDXBom
   */
  @JsonAnySetter
  public CycloneDXBom putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CycloneDXBom object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CycloneDXBom cycloneDxBom = (CycloneDXBom) o;
    return Objects.equals(this.bomFormat, cycloneDxBom.bomFormat)
        && Objects.equals(this.components, cycloneDxBom.components)
        && Objects.equals(this.metadata, cycloneDxBom.metadata)
        && Objects.equals(this.specVersion, cycloneDxBom.specVersion)
        && Objects.equals(this.version, cycloneDxBom.version)
        && Objects.equals(this.vulnerabilities, cycloneDxBom.vulnerabilities)
        && Objects.equals(this.additionalProperties, cycloneDxBom.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bomFormat,
        components,
        metadata,
        specVersion,
        version,
        vulnerabilities,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CycloneDXBom {\n");
    sb.append("    bomFormat: ").append(toIndentedString(bomFormat)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    specVersion: ").append(toIndentedString(specVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
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
