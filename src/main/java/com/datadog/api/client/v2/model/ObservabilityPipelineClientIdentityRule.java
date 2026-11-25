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

/**
 * A named rule. It matches when every constraint it defines matches at least one identity in the
 * client's certificate. It must define at least one of <code>common_names</code>, <code>dns_sans
 * </code>, or <code>uri_sans</code>.
 */
@JsonPropertyOrder({
  ObservabilityPipelineClientIdentityRule.JSON_PROPERTY_COMMON_NAMES,
  ObservabilityPipelineClientIdentityRule.JSON_PROPERTY_DNS_SANS,
  ObservabilityPipelineClientIdentityRule.JSON_PROPERTY_NAME,
  ObservabilityPipelineClientIdentityRule.JSON_PROPERTY_URI_SANS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineClientIdentityRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMON_NAMES = "common_names";
  private List<String> commonNames = null;

  public static final String JSON_PROPERTY_DNS_SANS = "dns_sans";
  private List<String> dnsSans = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_URI_SANS = "uri_sans";
  private List<String> uriSans = null;

  public ObservabilityPipelineClientIdentityRule() {}

  @JsonCreator
  public ObservabilityPipelineClientIdentityRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public ObservabilityPipelineClientIdentityRule commonNames(List<String> commonNames) {
    this.commonNames = commonNames;
    return this;
  }

  public ObservabilityPipelineClientIdentityRule addCommonNamesItem(String commonNamesItem) {
    if (this.commonNames == null) {
      this.commonNames = new ArrayList<>();
    }
    this.commonNames.add(commonNamesItem);
    return this;
  }

  /**
   * Patterns for the certificate subject common name. Matching is case-sensitive, and <code>*
   * </code> matches any characters, including dots.
   *
   * @return commonNames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMON_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCommonNames() {
    return commonNames;
  }

  public void setCommonNames(List<String> commonNames) {
    this.commonNames = commonNames;
  }

  public ObservabilityPipelineClientIdentityRule dnsSans(List<String> dnsSans) {
    this.dnsSans = dnsSans;
    return this;
  }

  public ObservabilityPipelineClientIdentityRule addDnsSansItem(String dnsSansItem) {
    if (this.dnsSans == null) {
      this.dnsSans = new ArrayList<>();
    }
    this.dnsSans.add(dnsSansItem);
    return this;
  }

  /**
   * Patterns for DNS subject alternative names. Matching is case-insensitive, and <code>*</code>
   * matches any characters within one DNS label.
   *
   * @return dnsSans
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_SANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDnsSans() {
    return dnsSans;
  }

  public void setDnsSans(List<String> dnsSans) {
    this.dnsSans = dnsSans;
  }

  public ObservabilityPipelineClientIdentityRule name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique rule name, reported in metrics.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ObservabilityPipelineClientIdentityRule uriSans(List<String> uriSans) {
    this.uriSans = uriSans;
    return this;
  }

  public ObservabilityPipelineClientIdentityRule addUriSansItem(String uriSansItem) {
    if (this.uriSans == null) {
      this.uriSans = new ArrayList<>();
    }
    this.uriSans.add(uriSansItem);
    return this;
  }

  /**
   * Patterns for URI subject alternative names. Matching is case-sensitive. <code>*</code> matches
   * any characters within one path segment, and a trailing <code>/**</code> matches the path and
   * everything below it. Wildcards are only supported in the path.
   *
   * @return uriSans
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URI_SANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getUriSans() {
    return uriSans;
  }

  public void setUriSans(List<String> uriSans) {
    this.uriSans = uriSans;
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
   * @return ObservabilityPipelineClientIdentityRule
   */
  @JsonAnySetter
  public ObservabilityPipelineClientIdentityRule putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineClientIdentityRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineClientIdentityRule observabilityPipelineClientIdentityRule =
        (ObservabilityPipelineClientIdentityRule) o;
    return Objects.equals(this.commonNames, observabilityPipelineClientIdentityRule.commonNames)
        && Objects.equals(this.dnsSans, observabilityPipelineClientIdentityRule.dnsSans)
        && Objects.equals(this.name, observabilityPipelineClientIdentityRule.name)
        && Objects.equals(this.uriSans, observabilityPipelineClientIdentityRule.uriSans)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineClientIdentityRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonNames, dnsSans, name, uriSans, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineClientIdentityRule {\n");
    sb.append("    commonNames: ").append(toIndentedString(commonNames)).append("\n");
    sb.append("    dnsSans: ").append(toIndentedString(dnsSans)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uriSans: ").append(toIndentedString(uriSans)).append("\n");
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
