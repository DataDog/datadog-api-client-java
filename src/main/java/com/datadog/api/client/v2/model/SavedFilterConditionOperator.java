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

/** The comparison operator used by a saved filter condition. */
@JsonSerialize(using = SavedFilterConditionOperator.SavedFilterConditionOperatorSerializer.class)
public class SavedFilterConditionOperator extends ModelEnum<String> {

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

  public static final SavedFilterConditionOperator LT = new SavedFilterConditionOperator("LT");
  public static final SavedFilterConditionOperator LTE = new SavedFilterConditionOperator("LTE");
  public static final SavedFilterConditionOperator GT = new SavedFilterConditionOperator("GT");
  public static final SavedFilterConditionOperator GTE = new SavedFilterConditionOperator("GTE");
  public static final SavedFilterConditionOperator MATCHES =
      new SavedFilterConditionOperator("MATCHES");
  public static final SavedFilterConditionOperator NOT_MATCHES =
      new SavedFilterConditionOperator("NOT_MATCHES");
  public static final SavedFilterConditionOperator ONE_OF =
      new SavedFilterConditionOperator("ONE_OF");
  public static final SavedFilterConditionOperator NOT_ONE_OF =
      new SavedFilterConditionOperator("NOT_ONE_OF");
  public static final SavedFilterConditionOperator IS_NULL =
      new SavedFilterConditionOperator("IS_NULL");
  public static final SavedFilterConditionOperator EQUALS =
      new SavedFilterConditionOperator("EQUALS");
  public static final SavedFilterConditionOperator SEMVER_EQ =
      new SavedFilterConditionOperator("SEMVER_EQ");
  public static final SavedFilterConditionOperator SEMVER_NEQ =
      new SavedFilterConditionOperator("SEMVER_NEQ");
  public static final SavedFilterConditionOperator SEMVER_LT =
      new SavedFilterConditionOperator("SEMVER_LT");
  public static final SavedFilterConditionOperator SEMVER_LTE =
      new SavedFilterConditionOperator("SEMVER_LTE");
  public static final SavedFilterConditionOperator SEMVER_GT =
      new SavedFilterConditionOperator("SEMVER_GT");
  public static final SavedFilterConditionOperator SEMVER_GTE =
      new SavedFilterConditionOperator("SEMVER_GTE");

  SavedFilterConditionOperator(String value) {
    super(value, allowedValues);
  }

  public static class SavedFilterConditionOperatorSerializer
      extends StdSerializer<SavedFilterConditionOperator> {
    public SavedFilterConditionOperatorSerializer(Class<SavedFilterConditionOperator> t) {
      super(t);
    }

    public SavedFilterConditionOperatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SavedFilterConditionOperator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SavedFilterConditionOperator fromValue(String value) {
    return new SavedFilterConditionOperator(value);
  }
}
