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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The supported attributes for creating a backfilled degradation. */
@JsonPropertyOrder({
  CreateBackfilledDegradationRequestDataAttributes.JSON_PROPERTY_TITLE,
  CreateBackfilledDegradationRequestDataAttributes.JSON_PROPERTY_UPDATES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateBackfilledDegradationRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_UPDATES = "updates";
  private List<CreateBackfilledDegradationRequestDataAttributesUpdatesItems> updates =
      new ArrayList<>();

  public CreateBackfilledDegradationRequestDataAttributes() {}

  @JsonCreator
  public CreateBackfilledDegradationRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATES)
          List<CreateBackfilledDegradationRequestDataAttributesUpdatesItems> updates) {
    this.title = title;
    this.updates = updates;
  }

  public CreateBackfilledDegradationRequestDataAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the backfilled degradation.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CreateBackfilledDegradationRequestDataAttributes updates(
      List<CreateBackfilledDegradationRequestDataAttributesUpdatesItems> updates) {
    this.updates = updates;
    for (CreateBackfilledDegradationRequestDataAttributesUpdatesItems item : updates) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CreateBackfilledDegradationRequestDataAttributes addUpdatesItem(
      CreateBackfilledDegradationRequestDataAttributesUpdatesItems updatesItem) {
    this.updates.add(updatesItem);
    this.unparsed |= updatesItem.unparsed;
    return this;
  }

  /**
   * The list of status updates describing the timeline of the degradation.
   *
   * @return updates
   */
  @JsonProperty(JSON_PROPERTY_UPDATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CreateBackfilledDegradationRequestDataAttributesUpdatesItems> getUpdates() {
    return updates;
  }

  public void setUpdates(
      List<CreateBackfilledDegradationRequestDataAttributesUpdatesItems> updates) {
    this.updates = updates;
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
   * @return CreateBackfilledDegradationRequestDataAttributes
   */
  @JsonAnySetter
  public CreateBackfilledDegradationRequestDataAttributes putAdditionalProperty(
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

  /** Return true if this CreateBackfilledDegradationRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBackfilledDegradationRequestDataAttributes
        createBackfilledDegradationRequestDataAttributes =
            (CreateBackfilledDegradationRequestDataAttributes) o;
    return Objects.equals(this.title, createBackfilledDegradationRequestDataAttributes.title)
        && Objects.equals(this.updates, createBackfilledDegradationRequestDataAttributes.updates)
        && Objects.equals(
            this.additionalProperties,
            createBackfilledDegradationRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, updates, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBackfilledDegradationRequestDataAttributes {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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
