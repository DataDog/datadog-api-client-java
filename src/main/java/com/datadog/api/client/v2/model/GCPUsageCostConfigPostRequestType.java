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

/** Type of Google Cloud Usage Cost config post request. */
@JsonSerialize(
    using = GCPUsageCostConfigPostRequestType.GCPUsageCostConfigPostRequestTypeSerializer.class)
public class GCPUsageCostConfigPostRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("gcp_uc_config_post_request"));

  public static final GCPUsageCostConfigPostRequestType GCP_USAGE_COST_CONFIG_POST_REQUEST =
      new GCPUsageCostConfigPostRequestType("gcp_uc_config_post_request");

  GCPUsageCostConfigPostRequestType(String value) {
    super(value, allowedValues);
  }

  public static class GCPUsageCostConfigPostRequestTypeSerializer
      extends StdSerializer<GCPUsageCostConfigPostRequestType> {
    public GCPUsageCostConfigPostRequestTypeSerializer(Class<GCPUsageCostConfigPostRequestType> t) {
      super(t);
    }

    public GCPUsageCostConfigPostRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GCPUsageCostConfigPostRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GCPUsageCostConfigPostRequestType fromValue(String value) {
    return new GCPUsageCostConfigPostRequestType(value);
  }
}
