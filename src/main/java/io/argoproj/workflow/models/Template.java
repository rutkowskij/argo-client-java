/*
 * Argo
 * Workflow Service API performs CRUD actions against application resources
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.Arguments;
import io.argoproj.workflow.models.ArtifactLocation;
import io.argoproj.workflow.models.DAGTemplate;
import io.argoproj.workflow.models.ExecutorConfig;
import io.argoproj.workflow.models.Inputs;
import io.argoproj.workflow.models.Metadata;
import io.argoproj.workflow.models.Metrics;
import io.argoproj.workflow.models.Outputs;
import io.argoproj.workflow.models.ResourceTemplate;
import io.argoproj.workflow.models.RetryStrategy;
import io.argoproj.workflow.models.ScriptTemplate;
import io.argoproj.workflow.models.SuspendTemplate;
import io.argoproj.workflow.models.TemplateRef;
import io.argoproj.workflow.models.UserContainer;
import io.argoproj.workflow.models.WorkflowStep;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Template
 */

public class Template {
  public static final String SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS = "activeDeadlineSeconds";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS)
  private String activeDeadlineSeconds;

  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private io.kubernetes.client.models.V1Affinity affinity;

  public static final String SERIALIZED_NAME_ARCHIVE_LOCATION = "archiveLocation";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_LOCATION)
  private ArtifactLocation archiveLocation;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Arguments arguments;

  public static final String SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN = "automountServiceAccountToken";
  @SerializedName(SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN)
  private Boolean automountServiceAccountToken;

  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private io.kubernetes.client.models.V1Container container;

  public static final String SERIALIZED_NAME_DAEMON = "daemon";
  @SerializedName(SERIALIZED_NAME_DAEMON)
  private Boolean daemon;

  public static final String SERIALIZED_NAME_DAG = "dag";
  @SerializedName(SERIALIZED_NAME_DAG)
  private DAGTemplate dag;

  public static final String SERIALIZED_NAME_EXECUTOR = "executor";
  @SerializedName(SERIALIZED_NAME_EXECUTOR)
  private ExecutorConfig executor;

  public static final String SERIALIZED_NAME_HOST_ALIASES = "hostAliases";
  @SerializedName(SERIALIZED_NAME_HOST_ALIASES)
  private List<io.kubernetes.client.models.V1HostAlias> hostAliases = null;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "initContainers";
  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private List<UserContainer> initContainers = null;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private Inputs inputs;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Metadata metadata;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private Metrics metrics;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private Outputs outputs;

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";
  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  private String parallelism;

  public static final String SERIALIZED_NAME_POD_SPEC_PATCH = "podSpecPatch";
  @SerializedName(SERIALIZED_NAME_POD_SPEC_PATCH)
  private String podSpecPatch;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_PRIORITY_CLASS_NAME = "priorityClassName";
  @SerializedName(SERIALIZED_NAME_PRIORITY_CLASS_NAME)
  private String priorityClassName;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private ResourceTemplate resource;

  public static final String SERIALIZED_NAME_RESUBMIT_PENDING_PODS = "resubmitPendingPods";
  @SerializedName(SERIALIZED_NAME_RESUBMIT_PENDING_PODS)
  private Boolean resubmitPendingPods;

  public static final String SERIALIZED_NAME_RETRY_STRATEGY = "retryStrategy";
  @SerializedName(SERIALIZED_NAME_RETRY_STRATEGY)
  private RetryStrategy retryStrategy;

  public static final String SERIALIZED_NAME_SCHEDULER_NAME = "schedulerName";
  @SerializedName(SERIALIZED_NAME_SCHEDULER_NAME)
  private String schedulerName;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private ScriptTemplate script;

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";
  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  private io.kubernetes.client.models.V1PodSecurityContext securityContext;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_SIDECARS = "sidecars";
  @SerializedName(SERIALIZED_NAME_SIDECARS)
  private List<UserContainer> sidecars = null;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<List<WorkflowStep>> steps = null;

  public static final String SERIALIZED_NAME_SUSPEND = "suspend";
  @SerializedName(SERIALIZED_NAME_SUSPEND)
  private SuspendTemplate suspend;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_TEMPLATE_REF = "templateRef";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REF)
  private TemplateRef templateRef;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<io.kubernetes.client.models.V1Toleration> tolerations = null;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<io.kubernetes.client.models.V1Volume> volumes = null;


  public Template activeDeadlineSeconds(String activeDeadlineSeconds) {
    
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

   /**
   * Optional duration in seconds relative to the StartTime that the pod may be active on a node before the system actively tries to terminate the pod; value must be positive integer This field is only applicable to container and script templates.
   * @return activeDeadlineSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional duration in seconds relative to the StartTime that the pod may be active on a node before the system actively tries to terminate the pod; value must be positive integer This field is only applicable to container and script templates.")

  public String getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }


  public void setActiveDeadlineSeconds(String activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }


  public Template affinity(io.kubernetes.client.models.V1Affinity affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.models.V1Affinity getAffinity() {
    return affinity;
  }


  public void setAffinity(io.kubernetes.client.models.V1Affinity affinity) {
    this.affinity = affinity;
  }


  public Template archiveLocation(ArtifactLocation archiveLocation) {
    
    this.archiveLocation = archiveLocation;
    return this;
  }

   /**
   * Get archiveLocation
   * @return archiveLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactLocation getArchiveLocation() {
    return archiveLocation;
  }


  public void setArchiveLocation(ArtifactLocation archiveLocation) {
    this.archiveLocation = archiveLocation;
  }


  public Template arguments(Arguments arguments) {
    
    this.arguments = arguments;
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Arguments getArguments() {
    return arguments;
  }


  public void setArguments(Arguments arguments) {
    this.arguments = arguments;
  }


  public Template automountServiceAccountToken(Boolean automountServiceAccountToken) {
    
    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

   /**
   * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false.
   * @return automountServiceAccountToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false.")

  public Boolean getAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }


  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }


  public Template container(io.kubernetes.client.models.V1Container container) {
    
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.models.V1Container getContainer() {
    return container;
  }


  public void setContainer(io.kubernetes.client.models.V1Container container) {
    this.container = container;
  }


  public Template daemon(Boolean daemon) {
    
    this.daemon = daemon;
    return this;
  }

   /**
   * Get daemon
   * @return daemon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDaemon() {
    return daemon;
  }


  public void setDaemon(Boolean daemon) {
    this.daemon = daemon;
  }


  public Template dag(DAGTemplate dag) {
    
    this.dag = dag;
    return this;
  }

   /**
   * Get dag
   * @return dag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DAGTemplate getDag() {
    return dag;
  }


  public void setDag(DAGTemplate dag) {
    this.dag = dag;
  }


  public Template executor(ExecutorConfig executor) {
    
    this.executor = executor;
    return this;
  }

   /**
   * Get executor
   * @return executor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExecutorConfig getExecutor() {
    return executor;
  }


  public void setExecutor(ExecutorConfig executor) {
    this.executor = executor;
  }


  public Template hostAliases(List<io.kubernetes.client.models.V1HostAlias> hostAliases) {
    
    this.hostAliases = hostAliases;
    return this;
  }

  public Template addHostAliasesItem(io.kubernetes.client.models.V1HostAlias hostAliasesItem) {
    if (this.hostAliases == null) {
      this.hostAliases = new ArrayList<io.kubernetes.client.models.V1HostAlias>();
    }
    this.hostAliases.add(hostAliasesItem);
    return this;
  }

   /**
   * Get hostAliases
   * @return hostAliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<io.kubernetes.client.models.V1HostAlias> getHostAliases() {
    return hostAliases;
  }


  public void setHostAliases(List<io.kubernetes.client.models.V1HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
  }


  public Template initContainers(List<UserContainer> initContainers) {
    
    this.initContainers = initContainers;
    return this;
  }

  public Template addInitContainersItem(UserContainer initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<UserContainer>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

   /**
   * Get initContainers
   * @return initContainers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserContainer> getInitContainers() {
    return initContainers;
  }


  public void setInitContainers(List<UserContainer> initContainers) {
    this.initContainers = initContainers;
  }


  public Template inputs(Inputs inputs) {
    
    this.inputs = inputs;
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Inputs getInputs() {
    return inputs;
  }


  public void setInputs(Inputs inputs) {
    this.inputs = inputs;
  }


  public Template metadata(Metadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Metadata getMetadata() {
    return metadata;
  }


  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }


  public Template metrics(Metrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Metrics getMetrics() {
    return metrics;
  }


  public void setMetrics(Metrics metrics) {
    this.metrics = metrics;
  }


  public Template name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Template nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public Template putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level.
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level.")

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public Template outputs(Outputs outputs) {
    
    this.outputs = outputs;
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Outputs getOutputs() {
    return outputs;
  }


  public void setOutputs(Outputs outputs) {
    this.outputs = outputs;
  }


  public Template parallelism(String parallelism) {
    
    this.parallelism = parallelism;
    return this;
  }

   /**
   * Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total.
   * @return parallelism
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total.")

  public String getParallelism() {
    return parallelism;
  }


  public void setParallelism(String parallelism) {
    this.parallelism = parallelism;
  }


  public Template podSpecPatch(String podSpecPatch) {
    
    this.podSpecPatch = podSpecPatch;
    return this;
  }

   /**
   * PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits).
   * @return podSpecPatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits).")

  public String getPodSpecPatch() {
    return podSpecPatch;
  }


  public void setPodSpecPatch(String podSpecPatch) {
    this.podSpecPatch = podSpecPatch;
  }


  public Template priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Priority to apply to workflow pods.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Priority to apply to workflow pods.")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public Template priorityClassName(String priorityClassName) {
    
    this.priorityClassName = priorityClassName;
    return this;
  }

   /**
   * PriorityClassName to apply to workflow pods.
   * @return priorityClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PriorityClassName to apply to workflow pods.")

  public String getPriorityClassName() {
    return priorityClassName;
  }


  public void setPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }


  public Template resource(ResourceTemplate resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceTemplate getResource() {
    return resource;
  }


  public void setResource(ResourceTemplate resource) {
    this.resource = resource;
  }


  public Template resubmitPendingPods(Boolean resubmitPendingPods) {
    
    this.resubmitPendingPods = resubmitPendingPods;
    return this;
  }

   /**
   * Get resubmitPendingPods
   * @return resubmitPendingPods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getResubmitPendingPods() {
    return resubmitPendingPods;
  }


  public void setResubmitPendingPods(Boolean resubmitPendingPods) {
    this.resubmitPendingPods = resubmitPendingPods;
  }


  public Template retryStrategy(RetryStrategy retryStrategy) {
    
    this.retryStrategy = retryStrategy;
    return this;
  }

   /**
   * Get retryStrategy
   * @return retryStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetryStrategy getRetryStrategy() {
    return retryStrategy;
  }


  public void setRetryStrategy(RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
  }


  public Template schedulerName(String schedulerName) {
    
    this.schedulerName = schedulerName;
    return this;
  }

   /**
   * Get schedulerName
   * @return schedulerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchedulerName() {
    return schedulerName;
  }


  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }


  public Template script(ScriptTemplate script) {
    
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScriptTemplate getScript() {
    return script;
  }


  public void setScript(ScriptTemplate script) {
    this.script = script;
  }


  public Template securityContext(io.kubernetes.client.models.V1PodSecurityContext securityContext) {
    
    this.securityContext = securityContext;
    return this;
  }

   /**
   * Get securityContext
   * @return securityContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.models.V1PodSecurityContext getSecurityContext() {
    return securityContext;
  }


  public void setSecurityContext(io.kubernetes.client.models.V1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
  }


  public Template serviceAccountName(String serviceAccountName) {
    
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * Get serviceAccountName
   * @return serviceAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceAccountName() {
    return serviceAccountName;
  }


  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  public Template sidecars(List<UserContainer> sidecars) {
    
    this.sidecars = sidecars;
    return this;
  }

  public Template addSidecarsItem(UserContainer sidecarsItem) {
    if (this.sidecars == null) {
      this.sidecars = new ArrayList<UserContainer>();
    }
    this.sidecars.add(sidecarsItem);
    return this;
  }

   /**
   * Get sidecars
   * @return sidecars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserContainer> getSidecars() {
    return sidecars;
  }


  public void setSidecars(List<UserContainer> sidecars) {
    this.sidecars = sidecars;
  }


  public Template steps(List<List<WorkflowStep>> steps) {
    
    this.steps = steps;
    return this;
  }

  public Template addStepsItem(List<WorkflowStep> stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<List>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<WorkflowStep>> getSteps() {
    return steps;
  }


  public void setSteps(List<List<WorkflowStep>> steps) {
    this.steps = steps;
  }


  public Template suspend(SuspendTemplate suspend) {
    
    this.suspend = suspend;
    return this;
  }

   /**
   * Get suspend
   * @return suspend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SuspendTemplate getSuspend() {
    return suspend;
  }


  public void setSuspend(SuspendTemplate suspend) {
    this.suspend = suspend;
  }


  public Template template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Template is the name of the template which is used as the base of this template. DEPRECATED: This field is not used.
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template is the name of the template which is used as the base of this template. DEPRECATED: This field is not used.")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public Template templateRef(TemplateRef templateRef) {
    
    this.templateRef = templateRef;
    return this;
  }

   /**
   * Get templateRef
   * @return templateRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateRef getTemplateRef() {
    return templateRef;
  }


  public void setTemplateRef(TemplateRef templateRef) {
    this.templateRef = templateRef;
  }


  public Template tolerations(List<io.kubernetes.client.models.V1Toleration> tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

  public Template addTolerationsItem(io.kubernetes.client.models.V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<io.kubernetes.client.models.V1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * Get tolerations
   * @return tolerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<io.kubernetes.client.models.V1Toleration> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<io.kubernetes.client.models.V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  public Template volumes(List<io.kubernetes.client.models.V1Volume> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public Template addVolumesItem(io.kubernetes.client.models.V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<io.kubernetes.client.models.V1Volume>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<io.kubernetes.client.models.V1Volume> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<io.kubernetes.client.models.V1Volume> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.activeDeadlineSeconds, template.activeDeadlineSeconds) &&
        Objects.equals(this.affinity, template.affinity) &&
        Objects.equals(this.archiveLocation, template.archiveLocation) &&
        Objects.equals(this.arguments, template.arguments) &&
        Objects.equals(this.automountServiceAccountToken, template.automountServiceAccountToken) &&
        Objects.equals(this.container, template.container) &&
        Objects.equals(this.daemon, template.daemon) &&
        Objects.equals(this.dag, template.dag) &&
        Objects.equals(this.executor, template.executor) &&
        Objects.equals(this.hostAliases, template.hostAliases) &&
        Objects.equals(this.initContainers, template.initContainers) &&
        Objects.equals(this.inputs, template.inputs) &&
        Objects.equals(this.metadata, template.metadata) &&
        Objects.equals(this.metrics, template.metrics) &&
        Objects.equals(this.name, template.name) &&
        Objects.equals(this.nodeSelector, template.nodeSelector) &&
        Objects.equals(this.outputs, template.outputs) &&
        Objects.equals(this.parallelism, template.parallelism) &&
        Objects.equals(this.podSpecPatch, template.podSpecPatch) &&
        Objects.equals(this.priority, template.priority) &&
        Objects.equals(this.priorityClassName, template.priorityClassName) &&
        Objects.equals(this.resource, template.resource) &&
        Objects.equals(this.resubmitPendingPods, template.resubmitPendingPods) &&
        Objects.equals(this.retryStrategy, template.retryStrategy) &&
        Objects.equals(this.schedulerName, template.schedulerName) &&
        Objects.equals(this.script, template.script) &&
        Objects.equals(this.securityContext, template.securityContext) &&
        Objects.equals(this.serviceAccountName, template.serviceAccountName) &&
        Objects.equals(this.sidecars, template.sidecars) &&
        Objects.equals(this.steps, template.steps) &&
        Objects.equals(this.suspend, template.suspend) &&
        Objects.equals(this.template, template.template) &&
        Objects.equals(this.templateRef, template.templateRef) &&
        Objects.equals(this.tolerations, template.tolerations) &&
        Objects.equals(this.volumes, template.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, affinity, archiveLocation, arguments, automountServiceAccountToken, container, daemon, dag, executor, hostAliases, initContainers, inputs, metadata, metrics, name, nodeSelector, outputs, parallelism, podSpecPatch, priority, priorityClassName, resource, resubmitPendingPods, retryStrategy, schedulerName, script, securityContext, serviceAccountName, sidecars, steps, suspend, template, templateRef, tolerations, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    archiveLocation: ").append(toIndentedString(archiveLocation)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
    sb.append("    dag: ").append(toIndentedString(dag)).append("\n");
    sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
    sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    podSpecPatch: ").append(toIndentedString(podSpecPatch)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    resubmitPendingPods: ").append(toIndentedString(resubmitPendingPods)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    sidecars: ").append(toIndentedString(sidecars)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

