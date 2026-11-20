/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = ReturnPeriodScopeType.ReturnPeriodScopeTypeSerializer.class)
public class ReturnPeriodScopeType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("return_period"));

  public static final ReturnPeriodScopeType RETURN_PERIOD =
      new ReturnPeriodScopeType("return_period");

  ReturnPeriodScopeType(String value) {
    super(value, allowedValues);
  }

  public static class ReturnPeriodScopeTypeSerializer extends StdSerializer<ReturnPeriodScopeType> {
    public ReturnPeriodScopeTypeSerializer(Class<ReturnPeriodScopeType> t) {
      super(t);
    }

    public ReturnPeriodScopeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ReturnPeriodScopeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ReturnPeriodScopeType fromValue(String value) {
    return new ReturnPeriodScopeType(value);
  }
}
