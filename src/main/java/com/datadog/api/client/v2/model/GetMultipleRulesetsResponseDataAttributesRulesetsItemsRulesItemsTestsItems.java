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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The definition of <code>
 * GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems</code> object.
 */
@JsonPropertyOrder({
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems
      .JSON_PROPERTY_ANNOTATION_COUNT,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems.JSON_PROPERTY_CODE,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems.JSON_PROPERTY_FILENAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATION_COUNT = "annotation_count";
  private Long annotationCount;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems annotationCount(
      Long annotationCount) {
    this.annotationCount = annotationCount;
    return this;
  }

  /**
   * The <code>items</code> <code>annotation_count</code>. minimum: 0 maximum: 65535
   *
   * @return annotationCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANNOTATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAnnotationCount() {
    return annotationCount;
  }

  public void setAnnotationCount(Long annotationCount) {
    this.annotationCount = annotationCount;
  }

  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems code(
      String code) {
    this.code = code;
    return this;
  }

  /**
   * The <code>items</code> <code>code</code>.
   *
   * @return code
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems filename(
      String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * The <code>items</code> <code>filename</code>.
   *
   * @return filename
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
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
   * @return GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems
   */
  @JsonAnySetter
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems
        getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems =
            (GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems) o;
    return Objects.equals(
            this.annotationCount,
            getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems
                .annotationCount)
        && Objects.equals(
            this.code,
            getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems.code)
        && Objects.equals(
            this.filename,
            getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems.filename)
        && Objects.equals(
            this.additionalProperties,
            getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationCount, code, filename, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems {\n");
    sb.append("    annotationCount: ").append(toIndentedString(annotationCount)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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
