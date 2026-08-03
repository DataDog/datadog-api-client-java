/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Assertion operator to apply.</p>
 */
@JsonSerialize(using = SyntheticsAssertionOperator.SyntheticsAssertionOperatorSerializer.class)
public class SyntheticsAssertionOperator extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("contains", "doesNotContain", "is", "isNot", "lessThan", "lessThanOrEqual", "moreThan", "moreThanOrEqual", "matches", "doesNotMatch", "validates", "isInMoreThan", "isInLessThan", "doesNotExist", "isUndefined"));

  public static final SyntheticsAssertionOperator CONTAINS = new SyntheticsAssertionOperator("contains");
  public static final SyntheticsAssertionOperator DOES_NOT_CONTAIN = new SyntheticsAssertionOperator("doesNotContain");
  public static final SyntheticsAssertionOperator IS = new SyntheticsAssertionOperator("is");
  public static final SyntheticsAssertionOperator IS_NOT = new SyntheticsAssertionOperator("isNot");
  public static final SyntheticsAssertionOperator LESS_THAN = new SyntheticsAssertionOperator("lessThan");
  public static final SyntheticsAssertionOperator LESS_THAN_OR_EQUAL = new SyntheticsAssertionOperator("lessThanOrEqual");
  public static final SyntheticsAssertionOperator MORE_THAN = new SyntheticsAssertionOperator("moreThan");
  public static final SyntheticsAssertionOperator MORE_THAN_OR_EQUAL = new SyntheticsAssertionOperator("moreThanOrEqual");
  public static final SyntheticsAssertionOperator MATCHES = new SyntheticsAssertionOperator("matches");
  public static final SyntheticsAssertionOperator DOES_NOT_MATCH = new SyntheticsAssertionOperator("doesNotMatch");
  public static final SyntheticsAssertionOperator VALIDATES = new SyntheticsAssertionOperator("validates");
  public static final SyntheticsAssertionOperator IS_IN_MORE_DAYS_THAN = new SyntheticsAssertionOperator("isInMoreThan");
  public static final SyntheticsAssertionOperator IS_IN_LESS_DAYS_THAN = new SyntheticsAssertionOperator("isInLessThan");
  public static final SyntheticsAssertionOperator DOES_NOT_EXIST = new SyntheticsAssertionOperator("doesNotExist");
  public static final SyntheticsAssertionOperator IS_UNDEFINED = new SyntheticsAssertionOperator("isUndefined");


  SyntheticsAssertionOperator(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsAssertionOperatorSerializer extends StdSerializer<SyntheticsAssertionOperator> {
      public SyntheticsAssertionOperatorSerializer(Class<SyntheticsAssertionOperator> t) {
          super(t);
      }

      public SyntheticsAssertionOperatorSerializer() {
          this(null);
      }

      @Override
      public void serialize(SyntheticsAssertionOperator value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SyntheticsAssertionOperator fromValue(String value) {
    return new SyntheticsAssertionOperator(value);
  }
}
