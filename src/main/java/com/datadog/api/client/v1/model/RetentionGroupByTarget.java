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

/** Target for retention group by. */
@JsonSerialize(using = RetentionGroupByTarget.RetentionGroupByTargetSerializer.class)
public class RetentionGroupByTarget extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cohort", "return_period"));

  public static final RetentionGroupByTarget COHORT = new RetentionGroupByTarget("cohort");
  public static final RetentionGroupByTarget RETURN_PERIOD =
      new RetentionGroupByTarget("return_period");

  RetentionGroupByTarget(String value) {
    super(value, allowedValues);
  }

  public static class RetentionGroupByTargetSerializer
      extends StdSerializer<RetentionGroupByTarget> {
    public RetentionGroupByTargetSerializer(Class<RetentionGroupByTarget> t) {
      super(t);
    }

    public RetentionGroupByTargetSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RetentionGroupByTarget value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RetentionGroupByTarget fromValue(String value) {
    return new RetentionGroupByTarget(value);
  }
}
