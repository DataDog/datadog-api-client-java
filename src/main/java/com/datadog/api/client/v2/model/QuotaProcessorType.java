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

/** The definition of <code>QuotaProcessorType</code> object. */
@JsonSerialize(using = QuotaProcessorType.QuotaProcessorTypeSerializer.class)
public class QuotaProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("quota"));

  public static final QuotaProcessorType QUOTA = new QuotaProcessorType("quota");

  QuotaProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class QuotaProcessorTypeSerializer extends StdSerializer<QuotaProcessorType> {
    public QuotaProcessorTypeSerializer(Class<QuotaProcessorType> t) {
      super(t);
    }

    public QuotaProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(QuotaProcessorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QuotaProcessorType fromValue(String value) {
    return new QuotaProcessorType(value);
  }
}
