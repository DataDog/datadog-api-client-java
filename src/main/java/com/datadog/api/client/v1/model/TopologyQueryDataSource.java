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
@JsonSerialize(using = TopologyQueryDataSource.TopologyQueryDataSourceSerializer.class)
public class TopologyQueryDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("data_streams", "service_map"));

  public static final TopologyQueryDataSource DATA_STREAMS =
      new TopologyQueryDataSource("data_streams");
  public static final TopologyQueryDataSource SERVICE_MAP =
      new TopologyQueryDataSource("service_map");

  TopologyQueryDataSource(String value) {
    super(value, allowedValues);
  }

  public static class TopologyQueryDataSourceSerializer
      extends StdSerializer<TopologyQueryDataSource> {
    public TopologyQueryDataSourceSerializer(Class<TopologyQueryDataSource> t) {
      super(t);
    }

    public TopologyQueryDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TopologyQueryDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TopologyQueryDataSource fromValue(String value) {
    return new TopologyQueryDataSource(value);
  }
}
