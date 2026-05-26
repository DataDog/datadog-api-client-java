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

/** Response attributes of an AI memory violation result. */
@JsonPropertyOrder({
  AiMemoryViolationResultResponseAttributes.JSON_PROPERTY_CREATED_AT,
  AiMemoryViolationResultResponseAttributes.JSON_PROPERTY_CREATED_BY,
  AiMemoryViolationResultResponseAttributes.JSON_PROPERTY_LINE,
  AiMemoryViolationResultResponseAttributes.JSON_PROPERTY_MESSAGE,
  AiMemoryViolationResultResponseAttributes.JSON_PROPERTY_NAME,
  AiMemoryViolationResultResponseAttributes.JSON_PROPERTY_REPOSITORY_ID,
  AiMemoryViolationResultResponseAttributes.JSON_PROPERTY_RULE,
  AiMemoryViolationResultResponseAttributes.JSON_PROPERTY_SHA,
  AiMemoryViolationResultResponseAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiMemoryViolationResultResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_LINE = "line";
  private Long line;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repository_id";
  private String repositoryId;

  public static final String JSON_PROPERTY_RULE = "rule";
  private String rule;

  public static final String JSON_PROPERTY_SHA = "sha";
  private String sha;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AiMemoryViolationType type;

  public AiMemoryViolationResultResponseAttributes() {}

  @JsonCreator
  public AiMemoryViolationResultResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_LINE) Long line,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_REPOSITORY_ID) String repositoryId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE) String rule,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHA) String sha,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) AiMemoryViolationType type) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.line = line;
    this.message = message;
    this.name = name;
    this.repositoryId = repositoryId;
    this.rule = rule;
    this.sha = sha;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AiMemoryViolationResultResponseAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation timestamp.
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

  public AiMemoryViolationResultResponseAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The identifier of the user who created the result.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public AiMemoryViolationResultResponseAttributes line(Long line) {
    this.line = line;
    return this;
  }

  /**
   * The line number where the violation was found.
   *
   * @return line
   */
  @JsonProperty(JSON_PROPERTY_LINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLine() {
    return line;
  }

  public void setLine(Long line) {
    this.line = line;
  }

  public AiMemoryViolationResultResponseAttributes message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A message explaining the violation result.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AiMemoryViolationResultResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The file path where the violation was found.
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

  public AiMemoryViolationResultResponseAttributes repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  /**
   * The repository identifier.
   *
   * @return repositoryId
   */
  @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }

  public AiMemoryViolationResultResponseAttributes rule(String rule) {
    this.rule = rule;
    return this;
  }

  /**
   * The rule identifier in the format ruleset/rule.
   *
   * @return rule
   */
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  public AiMemoryViolationResultResponseAttributes sha(String sha) {
    this.sha = sha;
    return this;
  }

  /**
   * The git commit SHA where the violation was found.
   *
   * @return sha
   */
  @JsonProperty(JSON_PROPERTY_SHA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public AiMemoryViolationResultResponseAttributes type(AiMemoryViolationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of AI memory violation result indicating whether it is a true positive or false
   * positive.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiMemoryViolationType getType() {
    return type;
  }

  public void setType(AiMemoryViolationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return AiMemoryViolationResultResponseAttributes
   */
  @JsonAnySetter
  public AiMemoryViolationResultResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiMemoryViolationResultResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiMemoryViolationResultResponseAttributes aiMemoryViolationResultResponseAttributes =
        (AiMemoryViolationResultResponseAttributes) o;
    return Objects.equals(this.createdAt, aiMemoryViolationResultResponseAttributes.createdAt)
        && Objects.equals(this.createdBy, aiMemoryViolationResultResponseAttributes.createdBy)
        && Objects.equals(this.line, aiMemoryViolationResultResponseAttributes.line)
        && Objects.equals(this.message, aiMemoryViolationResultResponseAttributes.message)
        && Objects.equals(this.name, aiMemoryViolationResultResponseAttributes.name)
        && Objects.equals(this.repositoryId, aiMemoryViolationResultResponseAttributes.repositoryId)
        && Objects.equals(this.rule, aiMemoryViolationResultResponseAttributes.rule)
        && Objects.equals(this.sha, aiMemoryViolationResultResponseAttributes.sha)
        && Objects.equals(this.type, aiMemoryViolationResultResponseAttributes.type)
        && Objects.equals(
            this.additionalProperties,
            aiMemoryViolationResultResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        line,
        message,
        name,
        repositoryId,
        rule,
        sha,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiMemoryViolationResultResponseAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
