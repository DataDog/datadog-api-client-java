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

/** Org group membership bulk update resource type. */
@JsonSerialize(
    using = OrgGroupMembershipBulkUpdateType.OrgGroupMembershipBulkUpdateTypeSerializer.class)
public class OrgGroupMembershipBulkUpdateType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("org_group_membership_bulk_updates"));

  public static final OrgGroupMembershipBulkUpdateType ORG_GROUP_MEMBERSHIP_BULK_UPDATES =
      new OrgGroupMembershipBulkUpdateType("org_group_membership_bulk_updates");

  OrgGroupMembershipBulkUpdateType(String value) {
    super(value, allowedValues);
  }

  public static class OrgGroupMembershipBulkUpdateTypeSerializer
      extends StdSerializer<OrgGroupMembershipBulkUpdateType> {
    public OrgGroupMembershipBulkUpdateTypeSerializer(Class<OrgGroupMembershipBulkUpdateType> t) {
      super(t);
    }

    public OrgGroupMembershipBulkUpdateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OrgGroupMembershipBulkUpdateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrgGroupMembershipBulkUpdateType fromValue(String value) {
    return new OrgGroupMembershipBulkUpdateType(value);
  }
}
