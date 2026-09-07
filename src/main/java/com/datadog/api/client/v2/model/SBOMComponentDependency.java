/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The dependencies of a component of the SBOM. */
@JsonPropertyOrder({
  SBOMComponentDependency.JSON_PROPERTY_DEPENDS_ON,
  SBOMComponentDependency.JSON_PROPERTY_REF
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SBOMComponentDependency {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEPENDS_ON = "dependsOn";
  private List<String> dependsOn = null;

  public static final String JSON_PROPERTY_REF = "ref";
  private String ref;

  public SBOMComponentDependency dependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public SBOMComponentDependency addDependsOnItem(String dependsOnItem) {
    if (this.dependsOn == null) {
      this.dependsOn = new ArrayList<>();
    }
    this.dependsOn.add(dependsOnItem);
    return this;
  }

  /**
   * The components that are dependencies of the ref component.
   *
   * @return dependsOn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPENDS_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDependsOn() {
    return dependsOn;
  }

  public void setDependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
  }

  public SBOMComponentDependency ref(String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * The identifier for the related component.
   *
   * @return ref
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
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
   * @return SBOMComponentDependency
   */
  @JsonAnySetter
  public SBOMComponentDependency putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SBOMComponentDependency object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SBOMComponentDependency sbomComponentDependency = (SBOMComponentDependency) o;
    return Objects.equals(this.dependsOn, sbomComponentDependency.dependsOn)
        && Objects.equals(this.ref, sbomComponentDependency.ref)
        && Objects.equals(this.additionalProperties, sbomComponentDependency.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependsOn, ref, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SBOMComponentDependency {\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
