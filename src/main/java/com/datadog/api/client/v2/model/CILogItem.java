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

/** A CI job log line. */
@JsonPropertyOrder({
  CILogItem.JSON_PROPERTY_DDTAGS,
  CILogItem.JSON_PROPERTY_JOB_ID,
  CILogItem.JSON_PROPERTY_LINE_NUMBER,
  CILogItem.JSON_PROPERTY_MESSAGE,
  CILogItem.JSON_PROPERTY_PIPELINE_UNIQUE_ID,
  CILogItem.JSON_PROPERTY_PROVIDER_NAME,
  CILogItem.JSON_PROPERTY_SECTION_NAME,
  CILogItem.JSON_PROPERTY_STATUS,
  CILogItem.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CILogItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DDTAGS = "ddtags";
  private String ddtags;

  public static final String JSON_PROPERTY_JOB_ID = "job_id";
  private String jobId;

  public static final String JSON_PROPERTY_LINE_NUMBER = "line_number";
  private Long lineNumber;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_PIPELINE_UNIQUE_ID = "pipeline_unique_id";
  private String pipelineUniqueId;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "provider_name";
  private String providerName;

  public static final String JSON_PROPERTY_SECTION_NAME = "section_name";
  private String sectionName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public CILogItem() {}

  @JsonCreator
  public CILogItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_JOB_ID) String jobId,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_PIPELINE_UNIQUE_ID)
          String pipelineUniqueId) {
    this.jobId = jobId;
    this.message = message;
    this.pipelineUniqueId = pipelineUniqueId;
  }

  public CILogItem ddtags(String ddtags) {
    this.ddtags = ddtags;
    return this;
  }

  /**
   * Comma-separated <code>key:value</code> tags. A job can have up to 256 tags, including repeated
   * keys.
   *
   * @return ddtags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DDTAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDdtags() {
    return ddtags;
  }

  public void setDdtags(String ddtags) {
    this.ddtags = ddtags;
  }

  public CILogItem jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * The job event's <code>resource.id</code>, sent through the CI Visibility pipeline API.
   *
   * @return jobId
   */
  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public CILogItem lineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * The line number in the job log. Use 0 or 1 for the first line. minimum: 0 maximum:
   * 9223372036854775807
   *
   * @return lineNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
  }

  public CILogItem message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The non-empty log line message.
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

  public CILogItem pipelineUniqueId(String pipelineUniqueId) {
    this.pipelineUniqueId = pipelineUniqueId;
    return this;
  }

  /**
   * The <code>resource.unique_id</code> of the pipeline event, which must also match the job
   * event's <code>resource.pipeline_unique_id</code>.
   *
   * @return pipelineUniqueId
   */
  @JsonProperty(JSON_PROPERTY_PIPELINE_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPipelineUniqueId() {
    return pipelineUniqueId;
  }

  public void setPipelineUniqueId(String pipelineUniqueId) {
    this.pipelineUniqueId = pipelineUniqueId;
  }

  public CILogItem providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * The provider name sent with the pipeline event. It defaults to <code>custom</code> when omitted
   * and, when provided, must be non-empty and cannot contain a comma.
   *
   * @return providerName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public CILogItem sectionName(String sectionName) {
    this.sectionName = sectionName;
    return this;
  }

  /**
   * The provider-defined section containing this log line, used to display collapsible groups of
   * lines in the CI job log view.
   *
   * @return sectionName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSectionName() {
    return sectionName;
  }

  public void setSectionName(String sectionName) {
    this.sectionName = sectionName;
  }

  public CILogItem status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of this log line. Any string is accepted. Datadog maps non-empty values to a
   * standard log status. See <a
   * href="https://docs.datadoghq.com/logs/log_configuration/processors/log_status_remapper/">status
   * mapping</a>.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CILogItem timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The log line time in RFC 3339 format with an explicit timezone. If omitted, the intake time is
   * used. It can be at most 18 hours in the past or 12 hours in the future.
   *
   * @return timestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
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
   * @return CILogItem
   */
  @JsonAnySetter
  public CILogItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CILogItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CILogItem ciLogItem = (CILogItem) o;
    return Objects.equals(this.ddtags, ciLogItem.ddtags)
        && Objects.equals(this.jobId, ciLogItem.jobId)
        && Objects.equals(this.lineNumber, ciLogItem.lineNumber)
        && Objects.equals(this.message, ciLogItem.message)
        && Objects.equals(this.pipelineUniqueId, ciLogItem.pipelineUniqueId)
        && Objects.equals(this.providerName, ciLogItem.providerName)
        && Objects.equals(this.sectionName, ciLogItem.sectionName)
        && Objects.equals(this.status, ciLogItem.status)
        && Objects.equals(this.timestamp, ciLogItem.timestamp)
        && Objects.equals(this.additionalProperties, ciLogItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ddtags,
        jobId,
        lineNumber,
        message,
        pipelineUniqueId,
        providerName,
        sectionName,
        status,
        timestamp,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CILogItem {\n");
    sb.append("    ddtags: ").append(toIndentedString(ddtags)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    pipelineUniqueId: ").append(toIndentedString(pipelineUniqueId)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
