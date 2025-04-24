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

/** Uses a GeoIP database to enrich logs based on an IP field. */
@JsonPropertyOrder({
  ObservabilityPipelineEnrichmentTableGeoIp.JSON_PROPERTY_KEY_FIELD,
  ObservabilityPipelineEnrichmentTableGeoIp.JSON_PROPERTY_LOCALE,
  ObservabilityPipelineEnrichmentTableGeoIp.JSON_PROPERTY_PATH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineEnrichmentTableGeoIp {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_KEY_FIELD = "key_field";
  private String keyField;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public ObservabilityPipelineEnrichmentTableGeoIp() {}

  @JsonCreator
  public ObservabilityPipelineEnrichmentTableGeoIp(
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY_FIELD) String keyField,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOCALE) String locale,
      @JsonProperty(required = true, value = JSON_PROPERTY_PATH) String path) {
    this.keyField = keyField;
    this.locale = locale;
    this.path = path;
  }

  public ObservabilityPipelineEnrichmentTableGeoIp keyField(String keyField) {
    this.keyField = keyField;
    return this;
  }

  /**
   * Path to the IP field in the log.
   *
   * @return keyField
   */
  @JsonProperty(JSON_PROPERTY_KEY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKeyField() {
    return keyField;
  }

  public void setKeyField(String keyField) {
    this.keyField = keyField;
  }

  public ObservabilityPipelineEnrichmentTableGeoIp locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Locale used to resolve geographical names.
   *
   * @return locale
   */
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public ObservabilityPipelineEnrichmentTableGeoIp path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path to the GeoIP database file.
   *
   * @return path
   */
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
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
   * @return ObservabilityPipelineEnrichmentTableGeoIp
   */
  @JsonAnySetter
  public ObservabilityPipelineEnrichmentTableGeoIp putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineEnrichmentTableGeoIp object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineEnrichmentTableGeoIp observabilityPipelineEnrichmentTableGeoIp =
        (ObservabilityPipelineEnrichmentTableGeoIp) o;
    return Objects.equals(this.keyField, observabilityPipelineEnrichmentTableGeoIp.keyField)
        && Objects.equals(this.locale, observabilityPipelineEnrichmentTableGeoIp.locale)
        && Objects.equals(this.path, observabilityPipelineEnrichmentTableGeoIp.path)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineEnrichmentTableGeoIp.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyField, locale, path, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineEnrichmentTableGeoIp {\n");
    sb.append("    keyField: ").append(toIndentedString(keyField)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
