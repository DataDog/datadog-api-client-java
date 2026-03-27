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
   * <p>Defines the configurable attributes of a routing rule, such as actions, query, time restriction, and urgency.</p>
 */
@JsonPropertyOrder({
  RoutingRuleAttributes.JSON_PROPERTY_ACTIONS,
  RoutingRuleAttributes.JSON_PROPERTY_QUERY,
  RoutingRuleAttributes.JSON_PROPERTY_TIME_RESTRICTION,
  RoutingRuleAttributes.JSON_PROPERTY_URGENCY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RoutingRuleAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private List<RoutingRuleAction> actions = null;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TIME_RESTRICTION = "time_restriction";
  private TimeRestrictions timeRestriction;

  public static final String JSON_PROPERTY_URGENCY = "urgency";
  private Urgency urgency;

  public RoutingRuleAttributes actions(List<RoutingRuleAction> actions) {
    this.actions = actions;
    for (RoutingRuleAction item : actions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public RoutingRuleAttributes addActionsItem(RoutingRuleAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    this.unparsed |= actionsItem.unparsed;
    return this;
  }

  /**
   * <p>Specifies the list of actions to perform when the routing rule matches.</p>
   * @return actions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<RoutingRuleAction> getActions() {
        return actions;
      }
  public void setActions(List<RoutingRuleAction> actions) {
    this.actions = actions;
  }
  public RoutingRuleAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Defines the query or condition that triggers this routing rule.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public RoutingRuleAttributes timeRestriction(TimeRestrictions timeRestriction) {
    this.timeRestriction = timeRestriction;
    this.unparsed |= timeRestriction.unparsed;
    return this;
  }

  /**
   * <p>Holds time zone information and a list of time restrictions for a routing rule.</p>
   * @return timeRestriction
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME_RESTRICTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TimeRestrictions getTimeRestriction() {
        return timeRestriction;
      }
  public void setTimeRestriction(TimeRestrictions timeRestriction) {
    this.timeRestriction = timeRestriction;
  }
  public RoutingRuleAttributes urgency(Urgency urgency) {
    this.urgency = urgency;
    this.unparsed |= !urgency.isValid();
    return this;
  }

  /**
   * <p>Specifies the level of urgency for a routing rule (low, high, or dynamic).</p>
   * @return urgency
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_URGENCY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Urgency getUrgency() {
        return urgency;
      }
  public void setUrgency(Urgency urgency) {
    if (!urgency.isValid()) {
        this.unparsed = true;
    }
    this.urgency = urgency;
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
   * @return RoutingRuleAttributes
   */
  @JsonAnySetter
  public RoutingRuleAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this RoutingRuleAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingRuleAttributes routingRuleAttributes = (RoutingRuleAttributes) o;
    return Objects.equals(this.actions, routingRuleAttributes.actions) && Objects.equals(this.query, routingRuleAttributes.query) && Objects.equals(this.timeRestriction, routingRuleAttributes.timeRestriction) && Objects.equals(this.urgency, routingRuleAttributes.urgency) && Objects.equals(this.additionalProperties, routingRuleAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(actions,query,timeRestriction,urgency, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingRuleAttributes {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    timeRestriction: ").append(toIndentedString(timeRestriction)).append("\n");
    sb.append("    urgency: ").append(toIndentedString(urgency)).append("\n");
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
