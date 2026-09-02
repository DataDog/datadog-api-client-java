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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Pagination links for the list rows response. */
@JsonPropertyOrder({
  ListRowsResponseLinks.JSON_PROPERTY_FIRST,
  ListRowsResponseLinks.JSON_PROPERTY_NEXT,
  ListRowsResponseLinks.JSON_PROPERTY_SELF
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListRowsResponseLinks {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST = "first";
  private String first;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public ListRowsResponseLinks() {}

  @JsonCreator
  public ListRowsResponseLinks(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIRST) String first,
      @JsonProperty(required = true, value = JSON_PROPERTY_SELF) String self) {
    this.first = first;
    this.self = self;
  }

  public ListRowsResponseLinks first(String first) {
    this.first = first;
    return this;
  }

  /**
   * Link to the first page of results.
   *
   * @return first
   */
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public ListRowsResponseLinks next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Link to the next page of results. Only present when more rows are available.
   *
   * @return next
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public ListRowsResponseLinks self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Link to the current page of results.
   *
   * @return self
   */
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
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
   * @return ListRowsResponseLinks
   */
  @JsonAnySetter
  public ListRowsResponseLinks putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ListRowsResponseLinks object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRowsResponseLinks listRowsResponseLinks = (ListRowsResponseLinks) o;
    return Objects.equals(this.first, listRowsResponseLinks.first)
        && Objects.equals(this.next, listRowsResponseLinks.next)
        && Objects.equals(this.self, listRowsResponseLinks.self)
        && Objects.equals(this.additionalProperties, listRowsResponseLinks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, next, self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRowsResponseLinks {\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
