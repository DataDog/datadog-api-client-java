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
   * <p>Relationships of a scanning rule.</p>
 */
@JsonPropertyOrder({
  SensitiveDataScannerRuleRelationships.JSON_PROPERTY_GROUP,
  SensitiveDataScannerRuleRelationships.JSON_PROPERTY_STANDARD_PATTERN
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerRuleRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP = "group";
  private SensitiveDataScannerGroupData group;

  public static final String JSON_PROPERTY_STANDARD_PATTERN = "standard_pattern";
  private SensitiveDataScannerStandardPatternData standardPattern;

  public SensitiveDataScannerRuleRelationships group(SensitiveDataScannerGroupData group) {
    this.group = group;
    this.unparsed |= group.unparsed;
    return this;
  }

  /**
   * <p>A scanning group data.</p>
   * @return group
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SensitiveDataScannerGroupData getGroup() {
        return group;
      }
  public void setGroup(SensitiveDataScannerGroupData group) {
    this.group = group;
  }
  public SensitiveDataScannerRuleRelationships standardPattern(SensitiveDataScannerStandardPatternData standardPattern) {
    this.standardPattern = standardPattern;
    this.unparsed |= standardPattern.unparsed;
    return this;
  }

  /**
   * <p>A standard pattern.</p>
   * @return standardPattern
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STANDARD_PATTERN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SensitiveDataScannerStandardPatternData getStandardPattern() {
        return standardPattern;
      }
  public void setStandardPattern(SensitiveDataScannerStandardPatternData standardPattern) {
    this.standardPattern = standardPattern;
  }

  /**
   * Return true if this SensitiveDataScannerRuleRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerRuleRelationships sensitiveDataScannerRuleRelationships = (SensitiveDataScannerRuleRelationships) o;
    return Objects.equals(this.group, sensitiveDataScannerRuleRelationships.group) && Objects.equals(this.standardPattern, sensitiveDataScannerRuleRelationships.standardPattern);
  }


  @Override
  public int hashCode() {
    return Objects.hash(group,standardPattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerRuleRelationships {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    standardPattern: ").append(toIndentedString(standardPattern)).append("\n");
    sb.append("}");
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
