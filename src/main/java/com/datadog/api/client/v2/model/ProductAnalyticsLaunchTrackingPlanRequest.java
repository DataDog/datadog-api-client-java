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

/** Tracking plan of a launch, listing the events and properties to instrument. */
@JsonPropertyOrder({
  ProductAnalyticsLaunchTrackingPlanRequest.JSON_PROPERTY_CODE_ANALYSIS,
  ProductAnalyticsLaunchTrackingPlanRequest.JSON_PROPERTY_CODEGEN_SESSION_ID,
  ProductAnalyticsLaunchTrackingPlanRequest.JSON_PROPERTY_EVENTS,
  ProductAnalyticsLaunchTrackingPlanRequest.JSON_PROPERTY_JIRA_TICKET_ID,
  ProductAnalyticsLaunchTrackingPlanRequest.JSON_PROPERTY_PR_LINK,
  ProductAnalyticsLaunchTrackingPlanRequest.JSON_PROPERTY_PROPERTIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsLaunchTrackingPlanRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE_ANALYSIS = "code_analysis";
  private ProductAnalyticsLaunchCodeAnalysis codeAnalysis;

  public static final String JSON_PROPERTY_CODEGEN_SESSION_ID = "codegen_session_id";
  private String codegenSessionId;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<ProductAnalyticsLaunchEvent> events = null;

  public static final String JSON_PROPERTY_JIRA_TICKET_ID = "jira_ticket_id";
  private String jiraTicketId;

  public static final String JSON_PROPERTY_PR_LINK = "pr_link";
  private String prLink;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private Map<String, ProductAnalyticsLaunchProperty> properties = null;

  public ProductAnalyticsLaunchTrackingPlanRequest codeAnalysis(
      ProductAnalyticsLaunchCodeAnalysis codeAnalysis) {
    this.codeAnalysis = codeAnalysis;
    this.unparsed |= codeAnalysis.unparsed;
    return this;
  }

  /**
   * Latest inspection of the repository for the tracking plan instrumentation. A new analysis
   * replaces the stored one. Events and properties that it does not list are not verified.
   *
   * @return codeAnalysis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_ANALYSIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsLaunchCodeAnalysis getCodeAnalysis() {
    return codeAnalysis;
  }

  public void setCodeAnalysis(ProductAnalyticsLaunchCodeAnalysis codeAnalysis) {
    this.codeAnalysis = codeAnalysis;
    if (codeAnalysis != null) {
      this.unparsed |= codeAnalysis.unparsed;
    }
  }

  public ProductAnalyticsLaunchTrackingPlanRequest codegenSessionId(String codegenSessionId) {
    this.codegenSessionId = codegenSessionId;
    return this;
  }

  /**
   * ID of the code generation session that implemented the plan.
   *
   * @return codegenSessionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODEGEN_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCodegenSessionId() {
    return codegenSessionId;
  }

  public void setCodegenSessionId(String codegenSessionId) {
    this.codegenSessionId = codegenSessionId;
  }

  public ProductAnalyticsLaunchTrackingPlanRequest events(
      List<ProductAnalyticsLaunchEvent> events) {
    this.events = events;
    if (events != null) {
      for (ProductAnalyticsLaunchEvent item : events) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsLaunchTrackingPlanRequest addEventsItem(
      ProductAnalyticsLaunchEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    this.unparsed |= eventsItem.unparsed;
    return this;
  }

  /**
   * Events to instrument.
   *
   * @return events
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsLaunchEvent> getEvents() {
    return events;
  }

  public void setEvents(List<ProductAnalyticsLaunchEvent> events) {
    this.events = events;
    if (events != null) {
      for (ProductAnalyticsLaunchEvent item : events) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsLaunchTrackingPlanRequest jiraTicketId(String jiraTicketId) {
    this.jiraTicketId = jiraTicketId;
    return this;
  }

  /**
   * ID of the Jira ticket that tracks the instrumentation work.
   *
   * @return jiraTicketId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JIRA_TICKET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getJiraTicketId() {
    return jiraTicketId;
  }

  public void setJiraTicketId(String jiraTicketId) {
    this.jiraTicketId = jiraTicketId;
  }

  public ProductAnalyticsLaunchTrackingPlanRequest prLink(String prLink) {
    this.prLink = prLink;
    return this;
  }

  /**
   * Link to the pull request that implements the plan.
   *
   * @return prLink
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PR_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrLink() {
    return prLink;
  }

  public void setPrLink(String prLink) {
    this.prLink = prLink;
  }

  public ProductAnalyticsLaunchTrackingPlanRequest properties(
      Map<String, ProductAnalyticsLaunchProperty> properties) {
    this.properties = properties;
    return this;
  }

  public ProductAnalyticsLaunchTrackingPlanRequest putPropertiesItem(
      String key, ProductAnalyticsLaunchProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Event properties of the tracking plan, keyed by property ID.
   *
   * @return properties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, ProductAnalyticsLaunchProperty> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, ProductAnalyticsLaunchProperty> properties) {
    this.properties = properties;
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
   * @return ProductAnalyticsLaunchTrackingPlanRequest
   */
  @JsonAnySetter
  public ProductAnalyticsLaunchTrackingPlanRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsLaunchTrackingPlanRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsLaunchTrackingPlanRequest productAnalyticsLaunchTrackingPlanRequest =
        (ProductAnalyticsLaunchTrackingPlanRequest) o;
    return Objects.equals(this.codeAnalysis, productAnalyticsLaunchTrackingPlanRequest.codeAnalysis)
        && Objects.equals(
            this.codegenSessionId, productAnalyticsLaunchTrackingPlanRequest.codegenSessionId)
        && Objects.equals(this.events, productAnalyticsLaunchTrackingPlanRequest.events)
        && Objects.equals(this.jiraTicketId, productAnalyticsLaunchTrackingPlanRequest.jiraTicketId)
        && Objects.equals(this.prLink, productAnalyticsLaunchTrackingPlanRequest.prLink)
        && Objects.equals(this.properties, productAnalyticsLaunchTrackingPlanRequest.properties)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsLaunchTrackingPlanRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        codeAnalysis,
        codegenSessionId,
        events,
        jiraTicketId,
        prLink,
        properties,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsLaunchTrackingPlanRequest {\n");
    sb.append("    codeAnalysis: ").append(toIndentedString(codeAnalysis)).append("\n");
    sb.append("    codegenSessionId: ").append(toIndentedString(codegenSessionId)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    jiraTicketId: ").append(toIndentedString(jiraTicketId)).append("\n");
    sb.append("    prLink: ").append(toIndentedString(prLink)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
