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
   * <p>The definition of LeakedKeyAttributes object.</p>
 */
@JsonPropertyOrder({
  LeakedKeyAttributes.JSON_PROPERTY_DATE,
  LeakedKeyAttributes.JSON_PROPERTY_LEAK_SOURCE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LeakedKeyAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_LEAK_SOURCE = "leak_source";
  private String leakSource;

  public LeakedKeyAttributes() {}

  @JsonCreator
  public LeakedKeyAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATE)OffsetDateTime date) {
        this.date = date;
  }
  public LeakedKeyAttributes date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * <p>The LeakedKeyAttributes date.</p>
   * @return date
  **/
      @JsonProperty(JSON_PROPERTY_DATE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getDate() {
        return date;
      }
  public void setDate(OffsetDateTime date) {
    this.date = date;
  }
  public LeakedKeyAttributes leakSource(String leakSource) {
    this.leakSource = leakSource;
    return this;
  }

  /**
   * <p>The LeakedKeyAttributes leak_source.</p>
   * @return leakSource
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LEAK_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLeakSource() {
        return leakSource;
      }
  public void setLeakSource(String leakSource) {
    this.leakSource = leakSource;
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
   * @return LeakedKeyAttributes
   */
  @JsonAnySetter
  public LeakedKeyAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this LeakedKeyAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeakedKeyAttributes leakedKeyAttributes = (LeakedKeyAttributes) o;
    return Objects.equals(this.date, leakedKeyAttributes.date) && Objects.equals(this.leakSource, leakedKeyAttributes.leakSource) && Objects.equals(this.additionalProperties, leakedKeyAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(date,leakSource, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeakedKeyAttributes {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    leakSource: ").append(toIndentedString(leakSource)).append("\n");
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
