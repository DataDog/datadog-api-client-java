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

/** A warning about the response that isn't an error. */
@JsonPropertyOrder({
  ExperimentsBanditV2WarningDTO.JSON_PROPERTY_CODE,
  ExperimentsBanditV2WarningDTO.JSON_PROPERTY_DETAIL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditV2WarningDTO {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE = "code";
  private ExperimentsBanditV2WarningCode code;

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public ExperimentsBanditV2WarningDTO() {}

  @JsonCreator
  public ExperimentsBanditV2WarningDTO(
      @JsonProperty(required = true, value = JSON_PROPERTY_CODE)
          ExperimentsBanditV2WarningCode code,
      @JsonProperty(required = true, value = JSON_PROPERTY_DETAIL) String detail) {
    this.code = code;
    this.unparsed |= !code.isValid();
    this.detail = detail;
  }

  public ExperimentsBanditV2WarningDTO code(ExperimentsBanditV2WarningCode code) {
    this.code = code;
    this.unparsed |= !code.isValid();
    return this;
  }

  /**
   * Code that identifies the warning. <code>datadog_flag_configuration_omitted</code> means the
   * caller lacks feature flag or environment read permissions, so the response leaves out <code>
   * datadog_flag_configuration</code>.
   *
   * @return code
   */
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditV2WarningCode getCode() {
    return code;
  }

  public void setCode(ExperimentsBanditV2WarningCode code) {
    if (!code.isValid()) {
      this.unparsed = true;
    }
    this.code = code;
  }

  public ExperimentsBanditV2WarningDTO detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Explanation of the warning.
   *
   * @return detail
   */
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
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
   * @return ExperimentsBanditV2WarningDTO
   */
  @JsonAnySetter
  public ExperimentsBanditV2WarningDTO putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditV2WarningDTO object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditV2WarningDTO experimentsBanditV2WarningDto = (ExperimentsBanditV2WarningDTO) o;
    return Objects.equals(this.code, experimentsBanditV2WarningDto.code)
        && Objects.equals(this.detail, experimentsBanditV2WarningDto.detail)
        && Objects.equals(
            this.additionalProperties, experimentsBanditV2WarningDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, detail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditV2WarningDTO {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
