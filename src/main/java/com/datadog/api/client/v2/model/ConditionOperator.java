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

/** The operator used in a targeting condition. */
@JsonSerialize(using = ConditionOperator.ConditionOperatorSerializer.class)
public class ConditionOperator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "LT",
              "LTE",
              "GT",
              "GTE",
              "MATCHES",
              "NOT_MATCHES",
              "ONE_OF",
              "NOT_ONE_OF",
              "IS_NULL",
              "EQUALS"));

  public static final ConditionOperator LT = new ConditionOperator("LT");
  public static final ConditionOperator LTE = new ConditionOperator("LTE");
  public static final ConditionOperator GT = new ConditionOperator("GT");
  public static final ConditionOperator GTE = new ConditionOperator("GTE");
  public static final ConditionOperator MATCHES = new ConditionOperator("MATCHES");
  public static final ConditionOperator NOT_MATCHES = new ConditionOperator("NOT_MATCHES");
  public static final ConditionOperator ONE_OF = new ConditionOperator("ONE_OF");
  public static final ConditionOperator NOT_ONE_OF = new ConditionOperator("NOT_ONE_OF");
  public static final ConditionOperator IS_NULL = new ConditionOperator("IS_NULL");
  public static final ConditionOperator EQUALS = new ConditionOperator("EQUALS");

  ConditionOperator(String value) {
    super(value, allowedValues);
  }

  public static class ConditionOperatorSerializer extends StdSerializer<ConditionOperator> {
    public ConditionOperatorSerializer(Class<ConditionOperator> t) {
      super(t);
    }

    public ConditionOperatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(ConditionOperator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ConditionOperator fromValue(String value) {
    return new ConditionOperator(value);
  }
}
