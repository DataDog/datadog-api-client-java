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

/** On-Call integration settings */
@JsonPropertyOrder({
  IntegrationOnCall.JSON_PROPERTY_AUTO_ASSIGN_ON_CALL,
  IntegrationOnCall.JSON_PROPERTY_ENABLED,
  IntegrationOnCall.JSON_PROPERTY_ESCALATION_QUERIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationOnCall {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_ASSIGN_ON_CALL = "auto_assign_on_call";
  private Boolean autoAssignOnCall;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ESCALATION_QUERIES = "escalation_queries";
  private List<IntegrationOnCallEscalationQueriesItems> escalationQueries = null;

  public IntegrationOnCall autoAssignOnCall(Boolean autoAssignOnCall) {
    this.autoAssignOnCall = autoAssignOnCall;
    return this;
  }

  /**
   * Whether to auto-assign on-call
   *
   * @return autoAssignOnCall
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_ASSIGN_ON_CALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutoAssignOnCall() {
    return autoAssignOnCall;
  }

  public void setAutoAssignOnCall(Boolean autoAssignOnCall) {
    this.autoAssignOnCall = autoAssignOnCall;
  }

  public IntegrationOnCall enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether On-Call integration is enabled
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public IntegrationOnCall escalationQueries(
      List<IntegrationOnCallEscalationQueriesItems> escalationQueries) {
    this.escalationQueries = escalationQueries;
    for (IntegrationOnCallEscalationQueriesItems item : escalationQueries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IntegrationOnCall addEscalationQueriesItem(
      IntegrationOnCallEscalationQueriesItems escalationQueriesItem) {
    if (this.escalationQueries == null) {
      this.escalationQueries = new ArrayList<>();
    }
    this.escalationQueries.add(escalationQueriesItem);
    this.unparsed |= escalationQueriesItem.unparsed;
    return this;
  }

  /**
   * GetescalationQueries
   *
   * @return escalationQueries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESCALATION_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IntegrationOnCallEscalationQueriesItems> getEscalationQueries() {
    return escalationQueries;
  }

  public void setEscalationQueries(
      List<IntegrationOnCallEscalationQueriesItems> escalationQueries) {
    this.escalationQueries = escalationQueries;
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
   * @return IntegrationOnCall
   */
  @JsonAnySetter
  public IntegrationOnCall putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IntegrationOnCall object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationOnCall integrationOnCall = (IntegrationOnCall) o;
    return Objects.equals(this.autoAssignOnCall, integrationOnCall.autoAssignOnCall)
        && Objects.equals(this.enabled, integrationOnCall.enabled)
        && Objects.equals(this.escalationQueries, integrationOnCall.escalationQueries)
        && Objects.equals(this.additionalProperties, integrationOnCall.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAssignOnCall, enabled, escalationQueries, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationOnCall {\n");
    sb.append("    autoAssignOnCall: ").append(toIndentedString(autoAssignOnCall)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    escalationQueries: ").append(toIndentedString(escalationQueries)).append("\n");
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
