/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Description of the CI provider. */
@JsonPropertyOrder({
  SyntheticsCIBatchMetadataCI.JSON_PROPERTY_PIPELINE,
  SyntheticsCIBatchMetadataCI.JSON_PROPERTY_PROVIDER
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsCIBatchMetadataCI {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PIPELINE = "pipeline";
  private SyntheticsCIBatchMetadataPipeline pipeline;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private SyntheticsCIBatchMetadataProvider provider;

  public SyntheticsCIBatchMetadataCI pipeline(SyntheticsCIBatchMetadataPipeline pipeline) {
    this.pipeline = pipeline;
    this.unparsed |= pipeline.unparsed;
    return this;
  }

  /**
   * Description of the CI pipeline.
   *
   * @return pipeline
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIPELINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsCIBatchMetadataPipeline getPipeline() {
    return pipeline;
  }

  public void setPipeline(SyntheticsCIBatchMetadataPipeline pipeline) {
    this.pipeline = pipeline;
  }

  public SyntheticsCIBatchMetadataCI provider(SyntheticsCIBatchMetadataProvider provider) {
    this.provider = provider;
    this.unparsed |= provider.unparsed;
    return this;
  }

  /**
   * Description of the CI provider.
   *
   * @return provider
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsCIBatchMetadataProvider getProvider() {
    return provider;
  }

  public void setProvider(SyntheticsCIBatchMetadataProvider provider) {
    this.provider = provider;
  }

  /** Return true if this SyntheticsCIBatchMetadataCI object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsCIBatchMetadataCI syntheticsCiBatchMetadataCi = (SyntheticsCIBatchMetadataCI) o;
    return Objects.equals(this.pipeline, syntheticsCiBatchMetadataCi.pipeline)
        && Objects.equals(this.provider, syntheticsCiBatchMetadataCi.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipeline, provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsCIBatchMetadataCI {\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("}");
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
