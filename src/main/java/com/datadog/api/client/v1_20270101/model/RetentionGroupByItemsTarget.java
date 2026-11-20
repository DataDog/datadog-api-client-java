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
@JsonSerialize(using = RetentionGroupByItemsTarget.RetentionGroupByItemsTargetSerializer.class)
public class RetentionGroupByItemsTarget extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cohort", "return_period"));

  public static final RetentionGroupByItemsTarget COHORT =
      new RetentionGroupByItemsTarget("cohort");
  public static final RetentionGroupByItemsTarget RETURN_PERIOD =
      new RetentionGroupByItemsTarget("return_period");

  RetentionGroupByItemsTarget(String value) {
    super(value, allowedValues);
  }

  public static class RetentionGroupByItemsTargetSerializer
      extends StdSerializer<RetentionGroupByItemsTarget> {
    public RetentionGroupByItemsTargetSerializer(Class<RetentionGroupByItemsTarget> t) {
      super(t);
    }

    public RetentionGroupByItemsTargetSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RetentionGroupByItemsTarget value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RetentionGroupByItemsTarget fromValue(String value) {
    return new RetentionGroupByItemsTarget(value);
  }
}
