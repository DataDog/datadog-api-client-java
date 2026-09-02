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

/** Web vitals metrics captured during a browser test step. */
@JsonPropertyOrder({
  SyntheticsTestResultVitalsMetrics.JSON_PROPERTY_CLS,
  SyntheticsTestResultVitalsMetrics.JSON_PROPERTY_FCP,
  SyntheticsTestResultVitalsMetrics.JSON_PROPERTY_INP,
  SyntheticsTestResultVitalsMetrics.JSON_PROPERTY_LCP,
  SyntheticsTestResultVitalsMetrics.JSON_PROPERTY_TTFB,
  SyntheticsTestResultVitalsMetrics.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultVitalsMetrics {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLS = "cls";
  private Double cls;

  public static final String JSON_PROPERTY_FCP = "fcp";
  private Double fcp;

  public static final String JSON_PROPERTY_INP = "inp";
  private Double inp;

  public static final String JSON_PROPERTY_LCP = "lcp";
  private Double lcp;

  public static final String JSON_PROPERTY_TTFB = "ttfb";
  private Double ttfb;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SyntheticsTestResultVitalsMetrics cls(Double cls) {
    this.cls = cls;
    return this;
  }

  /**
   * Cumulative Layout Shift score.
   *
   * @return cls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCls() {
    return cls;
  }

  public void setCls(Double cls) {
    this.cls = cls;
  }

  public SyntheticsTestResultVitalsMetrics fcp(Double fcp) {
    this.fcp = fcp;
    return this;
  }

  /**
   * First Contentful Paint in milliseconds.
   *
   * @return fcp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFcp() {
    return fcp;
  }

  public void setFcp(Double fcp) {
    this.fcp = fcp;
  }

  public SyntheticsTestResultVitalsMetrics inp(Double inp) {
    this.inp = inp;
    return this;
  }

  /**
   * Interaction to Next Paint in milliseconds.
   *
   * @return inp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInp() {
    return inp;
  }

  public void setInp(Double inp) {
    this.inp = inp;
  }

  public SyntheticsTestResultVitalsMetrics lcp(Double lcp) {
    this.lcp = lcp;
    return this;
  }

  /**
   * Largest Contentful Paint in milliseconds.
   *
   * @return lcp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLcp() {
    return lcp;
  }

  public void setLcp(Double lcp) {
    this.lcp = lcp;
  }

  public SyntheticsTestResultVitalsMetrics ttfb(Double ttfb) {
    this.ttfb = ttfb;
    return this;
  }

  /**
   * Time To First Byte in milliseconds.
   *
   * @return ttfb
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TTFB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTtfb() {
    return ttfb;
  }

  public void setTtfb(Double ttfb) {
    this.ttfb = ttfb;
  }

  public SyntheticsTestResultVitalsMetrics url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL that produced the metrics.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
   * @return SyntheticsTestResultVitalsMetrics
   */
  @JsonAnySetter
  public SyntheticsTestResultVitalsMetrics putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultVitalsMetrics object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultVitalsMetrics syntheticsTestResultVitalsMetrics =
        (SyntheticsTestResultVitalsMetrics) o;
    return Objects.equals(this.cls, syntheticsTestResultVitalsMetrics.cls)
        && Objects.equals(this.fcp, syntheticsTestResultVitalsMetrics.fcp)
        && Objects.equals(this.inp, syntheticsTestResultVitalsMetrics.inp)
        && Objects.equals(this.lcp, syntheticsTestResultVitalsMetrics.lcp)
        && Objects.equals(this.ttfb, syntheticsTestResultVitalsMetrics.ttfb)
        && Objects.equals(this.url, syntheticsTestResultVitalsMetrics.url)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultVitalsMetrics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cls, fcp, inp, lcp, ttfb, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultVitalsMetrics {\n");
    sb.append("    cls: ").append(toIndentedString(cls)).append("\n");
    sb.append("    fcp: ").append(toIndentedString(fcp)).append("\n");
    sb.append("    inp: ").append(toIndentedString(inp)).append("\n");
    sb.append("    lcp: ").append(toIndentedString(lcp)).append("\n");
    sb.append("    ttfb: ").append(toIndentedString(ttfb)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
