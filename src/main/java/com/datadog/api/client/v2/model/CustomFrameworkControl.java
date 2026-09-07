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

/** Framework Control. */
@JsonPropertyOrder({
  CustomFrameworkControl.JSON_PROPERTY_NAME,
  CustomFrameworkControl.JSON_PROPERTY_RULES_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomFrameworkControl {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RULES_ID = "rules_id";
  private List<String> rulesId = new ArrayList<>();

  public CustomFrameworkControl() {}

  @JsonCreator
  public CustomFrameworkControl(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULES_ID) List<String> rulesId) {
    this.name = name;
    this.rulesId = rulesId;
  }

  public CustomFrameworkControl name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Control Name.
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

  public CustomFrameworkControl rulesId(List<String> rulesId) {
    this.rulesId = rulesId;
    return this;
  }

  public CustomFrameworkControl addRulesIdItem(String rulesIdItem) {
    this.rulesId.add(rulesIdItem);
    return this;
  }

  /**
   * Rule IDs.
   *
   * @return rulesId
   */
  @JsonProperty(JSON_PROPERTY_RULES_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRulesId() {
    return rulesId;
  }

  public void setRulesId(List<String> rulesId) {
    this.rulesId = rulesId;
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
   * @return CustomFrameworkControl
   */
  @JsonAnySetter
  public CustomFrameworkControl putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomFrameworkControl object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFrameworkControl customFrameworkControl = (CustomFrameworkControl) o;
    return Objects.equals(this.name, customFrameworkControl.name)
        && Objects.equals(this.rulesId, customFrameworkControl.rulesId)
        && Objects.equals(this.additionalProperties, customFrameworkControl.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rulesId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFrameworkControl {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rulesId: ").append(toIndentedString(rulesId)).append("\n");
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
