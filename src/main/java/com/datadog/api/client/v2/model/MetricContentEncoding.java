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

/** HTTP header used to compress the media-type. */
@JsonSerialize(using = MetricContentEncoding.MetricContentEncodingSerializer.class)
public class MetricContentEncoding extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("deflate", "zstd1", "gzip"));

  public static final MetricContentEncoding DEFLATE = new MetricContentEncoding("deflate");
  public static final MetricContentEncoding ZSTD1 = new MetricContentEncoding("zstd1");
  public static final MetricContentEncoding GZIP = new MetricContentEncoding("gzip");

  MetricContentEncoding(String value) {
    super(value, allowedValues);
  }

  public static class MetricContentEncodingSerializer extends StdSerializer<MetricContentEncoding> {
    public MetricContentEncodingSerializer(Class<MetricContentEncoding> t) {
      super(t);
    }

    public MetricContentEncodingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricContentEncoding value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricContentEncoding fromValue(String value) {
    return new MetricContentEncoding(value);
  }
}
