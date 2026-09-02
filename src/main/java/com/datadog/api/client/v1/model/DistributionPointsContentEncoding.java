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

/** HTTP header used to compress the media-type. */
@JsonSerialize(
    using = DistributionPointsContentEncoding.DistributionPointsContentEncodingSerializer.class)
public class DistributionPointsContentEncoding extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("deflate"));

  public static final DistributionPointsContentEncoding DEFLATE =
      new DistributionPointsContentEncoding("deflate");

  DistributionPointsContentEncoding(String value) {
    super(value, allowedValues);
  }

  public static class DistributionPointsContentEncodingSerializer
      extends StdSerializer<DistributionPointsContentEncoding> {
    public DistributionPointsContentEncodingSerializer(Class<DistributionPointsContentEncoding> t) {
      super(t);
    }

    public DistributionPointsContentEncodingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DistributionPointsContentEncoding value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DistributionPointsContentEncoding fromValue(String value) {
    return new DistributionPointsContentEncoding(value);
  }
}
