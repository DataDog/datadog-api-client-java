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

/** JSON object of event system attributes. */
@JsonPropertyOrder({
  EventCreateResponseAttributesAttributesEvt.JSON_PROPERTY_ID,
  EventCreateResponseAttributesAttributesEvt.JSON_PROPERTY_UID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventCreateResponseAttributesAttributesEvt {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_UID = "uid";
  private String uid;

  public EventCreateResponseAttributesAttributesEvt id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Event identifier. This field is deprecated and will be removed in a future version. Use the
   * <code>uid</code> field instead.
   *
   * @return id
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  @Deprecated
  public void setId(String id) {
    this.id = id;
  }

  public EventCreateResponseAttributesAttributesEvt uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * A unique identifier for the event. You can use this identifier to query or reference the event.
   *
   * @return uid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
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
   * @return EventCreateResponseAttributesAttributesEvt
   */
  @JsonAnySetter
  public EventCreateResponseAttributesAttributesEvt putAdditionalProperty(
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

  /** Return true if this EventCreateResponseAttributesAttributesEvt object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCreateResponseAttributesAttributesEvt eventCreateResponseAttributesAttributesEvt =
        (EventCreateResponseAttributesAttributesEvt) o;
    return Objects.equals(this.id, eventCreateResponseAttributesAttributesEvt.id)
        && Objects.equals(this.uid, eventCreateResponseAttributesAttributesEvt.uid)
        && Objects.equals(
            this.additionalProperties,
            eventCreateResponseAttributesAttributesEvt.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCreateResponseAttributesAttributesEvt {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
