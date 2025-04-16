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

/** Indicates that the resource is of type <code>teams</code>. */
@JsonSerialize(
    using =
        EscalationPolicyDataRelationshipsTeamsDataItemsType
            .EscalationPolicyDataRelationshipsTeamsDataItemsTypeSerializer.class)
public class EscalationPolicyDataRelationshipsTeamsDataItemsType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("teams"));

  public static final EscalationPolicyDataRelationshipsTeamsDataItemsType TEAMS =
      new EscalationPolicyDataRelationshipsTeamsDataItemsType("teams");

  EscalationPolicyDataRelationshipsTeamsDataItemsType(String value) {
    super(value, allowedValues);
  }

  public static class EscalationPolicyDataRelationshipsTeamsDataItemsTypeSerializer
      extends StdSerializer<EscalationPolicyDataRelationshipsTeamsDataItemsType> {
    public EscalationPolicyDataRelationshipsTeamsDataItemsTypeSerializer(
        Class<EscalationPolicyDataRelationshipsTeamsDataItemsType> t) {
      super(t);
    }

    public EscalationPolicyDataRelationshipsTeamsDataItemsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EscalationPolicyDataRelationshipsTeamsDataItemsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EscalationPolicyDataRelationshipsTeamsDataItemsType fromValue(String value) {
    return new EscalationPolicyDataRelationshipsTeamsDataItemsType(value);
  }
}
