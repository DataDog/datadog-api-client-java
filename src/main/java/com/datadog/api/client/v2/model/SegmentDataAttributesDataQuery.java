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

/** */
@JsonPropertyOrder({
  SegmentDataAttributesDataQuery.JSON_PROPERTY_COMBINATION,
  SegmentDataAttributesDataQuery.JSON_PROPERTY_EVENT_PLATFORM,
  SegmentDataAttributesDataQuery.JSON_PROPERTY_REFERENCE_TABLE,
  SegmentDataAttributesDataQuery.JSON_PROPERTY_STATIC,
  SegmentDataAttributesDataQuery.JSON_PROPERTY_USER_STORE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SegmentDataAttributesDataQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMBINATION = "combination";
  private String combination;

  public static final String JSON_PROPERTY_EVENT_PLATFORM = "event_platform";
  private List<SegmentDataAttributesDataQueryEventPlatformItems> eventPlatform = null;

  public static final String JSON_PROPERTY_REFERENCE_TABLE = "reference_table";
  private List<SegmentDataAttributesDataQueryReferenceTableItems> referenceTable = null;

  public static final String JSON_PROPERTY_STATIC = "static";
  private List<SegmentDataAttributesDataQueryStaticItems> _static = null;

  public static final String JSON_PROPERTY_USER_STORE = "user_store";
  private List<SegmentDataAttributesDataQueryUserStoreItems> userStore = null;

  public SegmentDataAttributesDataQuery combination(String combination) {
    this.combination = combination;
    return this;
  }

  /**
   * Getcombination
   *
   * @return combination
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMBINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCombination() {
    return combination;
  }

  public void setCombination(String combination) {
    this.combination = combination;
  }

  public SegmentDataAttributesDataQuery eventPlatform(
      List<SegmentDataAttributesDataQueryEventPlatformItems> eventPlatform) {
    this.eventPlatform = eventPlatform;
    for (SegmentDataAttributesDataQueryEventPlatformItems item : eventPlatform) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SegmentDataAttributesDataQuery addEventPlatformItem(
      SegmentDataAttributesDataQueryEventPlatformItems eventPlatformItem) {
    if (this.eventPlatform == null) {
      this.eventPlatform = new ArrayList<>();
    }
    this.eventPlatform.add(eventPlatformItem);
    this.unparsed |= eventPlatformItem.unparsed;
    return this;
  }

  /**
   * GeteventPlatform
   *
   * @return eventPlatform
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SegmentDataAttributesDataQueryEventPlatformItems> getEventPlatform() {
    return eventPlatform;
  }

  public void setEventPlatform(
      List<SegmentDataAttributesDataQueryEventPlatformItems> eventPlatform) {
    this.eventPlatform = eventPlatform;
  }

  public SegmentDataAttributesDataQuery referenceTable(
      List<SegmentDataAttributesDataQueryReferenceTableItems> referenceTable) {
    this.referenceTable = referenceTable;
    for (SegmentDataAttributesDataQueryReferenceTableItems item : referenceTable) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SegmentDataAttributesDataQuery addReferenceTableItem(
      SegmentDataAttributesDataQueryReferenceTableItems referenceTableItem) {
    if (this.referenceTable == null) {
      this.referenceTable = new ArrayList<>();
    }
    this.referenceTable.add(referenceTableItem);
    this.unparsed |= referenceTableItem.unparsed;
    return this;
  }

  /**
   * GetreferenceTable
   *
   * @return referenceTable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SegmentDataAttributesDataQueryReferenceTableItems> getReferenceTable() {
    return referenceTable;
  }

  public void setReferenceTable(
      List<SegmentDataAttributesDataQueryReferenceTableItems> referenceTable) {
    this.referenceTable = referenceTable;
  }

  public SegmentDataAttributesDataQuery _static(
      List<SegmentDataAttributesDataQueryStaticItems> _static) {
    this._static = _static;
    for (SegmentDataAttributesDataQueryStaticItems item : _static) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SegmentDataAttributesDataQuery add_staticItem(
      SegmentDataAttributesDataQueryStaticItems _staticItem) {
    if (this._static == null) {
      this._static = new ArrayList<>();
    }
    this._static.add(_staticItem);
    this.unparsed |= _staticItem.unparsed;
    return this;
  }

  /**
   * Get_static
   *
   * @return _static
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SegmentDataAttributesDataQueryStaticItems> getStatic() {
    return _static;
  }

  public void setStatic(List<SegmentDataAttributesDataQueryStaticItems> _static) {
    this._static = _static;
  }

  public SegmentDataAttributesDataQuery userStore(
      List<SegmentDataAttributesDataQueryUserStoreItems> userStore) {
    this.userStore = userStore;
    for (SegmentDataAttributesDataQueryUserStoreItems item : userStore) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SegmentDataAttributesDataQuery addUserStoreItem(
      SegmentDataAttributesDataQueryUserStoreItems userStoreItem) {
    if (this.userStore == null) {
      this.userStore = new ArrayList<>();
    }
    this.userStore.add(userStoreItem);
    this.unparsed |= userStoreItem.unparsed;
    return this;
  }

  /**
   * GetuserStore
   *
   * @return userStore
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SegmentDataAttributesDataQueryUserStoreItems> getUserStore() {
    return userStore;
  }

  public void setUserStore(List<SegmentDataAttributesDataQueryUserStoreItems> userStore) {
    this.userStore = userStore;
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
   * @return SegmentDataAttributesDataQuery
   */
  @JsonAnySetter
  public SegmentDataAttributesDataQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SegmentDataAttributesDataQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentDataAttributesDataQuery segmentDataAttributesDataQuery =
        (SegmentDataAttributesDataQuery) o;
    return Objects.equals(this.combination, segmentDataAttributesDataQuery.combination)
        && Objects.equals(this.eventPlatform, segmentDataAttributesDataQuery.eventPlatform)
        && Objects.equals(this.referenceTable, segmentDataAttributesDataQuery.referenceTable)
        && Objects.equals(this._static, segmentDataAttributesDataQuery._static)
        && Objects.equals(this.userStore, segmentDataAttributesDataQuery.userStore)
        && Objects.equals(
            this.additionalProperties, segmentDataAttributesDataQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        combination, eventPlatform, referenceTable, _static, userStore, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentDataAttributesDataQuery {\n");
    sb.append("    combination: ").append(toIndentedString(combination)).append("\n");
    sb.append("    eventPlatform: ").append(toIndentedString(eventPlatform)).append("\n");
    sb.append("    referenceTable: ").append(toIndentedString(referenceTable)).append("\n");
    sb.append("    _static: ").append(toIndentedString(_static)).append("\n");
    sb.append("    userStore: ").append(toIndentedString(userStore)).append("\n");
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
