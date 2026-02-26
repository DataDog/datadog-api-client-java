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
   * <p>Defines a custom quota limit that applies to specific log events based on matching field values.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineQuotaProcessorOverride.JSON_PROPERTY_FIELDS,
  ObservabilityPipelineQuotaProcessorOverride.JSON_PROPERTY_LIMIT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineQuotaProcessorOverride {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<ObservabilityPipelineFieldValue> fields = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private ObservabilityPipelineQuotaProcessorLimit limit;

  public ObservabilityPipelineQuotaProcessorOverride() {}

  @JsonCreator
  public ObservabilityPipelineQuotaProcessorOverride(
            @JsonProperty(required=true, value=JSON_PROPERTY_FIELDS)List<ObservabilityPipelineFieldValue> fields,
            @JsonProperty(required=true, value=JSON_PROPERTY_LIMIT)ObservabilityPipelineQuotaProcessorLimit limit) {
        this.fields = fields;
        this.limit = limit;
        this.unparsed |= limit.unparsed;
  }
  public ObservabilityPipelineQuotaProcessorOverride fields(List<ObservabilityPipelineFieldValue> fields) {
    this.fields = fields;
    for (ObservabilityPipelineFieldValue item : fields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ObservabilityPipelineQuotaProcessorOverride addFieldsItem(ObservabilityPipelineFieldValue fieldsItem) {
    this.fields.add(fieldsItem);
    this.unparsed |= fieldsItem.unparsed;
    return this;
  }

  /**
   * <p>A list of field matchers used to apply a specific override. If an event matches all listed key-value pairs, the corresponding override limit is enforced.</p>
   * @return fields
  **/
      @JsonProperty(JSON_PROPERTY_FIELDS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ObservabilityPipelineFieldValue> getFields() {
        return fields;
      }
  public void setFields(List<ObservabilityPipelineFieldValue> fields) {
    this.fields = fields;
  }
  public ObservabilityPipelineQuotaProcessorOverride limit(ObservabilityPipelineQuotaProcessorLimit limit) {
    this.limit = limit;
    this.unparsed |= limit.unparsed;
    return this;
  }

  /**
   * <p>The maximum amount of data or number of events allowed before the quota is enforced. Can be specified in bytes or events.</p>
   * @return limit
  **/
      @JsonProperty(JSON_PROPERTY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineQuotaProcessorLimit getLimit() {
        return limit;
      }
  public void setLimit(ObservabilityPipelineQuotaProcessorLimit limit) {
    this.limit = limit;
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
   * @return ObservabilityPipelineQuotaProcessorOverride
   */
  @JsonAnySetter
  public ObservabilityPipelineQuotaProcessorOverride putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineQuotaProcessorOverride object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineQuotaProcessorOverride observabilityPipelineQuotaProcessorOverride = (ObservabilityPipelineQuotaProcessorOverride) o;
    return Objects.equals(this.fields, observabilityPipelineQuotaProcessorOverride.fields) && Objects.equals(this.limit, observabilityPipelineQuotaProcessorOverride.limit) && Objects.equals(this.additionalProperties, observabilityPipelineQuotaProcessorOverride.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(fields,limit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineQuotaProcessorOverride {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
