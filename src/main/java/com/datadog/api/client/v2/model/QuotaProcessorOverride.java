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

/** The definition of <code>QuotaProcessorOverride</code> object. */
@JsonPropertyOrder({
  QuotaProcessorOverride.JSON_PROPERTY_FIELDS,
  QuotaProcessorOverride.JSON_PROPERTY_LIMIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QuotaProcessorOverride {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<FieldItem> fields = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private QuotaLimit limit;

  public QuotaProcessorOverride() {}

  @JsonCreator
  public QuotaProcessorOverride(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELDS) List<FieldItem> fields,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT) QuotaLimit limit) {
    this.fields = fields;
    this.limit = limit;
    this.unparsed |= limit.unparsed;
  }

  public QuotaProcessorOverride fields(List<FieldItem> fields) {
    this.fields = fields;
    for (FieldItem item : fields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public QuotaProcessorOverride addFieldsItem(FieldItem fieldsItem) {
    this.fields.add(fieldsItem);
    this.unparsed |= fieldsItem.unparsed;
    return this;
  }

  /**
   * The <code>QuotaProcessorOverride</code> <code>fields</code>.
   *
   * @return fields
   */
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FieldItem> getFields() {
    return fields;
  }

  public void setFields(List<FieldItem> fields) {
    this.fields = fields;
  }

  public QuotaProcessorOverride limit(QuotaLimit limit) {
    this.limit = limit;
    this.unparsed |= limit.unparsed;
    return this;
  }

  /**
   * Unified definition of <code>QuotaLimit</code> object.
   *
   * @return limit
   */
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public QuotaLimit getLimit() {
    return limit;
  }

  public void setLimit(QuotaLimit limit) {
    this.limit = limit;
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
   * @return QuotaProcessorOverride
   */
  @JsonAnySetter
  public QuotaProcessorOverride putAdditionalProperty(String key, Object value) {
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

  /** Return true if this QuotaProcessorOverride object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaProcessorOverride quotaProcessorOverride = (QuotaProcessorOverride) o;
    return Objects.equals(this.fields, quotaProcessorOverride.fields)
        && Objects.equals(this.limit, quotaProcessorOverride.limit)
        && Objects.equals(this.additionalProperties, quotaProcessorOverride.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, limit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaProcessorOverride {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
