package org.thoughtslive.jenkins.plugins.jira.api.input;

import java.io.Serializable;
import java.util.List;

import org.kohsuke.stapler.DataBoundConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(onConstructor = @__({@DataBoundConstructor}))
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class IssuesInput implements Serializable {

  private static final long serialVersionUID = 3299430745665528801L;

  @JsonProperty("issueUpdates")
  private List<IssueInput> issueUpdates;

  @JsonProperty("issues")
  private List<IssueInput> issues;
}
