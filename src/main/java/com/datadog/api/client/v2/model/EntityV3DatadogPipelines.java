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
   * <p>CI Pipelines association.</p>
 */
@JsonPropertyOrder({
  EntityV3DatadogPipelines.JSON_PROPERTY_FINGERPRINTS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3DatadogPipelines {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FINGERPRINTS = "fingerprints";
  private List<String> fingerprints = null;

  public EntityV3DatadogPipelines fingerprints(List<String> fingerprints) {
    this.fingerprints = fingerprints;
    return this;
  }
  public EntityV3DatadogPipelines addFingerprintsItem(String fingerprintsItem) {
    if (this.fingerprints == null) {
      this.fingerprints = new ArrayList<>();
    }
    this.fingerprints.add(fingerprintsItem);
    return this;
  }

  /**
   * <p>A list of CI Fingerprints that associate CI Pipelines with the entity.</p>
   * @return fingerprints
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FINGERPRINTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getFingerprints() {
        return fingerprints;
      }
  public void setFingerprints(List<String> fingerprints) {
    this.fingerprints = fingerprints;
  }

  /**
   * Return true if this EntityV3DatadogPipelines object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3DatadogPipelines entityV3DatadogPipelines = (EntityV3DatadogPipelines) o;
    return Objects.equals(this.fingerprints, entityV3DatadogPipelines.fingerprints);
  }


  @Override
  public int hashCode() {
    return Objects.hash(fingerprints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3DatadogPipelines {\n");
    sb.append("    fingerprints: ").append(toIndentedString(fingerprints)).append("\n");
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
