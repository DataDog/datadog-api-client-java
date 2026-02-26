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

/** JSON object for category-specific attributes. */
@JsonPropertyOrder({EventCreateResponseAttributesAttributes.JSON_PROPERTY_EVT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventCreateResponseAttributesAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVT = "evt";
  private EventCreateResponseAttributesAttributesEvt evt;

  public EventCreateResponseAttributesAttributes evt(
      EventCreateResponseAttributesAttributesEvt evt) {
    this.evt = evt;
    this.unparsed |= evt.unparsed;
    return this;
  }

  /**
   * JSON object of event system attributes.
   *
   * @return evt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EventCreateResponseAttributesAttributesEvt getEvt() {
    return evt;
  }

  public void setEvt(EventCreateResponseAttributesAttributesEvt evt) {
    this.evt = evt;
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
   * @return EventCreateResponseAttributesAttributes
   */
  @JsonAnySetter
  public EventCreateResponseAttributesAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EventCreateResponseAttributesAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCreateResponseAttributesAttributes eventCreateResponseAttributesAttributes =
        (EventCreateResponseAttributesAttributes) o;
    return Objects.equals(this.evt, eventCreateResponseAttributesAttributes.evt)
        && Objects.equals(
            this.additionalProperties,
            eventCreateResponseAttributesAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCreateResponseAttributesAttributes {\n");
    sb.append("    evt: ").append(toIndentedString(evt)).append("\n");
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
