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
 * Cloud provider for this sync configuration (<code>aws</code>, <code>gcp</code>, or <code>azure
 * </code>). For requests, must match the provider block supplied under <code>attributes</code>.
 */
@JsonSerialize(using = CloudInventoryCloudProviderId.CloudInventoryCloudProviderIdSerializer.class)
public class CloudInventoryCloudProviderId extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aws", "gcp", "azure"));

  public static final CloudInventoryCloudProviderId AWS = new CloudInventoryCloudProviderId("aws");
  public static final CloudInventoryCloudProviderId GCP = new CloudInventoryCloudProviderId("gcp");
  public static final CloudInventoryCloudProviderId AZURE =
      new CloudInventoryCloudProviderId("azure");

  CloudInventoryCloudProviderId(String value) {
    super(value, allowedValues);
  }

  public static class CloudInventoryCloudProviderIdSerializer
      extends StdSerializer<CloudInventoryCloudProviderId> {
    public CloudInventoryCloudProviderIdSerializer(Class<CloudInventoryCloudProviderId> t) {
      super(t);
    }

    public CloudInventoryCloudProviderIdSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CloudInventoryCloudProviderId value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CloudInventoryCloudProviderId fromValue(String value) {
    return new CloudInventoryCloudProviderId(value);
  }
}
