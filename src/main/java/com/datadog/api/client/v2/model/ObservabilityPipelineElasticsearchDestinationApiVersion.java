/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** The Elasticsearch API version to use. Set to <code>auto</code> to auto-detect. */
@JsonSerialize(
    using =
        ObservabilityPipelineElasticsearchDestinationApiVersion
            .ObservabilityPipelineElasticsearchDestinationApiVersionSerializer.class)
public class ObservabilityPipelineElasticsearchDestinationApiVersion extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "v6", "v7", "v8"));

  public static final ObservabilityPipelineElasticsearchDestinationApiVersion AUTO =
      new ObservabilityPipelineElasticsearchDestinationApiVersion("auto");
  public static final ObservabilityPipelineElasticsearchDestinationApiVersion V6 =
      new ObservabilityPipelineElasticsearchDestinationApiVersion("v6");
  public static final ObservabilityPipelineElasticsearchDestinationApiVersion V7 =
      new ObservabilityPipelineElasticsearchDestinationApiVersion("v7");
  public static final ObservabilityPipelineElasticsearchDestinationApiVersion V8 =
      new ObservabilityPipelineElasticsearchDestinationApiVersion("v8");

  ObservabilityPipelineElasticsearchDestinationApiVersion(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineElasticsearchDestinationApiVersionSerializer
      extends StdSerializer<ObservabilityPipelineElasticsearchDestinationApiVersion> {
    public ObservabilityPipelineElasticsearchDestinationApiVersionSerializer(
        Class<ObservabilityPipelineElasticsearchDestinationApiVersion> t) {
      super(t);
    }

    public ObservabilityPipelineElasticsearchDestinationApiVersionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineElasticsearchDestinationApiVersion value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineElasticsearchDestinationApiVersion fromValue(String value) {
    return new ObservabilityPipelineElasticsearchDestinationApiVersion(value);
  }
}
