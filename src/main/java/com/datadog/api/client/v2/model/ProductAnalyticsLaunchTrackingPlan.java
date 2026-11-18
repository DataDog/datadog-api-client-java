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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Tracking plan of a launch, listing the events and properties to instrument. */
@JsonPropertyOrder({
  ProductAnalyticsLaunchTrackingPlan.JSON_PROPERTY_CODE_ANALYSIS,
  ProductAnalyticsLaunchTrackingPlan.JSON_PROPERTY_CODEGEN_SESSION_ID,
  ProductAnalyticsLaunchTrackingPlan.JSON_PROPERTY_CREATED_AT,
  ProductAnalyticsLaunchTrackingPlan.JSON_PROPERTY_CREATED_BY,
  ProductAnalyticsLaunchTrackingPlan.JSON_PROPERTY_EVENTS,
  ProductAnalyticsLaunchTrackingPlan.JSON_PROPERTY_ID,
  ProductAnalyticsLaunchTrackingPlan.JSON_PROPERTY_JIRA_TICKET_ID,
  ProductAnalyticsLaunchTrackingPlan.JSON_PROPERTY_PR_LINK,
  ProductAnalyticsLaunchTrackingPlan.JSON_PROPERTY_PROPERTIES,
  ProductAnalyticsLaunchTrackingPlan.JSON_PROPERTY_UPDATED_AT,
  ProductAnalyticsLaunchTrackingPlan.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsLaunchTrackingPlan {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE_ANALYSIS = "code_analysis";
  private ProductAnalyticsLaunchCodeAnalysis codeAnalysis;

  public static final String JSON_PROPERTY_CODEGEN_SESSION_ID = "codegen_session_id";
  private String codegenSessionId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<ProductAnalyticsLaunchEvent> events = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_JIRA_TICKET_ID = "jira_ticket_id";
  private String jiraTicketId;

  public static final String JSON_PROPERTY_PR_LINK = "pr_link";
  private String prLink;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private Map<String, ProductAnalyticsLaunchProperty> properties = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private JsonNullable<String> updatedBy = JsonNullable.<String>undefined();

  public ProductAnalyticsLaunchTrackingPlan() {}

  @JsonCreator
  public ProductAnalyticsLaunchTrackingPlan(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.id = id;
  }

  public ProductAnalyticsLaunchTrackingPlan codeAnalysis(
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

  public ProductAnalyticsLaunchTrackingPlan codegenSessionId(String codegenSessionId) {
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

  public ProductAnalyticsLaunchTrackingPlan createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time the tracking plan was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ProductAnalyticsLaunchTrackingPlan createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * UUID of the user who created the tracking plan.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public ProductAnalyticsLaunchTrackingPlan events(List<ProductAnalyticsLaunchEvent> events) {
    this.events = events;
    if (events != null) {
      for (ProductAnalyticsLaunchEvent item : events) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsLaunchTrackingPlan addEventsItem(ProductAnalyticsLaunchEvent eventsItem) {
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

  public ProductAnalyticsLaunchTrackingPlan id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the tracking plan.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductAnalyticsLaunchTrackingPlan jiraTicketId(String jiraTicketId) {
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

  public ProductAnalyticsLaunchTrackingPlan prLink(String prLink) {
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

  public ProductAnalyticsLaunchTrackingPlan properties(
      Map<String, ProductAnalyticsLaunchProperty> properties) {
    this.properties = properties;
    return this;
  }

  public ProductAnalyticsLaunchTrackingPlan putPropertiesItem(
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

  public ProductAnalyticsLaunchTrackingPlan updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = JsonNullable.<OffsetDateTime>of(updatedAt);
    return this;
  }

  /**
   * Time the tracking plan was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getUpdatedAt() {
    return updatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getUpdatedAt_JsonNullable() {
    return updatedAt;
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  public void setUpdatedAt_JsonNullable(JsonNullable<OffsetDateTime> updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = JsonNullable.<OffsetDateTime>of(updatedAt);
  }

  public ProductAnalyticsLaunchTrackingPlan updatedBy(String updatedBy) {
    this.updatedBy = JsonNullable.<String>of(updatedBy);
    return this;
  }

  /**
   * UUID of the user who last updated the tracking plan.
   *
   * @return updatedBy
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getUpdatedBy() {
    return updatedBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUpdatedBy_JsonNullable() {
    return updatedBy;
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  public void setUpdatedBy_JsonNullable(JsonNullable<String> updatedBy) {
    this.updatedBy = updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = JsonNullable.<String>of(updatedBy);
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
   * @return ProductAnalyticsLaunchTrackingPlan
   */
  @JsonAnySetter
  public ProductAnalyticsLaunchTrackingPlan putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsLaunchTrackingPlan object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsLaunchTrackingPlan productAnalyticsLaunchTrackingPlan =
        (ProductAnalyticsLaunchTrackingPlan) o;
    return Objects.equals(this.codeAnalysis, productAnalyticsLaunchTrackingPlan.codeAnalysis)
        && Objects.equals(
            this.codegenSessionId, productAnalyticsLaunchTrackingPlan.codegenSessionId)
        && Objects.equals(this.createdAt, productAnalyticsLaunchTrackingPlan.createdAt)
        && Objects.equals(this.createdBy, productAnalyticsLaunchTrackingPlan.createdBy)
        && Objects.equals(this.events, productAnalyticsLaunchTrackingPlan.events)
        && Objects.equals(this.id, productAnalyticsLaunchTrackingPlan.id)
        && Objects.equals(this.jiraTicketId, productAnalyticsLaunchTrackingPlan.jiraTicketId)
        && Objects.equals(this.prLink, productAnalyticsLaunchTrackingPlan.prLink)
        && Objects.equals(this.properties, productAnalyticsLaunchTrackingPlan.properties)
        && Objects.equals(this.updatedAt, productAnalyticsLaunchTrackingPlan.updatedAt)
        && Objects.equals(this.updatedBy, productAnalyticsLaunchTrackingPlan.updatedBy)
        && Objects.equals(
            this.additionalProperties, productAnalyticsLaunchTrackingPlan.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        codeAnalysis,
        codegenSessionId,
        createdAt,
        createdBy,
        events,
        id,
        jiraTicketId,
        prLink,
        properties,
        updatedAt,
        updatedBy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsLaunchTrackingPlan {\n");
    sb.append("    codeAnalysis: ").append(toIndentedString(codeAnalysis)).append("\n");
    sb.append("    codegenSessionId: ").append(toIndentedString(codegenSessionId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jiraTicketId: ").append(toIndentedString(jiraTicketId)).append("\n");
    sb.append("    prLink: ").append(toIndentedString(prLink)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
