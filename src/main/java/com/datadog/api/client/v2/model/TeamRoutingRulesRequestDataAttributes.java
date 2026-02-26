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
   * <p>Represents the attributes of a request to update or create team routing rules.</p>
 */
@JsonPropertyOrder({
  TeamRoutingRulesRequestDataAttributes.JSON_PROPERTY_RULES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamRoutingRulesRequestDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_RULES = "rules";
  private List<TeamRoutingRulesRequestRule> rules = null;

  public TeamRoutingRulesRequestDataAttributes rules(List<TeamRoutingRulesRequestRule> rules) {
    this.rules = rules;
    for (TeamRoutingRulesRequestRule item : rules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public TeamRoutingRulesRequestDataAttributes addRulesItem(TeamRoutingRulesRequestRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    this.unparsed |= rulesItem.unparsed;
    return this;
  }

  /**
   * <p>A list of routing rule items that define how incoming pages should be handled.</p>
   * @return rules
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RULES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<TeamRoutingRulesRequestRule> getRules() {
        return rules;
      }
  public void setRules(List<TeamRoutingRulesRequestRule> rules) {
    this.rules = rules;
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
   * @return TeamRoutingRulesRequestDataAttributes
   */
  @JsonAnySetter
  public TeamRoutingRulesRequestDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this TeamRoutingRulesRequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamRoutingRulesRequestDataAttributes teamRoutingRulesRequestDataAttributes = (TeamRoutingRulesRequestDataAttributes) o;
    return Objects.equals(this.rules, teamRoutingRulesRequestDataAttributes.rules) && Objects.equals(this.additionalProperties, teamRoutingRulesRequestDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(rules, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRoutingRulesRequestDataAttributes {\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
