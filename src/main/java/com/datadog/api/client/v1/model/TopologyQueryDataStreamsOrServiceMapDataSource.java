/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Name of the data source */
@JsonSerialize(
    using =
        TopologyQueryDataStreamsOrServiceMapDataSource
            .TopologyQueryDataStreamsOrServiceMapDataSourceSerializer.class)
public class TopologyQueryDataStreamsOrServiceMapDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("data_streams", "service_map"));

  public static final TopologyQueryDataStreamsOrServiceMapDataSource DATA_STREAMS =
      new TopologyQueryDataStreamsOrServiceMapDataSource("data_streams");
  public static final TopologyQueryDataStreamsOrServiceMapDataSource SERVICE_MAP =
      new TopologyQueryDataStreamsOrServiceMapDataSource("service_map");

  TopologyQueryDataStreamsOrServiceMapDataSource(String value) {
    super(value, allowedValues);
  }

  public static class TopologyQueryDataStreamsOrServiceMapDataSourceSerializer
      extends StdSerializer<TopologyQueryDataStreamsOrServiceMapDataSource> {
    public TopologyQueryDataStreamsOrServiceMapDataSourceSerializer(
        Class<TopologyQueryDataStreamsOrServiceMapDataSource> t) {
      super(t);
    }

    public TopologyQueryDataStreamsOrServiceMapDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TopologyQueryDataStreamsOrServiceMapDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TopologyQueryDataStreamsOrServiceMapDataSource fromValue(String value) {
    return new TopologyQueryDataStreamsOrServiceMapDataSource(value);
  }
}
