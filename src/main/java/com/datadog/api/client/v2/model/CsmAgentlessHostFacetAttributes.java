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

/** Attributes of an agentless host facet. */
@JsonPropertyOrder({
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_BOUNDED,
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_BUNDLED,
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_BUNDLED_AND_USED,
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_DEFAULT_VALUES,
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_DESCRIPTION,
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_EDITABLE,
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_FACET_TYPE,
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_GROUPS,
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_NAME,
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_PATH,
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_SOURCE,
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_TYPE,
  CsmAgentlessHostFacetAttributes.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmAgentlessHostFacetAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BOUNDED = "bounded";
  private Boolean bounded;

  public static final String JSON_PROPERTY_BUNDLED = "bundled";
  private Boolean bundled;

  public static final String JSON_PROPERTY_BUNDLED_AND_USED = "bundledAndUsed";
  private Boolean bundledAndUsed;

  public static final String JSON_PROPERTY_DEFAULT_VALUES = "defaultValues";
  private List<String> defaultValues = new ArrayList<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EDITABLE = "editable";
  private Boolean editable;

  public static final String JSON_PROPERTY_FACET_TYPE = "facetType";
  private String facetType;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = new ArrayList<>();

  public CsmAgentlessHostFacetAttributes() {}

  @JsonCreator
  public CsmAgentlessHostFacetAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_BOUNDED) Boolean bounded,
      @JsonProperty(required = true, value = JSON_PROPERTY_BUNDLED) Boolean bundled,
      @JsonProperty(required = true, value = JSON_PROPERTY_BUNDLED_AND_USED) Boolean bundledAndUsed,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT_VALUES)
          List<String> defaultValues,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_EDITABLE) Boolean editable,
      @JsonProperty(required = true, value = JSON_PROPERTY_FACET_TYPE) String facetType,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUPS) List<String> groups,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PATH) String path,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<String> values) {
    this.bounded = bounded;
    this.bundled = bundled;
    this.bundledAndUsed = bundledAndUsed;
    this.defaultValues = defaultValues;
    this.description = description;
    this.editable = editable;
    this.facetType = facetType;
    this.groups = groups;
    this.name = name;
    this.path = path;
    this.source = source;
    this.type = type;
    this.values = values;
  }

  public CsmAgentlessHostFacetAttributes bounded(Boolean bounded) {
    this.bounded = bounded;
    return this;
  }

  /**
   * Whether the facet has a bounded set of allowed values. <code>true</code> indicates a fixed
   * value set and <code>false</code> indicates free-form values.
   *
   * @return bounded
   */
  @JsonProperty(JSON_PROPERTY_BOUNDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getBounded() {
    return bounded;
  }

  public void setBounded(Boolean bounded) {
    this.bounded = bounded;
  }

  public CsmAgentlessHostFacetAttributes bundled(Boolean bundled) {
    this.bundled = bundled;
    return this;
  }

  /**
   * Whether the facet is bundled as part of the default facet set. <code>true</code> indicates
   * bundled and <code>false</code> indicates custom.
   *
   * @return bundled
   */
  @JsonProperty(JSON_PROPERTY_BUNDLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getBundled() {
    return bundled;
  }

  public void setBundled(Boolean bundled) {
    this.bundled = bundled;
  }

  public CsmAgentlessHostFacetAttributes bundledAndUsed(Boolean bundledAndUsed) {
    this.bundledAndUsed = bundledAndUsed;
    return this;
  }

  /**
   * Whether the facet is both bundled and actively used. <code>true</code> indicates in use; <code>
   * false</code> indicates unused.
   *
   * @return bundledAndUsed
   */
  @JsonProperty(JSON_PROPERTY_BUNDLED_AND_USED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getBundledAndUsed() {
    return bundledAndUsed;
  }

  public void setBundledAndUsed(Boolean bundledAndUsed) {
    this.bundledAndUsed = bundledAndUsed;
  }

  public CsmAgentlessHostFacetAttributes defaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
    return this;
  }

  public CsmAgentlessHostFacetAttributes addDefaultValuesItem(String defaultValuesItem) {
    this.defaultValues.add(defaultValuesItem);
    return this;
  }

  /**
   * The list of default filter values for the facet.
   *
   * @return defaultValues
   */
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getDefaultValues() {
    return defaultValues;
  }

  public void setDefaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
  }

  public CsmAgentlessHostFacetAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-readable description of what the facet represents.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CsmAgentlessHostFacetAttributes editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Whether the facet can be edited by users. <code>true</code> indicates editable; <code>false
   * </code> indicates read-only.
   *
   * @return editable
   */
  @JsonProperty(JSON_PROPERTY_EDITABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public CsmAgentlessHostFacetAttributes facetType(String facetType) {
    this.facetType = facetType;
    return this;
  }

  /**
   * The UI display type for the facet, such as <code>list</code>.
   *
   * @return facetType
   */
  @JsonProperty(JSON_PROPERTY_FACET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFacetType() {
    return facetType;
  }

  public void setFacetType(String facetType) {
    this.facetType = facetType;
  }

  public CsmAgentlessHostFacetAttributes groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public CsmAgentlessHostFacetAttributes addGroupsItem(String groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * The list of UI groups that this facet belongs to.
   *
   * @return groups
   */
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public CsmAgentlessHostFacetAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the facet.
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

  public CsmAgentlessHostFacetAttributes path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The field path used when filtering by this facet.
   *
   * @return path
   */
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public CsmAgentlessHostFacetAttributes source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The data source that provides the facet values.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CsmAgentlessHostFacetAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The data type of the facet values.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CsmAgentlessHostFacetAttributes values(List<String> values) {
    this.values = values;
    return this;
  }

  public CsmAgentlessHostFacetAttributes addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * The list of allowed filter values for bounded facets. Empty for unbounded facets.
   *
   * @return values
   */
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
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
   * @return CsmAgentlessHostFacetAttributes
   */
  @JsonAnySetter
  public CsmAgentlessHostFacetAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CsmAgentlessHostFacetAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsmAgentlessHostFacetAttributes csmAgentlessHostFacetAttributes =
        (CsmAgentlessHostFacetAttributes) o;
    return Objects.equals(this.bounded, csmAgentlessHostFacetAttributes.bounded)
        && Objects.equals(this.bundled, csmAgentlessHostFacetAttributes.bundled)
        && Objects.equals(this.bundledAndUsed, csmAgentlessHostFacetAttributes.bundledAndUsed)
        && Objects.equals(this.defaultValues, csmAgentlessHostFacetAttributes.defaultValues)
        && Objects.equals(this.description, csmAgentlessHostFacetAttributes.description)
        && Objects.equals(this.editable, csmAgentlessHostFacetAttributes.editable)
        && Objects.equals(this.facetType, csmAgentlessHostFacetAttributes.facetType)
        && Objects.equals(this.groups, csmAgentlessHostFacetAttributes.groups)
        && Objects.equals(this.name, csmAgentlessHostFacetAttributes.name)
        && Objects.equals(this.path, csmAgentlessHostFacetAttributes.path)
        && Objects.equals(this.source, csmAgentlessHostFacetAttributes.source)
        && Objects.equals(this.type, csmAgentlessHostFacetAttributes.type)
        && Objects.equals(this.values, csmAgentlessHostFacetAttributes.values)
        && Objects.equals(
            this.additionalProperties, csmAgentlessHostFacetAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bounded,
        bundled,
        bundledAndUsed,
        defaultValues,
        description,
        editable,
        facetType,
        groups,
        name,
        path,
        source,
        type,
        values,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsmAgentlessHostFacetAttributes {\n");
    sb.append("    bounded: ").append(toIndentedString(bounded)).append("\n");
    sb.append("    bundled: ").append(toIndentedString(bundled)).append("\n");
    sb.append("    bundledAndUsed: ").append(toIndentedString(bundledAndUsed)).append("\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    facetType: ").append(toIndentedString(facetType)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
