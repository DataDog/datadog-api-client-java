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
   * <p>Alert event attributes.</p>
 */
@JsonPropertyOrder({
  AlertEventAttributes.JSON_PROPERTY_AGGREGATION_KEY,
  AlertEventAttributes.JSON_PROPERTY_CUSTOM,
  AlertEventAttributes.JSON_PROPERTY_EVT,
  AlertEventAttributes.JSON_PROPERTY_LINKS,
  AlertEventAttributes.JSON_PROPERTY_PRIORITY,
  AlertEventAttributes.JSON_PROPERTY_SERVICE,
  AlertEventAttributes.JSON_PROPERTY_STATUS,
  AlertEventAttributes.JSON_PROPERTY_TIMESTAMP,
  AlertEventAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AlertEventAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION_KEY = "aggregation_key";
  private String aggregationKey;

  public static final String JSON_PROPERTY_CUSTOM = "custom";
  private Object custom;

  public static final String JSON_PROPERTY_EVT = "evt";
  private EventSystemAttributes evt;

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<AlertEventAttributesLinksItem> links = null;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private AlertEventAttributesPriority priority;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AlertEventAttributesStatus status;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public AlertEventAttributes aggregationKey(String aggregationKey) {
    this.aggregationKey = aggregationKey;
    return this;
  }

  /**
   * <p>Aggregation key of the event.</p>
   * @return aggregationKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGGREGATION_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAggregationKey() {
        return aggregationKey;
      }
  public void setAggregationKey(String aggregationKey) {
    this.aggregationKey = aggregationKey;
  }
  public AlertEventAttributes custom(Object custom) {
    this.custom = custom;
    return this;
  }

  /**
   * <p>JSON object of custom attributes.</p>
   * @return custom
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getCustom() {
        return custom;
      }
  public void setCustom(Object custom) {
    this.custom = custom;
  }
  public AlertEventAttributes evt(EventSystemAttributes evt) {
    this.evt = evt;
    this.unparsed |= evt.unparsed;
    return this;
  }

  /**
   * <p>JSON object of event system attributes.</p>
   * @return evt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EventSystemAttributes getEvt() {
        return evt;
      }
  public void setEvt(EventSystemAttributes evt) {
    this.evt = evt;
  }
  public AlertEventAttributes links(List<AlertEventAttributesLinksItem> links) {
    this.links = links;
    for (AlertEventAttributesLinksItem item : links) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public AlertEventAttributes addLinksItem(AlertEventAttributesLinksItem linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    this.unparsed |= linksItem.unparsed;
    return this;
  }

  /**
   * <p>The links related to the event.</p>
   * @return links
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<AlertEventAttributesLinksItem> getLinks() {
        return links;
      }
  public void setLinks(List<AlertEventAttributesLinksItem> links) {
    this.links = links;
  }
  public AlertEventAttributes priority(AlertEventAttributesPriority priority) {
    this.priority = priority;
    this.unparsed |= !priority.isValid();
    return this;
  }

  /**
   * <p>The priority of the alert.</p>
   * @return priority
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRIORITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AlertEventAttributesPriority getPriority() {
        return priority;
      }
  public void setPriority(AlertEventAttributesPriority priority) {
    if (!priority.isValid()) {
        this.unparsed = true;
    }
    this.priority = priority;
  }
  public AlertEventAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>Service that triggered the event.</p>
   * @return service
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getService() {
        return service;
      }
  public void setService(String service) {
    this.service = service;
  }
  public AlertEventAttributes status(AlertEventAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>The status of the alert.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AlertEventAttributesStatus getStatus() {
        return status;
      }
  public void setStatus(AlertEventAttributesStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public AlertEventAttributes timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>POSIX timestamp of the event.</p>
   * @return timestamp
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMESTAMP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTimestamp() {
        return timestamp;
      }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }
  public AlertEventAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>The title of the event.</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
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
   * @return AlertEventAttributes
   */
  @JsonAnySetter
  public AlertEventAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this AlertEventAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertEventAttributes alertEventAttributes = (AlertEventAttributes) o;
    return Objects.equals(this.aggregationKey, alertEventAttributes.aggregationKey) && Objects.equals(this.custom, alertEventAttributes.custom) && Objects.equals(this.evt, alertEventAttributes.evt) && Objects.equals(this.links, alertEventAttributes.links) && Objects.equals(this.priority, alertEventAttributes.priority) && Objects.equals(this.service, alertEventAttributes.service) && Objects.equals(this.status, alertEventAttributes.status) && Objects.equals(this.timestamp, alertEventAttributes.timestamp) && Objects.equals(this.title, alertEventAttributes.title) && Objects.equals(this.additionalProperties, alertEventAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregationKey,custom,evt,links,priority,service,status,timestamp,title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertEventAttributes {\n");
    sb.append("    aggregationKey: ").append(toIndentedString(aggregationKey)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    evt: ").append(toIndentedString(evt)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
