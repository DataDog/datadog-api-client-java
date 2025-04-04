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

/** The source type. The value should always be <code>kafka</code>. */
@JsonSerialize(using = PipelineKafkaSourceType.PipelineKafkaSourceTypeSerializer.class)
public class PipelineKafkaSourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("kafka"));

  public static final PipelineKafkaSourceType KAFKA = new PipelineKafkaSourceType("kafka");

  PipelineKafkaSourceType(String value) {
    super(value, allowedValues);
  }

  public static class PipelineKafkaSourceTypeSerializer
      extends StdSerializer<PipelineKafkaSourceType> {
    public PipelineKafkaSourceTypeSerializer(Class<PipelineKafkaSourceType> t) {
      super(t);
    }

    public PipelineKafkaSourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PipelineKafkaSourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PipelineKafkaSourceType fromValue(String value) {
    return new PipelineKafkaSourceType(value);
  }
}
