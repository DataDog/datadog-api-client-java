/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>The response containing attributes for specified custom reports.</p>
 */
@JsonPropertyOrder({
  UsageSpecifiedCustomReportsAttributes.JSON_PROPERTY_COMPUTED_ON,
  UsageSpecifiedCustomReportsAttributes.JSON_PROPERTY_END_DATE,
  UsageSpecifiedCustomReportsAttributes.JSON_PROPERTY_LOCATION,
  UsageSpecifiedCustomReportsAttributes.JSON_PROPERTY_SIZE,
  UsageSpecifiedCustomReportsAttributes.JSON_PROPERTY_START_DATE,
  UsageSpecifiedCustomReportsAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSpecifiedCustomReportsAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTED_ON = "computed_on";
  private String computedOn;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private String endDate;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private String startDate;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public UsageSpecifiedCustomReportsAttributes computedOn(String computedOn) {
    this.computedOn = computedOn;
    return this;
  }

  /**
   * <p>The date the specified custom report was computed.</p>
   * @return computedOn
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPUTED_ON)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getComputedOn() {
        return computedOn;
      }
  public void setComputedOn(String computedOn) {
    this.computedOn = computedOn;
  }
  public UsageSpecifiedCustomReportsAttributes endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <p>The ending date of specified custom report.</p>
   * @return endDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_END_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEndDate() {
        return endDate;
      }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }
  public UsageSpecifiedCustomReportsAttributes location(String location) {
    this.location = location;
    return this;
  }

  /**
   * <p>A downloadable file for the specified custom reporting file.</p>
   * @return location
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOCATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLocation() {
        return location;
      }
  public void setLocation(String location) {
    this.location = location;
  }
  public UsageSpecifiedCustomReportsAttributes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * <p>size</p>
   * @return size
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getSize() {
        return size;
      }
  public void setSize(Long size) {
    this.size = size;
  }
  public UsageSpecifiedCustomReportsAttributes startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <p>The starting date of specified custom report.</p>
   * @return startDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStartDate() {
        return startDate;
      }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }
  public UsageSpecifiedCustomReportsAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public UsageSpecifiedCustomReportsAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of tags to apply to specified custom reports.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return UsageSpecifiedCustomReportsAttributes
   */
  @JsonAnySetter
  public UsageSpecifiedCustomReportsAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this UsageSpecifiedCustomReportsAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSpecifiedCustomReportsAttributes usageSpecifiedCustomReportsAttributes = (UsageSpecifiedCustomReportsAttributes) o;
    return Objects.equals(this.computedOn, usageSpecifiedCustomReportsAttributes.computedOn) && Objects.equals(this.endDate, usageSpecifiedCustomReportsAttributes.endDate) && Objects.equals(this.location, usageSpecifiedCustomReportsAttributes.location) && Objects.equals(this.size, usageSpecifiedCustomReportsAttributes.size) && Objects.equals(this.startDate, usageSpecifiedCustomReportsAttributes.startDate) && Objects.equals(this.tags, usageSpecifiedCustomReportsAttributes.tags) && Objects.equals(this.additionalProperties, usageSpecifiedCustomReportsAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(computedOn,endDate,location,size,startDate,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSpecifiedCustomReportsAttributes {\n");
    sb.append("    computedOn: ").append(toIndentedString(computedOn)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
