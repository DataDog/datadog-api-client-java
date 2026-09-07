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

/** Assertion operator to apply. */
@JsonSerialize(
    using = SyntheticsNetworkAssertionOperator.SyntheticsNetworkAssertionOperatorSerializer.class)
public class SyntheticsNetworkAssertionOperator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "is", "isNot", "lessThan", "lessThanOrEqual", "moreThan", "moreThanOrEqual"));

  public static final SyntheticsNetworkAssertionOperator IS =
      new SyntheticsNetworkAssertionOperator("is");
  public static final SyntheticsNetworkAssertionOperator IS_NOT =
      new SyntheticsNetworkAssertionOperator("isNot");
  public static final SyntheticsNetworkAssertionOperator LESS_THAN =
      new SyntheticsNetworkAssertionOperator("lessThan");
  public static final SyntheticsNetworkAssertionOperator LESS_THAN_OR_EQUAL =
      new SyntheticsNetworkAssertionOperator("lessThanOrEqual");
  public static final SyntheticsNetworkAssertionOperator MORE_THAN =
      new SyntheticsNetworkAssertionOperator("moreThan");
  public static final SyntheticsNetworkAssertionOperator MORE_THAN_OR_EQUAL =
      new SyntheticsNetworkAssertionOperator("moreThanOrEqual");

  SyntheticsNetworkAssertionOperator(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsNetworkAssertionOperatorSerializer
      extends StdSerializer<SyntheticsNetworkAssertionOperator> {
    public SyntheticsNetworkAssertionOperatorSerializer(
        Class<SyntheticsNetworkAssertionOperator> t) {
      super(t);
    }

    public SyntheticsNetworkAssertionOperatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsNetworkAssertionOperator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsNetworkAssertionOperator fromValue(String value) {
    return new SyntheticsNetworkAssertionOperator(value);
  }
}
