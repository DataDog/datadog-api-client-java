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
   * <p>The JSON:API links related to pagination.</p>
 */
@JsonPropertyOrder({
  Links.JSON_PROPERTY_FIRST,
  Links.JSON_PROPERTY_LAST,
  Links.JSON_PROPERTY_NEXT,
  Links.JSON_PROPERTY_PREVIOUS,
  Links.JSON_PROPERTY_SELF
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Links {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST = "first";
  private String first;

  public static final String JSON_PROPERTY_LAST = "last";
  private String last;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  private String previous;

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public Links() {}

  @JsonCreator
  public Links(
            @JsonProperty(required=true, value=JSON_PROPERTY_FIRST)String first,
            @JsonProperty(required=true, value=JSON_PROPERTY_LAST)String last,
            @JsonProperty(required=true, value=JSON_PROPERTY_SELF)String self) {
        this.first = first;
        this.last = last;
        this.self = self;
  }
  public Links first(String first) {
    this.first = first;
    return this;
  }

  /**
   * <p>First page link.</p>
   * @return first
  **/
      @JsonProperty(JSON_PROPERTY_FIRST)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getFirst() {
        return first;
      }
  public void setFirst(String first) {
    this.first = first;
  }
  public Links last(String last) {
    this.last = last;
    return this;
  }

  /**
   * <p>Last page link.</p>
   * @return last
  **/
      @JsonProperty(JSON_PROPERTY_LAST)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getLast() {
        return last;
      }
  public void setLast(String last) {
    this.last = last;
  }
  public Links next(String next) {
    this.next = next;
    return this;
  }

  /**
   * <p>Next page link.</p>
   * @return next
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NEXT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getNext() {
        return next;
      }
  public void setNext(String next) {
    this.next = next;
  }
  public Links previous(String previous) {
    this.previous = previous;
    return this;
  }

  /**
   * <p>Previous page link.</p>
   * @return previous
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PREVIOUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPrevious() {
        return previous;
      }
  public void setPrevious(String previous) {
    this.previous = previous;
  }
  public Links self(String self) {
    this.self = self;
    return this;
  }

  /**
   * <p>Request link.</p>
   * @return self
  **/
      @JsonProperty(JSON_PROPERTY_SELF)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * @return Links
   */
  @JsonAnySetter
  public Links putAdditionalProperty(String key, Object value) {
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
   * Return true if this Links object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.first, links.first) && Objects.equals(this.last, links.last) && Objects.equals(this.next, links.next) && Objects.equals(this.previous, links.previous) && Objects.equals(this.self, links.self) && Objects.equals(this.additionalProperties, links.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(first,last,next,previous,self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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
