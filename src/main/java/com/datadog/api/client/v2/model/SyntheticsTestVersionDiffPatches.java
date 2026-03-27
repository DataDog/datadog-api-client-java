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

/** Object describing a patch in the diff. */
@JsonPropertyOrder({
  SyntheticsTestVersionDiffPatches.JSON_PROPERTY_DIFFS,
  SyntheticsTestVersionDiffPatches.JSON_PROPERTY_LENGTH1,
  SyntheticsTestVersionDiffPatches.JSON_PROPERTY_LENGTH2,
  SyntheticsTestVersionDiffPatches.JSON_PROPERTY_START1,
  SyntheticsTestVersionDiffPatches.JSON_PROPERTY_START2
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestVersionDiffPatches {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIFFS = "diffs";
  private List<SyntheticsTestVersionDiffPatchDiff> diffs = null;

  public static final String JSON_PROPERTY_LENGTH1 = "length1";
  private Long length1;

  public static final String JSON_PROPERTY_LENGTH2 = "length2";
  private Long length2;

  public static final String JSON_PROPERTY_START1 = "start1";
  private Long start1;

  public static final String JSON_PROPERTY_START2 = "start2";
  private Long start2;

  public SyntheticsTestVersionDiffPatches diffs(List<SyntheticsTestVersionDiffPatchDiff> diffs) {
    this.diffs = diffs;
    for (SyntheticsTestVersionDiffPatchDiff item : diffs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestVersionDiffPatches addDiffsItem(
      SyntheticsTestVersionDiffPatchDiff diffsItem) {
    if (this.diffs == null) {
      this.diffs = new ArrayList<>();
    }
    this.diffs.add(diffsItem);
    this.unparsed |= diffsItem.unparsed;
    return this;
  }

  /**
   * List of individual diff operations.
   *
   * @return diffs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIFFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestVersionDiffPatchDiff> getDiffs() {
    return diffs;
  }

  public void setDiffs(List<SyntheticsTestVersionDiffPatchDiff> diffs) {
    this.diffs = diffs;
  }

  public SyntheticsTestVersionDiffPatches length1(Long length1) {
    this.length1 = length1;
    return this;
  }

  /**
   * Length of the original text segment.
   *
   * @return length1
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLength1() {
    return length1;
  }

  public void setLength1(Long length1) {
    this.length1 = length1;
  }

  public SyntheticsTestVersionDiffPatches length2(Long length2) {
    this.length2 = length2;
    return this;
  }

  /**
   * Length of the modified text segment.
   *
   * @return length2
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLength2() {
    return length2;
  }

  public void setLength2(Long length2) {
    this.length2 = length2;
  }

  public SyntheticsTestVersionDiffPatches start1(Long start1) {
    this.start1 = start1;
    return this;
  }

  /**
   * Start position in the original text.
   *
   * @return start1
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStart1() {
    return start1;
  }

  public void setStart1(Long start1) {
    this.start1 = start1;
  }

  public SyntheticsTestVersionDiffPatches start2(Long start2) {
    this.start2 = start2;
    return this;
  }

  /**
   * Start position in the modified text.
   *
   * @return start2
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStart2() {
    return start2;
  }

  public void setStart2(Long start2) {
    this.start2 = start2;
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
   * @return SyntheticsTestVersionDiffPatches
   */
  @JsonAnySetter
  public SyntheticsTestVersionDiffPatches putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestVersionDiffPatches object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestVersionDiffPatches syntheticsTestVersionDiffPatches =
        (SyntheticsTestVersionDiffPatches) o;
    return Objects.equals(this.diffs, syntheticsTestVersionDiffPatches.diffs)
        && Objects.equals(this.length1, syntheticsTestVersionDiffPatches.length1)
        && Objects.equals(this.length2, syntheticsTestVersionDiffPatches.length2)
        && Objects.equals(this.start1, syntheticsTestVersionDiffPatches.start1)
        && Objects.equals(this.start2, syntheticsTestVersionDiffPatches.start2)
        && Objects.equals(
            this.additionalProperties, syntheticsTestVersionDiffPatches.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diffs, length1, length2, start1, start2, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestVersionDiffPatches {\n");
    sb.append("    diffs: ").append(toIndentedString(diffs)).append("\n");
    sb.append("    length1: ").append(toIndentedString(length1)).append("\n");
    sb.append("    length2: ").append(toIndentedString(length2)).append("\n");
    sb.append("    start1: ").append(toIndentedString(start1)).append("\n");
    sb.append("    start2: ").append(toIndentedString(start2)).append("\n");
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
