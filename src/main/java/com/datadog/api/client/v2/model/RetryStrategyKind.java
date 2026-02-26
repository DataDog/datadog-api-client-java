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

/** The definition of <code>RetryStrategyKind</code> object. */
@JsonSerialize(using = RetryStrategyKind.RetryStrategyKindSerializer.class)
public class RetryStrategyKind extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("RETRY_STRATEGY_LINEAR"));

  public static final RetryStrategyKind RETRY_STRATEGY_LINEAR =
      new RetryStrategyKind("RETRY_STRATEGY_LINEAR");

  RetryStrategyKind(String value) {
    super(value, allowedValues);
  }

  public static class RetryStrategyKindSerializer extends StdSerializer<RetryStrategyKind> {
    public RetryStrategyKindSerializer(Class<RetryStrategyKind> t) {
      super(t);
    }

    public RetryStrategyKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(RetryStrategyKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RetryStrategyKind fromValue(String value) {
    return new RetryStrategyKind(value);
  }
}
