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

/**
 * Insert format for events sent to ClickHouse. - <code>json_each_row</code>: Maps event fields to
 * columns by name (ClickHouse <code>JSONEachRow</code>). - <code>json_as_object</code>: Inserts
 * each event into a single <code>Object('json')</code> / <code>JSON</code> column (ClickHouse
 * <code>JSONAsObject</code>). - <code>json_as_string</code>: Inserts each event into a single
 * <code>String</code>-typed column as raw JSON (ClickHouse <code>JSONAsString</code>). - <code>
 * arrow_stream</code>: Batches events using Apache Arrow IPC streaming format. Requires <code>
 * batch_encoding</code>.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineClickhouseDestinationFormat
            .ObservabilityPipelineClickhouseDestinationFormatSerializer.class)
public class ObservabilityPipelineClickhouseDestinationFormat extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("json_each_row", "json_as_object", "json_as_string", "arrow_stream"));

  public static final ObservabilityPipelineClickhouseDestinationFormat JSON_EACH_ROW =
      new ObservabilityPipelineClickhouseDestinationFormat("json_each_row");
  public static final ObservabilityPipelineClickhouseDestinationFormat JSON_AS_OBJECT =
      new ObservabilityPipelineClickhouseDestinationFormat("json_as_object");
  public static final ObservabilityPipelineClickhouseDestinationFormat JSON_AS_STRING =
      new ObservabilityPipelineClickhouseDestinationFormat("json_as_string");
  public static final ObservabilityPipelineClickhouseDestinationFormat ARROW_STREAM =
      new ObservabilityPipelineClickhouseDestinationFormat("arrow_stream");

  ObservabilityPipelineClickhouseDestinationFormat(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineClickhouseDestinationFormatSerializer
      extends StdSerializer<ObservabilityPipelineClickhouseDestinationFormat> {
    public ObservabilityPipelineClickhouseDestinationFormatSerializer(
        Class<ObservabilityPipelineClickhouseDestinationFormat> t) {
      super(t);
    }

    public ObservabilityPipelineClickhouseDestinationFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineClickhouseDestinationFormat value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineClickhouseDestinationFormat fromValue(String value) {
    return new ObservabilityPipelineClickhouseDestinationFormat(value);
  }
}
