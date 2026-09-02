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
 * Category of network health insight. Indicates whether the insight relates to a DNS issue (<code>
 * dns</code>), a TCP issue (<code>tcp</code>), a TLS certificate issue (<code>tls-cert</code>), or
 * a security group denial (<code>security-group</code>).
 */
@JsonSerialize(using = NetworkHealthInsightCategory.NetworkHealthInsightCategorySerializer.class)
public class NetworkHealthInsightCategory extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("dns", "tcp", "tls-cert", "security-group"));

  public static final NetworkHealthInsightCategory DNS = new NetworkHealthInsightCategory("dns");
  public static final NetworkHealthInsightCategory TCP = new NetworkHealthInsightCategory("tcp");
  public static final NetworkHealthInsightCategory TLS_CERT =
      new NetworkHealthInsightCategory("tls-cert");
  public static final NetworkHealthInsightCategory SECURITY_GROUP =
      new NetworkHealthInsightCategory("security-group");

  NetworkHealthInsightCategory(String value) {
    super(value, allowedValues);
  }

  public static class NetworkHealthInsightCategorySerializer
      extends StdSerializer<NetworkHealthInsightCategory> {
    public NetworkHealthInsightCategorySerializer(Class<NetworkHealthInsightCategory> t) {
      super(t);
    }

    public NetworkHealthInsightCategorySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NetworkHealthInsightCategory value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NetworkHealthInsightCategory fromValue(String value) {
    return new NetworkHealthInsightCategory(value);
  }
}
