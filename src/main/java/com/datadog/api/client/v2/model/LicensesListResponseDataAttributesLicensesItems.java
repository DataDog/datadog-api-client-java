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

/** An SPDX license entry returned by the licenses list endpoint. */
@JsonPropertyOrder({
  LicensesListResponseDataAttributesLicensesItems.JSON_PROPERTY_DISPLAY_NAME,
  LicensesListResponseDataAttributesLicensesItems.JSON_PROPERTY_IDENTIFIER,
  LicensesListResponseDataAttributesLicensesItems.JSON_PROPERTY_SHORT_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LicensesListResponseDataAttributesLicensesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier;

  public static final String JSON_PROPERTY_SHORT_NAME = "short_name";
  private String shortName;

  public LicensesListResponseDataAttributesLicensesItems() {}

  @JsonCreator
  public LicensesListResponseDataAttributesLicensesItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_NAME) String displayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_IDENTIFIER) String identifier,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHORT_NAME) String shortName) {
    this.displayName = displayName;
    this.identifier = identifier;
    this.shortName = shortName;
  }

  public LicensesListResponseDataAttributesLicensesItems displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The human-readable name of the license.
   *
   * @return displayName
   */
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public LicensesListResponseDataAttributesLicensesItems identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * The SPDX identifier of the license.
   *
   * @return identifier
   */
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public LicensesListResponseDataAttributesLicensesItems shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * The short name of the license, typically matching the SPDX identifier.
   *
   * @return shortName
   */
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
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
   * @return LicensesListResponseDataAttributesLicensesItems
   */
  @JsonAnySetter
  public LicensesListResponseDataAttributesLicensesItems putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this LicensesListResponseDataAttributesLicensesItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicensesListResponseDataAttributesLicensesItems
        licensesListResponseDataAttributesLicensesItems =
            (LicensesListResponseDataAttributesLicensesItems) o;
    return Objects.equals(
            this.displayName, licensesListResponseDataAttributesLicensesItems.displayName)
        && Objects.equals(
            this.identifier, licensesListResponseDataAttributesLicensesItems.identifier)
        && Objects.equals(this.shortName, licensesListResponseDataAttributesLicensesItems.shortName)
        && Objects.equals(
            this.additionalProperties,
            licensesListResponseDataAttributesLicensesItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, identifier, shortName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicensesListResponseDataAttributesLicensesItems {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
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
