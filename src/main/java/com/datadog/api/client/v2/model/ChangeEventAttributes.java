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
   * <p>Change event attributes.</p>
 */
@JsonPropertyOrder({
  ChangeEventAttributes.JSON_PROPERTY_AGGREGATION_KEY,
  ChangeEventAttributes.JSON_PROPERTY_AUTHOR,
  ChangeEventAttributes.JSON_PROPERTY_CHANGE_METADATA,
  ChangeEventAttributes.JSON_PROPERTY_CHANGED_RESOURCE,
  ChangeEventAttributes.JSON_PROPERTY_EVT,
  ChangeEventAttributes.JSON_PROPERTY_IMPACTED_RESOURCES,
  ChangeEventAttributes.JSON_PROPERTY_NEW_VALUE,
  ChangeEventAttributes.JSON_PROPERTY_PREV_VALUE,
  ChangeEventAttributes.JSON_PROPERTY_SERVICE,
  ChangeEventAttributes.JSON_PROPERTY_TIMESTAMP,
  ChangeEventAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeEventAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION_KEY = "aggregation_key";
  private String aggregationKey;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private ChangeEventAttributesAuthor author;

  public static final String JSON_PROPERTY_CHANGE_METADATA = "change_metadata";
  private Object changeMetadata;

  public static final String JSON_PROPERTY_CHANGED_RESOURCE = "changed_resource";
  private ChangeEventAttributesChangedResource changedResource;

  public static final String JSON_PROPERTY_EVT = "evt";
  private EventSystemAttributes evt;

  public static final String JSON_PROPERTY_IMPACTED_RESOURCES = "impacted_resources";
  private List<ChangeEventAttributesImpactedResourcesItem> impactedResources = null;

  public static final String JSON_PROPERTY_NEW_VALUE = "new_value";
  private Object newValue;

  public static final String JSON_PROPERTY_PREV_VALUE = "prev_value";
  private Object prevValue;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ChangeEventAttributes aggregationKey(String aggregationKey) {
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
  public ChangeEventAttributes author(ChangeEventAttributesAuthor author) {
    this.author = author;
    this.unparsed |= author.unparsed;
    return this;
  }

  /**
   * <p>The entity that made the change.</p>
   * @return author
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTHOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ChangeEventAttributesAuthor getAuthor() {
        return author;
      }
  public void setAuthor(ChangeEventAttributesAuthor author) {
    this.author = author;
  }
  public ChangeEventAttributes changeMetadata(Object changeMetadata) {
    this.changeMetadata = changeMetadata;
    return this;
  }

  /**
   * <p>JSON object of change metadata.</p>
   * @return changeMetadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANGE_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getChangeMetadata() {
        return changeMetadata;
      }
  public void setChangeMetadata(Object changeMetadata) {
    this.changeMetadata = changeMetadata;
  }
  public ChangeEventAttributes changedResource(ChangeEventAttributesChangedResource changedResource) {
    this.changedResource = changedResource;
    this.unparsed |= changedResource.unparsed;
    return this;
  }

  /**
   * <p>A uniquely identified resource.</p>
   * @return changedResource
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANGED_RESOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ChangeEventAttributesChangedResource getChangedResource() {
        return changedResource;
      }
  public void setChangedResource(ChangeEventAttributesChangedResource changedResource) {
    this.changedResource = changedResource;
  }
  public ChangeEventAttributes evt(EventSystemAttributes evt) {
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
  public ChangeEventAttributes impactedResources(List<ChangeEventAttributesImpactedResourcesItem> impactedResources) {
    this.impactedResources = impactedResources;
    for (ChangeEventAttributesImpactedResourcesItem item : impactedResources) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ChangeEventAttributes addImpactedResourcesItem(ChangeEventAttributesImpactedResourcesItem impactedResourcesItem) {
    if (this.impactedResources == null) {
      this.impactedResources = new ArrayList<>();
    }
    this.impactedResources.add(impactedResourcesItem);
    this.unparsed |= impactedResourcesItem.unparsed;
    return this;
  }

  /**
   * <p>A list of resources impacted by this change.</p>
   * @return impactedResources
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IMPACTED_RESOURCES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ChangeEventAttributesImpactedResourcesItem> getImpactedResources() {
        return impactedResources;
      }
  public void setImpactedResources(List<ChangeEventAttributesImpactedResourcesItem> impactedResources) {
    this.impactedResources = impactedResources;
  }
  public ChangeEventAttributes newValue(Object newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * <p>The new state of the changed resource.</p>
   * @return newValue
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NEW_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getNewValue() {
        return newValue;
      }
  public void setNewValue(Object newValue) {
    this.newValue = newValue;
  }
  public ChangeEventAttributes prevValue(Object prevValue) {
    this.prevValue = prevValue;
    return this;
  }

  /**
   * <p>The previous state of the changed resource.</p>
   * @return prevValue
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PREV_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getPrevValue() {
        return prevValue;
      }
  public void setPrevValue(Object prevValue) {
    this.prevValue = prevValue;
  }
  public ChangeEventAttributes service(String service) {
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
  public ChangeEventAttributes timestamp(Long timestamp) {
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
  public ChangeEventAttributes title(String title) {
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
   * @return ChangeEventAttributes
   */
  @JsonAnySetter
  public ChangeEventAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ChangeEventAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeEventAttributes changeEventAttributes = (ChangeEventAttributes) o;
    return Objects.equals(this.aggregationKey, changeEventAttributes.aggregationKey) && Objects.equals(this.author, changeEventAttributes.author) && Objects.equals(this.changeMetadata, changeEventAttributes.changeMetadata) && Objects.equals(this.changedResource, changeEventAttributes.changedResource) && Objects.equals(this.evt, changeEventAttributes.evt) && Objects.equals(this.impactedResources, changeEventAttributes.impactedResources) && Objects.equals(this.newValue, changeEventAttributes.newValue) && Objects.equals(this.prevValue, changeEventAttributes.prevValue) && Objects.equals(this.service, changeEventAttributes.service) && Objects.equals(this.timestamp, changeEventAttributes.timestamp) && Objects.equals(this.title, changeEventAttributes.title) && Objects.equals(this.additionalProperties, changeEventAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregationKey,author,changeMetadata,changedResource,evt,impactedResources,newValue,prevValue,service,timestamp,title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeEventAttributes {\n");
    sb.append("    aggregationKey: ").append(toIndentedString(aggregationKey)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    changeMetadata: ").append(toIndentedString(changeMetadata)).append("\n");
    sb.append("    changedResource: ").append(toIndentedString(changedResource)).append("\n");
    sb.append("    evt: ").append(toIndentedString(evt)).append("\n");
    sb.append("    impactedResources: ").append(toIndentedString(impactedResources)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    prevValue: ").append(toIndentedString(prevValue)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
