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
   * <p>Software or hardware component.</p>
 */
@JsonPropertyOrder({
  SBOMComponent.JSON_PROPERTY_BOM_REF,
  SBOMComponent.JSON_PROPERTY_LICENSES,
  SBOMComponent.JSON_PROPERTY_NAME,
  SBOMComponent.JSON_PROPERTY_PROPERTIES,
  SBOMComponent.JSON_PROPERTY_PURL,
  SBOMComponent.JSON_PROPERTY_SUPPLIER,
  SBOMComponent.JSON_PROPERTY_TYPE,
  SBOMComponent.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SBOMComponent {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BOM_REF = "bom-ref";
  private String bomRef;

  public static final String JSON_PROPERTY_LICENSES = "licenses";
  private List<SBOMComponentLicense> licenses = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private List<SBOMComponentProperty> properties = null;

  public static final String JSON_PROPERTY_PURL = "purl";
  private String purl;

  public static final String JSON_PROPERTY_SUPPLIER = "supplier";
  private SBOMComponentSupplier supplier;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SBOMComponentType type;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public SBOMComponent() {}

  @JsonCreator
  public SBOMComponent(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_SUPPLIER)SBOMComponentSupplier supplier,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)SBOMComponentType type,
            @JsonProperty(required=true, value=JSON_PROPERTY_VERSION)String version) {
        this.name = name;
        this.supplier = supplier;
        this.unparsed |= supplier.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
        this.version = version;
  }
  public SBOMComponent bomRef(String bomRef) {
    this.bomRef = bomRef;
    return this;
  }

  /**
   * <p>An optional identifier that can be used to reference the component elsewhere in the BOM.</p>
   * @return bomRef
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BOM_REF)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBomRef() {
        return bomRef;
      }
  public void setBomRef(String bomRef) {
    this.bomRef = bomRef;
  }
  public SBOMComponent licenses(List<SBOMComponentLicense> licenses) {
    this.licenses = licenses;
    for (SBOMComponentLicense item : licenses) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SBOMComponent addLicensesItem(SBOMComponentLicense licensesItem) {
    if (this.licenses == null) {
      this.licenses = new ArrayList<>();
    }
    this.licenses.add(licensesItem);
    this.unparsed |= licensesItem.unparsed;
    return this;
  }

  /**
   * <p>The software licenses of the SBOM component.</p>
   * @return licenses
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LICENSES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SBOMComponentLicense> getLicenses() {
        return licenses;
      }
  public void setLicenses(List<SBOMComponentLicense> licenses) {
    this.licenses = licenses;
  }
  public SBOMComponent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the component. This will often be a shortened, single name of the component.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public SBOMComponent properties(List<SBOMComponentProperty> properties) {
    this.properties = properties;
    for (SBOMComponentProperty item : properties) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SBOMComponent addPropertiesItem(SBOMComponentProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    this.unparsed |= propertiesItem.unparsed;
    return this;
  }

  /**
   * <p>The custom properties of the component of the SBOM.</p>
   * @return properties
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROPERTIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SBOMComponentProperty> getProperties() {
        return properties;
      }
  public void setProperties(List<SBOMComponentProperty> properties) {
    this.properties = properties;
  }
  public SBOMComponent purl(String purl) {
    this.purl = purl;
    return this;
  }

  /**
   * <p>Specifies the package-url (purl). The purl, if specified, MUST be valid and conform to the <a href="https://github.com/package-url/purl-spec">specification</a>.</p>
   * @return purl
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PURL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPurl() {
        return purl;
      }
  public void setPurl(String purl) {
    this.purl = purl;
  }
  public SBOMComponent supplier(SBOMComponentSupplier supplier) {
    this.supplier = supplier;
    this.unparsed |= supplier.unparsed;
    return this;
  }

  /**
   * <p>The supplier of the component.</p>
   * @return supplier
  **/
      @JsonProperty(JSON_PROPERTY_SUPPLIER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SBOMComponentSupplier getSupplier() {
        return supplier;
      }
  public void setSupplier(SBOMComponentSupplier supplier) {
    this.supplier = supplier;
  }
  public SBOMComponent type(SBOMComponentType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The SBOM component type</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>The component version.</p>
   * @return version
  **/
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getVersion() {
        return version;
      }
  public void setVersion(String version) {
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

  /**
   * Return true if this SBOMComponent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SBOMComponent sbomComponent = (SBOMComponent) o;
    return Objects.equals(this.bomRef, sbomComponent.bomRef) && Objects.equals(this.licenses, sbomComponent.licenses) && Objects.equals(this.name, sbomComponent.name) && Objects.equals(this.properties, sbomComponent.properties) && Objects.equals(this.purl, sbomComponent.purl) && Objects.equals(this.supplier, sbomComponent.supplier) && Objects.equals(this.type, sbomComponent.type) && Objects.equals(this.version, sbomComponent.version) && Objects.equals(this.additionalProperties, sbomComponent.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(bomRef,licenses,name,properties,purl,supplier,type,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SBOMComponent {\n");
    sb.append("    bomRef: ").append(toIndentedString(bomRef)).append("\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    purl: ").append(toIndentedString(purl)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
