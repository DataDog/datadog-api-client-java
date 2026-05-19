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

/**
 * A facet group containing counts broken down by the distinct values of a case field (for example,
 * status or priority).
 */
@JsonPropertyOrder({CaseCountGroup.JSON_PROPERTY_GROUP, CaseCountGroup.JSON_PROPERTY_GROUP_VALUES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseCountGroup {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP = "group";
  private String group;

  public static final String JSON_PROPERTY_GROUP_VALUES = "group_values";
  private List<CaseCountGroupValue> groupValues = new ArrayList<>();

  public CaseCountGroup() {}

  @JsonCreator
  public CaseCountGroup(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP) String group,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_VALUES)
          List<CaseCountGroupValue> groupValues) {
    this.group = group;
    this.groupValues = groupValues;
  }

  public CaseCountGroup group(String group) {
    this.group = group;
    return this;
  }

  /**
   * The name of the field being grouped on (for example, <code>status</code> or <code>priority
   * </code>).
   *
   * @return group
   */
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public CaseCountGroup groupValues(List<CaseCountGroupValue> groupValues) {
    this.groupValues = groupValues;
    for (CaseCountGroupValue item : groupValues) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CaseCountGroup addGroupValuesItem(CaseCountGroupValue groupValuesItem) {
    this.groupValues.add(groupValuesItem);
    this.unparsed |= groupValuesItem.unparsed;
    return this;
  }

  /**
   * Values within this group.
   *
   * @return groupValues
   */
  @JsonProperty(JSON_PROPERTY_GROUP_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CaseCountGroupValue> getGroupValues() {
    return groupValues;
  }

  public void setGroupValues(List<CaseCountGroupValue> groupValues) {
    this.groupValues = groupValues;
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
   * @return CaseCountGroup
   */
  @JsonAnySetter
  public CaseCountGroup putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseCountGroup object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseCountGroup caseCountGroup = (CaseCountGroup) o;
    return Objects.equals(this.group, caseCountGroup.group)
        && Objects.equals(this.groupValues, caseCountGroup.groupValues)
        && Objects.equals(this.additionalProperties, caseCountGroup.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, groupValues, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseCountGroup {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupValues: ").append(toIndentedString(groupValues)).append("\n");
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
