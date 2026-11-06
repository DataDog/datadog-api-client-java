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

/** A token claim must match at least one of the configured values. */
@JsonPropertyOrder({
  OIDCCloudAuthClaimMatcher.JSON_PROPERTY_CLAIM,
  OIDCCloudAuthClaimMatcher.JSON_PROPERTY_MODE,
  OIDCCloudAuthClaimMatcher.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OIDCCloudAuthClaimMatcher {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLAIM = "claim";
  private String claim;

  public static final String JSON_PROPERTY_MODE = "mode";
  private OIDCCloudAuthClaimMatchMode mode = OIDCCloudAuthClaimMatchMode.EXACT;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = new ArrayList<>();

  public OIDCCloudAuthClaimMatcher() {}

  @JsonCreator
  public OIDCCloudAuthClaimMatcher(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLAIM) String claim,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<String> values) {
    this.claim = claim;
    this.values = values;
  }

  public OIDCCloudAuthClaimMatcher claim(String claim) {
    this.claim = claim;
    return this;
  }

  /**
   * Name of the token claim.
   *
   * @return claim
   */
  @JsonProperty(JSON_PROPERTY_CLAIM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClaim() {
    return claim;
  }

  public void setClaim(String claim) {
    this.claim = claim;
  }

  public OIDCCloudAuthClaimMatcher mode(OIDCCloudAuthClaimMatchMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Case-sensitive matching mode. Exact compares strings. Glob matches the entire value: * matches
   * any number of characters, including /, and ? matches one character. Other characters are
   * literal; escaping is not supported.
   *
   * @return mode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OIDCCloudAuthClaimMatchMode getMode() {
    return mode;
  }

  public void setMode(OIDCCloudAuthClaimMatchMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public OIDCCloudAuthClaimMatcher values(List<String> values) {
    this.values = values;
    return this;
  }

  public OIDCCloudAuthClaimMatcher addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Accepted values for this claim.
   *
   * @return values
   */
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
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
   * @return OIDCCloudAuthClaimMatcher
   */
  @JsonAnySetter
  public OIDCCloudAuthClaimMatcher putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OIDCCloudAuthClaimMatcher object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCCloudAuthClaimMatcher oidcCloudAuthClaimMatcher = (OIDCCloudAuthClaimMatcher) o;
    return Objects.equals(this.claim, oidcCloudAuthClaimMatcher.claim)
        && Objects.equals(this.mode, oidcCloudAuthClaimMatcher.mode)
        && Objects.equals(this.values, oidcCloudAuthClaimMatcher.values)
        && Objects.equals(
            this.additionalProperties, oidcCloudAuthClaimMatcher.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claim, mode, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCCloudAuthClaimMatcher {\n");
    sb.append("    claim: ").append(toIndentedString(claim)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
