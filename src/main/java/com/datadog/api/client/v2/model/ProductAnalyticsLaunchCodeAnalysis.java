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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Latest inspection of the repository for the tracking plan instrumentation. A new analysis
 * replaces the stored one. Events and properties that it does not list are not verified.
 */
@JsonPropertyOrder({
  ProductAnalyticsLaunchCodeAnalysis.JSON_PROPERTY_ANALYZED_AT,
  ProductAnalyticsLaunchCodeAnalysis.JSON_PROPERTY_EVENTS,
  ProductAnalyticsLaunchCodeAnalysis.JSON_PROPERTY_REVISION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsLaunchCodeAnalysis {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANALYZED_AT = "analyzed_at";
  private OffsetDateTime analyzedAt;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<ProductAnalyticsLaunchEventFinding> events = null;

  public static final String JSON_PROPERTY_REVISION = "revision";
  private String revision;

  /**
   * Time of the analysis. Set by the server.
   *
   * @return analyzedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANALYZED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getAnalyzedAt() {
    return analyzedAt;
  }

  public ProductAnalyticsLaunchCodeAnalysis events(
      List<ProductAnalyticsLaunchEventFinding> events) {
    this.events = events;
    if (events != null) {
      for (ProductAnalyticsLaunchEventFinding item : events) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsLaunchCodeAnalysis addEventsItem(
      ProductAnalyticsLaunchEventFinding eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    this.unparsed |= eventsItem.unparsed;
    return this;
  }

  /**
   * Results for the events of the tracking plan. List each event once.
   *
   * @return events
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsLaunchEventFinding> getEvents() {
    return events;
  }

  public void setEvents(List<ProductAnalyticsLaunchEventFinding> events) {
    this.events = events;
    if (events != null) {
      for (ProductAnalyticsLaunchEventFinding item : events) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsLaunchCodeAnalysis revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Code revision that was inspected, such as a commit SHA.
   *
   * @return revision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
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
   * @return ProductAnalyticsLaunchCodeAnalysis
   */
  @JsonAnySetter
  public ProductAnalyticsLaunchCodeAnalysis putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsLaunchCodeAnalysis object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsLaunchCodeAnalysis productAnalyticsLaunchCodeAnalysis =
        (ProductAnalyticsLaunchCodeAnalysis) o;
    return Objects.equals(this.analyzedAt, productAnalyticsLaunchCodeAnalysis.analyzedAt)
        && Objects.equals(this.events, productAnalyticsLaunchCodeAnalysis.events)
        && Objects.equals(this.revision, productAnalyticsLaunchCodeAnalysis.revision)
        && Objects.equals(
            this.additionalProperties, productAnalyticsLaunchCodeAnalysis.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyzedAt, events, revision, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsLaunchCodeAnalysis {\n");
    sb.append("    analyzedAt: ").append(toIndentedString(analyzedAt)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
