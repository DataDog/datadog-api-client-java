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

/** Required with attribute and value for an inline condition; omit when saved_filter_id is set. */
@JsonSerialize(
    using = ExperimentsTargetingRuleOperator.ExperimentsTargetingRuleOperatorSerializer.class)
public class ExperimentsTargetingRuleOperator extends ModelEnum<String> {

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
              "EQUALS",
              "SEMVER_EQ",
              "SEMVER_NEQ",
              "SEMVER_LT",
              "SEMVER_LTE",
              "SEMVER_GT",
              "SEMVER_GTE"));

  public static final ExperimentsTargetingRuleOperator LT =
      new ExperimentsTargetingRuleOperator("LT");
  public static final ExperimentsTargetingRuleOperator LTE =
      new ExperimentsTargetingRuleOperator("LTE");
  public static final ExperimentsTargetingRuleOperator GT =
      new ExperimentsTargetingRuleOperator("GT");
  public static final ExperimentsTargetingRuleOperator GTE =
      new ExperimentsTargetingRuleOperator("GTE");
  public static final ExperimentsTargetingRuleOperator MATCHES =
      new ExperimentsTargetingRuleOperator("MATCHES");
  public static final ExperimentsTargetingRuleOperator NOT_MATCHES =
      new ExperimentsTargetingRuleOperator("NOT_MATCHES");
  public static final ExperimentsTargetingRuleOperator ONE_OF =
      new ExperimentsTargetingRuleOperator("ONE_OF");
  public static final ExperimentsTargetingRuleOperator NOT_ONE_OF =
      new ExperimentsTargetingRuleOperator("NOT_ONE_OF");
  public static final ExperimentsTargetingRuleOperator IS_NULL =
      new ExperimentsTargetingRuleOperator("IS_NULL");
  public static final ExperimentsTargetingRuleOperator EQUALS =
      new ExperimentsTargetingRuleOperator("EQUALS");
  public static final ExperimentsTargetingRuleOperator SEMVER_EQ =
      new ExperimentsTargetingRuleOperator("SEMVER_EQ");
  public static final ExperimentsTargetingRuleOperator SEMVER_NEQ =
      new ExperimentsTargetingRuleOperator("SEMVER_NEQ");
  public static final ExperimentsTargetingRuleOperator SEMVER_LT =
      new ExperimentsTargetingRuleOperator("SEMVER_LT");
  public static final ExperimentsTargetingRuleOperator SEMVER_LTE =
      new ExperimentsTargetingRuleOperator("SEMVER_LTE");
  public static final ExperimentsTargetingRuleOperator SEMVER_GT =
      new ExperimentsTargetingRuleOperator("SEMVER_GT");
  public static final ExperimentsTargetingRuleOperator SEMVER_GTE =
      new ExperimentsTargetingRuleOperator("SEMVER_GTE");

  ExperimentsTargetingRuleOperator(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsTargetingRuleOperatorSerializer
      extends StdSerializer<ExperimentsTargetingRuleOperator> {
    public ExperimentsTargetingRuleOperatorSerializer(Class<ExperimentsTargetingRuleOperator> t) {
      super(t);
    }

    public ExperimentsTargetingRuleOperatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsTargetingRuleOperator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsTargetingRuleOperator fromValue(String value) {
    return new ExperimentsTargetingRuleOperator(value);
  }
}
