/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = OrchestrationView.OrchestrationViewSerializer.class)
public class OrchestrationView extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "service",
              "cluster",
              "job",
              "node",
              "deployment",
              "namespace",
              "pod",
              "genericWorkload",
              "inferenceWorkload",
              "replicaSet",
              "cronJob",
              "daemonSet",
              "statefulSet",
              "persistentVolume",
              "persistentVolumeClaim",
              "role",
              "roleBinding",
              "clusterRole",
              "clusterRoleBinding",
              "serviceAccount",
              "ingress",
              "configMap",
              "verticalPodAutoscaler",
              "horizontalPodAutoscaler",
              "crd",
              "cr",
              "networkPolicy",
              "podDisruptionBudget",
              "ecsTask",
              "ecsTaskDefinition",
              "ecsDaemonTaskDefinition",
              "ecsService",
              "ecsDaemon",
              "ecsCluster",
              "ecsContainerInstance"));

  public static final OrchestrationView SERVICE = new OrchestrationView("service");
  public static final OrchestrationView CLUSTER = new OrchestrationView("cluster");
  public static final OrchestrationView JOB = new OrchestrationView("job");
  public static final OrchestrationView NODE = new OrchestrationView("node");
  public static final OrchestrationView DEPLOYMENT = new OrchestrationView("deployment");
  public static final OrchestrationView NAMESPACE = new OrchestrationView("namespace");
  public static final OrchestrationView POD = new OrchestrationView("pod");
  public static final OrchestrationView GENERICWORKLOAD = new OrchestrationView("genericWorkload");
  public static final OrchestrationView INFERENCEWORKLOAD =
      new OrchestrationView("inferenceWorkload");
  public static final OrchestrationView REPLICASET = new OrchestrationView("replicaSet");
  public static final OrchestrationView CRONJOB = new OrchestrationView("cronJob");
  public static final OrchestrationView DAEMONSET = new OrchestrationView("daemonSet");
  public static final OrchestrationView STATEFULSET = new OrchestrationView("statefulSet");
  public static final OrchestrationView PERSISTENTVOLUME =
      new OrchestrationView("persistentVolume");
  public static final OrchestrationView PERSISTENTVOLUMECLAIM =
      new OrchestrationView("persistentVolumeClaim");
  public static final OrchestrationView ROLE = new OrchestrationView("role");
  public static final OrchestrationView ROLEBINDING = new OrchestrationView("roleBinding");
  public static final OrchestrationView CLUSTERROLE = new OrchestrationView("clusterRole");
  public static final OrchestrationView CLUSTERROLEBINDING =
      new OrchestrationView("clusterRoleBinding");
  public static final OrchestrationView SERVICEACCOUNT = new OrchestrationView("serviceAccount");
  public static final OrchestrationView INGRESS = new OrchestrationView("ingress");
  public static final OrchestrationView CONFIGMAP = new OrchestrationView("configMap");
  public static final OrchestrationView VERTICALPODAUTOSCALER =
      new OrchestrationView("verticalPodAutoscaler");
  public static final OrchestrationView HORIZONTALPODAUTOSCALER =
      new OrchestrationView("horizontalPodAutoscaler");
  public static final OrchestrationView CRD = new OrchestrationView("crd");
  public static final OrchestrationView CR = new OrchestrationView("cr");
  public static final OrchestrationView NETWORKPOLICY = new OrchestrationView("networkPolicy");
  public static final OrchestrationView PODDISRUPTIONBUDGET =
      new OrchestrationView("podDisruptionBudget");
  public static final OrchestrationView ECSTASK = new OrchestrationView("ecsTask");
  public static final OrchestrationView ECSTASKDEFINITION =
      new OrchestrationView("ecsTaskDefinition");
  public static final OrchestrationView ECSDAEMONTASKDEFINITION =
      new OrchestrationView("ecsDaemonTaskDefinition");
  public static final OrchestrationView ECSSERVICE = new OrchestrationView("ecsService");
  public static final OrchestrationView ECSDAEMON = new OrchestrationView("ecsDaemon");
  public static final OrchestrationView ECSCLUSTER = new OrchestrationView("ecsCluster");
  public static final OrchestrationView ECSCONTAINERINSTANCE =
      new OrchestrationView("ecsContainerInstance");

  OrchestrationView(String value) {
    super(value, allowedValues);
  }

  public static class OrchestrationViewSerializer extends StdSerializer<OrchestrationView> {
    public OrchestrationViewSerializer(Class<OrchestrationView> t) {
      super(t);
    }

    public OrchestrationViewSerializer() {
      this(null);
    }

    @Override
    public void serialize(OrchestrationView value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrchestrationView fromValue(String value) {
    return new OrchestrationView(value);
  }
}
