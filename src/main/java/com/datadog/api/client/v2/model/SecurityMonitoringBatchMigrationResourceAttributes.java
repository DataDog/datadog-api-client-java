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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Attributes of a batch migration resource. */
@JsonPropertyOrder({
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_BATCH_ID,
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_CREATED_AT,
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_CREATED_BY,
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_DESCRIPTION,
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_INPUT,
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_INPUT_TYPE,
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_LAST_UPDATED_AT,
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_LAST_UPDATED_BY,
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_NAME,
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_OUTPUT,
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_OUTPUT_TYPE,
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_RULE_ID,
  SecurityMonitoringBatchMigrationResourceAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringBatchMigrationResourceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BATCH_ID = "batchId";
  private UUID batchId;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INPUT = "input";
  private String input;

  public static final String JSON_PROPERTY_INPUT_TYPE = "inputType";
  private SecurityMonitoringBatchMigrationResourceInputType inputType;

  public static final String JSON_PROPERTY_LAST_UPDATED_AT = "lastUpdatedAt";
  private OffsetDateTime lastUpdatedAt;

  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "lastUpdatedBy";
  private String lastUpdatedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  private Map<String, Object> output = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_OUTPUT_TYPE = "outputType";
  private String outputType;

  public static final String JSON_PROPERTY_RULE_ID = "ruleId";
  private String ruleId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SecurityMonitoringBatchMigrationResourceStatus status;

  public SecurityMonitoringBatchMigrationResourceAttributes() {}

  @JsonCreator
  public SecurityMonitoringBatchMigrationResourceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_BATCH_ID) UUID batchId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT) String input,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT_TYPE)
          SecurityMonitoringBatchMigrationResourceInputType inputType,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_UPDATED_AT)
          OffsetDateTime lastUpdatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OUTPUT) Map<String, Object> output,
      @JsonProperty(required = true, value = JSON_PROPERTY_OUTPUT_TYPE) String outputType,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          SecurityMonitoringBatchMigrationResourceStatus status) {
    this.batchId = batchId;
    this.createdAt = createdAt;
    this.input = input;
    this.inputType = inputType;
    this.unparsed |= !inputType.isValid();
    this.lastUpdatedAt = lastUpdatedAt;
    this.name = name;
    this.output = output;
    if (output != null) {}
    this.outputType = outputType;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public SecurityMonitoringBatchMigrationResourceAttributes batchId(UUID batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * The UUID of the batch migration that contains the resource.
   *
   * @return batchId
   */
  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getBatchId() {
    return batchId;
  }

  public void setBatchId(UUID batchId) {
    this.batchId = batchId;
  }

  public SecurityMonitoringBatchMigrationResourceAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation date of the resource, in RFC 3339 format.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SecurityMonitoringBatchMigrationResourceAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The UUID of the user or service account who created the resource.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public SecurityMonitoringBatchMigrationResourceAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the resource.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecurityMonitoringBatchMigrationResourceAttributes input(String input) {
    this.input = input;
    return this;
  }

  /**
   * The source query or natural language description to translate.
   *
   * @return input
   */
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public SecurityMonitoringBatchMigrationResourceAttributes inputType(
      SecurityMonitoringBatchMigrationResourceInputType inputType) {
    this.inputType = inputType;
    this.unparsed |= !inputType.isValid();
    return this;
  }

  /**
   * The type of the source rule: <code>spl</code> for a Splunk SPL search or saved search
   * definition, <code>natural_language</code> for a plain-English description of the behavior to
   * detect, or <code>kql</code> for a Microsoft KQL query. SPL inputs must be self-contained, with
   * search macros expanded.
   *
   * @return inputType
   */
  @JsonProperty(JSON_PROPERTY_INPUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringBatchMigrationResourceInputType getInputType() {
    return inputType;
  }

  public void setInputType(SecurityMonitoringBatchMigrationResourceInputType inputType) {
    if (!inputType.isValid()) {
      this.unparsed = true;
    }
    this.inputType = inputType;
  }

  public SecurityMonitoringBatchMigrationResourceAttributes lastUpdatedAt(
      OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  /**
   * The last update date of the resource, in RFC 3339 format.
   *
   * @return lastUpdatedAt
   */
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public SecurityMonitoringBatchMigrationResourceAttributes lastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  /**
   * The UUID of the user or service account who last updated the resource, or the name of a system
   * actor.
   *
   * @return lastUpdatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public SecurityMonitoringBatchMigrationResourceAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the resource.
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

  public SecurityMonitoringBatchMigrationResourceAttributes output(Map<String, Object> output) {
    this.output = output;
    if (output != null) {}
    return this;
  }

  public SecurityMonitoringBatchMigrationResourceAttributes putOutputItem(
      String key, Object outputItem) {
    this.output.put(key, outputItem);
    return this;
  }

  /**
   * The translation output. When the resource is <code>completed</code>, a Cloud SIEM detection
   * rule definition in the same format as the create detection rule API. When the resource is
   * <code>failed</code>, an object with an <code>error</code> describing the failure, with <code>
   * kind</code> set to <code>translation_error</code> or <code>internal_error</code>, and optional
   * <code>type</code> and <code>message</code>. Otherwise, null.
   *
   * @return output
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getOutput() {
    return output;
  }

  public void setOutput(Map<String, Object> output) {
    this.output = output;
  }

  public SecurityMonitoringBatchMigrationResourceAttributes outputType(String outputType) {
    this.outputType = outputType;
    return this;
  }

  /**
   * The type of the translation output. Currently always <code>siem_rule</code>.
   *
   * @return outputType
   */
  @JsonProperty(JSON_PROPERTY_OUTPUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOutputType() {
    return outputType;
  }

  public void setOutputType(String outputType) {
    this.outputType = outputType;
  }

  public SecurityMonitoringBatchMigrationResourceAttributes ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * The ID of the Cloud SIEM detection rule created when the resource was published.
   *
   * @return ruleId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public SecurityMonitoringBatchMigrationResourceAttributes status(
      SecurityMonitoringBatchMigrationResourceStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of a batch migration resource. <code>completed</code> resources have a translation
   * in <code>output</code> that is ready to be published. <code>duplicate</code> is reserved for
   * future duplicate rule detection.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringBatchMigrationResourceStatus getStatus() {
    return status;
  }

  public void setStatus(SecurityMonitoringBatchMigrationResourceStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
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
   * @return SecurityMonitoringBatchMigrationResourceAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringBatchMigrationResourceAttributes putAdditionalProperty(
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

  /**
   * Return true if this SecurityMonitoringBatchMigrationResourceAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringBatchMigrationResourceAttributes
        securityMonitoringBatchMigrationResourceAttributes =
            (SecurityMonitoringBatchMigrationResourceAttributes) o;
    return Objects.equals(this.batchId, securityMonitoringBatchMigrationResourceAttributes.batchId)
        && Objects.equals(
            this.createdAt, securityMonitoringBatchMigrationResourceAttributes.createdAt)
        && Objects.equals(
            this.createdBy, securityMonitoringBatchMigrationResourceAttributes.createdBy)
        && Objects.equals(
            this.description, securityMonitoringBatchMigrationResourceAttributes.description)
        && Objects.equals(this.input, securityMonitoringBatchMigrationResourceAttributes.input)
        && Objects.equals(
            this.inputType, securityMonitoringBatchMigrationResourceAttributes.inputType)
        && Objects.equals(
            this.lastUpdatedAt, securityMonitoringBatchMigrationResourceAttributes.lastUpdatedAt)
        && Objects.equals(
            this.lastUpdatedBy, securityMonitoringBatchMigrationResourceAttributes.lastUpdatedBy)
        && Objects.equals(this.name, securityMonitoringBatchMigrationResourceAttributes.name)
        && Objects.equals(this.output, securityMonitoringBatchMigrationResourceAttributes.output)
        && Objects.equals(
            this.outputType, securityMonitoringBatchMigrationResourceAttributes.outputType)
        && Objects.equals(this.ruleId, securityMonitoringBatchMigrationResourceAttributes.ruleId)
        && Objects.equals(this.status, securityMonitoringBatchMigrationResourceAttributes.status)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringBatchMigrationResourceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        batchId,
        createdAt,
        createdBy,
        description,
        input,
        inputType,
        lastUpdatedAt,
        lastUpdatedBy,
        name,
        output,
        outputType,
        ruleId,
        status,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringBatchMigrationResourceAttributes {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
