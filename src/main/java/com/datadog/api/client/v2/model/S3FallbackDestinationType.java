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

/** Type of the S3 archive destination. */
@JsonSerialize(using = S3FallbackDestinationType.S3FallbackDestinationTypeSerializer.class)
public class S3FallbackDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("s3"));

  public static final S3FallbackDestinationType S3 = new S3FallbackDestinationType("s3");

  S3FallbackDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class S3FallbackDestinationTypeSerializer
      extends StdSerializer<S3FallbackDestinationType> {
    public S3FallbackDestinationTypeSerializer(Class<S3FallbackDestinationType> t) {
      super(t);
    }

    public S3FallbackDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        S3FallbackDestinationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static S3FallbackDestinationType fromValue(String value) {
    return new S3FallbackDestinationType(value);
  }
}
