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

/** Type of assertion to apply in an API test. */
@JsonSerialize(using = SyntheticsCheckType.SyntheticsCheckTypeSerializer.class)
public class SyntheticsCheckType extends ModelEnum<String> {

  public static final SyntheticsCheckType EQUALS = new SyntheticsCheckType("equals");
  public static final SyntheticsCheckType NOT_EQUALS = new SyntheticsCheckType("notEquals");
  public static final SyntheticsCheckType CONTAINS = new SyntheticsCheckType("contains");
  public static final SyntheticsCheckType NOT_CONTAINS = new SyntheticsCheckType("notContains");
  public static final SyntheticsCheckType STARTS_WITH = new SyntheticsCheckType("startsWith");
  public static final SyntheticsCheckType NOT_STARTS_WITH =
      new SyntheticsCheckType("notStartsWith");
  public static final SyntheticsCheckType GREATER = new SyntheticsCheckType("greater");
  public static final SyntheticsCheckType LOWER = new SyntheticsCheckType("lower");
  public static final SyntheticsCheckType GREATER_EQUALS = new SyntheticsCheckType("greaterEquals");
  public static final SyntheticsCheckType LOWER_EQUALS = new SyntheticsCheckType("lowerEquals");
  public static final SyntheticsCheckType MATCH_REGEX = new SyntheticsCheckType("matchRegex");
  public static final SyntheticsCheckType BETWEEN = new SyntheticsCheckType("between");
  public static final SyntheticsCheckType IS_EMPTY = new SyntheticsCheckType("isEmpty");
  public static final SyntheticsCheckType NOT_IS_EMPTY = new SyntheticsCheckType("notIsEmpty");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "equals",
              "notEquals",
              "contains",
              "notContains",
              "startsWith",
              "notStartsWith",
              "greater",
              "lower",
              "greaterEquals",
              "lowerEquals",
              "matchRegex",
              "between",
              "isEmpty",
              "notIsEmpty"));

  SyntheticsCheckType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class SyntheticsCheckTypeSerializer extends StdSerializer<SyntheticsCheckType> {
    public SyntheticsCheckTypeSerializer(Class<SyntheticsCheckType> t) {
      super(t);
    }

    public SyntheticsCheckTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsCheckType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsCheckType fromValue(String value) {
    return new SyntheticsCheckType(value);
  }
}
