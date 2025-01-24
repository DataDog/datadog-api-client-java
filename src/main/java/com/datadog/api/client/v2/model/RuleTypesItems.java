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
 * Security rule types which can be used in notification rules. Signal-based notification rules can
 * filter signals based on rule types application_security, log_detection, workload_security,
 * signal_correlation, cloud_configuration and infrastructure_configuration. Vulnerability-based
 * notification rules can filter vulnerabilities based on rule types application_code_vulnerability,
 * application_library_vulnerability, attack_path, container_image_vulnerability, identity_risk,
 * misconfiguration, and api_security.
 */
@JsonSerialize(using = RuleTypesItems.RuleTypesItemsSerializer.class)
public class RuleTypesItems extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "application_security",
              "log_detection",
              "workload_security",
              "signal_correlation",
              "cloud_configuration",
              "infrastructure_configuration",
              "application_code_vulnerability",
              "application_library_vulnerability",
              "attack_path",
              "container_image_vulnerability",
              "identity_risk",
              "misconfiguration",
              "api_security"));

  public static final RuleTypesItems APPLICATION_SECURITY =
      new RuleTypesItems("application_security");
  public static final RuleTypesItems LOG_DETECTION = new RuleTypesItems("log_detection");
  public static final RuleTypesItems WORKLOAD_SECURITY = new RuleTypesItems("workload_security");
  public static final RuleTypesItems SIGNAL_CORRELATION = new RuleTypesItems("signal_correlation");
  public static final RuleTypesItems CLOUD_CONFIGURATION =
      new RuleTypesItems("cloud_configuration");
  public static final RuleTypesItems INFRASTRUCTURE_CONFIGURATION =
      new RuleTypesItems("infrastructure_configuration");
  public static final RuleTypesItems APPLICATION_CODE_VULNERABILITY =
      new RuleTypesItems("application_code_vulnerability");
  public static final RuleTypesItems APPLICATION_LIBRARY_VULNERABILITY =
      new RuleTypesItems("application_library_vulnerability");
  public static final RuleTypesItems ATTACK_PATH = new RuleTypesItems("attack_path");
  public static final RuleTypesItems CONTAINER_IMAGE_VULNERABILITY =
      new RuleTypesItems("container_image_vulnerability");
  public static final RuleTypesItems IDENTITY_RISK = new RuleTypesItems("identity_risk");
  public static final RuleTypesItems MISCONFIGURATION = new RuleTypesItems("misconfiguration");
  public static final RuleTypesItems API_SECURITY = new RuleTypesItems("api_security");

  RuleTypesItems(String value) {
    super(value, allowedValues);
  }

  public static class RuleTypesItemsSerializer extends StdSerializer<RuleTypesItems> {
    public RuleTypesItemsSerializer(Class<RuleTypesItems> t) {
      super(t);
    }

    public RuleTypesItemsSerializer() {
      this(null);
    }

    @Override
    public void serialize(RuleTypesItems value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RuleTypesItems fromValue(String value) {
    return new RuleTypesItems(value);
  }
}
