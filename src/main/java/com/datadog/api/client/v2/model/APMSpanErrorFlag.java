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

/** Error flag for a span. <code>1</code> when the span is in error, <code>0</code> otherwise. */
@JsonSerialize(using = APMSpanErrorFlag.APMSpanErrorFlagSerializer.class)
public class APMSpanErrorFlag extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(0, 1));

  public static final APMSpanErrorFlag NO_ERROR = new APMSpanErrorFlag(0);
  public static final APMSpanErrorFlag ERROR = new APMSpanErrorFlag(1);

  APMSpanErrorFlag(Integer value) {
    super(value, allowedValues);
  }

  public static class APMSpanErrorFlagSerializer extends StdSerializer<APMSpanErrorFlag> {
    public APMSpanErrorFlagSerializer(Class<APMSpanErrorFlag> t) {
      super(t);
    }

    public APMSpanErrorFlagSerializer() {
      this(null);
    }

    @Override
    public void serialize(APMSpanErrorFlag value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static APMSpanErrorFlag fromValue(Integer value) {
    return new APMSpanErrorFlag(value);
  }
}
