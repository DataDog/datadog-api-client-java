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

/** Type of sharing access (either open to anyone who has the public URL or invite-only). */
@JsonSerialize(using = DashboardShareType.DashboardShareTypeSerializer.class)
public class DashboardShareType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("open", "invite", "embed"));

  public static final DashboardShareType OPEN = new DashboardShareType("open");
  public static final DashboardShareType INVITE = new DashboardShareType("invite");
  public static final DashboardShareType EMBED = new DashboardShareType("embed");

  DashboardShareType(String value) {
    super(value, allowedValues);
  }

  public static class DashboardShareTypeSerializer extends StdSerializer<DashboardShareType> {
    public DashboardShareTypeSerializer(Class<DashboardShareType> t) {
      super(t);
    }

    public DashboardShareTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(DashboardShareType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardShareType fromValue(String value) {
    return new DashboardShareType(value);
  }
}
