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
  ChangeEventCustomAttributes.JSON_PROPERTY_AUTHOR,
  ChangeEventCustomAttributes.JSON_PROPERTY_CHANGE_METADATA,
  ChangeEventCustomAttributes.JSON_PROPERTY_CHANGED_RESOURCE,
  ChangeEventCustomAttributes.JSON_PROPERTY_IMPACTED_RESOURCES,
  ChangeEventCustomAttributes.JSON_PROPERTY_NEW_VALUE,
  ChangeEventCustomAttributes.JSON_PROPERTY_PREV_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeEventCustomAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private ChangeEventCustomAttributesAuthor author;

  public static final String JSON_PROPERTY_CHANGE_METADATA = "change_metadata";
  private Map<String, Object> changeMetadata = null;

  public static final String JSON_PROPERTY_CHANGED_RESOURCE = "changed_resource";
  private ChangeEventCustomAttributesChangedResource changedResource;

  public static final String JSON_PROPERTY_IMPACTED_RESOURCES = "impacted_resources";
  private List<ChangeEventCustomAttributesImpactedResourcesItems> impactedResources = null;

  public static final String JSON_PROPERTY_NEW_VALUE = "new_value";
  private Map<String, Object> newValue = null;

  public static final String JSON_PROPERTY_PREV_VALUE = "prev_value";
  private Map<String, Object> prevValue = null;

  public ChangeEventCustomAttributes() {}

  @JsonCreator
  public ChangeEventCustomAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CHANGED_RESOURCE)ChangeEventCustomAttributesChangedResource changedResource) {
        this.changedResource = changedResource;
        this.unparsed |= changedResource.unparsed;
  }
  public ChangeEventCustomAttributes author(ChangeEventCustomAttributesAuthor author) {
    this.author = author;
    this.unparsed |= author.unparsed;
    return this;
  }

  /**
   * <p>The entity that made the change. Optional, if provided it must include <code>type</code> and <code>name</code>.</p>
   * @return author
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTHOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ChangeEventCustomAttributesAuthor getAuthor() {
        return author;
      }
  public void setAuthor(ChangeEventCustomAttributesAuthor author) {
    this.author = author;
  }
  public ChangeEventCustomAttributes changeMetadata(Map<String, Object> changeMetadata) {
    this.changeMetadata = changeMetadata;
    return this;
  }
  public ChangeEventCustomAttributes putChangeMetadataItem(String key, Object changeMetadataItem) {
    if (this.changeMetadata == null) {
      this.changeMetadata = new HashMap<>();
    }
    this.changeMetadata.put(key, changeMetadataItem);
    return this;
  }

  /**
   * <p>Free form JSON object with information related to the <code>change</code> event. Supports up to 100 properties per object and a maximum nesting depth of 10 levels.</p>
   * @return changeMetadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANGE_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getChangeMetadata() {
        return changeMetadata;
      }
  public void setChangeMetadata(Map<String, Object> changeMetadata) {
    this.changeMetadata = changeMetadata;
  }
  public ChangeEventCustomAttributes changedResource(ChangeEventCustomAttributesChangedResource changedResource) {
    this.changedResource = changedResource;
    this.unparsed |= changedResource.unparsed;
    return this;
  }

  /**
   * <p>A uniquely identified resource.</p>
   * @return changedResource
  **/
      @JsonProperty(JSON_PROPERTY_CHANGED_RESOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ChangeEventCustomAttributesChangedResource getChangedResource() {
        return changedResource;
      }
  public void setChangedResource(ChangeEventCustomAttributesChangedResource changedResource) {
    this.changedResource = changedResource;
  }
  public ChangeEventCustomAttributes impactedResources(List<ChangeEventCustomAttributesImpactedResourcesItems> impactedResources) {
    this.impactedResources = impactedResources;
    for (ChangeEventCustomAttributesImpactedResourcesItems item : impactedResources) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ChangeEventCustomAttributes addImpactedResourcesItem(ChangeEventCustomAttributesImpactedResourcesItems impactedResourcesItem) {
    if (this.impactedResources == null) {
      this.impactedResources = new ArrayList<>();
    }
    this.impactedResources.add(impactedResourcesItem);
    this.unparsed |= impactedResourcesItem.unparsed;
    return this;
  }

  /**
   * <p>A list of resources impacted by this change. It is recommended to provide an impacted resource to display
   * the change event at the correct location. Only resources of type <code>service</code> are supported. Maximum of 100 impacted resources allowed.</p>
   * @return impactedResources
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IMPACTED_RESOURCES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ChangeEventCustomAttributesImpactedResourcesItems> getImpactedResources() {
        return impactedResources;
      }
  public void setImpactedResources(List<ChangeEventCustomAttributesImpactedResourcesItems> impactedResources) {
    this.impactedResources = impactedResources;
  }
  public ChangeEventCustomAttributes newValue(Map<String, Object> newValue) {
    this.newValue = newValue;
    return this;
  }
  public ChangeEventCustomAttributes putNewValueItem(String key, Object newValueItem) {
    if (this.newValue == null) {
      this.newValue = new HashMap<>();
    }
    this.newValue.put(key, newValueItem);
    return this;
  }

  /**
   * <p>Free form JSON object representing the new state of the changed resource.</p>
   * @return newValue
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NEW_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getNewValue() {
        return newValue;
      }
  public void setNewValue(Map<String, Object> newValue) {
    this.newValue = newValue;
  }
  public ChangeEventCustomAttributes prevValue(Map<String, Object> prevValue) {
    this.prevValue = prevValue;
    return this;
  }
  public ChangeEventCustomAttributes putPrevValueItem(String key, Object prevValueItem) {
    if (this.prevValue == null) {
      this.prevValue = new HashMap<>();
    }
    this.prevValue.put(key, prevValueItem);
    return this;
  }

  /**
   * <p>Free form JSON object representing the previous state of the changed resource.</p>
   * @return prevValue
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PREV_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getPrevValue() {
        return prevValue;
      }
  public void setPrevValue(Map<String, Object> prevValue) {
    this.prevValue = prevValue;
  }

  /**
   * Return true if this ChangeEventCustomAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeEventCustomAttributes changeEventCustomAttributes = (ChangeEventCustomAttributes) o;
    return Objects.equals(this.author, changeEventCustomAttributes.author) && Objects.equals(this.changeMetadata, changeEventCustomAttributes.changeMetadata) && Objects.equals(this.changedResource, changeEventCustomAttributes.changedResource) && Objects.equals(this.impactedResources, changeEventCustomAttributes.impactedResources) && Objects.equals(this.newValue, changeEventCustomAttributes.newValue) && Objects.equals(this.prevValue, changeEventCustomAttributes.prevValue);
  }


  @Override
  public int hashCode() {
    return Objects.hash(author,changeMetadata,changedResource,impactedResources,newValue,prevValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeEventCustomAttributes {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    changeMetadata: ").append(toIndentedString(changeMetadata)).append("\n");
    sb.append("    changedResource: ").append(toIndentedString(changedResource)).append("\n");
    sb.append("    impactedResources: ").append(toIndentedString(impactedResources)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    prevValue: ").append(toIndentedString(prevValue)).append("\n");
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
