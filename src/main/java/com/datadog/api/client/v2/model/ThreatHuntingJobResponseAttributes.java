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
   * <p>Threat hunting job attributes.</p>
 */
@JsonPropertyOrder({
  ThreatHuntingJobResponseAttributes.JSON_PROPERTY_CREATED_AT,
  ThreatHuntingJobResponseAttributes.JSON_PROPERTY_CREATED_BY_HANDLE,
  ThreatHuntingJobResponseAttributes.JSON_PROPERTY_CREATED_BY_NAME,
  ThreatHuntingJobResponseAttributes.JSON_PROPERTY_CREATED_FROM_RULE_ID,
  ThreatHuntingJobResponseAttributes.JSON_PROPERTY_JOB_DEFINITION,
  ThreatHuntingJobResponseAttributes.JSON_PROPERTY_JOB_NAME,
  ThreatHuntingJobResponseAttributes.JSON_PROPERTY_JOB_STATUS,
  ThreatHuntingJobResponseAttributes.JSON_PROPERTY_MODIFIED_AT,
  ThreatHuntingJobResponseAttributes.JSON_PROPERTY_SIGNAL_OUTPUT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ThreatHuntingJobResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_CREATED_BY_HANDLE = "createdByHandle";
  private String createdByHandle;

  public static final String JSON_PROPERTY_CREATED_BY_NAME = "createdByName";
  private String createdByName;

  public static final String JSON_PROPERTY_CREATED_FROM_RULE_ID = "createdFromRuleId";
  private String createdFromRuleId;

  public static final String JSON_PROPERTY_JOB_DEFINITION = "jobDefinition";
  private JobDefinition jobDefinition;

  public static final String JSON_PROPERTY_JOB_NAME = "jobName";
  private String jobName;

  public static final String JSON_PROPERTY_JOB_STATUS = "jobStatus";
  private String jobStatus;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private String modifiedAt;

  public static final String JSON_PROPERTY_SIGNAL_OUTPUT = "signalOutput";
  private Boolean signalOutput;

  public ThreatHuntingJobResponseAttributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Time when the job was created.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  public ThreatHuntingJobResponseAttributes createdByHandle(String createdByHandle) {
    this.createdByHandle = createdByHandle;
    return this;
  }

  /**
   * <p>The handle of the user who created the job.</p>
   * @return createdByHandle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY_HANDLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedByHandle() {
        return createdByHandle;
      }
  public void setCreatedByHandle(String createdByHandle) {
    this.createdByHandle = createdByHandle;
  }
  public ThreatHuntingJobResponseAttributes createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
  }

  /**
   * <p>The name of the user who created the job.</p>
   * @return createdByName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedByName() {
        return createdByName;
      }
  public void setCreatedByName(String createdByName) {
    this.createdByName = createdByName;
  }
  public ThreatHuntingJobResponseAttributes createdFromRuleId(String createdFromRuleId) {
    this.createdFromRuleId = createdFromRuleId;
    return this;
  }

  /**
   * <p>ID of the rule used to create the job (if it is created from a rule).</p>
   * @return createdFromRuleId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_FROM_RULE_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedFromRuleId() {
        return createdFromRuleId;
      }
  public void setCreatedFromRuleId(String createdFromRuleId) {
    this.createdFromRuleId = createdFromRuleId;
  }
  public ThreatHuntingJobResponseAttributes jobDefinition(JobDefinition jobDefinition) {
    this.jobDefinition = jobDefinition;
    this.unparsed |= jobDefinition.unparsed;
    return this;
  }

  /**
   * <p>Definition of a threat hunting job.</p>
   * @return jobDefinition
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_JOB_DEFINITION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public JobDefinition getJobDefinition() {
        return jobDefinition;
      }
  public void setJobDefinition(JobDefinition jobDefinition) {
    this.jobDefinition = jobDefinition;
  }
  public ThreatHuntingJobResponseAttributes jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

  /**
   * <p>Job name.</p>
   * @return jobName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_JOB_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getJobName() {
        return jobName;
      }
  public void setJobName(String jobName) {
    this.jobName = jobName;
  }
  public ThreatHuntingJobResponseAttributes jobStatus(String jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

  /**
   * <p>Job status.</p>
   * @return jobStatus
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_JOB_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getJobStatus() {
        return jobStatus;
      }
  public void setJobStatus(String jobStatus) {
    this.jobStatus = jobStatus;
  }
  public ThreatHuntingJobResponseAttributes modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>Last modification time of the job.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getModifiedAt() {
        return modifiedAt;
      }
  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public ThreatHuntingJobResponseAttributes signalOutput(Boolean signalOutput) {
    this.signalOutput = signalOutput;
    return this;
  }

  /**
   * <p>Whether the job outputs signals.</p>
   * @return signalOutput
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SIGNAL_OUTPUT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getSignalOutput() {
        return signalOutput;
      }
  public void setSignalOutput(Boolean signalOutput) {
    this.signalOutput = signalOutput;
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
   * @return ThreatHuntingJobResponseAttributes
   */
  @JsonAnySetter
  public ThreatHuntingJobResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ThreatHuntingJobResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreatHuntingJobResponseAttributes threatHuntingJobResponseAttributes = (ThreatHuntingJobResponseAttributes) o;
    return Objects.equals(this.createdAt, threatHuntingJobResponseAttributes.createdAt) && Objects.equals(this.createdByHandle, threatHuntingJobResponseAttributes.createdByHandle) && Objects.equals(this.createdByName, threatHuntingJobResponseAttributes.createdByName) && Objects.equals(this.createdFromRuleId, threatHuntingJobResponseAttributes.createdFromRuleId) && Objects.equals(this.jobDefinition, threatHuntingJobResponseAttributes.jobDefinition) && Objects.equals(this.jobName, threatHuntingJobResponseAttributes.jobName) && Objects.equals(this.jobStatus, threatHuntingJobResponseAttributes.jobStatus) && Objects.equals(this.modifiedAt, threatHuntingJobResponseAttributes.modifiedAt) && Objects.equals(this.signalOutput, threatHuntingJobResponseAttributes.signalOutput) && Objects.equals(this.additionalProperties, threatHuntingJobResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,createdByHandle,createdByName,createdFromRuleId,jobDefinition,jobName,jobStatus,modifiedAt,signalOutput, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreatHuntingJobResponseAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByHandle: ").append(toIndentedString(createdByHandle)).append("\n");
    sb.append("    createdByName: ").append(toIndentedString(createdByName)).append("\n");
    sb.append("    createdFromRuleId: ").append(toIndentedString(createdFromRuleId)).append("\n");
    sb.append("    jobDefinition: ").append(toIndentedString(jobDefinition)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    signalOutput: ").append(toIndentedString(signalOutput)).append("\n");
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
