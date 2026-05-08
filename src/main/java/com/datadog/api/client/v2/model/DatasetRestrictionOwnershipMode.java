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

/**
 * Controls how dataset ownership is determined. <code>disabled</code> turns off ownership-based
 * access entirely. <code>team_tag_based</code> assigns dataset ownership based on the team tags
 * applied to the data, allowing team members to see their own team's datasets.
 */
@JsonSerialize(
    using = DatasetRestrictionOwnershipMode.DatasetRestrictionOwnershipModeSerializer.class)
public class DatasetRestrictionOwnershipMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("disabled", "team_tag_based"));

  public static final DatasetRestrictionOwnershipMode DISABLED =
      new DatasetRestrictionOwnershipMode("disabled");
  public static final DatasetRestrictionOwnershipMode TEAM_TAG_BASED =
      new DatasetRestrictionOwnershipMode("team_tag_based");

  DatasetRestrictionOwnershipMode(String value) {
    super(value, allowedValues);
  }

  public static class DatasetRestrictionOwnershipModeSerializer
      extends StdSerializer<DatasetRestrictionOwnershipMode> {
    public DatasetRestrictionOwnershipModeSerializer(Class<DatasetRestrictionOwnershipMode> t) {
      super(t);
    }

    public DatasetRestrictionOwnershipModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatasetRestrictionOwnershipMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatasetRestrictionOwnershipMode fromValue(String value) {
    return new DatasetRestrictionOwnershipMode(value);
  }
}
