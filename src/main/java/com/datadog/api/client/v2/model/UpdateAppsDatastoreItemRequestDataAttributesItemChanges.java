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
import java.util.Set;

/**
 * The definition of <code>UpdateAppsDatastoreItemRequestDataAttributesItemChanges</code> object.
 */
@JsonPropertyOrder({UpdateAppsDatastoreItemRequestDataAttributesItemChanges.JSON_PROPERTY__SET})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateAppsDatastoreItemRequestDataAttributesItemChanges {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY__SET = "$set";
  private Map<String, Object> Set = null;

  public UpdateAppsDatastoreItemRequestDataAttributesItemChanges Set(Map<String, Object> Set) {
    this.Set = Set;
    return this;
  }

  public UpdateAppsDatastoreItemRequestDataAttributesItemChanges putSetItem(
      String key, Object SetItem) {
    if (this.Set == null) {
      this.Set = new HashMap<>();
    }
    this.Set.put(key, SetItem);
    return this;
  }

  /**
   * The <code>item_changes</code> <code>$set</code>.
   *
   * @return Set
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY__SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getSet() {
    return Set;
  }

  public void setSet(Map<String, Object> Set) {
    this.Set = Set;
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
   * @return UpdateAppsDatastoreItemRequestDataAttributesItemChanges
   */
  @JsonAnySetter
  public UpdateAppsDatastoreItemRequestDataAttributesItemChanges putAdditionalProperty(
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

  /**
   * Return true if this UpdateAppsDatastoreItemRequestDataAttributesItemChanges object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAppsDatastoreItemRequestDataAttributesItemChanges
        updateAppsDatastoreItemRequestDataAttributesItemChanges =
            (UpdateAppsDatastoreItemRequestDataAttributesItemChanges) o;
    return Objects.equals(this.Set, updateAppsDatastoreItemRequestDataAttributesItemChanges.Set)
        && Objects.equals(
            this.additionalProperties,
            updateAppsDatastoreItemRequestDataAttributesItemChanges.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Set, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAppsDatastoreItemRequestDataAttributesItemChanges {\n");
    sb.append("    Set: ").append(toIndentedString(Set)).append("\n");
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
