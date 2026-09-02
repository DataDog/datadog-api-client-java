/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Core Web Vitals attached to a browser test step.</p>
 */
@JsonPropertyOrder({
  SyntheticsCoreWebVitals.JSON_PROPERTY_CLS,
  SyntheticsCoreWebVitals.JSON_PROPERTY_LCP,
  SyntheticsCoreWebVitals.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsCoreWebVitals {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLS = "cls";
  private Double cls;

  public static final String JSON_PROPERTY_LCP = "lcp";
  private Double lcp;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SyntheticsCoreWebVitals cls(Double cls) {
    this.cls = cls;
    return this;
  }

  /**
   * <p>Cumulative Layout Shift.</p>
   * @return cls
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getCls() {
        return cls;
      }
  public void setCls(Double cls) {
    this.cls = cls;
  }
  public SyntheticsCoreWebVitals lcp(Double lcp) {
    this.lcp = lcp;
    return this;
  }

  /**
   * <p>Largest Contentful Paint in milliseconds.</p>
   * @return lcp
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LCP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getLcp() {
        return lcp;
      }
  public void setLcp(Double lcp) {
    this.lcp = lcp;
  }
  public SyntheticsCoreWebVitals url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>URL attached to the metrics.</p>
   * @return url
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_URL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUrl() {
        return url;
      }
  public void setUrl(String url) {
    this.url = url;
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
   * @return SyntheticsCoreWebVitals
   */
  @JsonAnySetter
  public SyntheticsCoreWebVitals putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsCoreWebVitals object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsCoreWebVitals syntheticsCoreWebVitals = (SyntheticsCoreWebVitals) o;
    return Objects.equals(this.cls, syntheticsCoreWebVitals.cls) && Objects.equals(this.lcp, syntheticsCoreWebVitals.lcp) && Objects.equals(this.url, syntheticsCoreWebVitals.url) && Objects.equals(this.additionalProperties, syntheticsCoreWebVitals.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cls,lcp,url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsCoreWebVitals {\n");
    sb.append("    cls: ").append(toIndentedString(cls)).append("\n");
    sb.append("    lcp: ").append(toIndentedString(lcp)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
