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

/** Per-item status returned for a bulk subscription request. */
@JsonPropertyOrder({
  SampleLogGenerationBulkSubscriptionItemMeta.JSON_PROPERTY_ERROR,
  SampleLogGenerationBulkSubscriptionItemMeta.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SampleLogGenerationBulkSubscriptionItemMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public SampleLogGenerationBulkSubscriptionItemMeta() {}

  @JsonCreator
  public SampleLogGenerationBulkSubscriptionItemMeta(
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) Integer status) {
    this.status = status;
  }

  public SampleLogGenerationBulkSubscriptionItemMeta error(String error) {
    this.error = error;
    return this;
  }

  /**
   * A description of the error encountered for this content pack, if the subscription could not be
   * created.
   *
   * @return error
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public SampleLogGenerationBulkSubscriptionItemMeta status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The HTTP status code that resulted from creating the subscription for this content pack.
   * maximum: 599
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
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
   * @return SampleLogGenerationBulkSubscriptionItemMeta
   */
  @JsonAnySetter
  public SampleLogGenerationBulkSubscriptionItemMeta putAdditionalProperty(
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

  /** Return true if this SampleLogGenerationBulkSubscriptionItemMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SampleLogGenerationBulkSubscriptionItemMeta sampleLogGenerationBulkSubscriptionItemMeta =
        (SampleLogGenerationBulkSubscriptionItemMeta) o;
    return Objects.equals(this.error, sampleLogGenerationBulkSubscriptionItemMeta.error)
        && Objects.equals(this.status, sampleLogGenerationBulkSubscriptionItemMeta.status)
        && Objects.equals(
            this.additionalProperties,
            sampleLogGenerationBulkSubscriptionItemMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampleLogGenerationBulkSubscriptionItemMeta {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
