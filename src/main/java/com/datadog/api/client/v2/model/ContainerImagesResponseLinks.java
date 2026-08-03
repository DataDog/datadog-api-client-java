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
   * <p>Pagination links.</p>
 */
@JsonPropertyOrder({
  ContainerImagesResponseLinks.JSON_PROPERTY_FIRST,
  ContainerImagesResponseLinks.JSON_PROPERTY_LAST,
  ContainerImagesResponseLinks.JSON_PROPERTY_NEXT,
  ContainerImagesResponseLinks.JSON_PROPERTY_PREV,
  ContainerImagesResponseLinks.JSON_PROPERTY_SELF
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ContainerImagesResponseLinks {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST = "first";
  private String first;

  public static final String JSON_PROPERTY_LAST = "last";
  private JsonNullable<String> last = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NEXT = "next";
  private JsonNullable<String> next = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PREV = "prev";
  private JsonNullable<String> prev = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public ContainerImagesResponseLinks first(String first) {
    this.first = first;
    return this;
  }

  /**
   * <p>Link to the first page.</p>
   * @return first
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIRST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFirst() {
        return first;
      }
  public void setFirst(String first) {
    this.first = first;
  }
  public ContainerImagesResponseLinks last(String last) {
    this.last = JsonNullable.<String>of(last);
    return this;
  }

  /**
   * <p>Link to the last page.</p>
   * @return last
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getLast() {
        return last.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_LAST)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getLast_JsonNullable() {
    return last;
  }
  @JsonProperty(JSON_PROPERTY_LAST)public void setLast_JsonNullable(JsonNullable<String> last) {
    this.last = last;
  }
  public void setLast(String last) {
    this.last = JsonNullable.<String>of(last);
  }
  public ContainerImagesResponseLinks next(String next) {
    this.next = JsonNullable.<String>of(next);
    return this;
  }

  /**
   * <p>Link to the next page.</p>
   * @return next
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getNext() {
        return next.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getNext_JsonNullable() {
    return next;
  }
  @JsonProperty(JSON_PROPERTY_NEXT)public void setNext_JsonNullable(JsonNullable<String> next) {
    this.next = next;
  }
  public void setNext(String next) {
    this.next = JsonNullable.<String>of(next);
  }
  public ContainerImagesResponseLinks prev(String prev) {
    this.prev = JsonNullable.<String>of(prev);
    return this;
  }

  /**
   * <p>Link to previous page.</p>
   * @return prev
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getPrev() {
        return prev.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_PREV)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPrev_JsonNullable() {
    return prev;
  }
  @JsonProperty(JSON_PROPERTY_PREV)public void setPrev_JsonNullable(JsonNullable<String> prev) {
    this.prev = prev;
  }
  public void setPrev(String prev) {
    this.prev = JsonNullable.<String>of(prev);
  }
  public ContainerImagesResponseLinks self(String self) {
    this.self = self;
    return this;
  }

  /**
   * <p>Link to current page.</p>
   * @return self
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SELF)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSelf() {
        return self;
      }
  public void setSelf(String self) {
    this.self = self;
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
   * @return ContainerImagesResponseLinks
   */
  @JsonAnySetter
  public ContainerImagesResponseLinks putAdditionalProperty(String key, Object value) {
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
   * Return true if this ContainerImagesResponseLinks object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerImagesResponseLinks containerImagesResponseLinks = (ContainerImagesResponseLinks) o;
    return Objects.equals(this.first, containerImagesResponseLinks.first) && Objects.equals(this.last, containerImagesResponseLinks.last) && Objects.equals(this.next, containerImagesResponseLinks.next) && Objects.equals(this.prev, containerImagesResponseLinks.prev) && Objects.equals(this.self, containerImagesResponseLinks.self) && Objects.equals(this.additionalProperties, containerImagesResponseLinks.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(first,last,next,prev,self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerImagesResponseLinks {\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
