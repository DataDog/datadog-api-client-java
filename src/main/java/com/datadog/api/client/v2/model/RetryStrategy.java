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
   * <p>The definition of <code>RetryStrategy</code> object.</p>
 */
@JsonPropertyOrder({
  RetryStrategy.JSON_PROPERTY_KIND,
  RetryStrategy.JSON_PROPERTY_LINEAR
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetryStrategy {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_KIND = "kind";
  private RetryStrategyKind kind;

  public static final String JSON_PROPERTY_LINEAR = "linear";
  private RetryStrategyLinear linear;

  public RetryStrategy() {}

  @JsonCreator
  public RetryStrategy(
            @JsonProperty(required=true, value=JSON_PROPERTY_KIND)RetryStrategyKind kind,
            @JsonProperty(required=true, value=JSON_PROPERTY_LINEAR)RetryStrategyLinear linear) {
        this.kind = kind;
        this.unparsed |= !kind.isValid();
        this.linear = linear;
        this.unparsed |= linear.unparsed;
  }
  public RetryStrategy kind(RetryStrategyKind kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    return this;
  }

  /**
   * <p>The definition of <code>RetryStrategyKind</code> object.</p>
   * @return kind
  **/
      @JsonProperty(JSON_PROPERTY_KIND)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RetryStrategyKind getKind() {
        return kind;
      }
  public void setKind(RetryStrategyKind kind) {
    if (!kind.isValid()) {
        this.unparsed = true;
    }
    this.kind = kind;
  }
  public RetryStrategy linear(RetryStrategyLinear linear) {
    this.linear = linear;
    this.unparsed |= linear.unparsed;
    return this;
  }

  /**
   * <p>The definition of <code>RetryStrategyLinear</code> object.</p>
   * @return linear
  **/
      @JsonProperty(JSON_PROPERTY_LINEAR)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RetryStrategyLinear getLinear() {
        return linear;
      }
  public void setLinear(RetryStrategyLinear linear) {
    this.linear = linear;
    if (linear != null) {
      this.unparsed |= linear.unparsed;
    }
  }

  /**
   * Return true if this RetryStrategy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetryStrategy retryStrategy = (RetryStrategy) o;
    return Objects.equals(this.kind, retryStrategy.kind) && Objects.equals(this.linear, retryStrategy.linear);
  }


  @Override
  public int hashCode() {
    return Objects.hash(kind,linear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetryStrategy {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    linear: ").append(toIndentedString(linear)).append("\n");
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
