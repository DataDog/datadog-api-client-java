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

/** */
@JsonPropertyOrder({
  GetMultipleRulesetsResponseDataAttributesRulesetsItems.JSON_PROPERTY_DATA,
  GetMultipleRulesetsResponseDataAttributesRulesetsItems.JSON_PROPERTY_DESCRIPTION,
  GetMultipleRulesetsResponseDataAttributesRulesetsItems.JSON_PROPERTY_NAME,
  GetMultipleRulesetsResponseDataAttributesRulesetsItems.JSON_PROPERTY_RULES,
  GetMultipleRulesetsResponseDataAttributesRulesetsItems.JSON_PROPERTY_SHORT_DESCRIPTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetMultipleRulesetsResponseDataAttributesRulesetsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private GetMultipleRulesetsResponseDataAttributesRulesetsItemsData data;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems> rules = null;

  public static final String JSON_PROPERTY_SHORT_DESCRIPTION = "short_description";
  private String shortDescription;

  public GetMultipleRulesetsResponseDataAttributesRulesetsItems() {}

  @JsonCreator
  public GetMultipleRulesetsResponseDataAttributesRulesetsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          GetMultipleRulesetsResponseDataAttributesRulesetsItemsData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
  }

  public GetMultipleRulesetsResponseDataAttributesRulesetsItems data(
      GetMultipleRulesetsResponseDataAttributesRulesetsItemsData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Getdata
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsData getData() {
    return data;
  }

  public void setData(GetMultipleRulesetsResponseDataAttributesRulesetsItemsData data) {
    this.data = data;
  }

  public GetMultipleRulesetsResponseDataAttributesRulesetsItems description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Getdescription
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetMultipleRulesetsResponseDataAttributesRulesetsItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Getname
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetMultipleRulesetsResponseDataAttributesRulesetsItems rules(
      List<GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems> rules) {
    this.rules = rules;
    for (GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems item : rules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GetMultipleRulesetsResponseDataAttributesRulesetsItems addRulesItem(
      GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    this.unparsed |= rulesItem.unparsed;
    return this;
  }

  /**
   * Getrules
   *
   * @return rules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems> getRules() {
    return rules;
  }

  public void setRules(
      List<GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems> rules) {
    this.rules = rules;
  }

  public GetMultipleRulesetsResponseDataAttributesRulesetsItems shortDescription(
      String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * GetshortDescription
   *
   * @return shortDescription
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
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
   * @return GetMultipleRulesetsResponseDataAttributesRulesetsItems
   */
  @JsonAnySetter
  public GetMultipleRulesetsResponseDataAttributesRulesetsItems putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this GetMultipleRulesetsResponseDataAttributesRulesetsItems object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMultipleRulesetsResponseDataAttributesRulesetsItems
        getMultipleRulesetsResponseDataAttributesRulesetsItems =
            (GetMultipleRulesetsResponseDataAttributesRulesetsItems) o;
    return Objects.equals(this.data, getMultipleRulesetsResponseDataAttributesRulesetsItems.data)
        && Objects.equals(
            this.description, getMultipleRulesetsResponseDataAttributesRulesetsItems.description)
        && Objects.equals(this.name, getMultipleRulesetsResponseDataAttributesRulesetsItems.name)
        && Objects.equals(this.rules, getMultipleRulesetsResponseDataAttributesRulesetsItems.rules)
        && Objects.equals(
            this.shortDescription,
            getMultipleRulesetsResponseDataAttributesRulesetsItems.shortDescription)
        && Objects.equals(
            this.additionalProperties,
            getMultipleRulesetsResponseDataAttributesRulesetsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, description, name, rules, shortDescription, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMultipleRulesetsResponseDataAttributesRulesetsItems {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
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
