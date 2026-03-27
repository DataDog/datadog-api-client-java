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

/** The definition of <code>CompletionConditionOperator</code> object. */
@JsonSerialize(using = CompletionConditionOperator.CompletionConditionOperatorSerializer.class)
public class CompletionConditionOperator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "OPERATOR_EQUAL",
              "OPERATOR_NOT_EQUAL",
              "OPERATOR_GREATER_THAN",
              "OPERATOR_LESS_THAN",
              "OPERATOR_GREATER_THAN_OR_EQUAL_TO",
              "OPERATOR_LESS_THAN_OR_EQUAL_TO",
              "OPERATOR_CONTAINS",
              "OPERATOR_DOES_NOT_CONTAIN",
              "OPERATOR_IS_NULL",
              "OPERATOR_IS_NOT_NULL",
              "OPERATOR_IS_EMPTY",
              "OPERATOR_IS_NOT_EMPTY"));

  public static final CompletionConditionOperator OPERATOR_EQUAL =
      new CompletionConditionOperator("OPERATOR_EQUAL");
  public static final CompletionConditionOperator OPERATOR_NOT_EQUAL =
      new CompletionConditionOperator("OPERATOR_NOT_EQUAL");
  public static final CompletionConditionOperator OPERATOR_GREATER_THAN =
      new CompletionConditionOperator("OPERATOR_GREATER_THAN");
  public static final CompletionConditionOperator OPERATOR_LESS_THAN =
      new CompletionConditionOperator("OPERATOR_LESS_THAN");
  public static final CompletionConditionOperator OPERATOR_GREATER_THAN_OR_EQUAL_TO =
      new CompletionConditionOperator("OPERATOR_GREATER_THAN_OR_EQUAL_TO");
  public static final CompletionConditionOperator OPERATOR_LESS_THAN_OR_EQUAL_TO =
      new CompletionConditionOperator("OPERATOR_LESS_THAN_OR_EQUAL_TO");
  public static final CompletionConditionOperator OPERATOR_CONTAINS =
      new CompletionConditionOperator("OPERATOR_CONTAINS");
  public static final CompletionConditionOperator OPERATOR_DOES_NOT_CONTAIN =
      new CompletionConditionOperator("OPERATOR_DOES_NOT_CONTAIN");
  public static final CompletionConditionOperator OPERATOR_IS_NULL =
      new CompletionConditionOperator("OPERATOR_IS_NULL");
  public static final CompletionConditionOperator OPERATOR_IS_NOT_NULL =
      new CompletionConditionOperator("OPERATOR_IS_NOT_NULL");
  public static final CompletionConditionOperator OPERATOR_IS_EMPTY =
      new CompletionConditionOperator("OPERATOR_IS_EMPTY");
  public static final CompletionConditionOperator OPERATOR_IS_NOT_EMPTY =
      new CompletionConditionOperator("OPERATOR_IS_NOT_EMPTY");

  CompletionConditionOperator(String value) {
    super(value, allowedValues);
  }

  public static class CompletionConditionOperatorSerializer
      extends StdSerializer<CompletionConditionOperator> {
    public CompletionConditionOperatorSerializer(Class<CompletionConditionOperator> t) {
      super(t);
    }

    public CompletionConditionOperatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CompletionConditionOperator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CompletionConditionOperator fromValue(String value) {
    return new CompletionConditionOperator(value);
  }
}
