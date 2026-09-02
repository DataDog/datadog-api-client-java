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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Optional parameters for bulk deleting metric tag configurations. */
@JsonPropertyOrder({MetricBulkTagConfigDeleteAttributes.JSON_PROPERTY_EMAILS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricBulkTagConfigDeleteAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<String> emails = null;

  public MetricBulkTagConfigDeleteAttributes emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public MetricBulkTagConfigDeleteAttributes addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * A list of account emails to notify when the configuration is applied.
   *
   * @return emails
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
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
   * @return MetricBulkTagConfigDeleteAttributes
   */
  @JsonAnySetter
  public MetricBulkTagConfigDeleteAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MetricBulkTagConfigDeleteAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricBulkTagConfigDeleteAttributes metricBulkTagConfigDeleteAttributes =
        (MetricBulkTagConfigDeleteAttributes) o;
    return Objects.equals(this.emails, metricBulkTagConfigDeleteAttributes.emails)
        && Objects.equals(
            this.additionalProperties, metricBulkTagConfigDeleteAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricBulkTagConfigDeleteAttributes {\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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
