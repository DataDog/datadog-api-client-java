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

/** Field to sort memberships by. */
@JsonSerialize(using = OrgGroupMembershipSortOption.OrgGroupMembershipSortOptionSerializer.class)
public class OrgGroupMembershipSortOption extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("name", "-name", "uuid", "-uuid"));

  public static final OrgGroupMembershipSortOption NAME = new OrgGroupMembershipSortOption("name");
  public static final OrgGroupMembershipSortOption MINUS_NAME =
      new OrgGroupMembershipSortOption("-name");
  public static final OrgGroupMembershipSortOption UUID = new OrgGroupMembershipSortOption("uuid");
  public static final OrgGroupMembershipSortOption MINUS_UUID =
      new OrgGroupMembershipSortOption("-uuid");

  OrgGroupMembershipSortOption(String value) {
    super(value, allowedValues);
  }

  public static class OrgGroupMembershipSortOptionSerializer
      extends StdSerializer<OrgGroupMembershipSortOption> {
    public OrgGroupMembershipSortOptionSerializer(Class<OrgGroupMembershipSortOption> t) {
      super(t);
    }

    public OrgGroupMembershipSortOptionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OrgGroupMembershipSortOption value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrgGroupMembershipSortOption fromValue(String value) {
    return new OrgGroupMembershipSortOption(value);
  }
}
