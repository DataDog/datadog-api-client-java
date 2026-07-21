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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of an AI-generated incident postmortem. */
@JsonPropertyOrder({
  IncidentAIPostmortemDataAttributesResponse.JSON_PROPERTY_ACTION_ITEMS,
  IncidentAIPostmortemDataAttributesResponse.JSON_PROPERTY_CUSTOMER_IMPACT,
  IncidentAIPostmortemDataAttributesResponse.JSON_PROPERTY_EXECUTIVE_SUMMARY,
  IncidentAIPostmortemDataAttributesResponse.JSON_PROPERTY_KEY_TIMELINE,
  IncidentAIPostmortemDataAttributesResponse.JSON_PROPERTY_LESSONS_LEARNED,
  IncidentAIPostmortemDataAttributesResponse.JSON_PROPERTY_SYSTEM_OVERVIEW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentAIPostmortemDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION_ITEMS = "action_items";
  private String actionItems;

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT = "customer_impact";
  private String customerImpact;

  public static final String JSON_PROPERTY_EXECUTIVE_SUMMARY = "executive_summary";
  private String executiveSummary;

  public static final String JSON_PROPERTY_KEY_TIMELINE = "key_timeline";
  private String keyTimeline;

  public static final String JSON_PROPERTY_LESSONS_LEARNED = "lessons_learned";
  private String lessonsLearned;

  public static final String JSON_PROPERTY_SYSTEM_OVERVIEW = "system_overview";
  private String systemOverview;

  public IncidentAIPostmortemDataAttributesResponse actionItems(String actionItems) {
    this.actionItems = actionItems;
    return this;
  }

  /**
   * Action items to prevent recurrence.
   *
   * @return actionItems
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getActionItems() {
    return actionItems;
  }

  public void setActionItems(String actionItems) {
    this.actionItems = actionItems;
  }

  public IncidentAIPostmortemDataAttributesResponse customerImpact(String customerImpact) {
    this.customerImpact = customerImpact;
    return this;
  }

  /**
   * The impact of the incident on customers.
   *
   * @return customerImpact
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerImpact() {
    return customerImpact;
  }

  public void setCustomerImpact(String customerImpact) {
    this.customerImpact = customerImpact;
  }

  public IncidentAIPostmortemDataAttributesResponse executiveSummary(String executiveSummary) {
    this.executiveSummary = executiveSummary;
    return this;
  }

  /**
   * An executive summary of the incident.
   *
   * @return executiveSummary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTIVE_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExecutiveSummary() {
    return executiveSummary;
  }

  public void setExecutiveSummary(String executiveSummary) {
    this.executiveSummary = executiveSummary;
  }

  public IncidentAIPostmortemDataAttributesResponse keyTimeline(String keyTimeline) {
    this.keyTimeline = keyTimeline;
    return this;
  }

  /**
   * Key timeline events during the incident.
   *
   * @return keyTimeline
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY_TIMELINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKeyTimeline() {
    return keyTimeline;
  }

  public void setKeyTimeline(String keyTimeline) {
    this.keyTimeline = keyTimeline;
  }

  public IncidentAIPostmortemDataAttributesResponse lessonsLearned(String lessonsLearned) {
    this.lessonsLearned = lessonsLearned;
    return this;
  }

  /**
   * Lessons learned from the incident.
   *
   * @return lessonsLearned
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LESSONS_LEARNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLessonsLearned() {
    return lessonsLearned;
  }

  public void setLessonsLearned(String lessonsLearned) {
    this.lessonsLearned = lessonsLearned;
  }

  public IncidentAIPostmortemDataAttributesResponse systemOverview(String systemOverview) {
    this.systemOverview = systemOverview;
    return this;
  }

  /**
   * An overview of the affected systems.
   *
   * @return systemOverview
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_OVERVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSystemOverview() {
    return systemOverview;
  }

  public void setSystemOverview(String systemOverview) {
    this.systemOverview = systemOverview;
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
   * @return IncidentAIPostmortemDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentAIPostmortemDataAttributesResponse putAdditionalProperty(
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

  /** Return true if this IncidentAIPostmortemDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentAIPostmortemDataAttributesResponse incidentAiPostmortemDataAttributesResponse =
        (IncidentAIPostmortemDataAttributesResponse) o;
    return Objects.equals(this.actionItems, incidentAiPostmortemDataAttributesResponse.actionItems)
        && Objects.equals(
            this.customerImpact, incidentAiPostmortemDataAttributesResponse.customerImpact)
        && Objects.equals(
            this.executiveSummary, incidentAiPostmortemDataAttributesResponse.executiveSummary)
        && Objects.equals(this.keyTimeline, incidentAiPostmortemDataAttributesResponse.keyTimeline)
        && Objects.equals(
            this.lessonsLearned, incidentAiPostmortemDataAttributesResponse.lessonsLearned)
        && Objects.equals(
            this.systemOverview, incidentAiPostmortemDataAttributesResponse.systemOverview)
        && Objects.equals(
            this.additionalProperties,
            incidentAiPostmortemDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionItems,
        customerImpact,
        executiveSummary,
        keyTimeline,
        lessonsLearned,
        systemOverview,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentAIPostmortemDataAttributesResponse {\n");
    sb.append("    actionItems: ").append(toIndentedString(actionItems)).append("\n");
    sb.append("    customerImpact: ").append(toIndentedString(customerImpact)).append("\n");
    sb.append("    executiveSummary: ").append(toIndentedString(executiveSummary)).append("\n");
    sb.append("    keyTimeline: ").append(toIndentedString(keyTimeline)).append("\n");
    sb.append("    lessonsLearned: ").append(toIndentedString(lessonsLearned)).append("\n");
    sb.append("    systemOverview: ").append(toIndentedString(systemOverview)).append("\n");
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
