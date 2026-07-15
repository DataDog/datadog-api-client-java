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

/**
 * Root object representing a schedule's on-call responders, grouped by position (previous, current,
 * next), for a given point in time.
 */
@JsonPropertyOrder({
  ScheduleOnCallResponders.JSON_PROPERTY_DATA,
  ScheduleOnCallResponders.JSON_PROPERTY_INCLUDED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScheduleOnCallResponders {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private ScheduleOnCallRespondersData data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<ScheduleOnCallRespondersIncluded> included = null;

  public ScheduleOnCallResponders data(ScheduleOnCallRespondersData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * The main data object representing a schedule's on-call responders lookup, including
   * relationships and metadata.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScheduleOnCallRespondersData getData() {
    return data;
  }

  public void setData(ScheduleOnCallRespondersData data) {
    this.data = data;
  }

  public ScheduleOnCallResponders included(List<ScheduleOnCallRespondersIncluded> included) {
    this.included = included;
    for (ScheduleOnCallRespondersIncluded item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScheduleOnCallResponders addIncludedItem(ScheduleOnCallRespondersIncluded includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Related resources referenced in the responder groups' relationships, such as shifts, schedules,
   * and users.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ScheduleOnCallRespondersIncluded> getIncluded() {
    return included;
  }

  public void setIncluded(List<ScheduleOnCallRespondersIncluded> included) {
    this.included = included;
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
   * @return ScheduleOnCallResponders
   */
  @JsonAnySetter
  public ScheduleOnCallResponders putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScheduleOnCallResponders object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleOnCallResponders scheduleOnCallResponders = (ScheduleOnCallResponders) o;
    return Objects.equals(this.data, scheduleOnCallResponders.data)
        && Objects.equals(this.included, scheduleOnCallResponders.included)
        && Objects.equals(this.additionalProperties, scheduleOnCallResponders.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleOnCallResponders {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
