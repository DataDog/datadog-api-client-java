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

/** Resource type of an LLM Observability annotation queue. */
@JsonSerialize(using = LLMObsAnnotationQueueType.LLMObsAnnotationQueueTypeSerializer.class)
public class LLMObsAnnotationQueueType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("queues"));

  public static final LLMObsAnnotationQueueType QUEUES = new LLMObsAnnotationQueueType("queues");

  LLMObsAnnotationQueueType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsAnnotationQueueTypeSerializer
      extends StdSerializer<LLMObsAnnotationQueueType> {
    public LLMObsAnnotationQueueTypeSerializer(Class<LLMObsAnnotationQueueType> t) {
      super(t);
    }

    public LLMObsAnnotationQueueTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsAnnotationQueueType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsAnnotationQueueType fromValue(String value) {
    return new LLMObsAnnotationQueueType(value);
  }
}
