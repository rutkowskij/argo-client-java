

# GitArtifact

GitArtifact is the location of an git artifact
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depth** | **Long** | Depth specifies clones/fetches should be shallow and include the given number of commits from the branch tip |  [optional]
**fetch** | **List&lt;String&gt;** | Fetch specifies a number of refs that should be fetched before checkout |  [optional]
**insecureIgnoreHostKey** | **Boolean** | InsecureIgnoreHostKey disables SSH strict host key checking during git clone |  [optional]
**passwordSecret** | [**io.kubernetes.client.models.V1SecretKeySelector**](io.kubernetes.client.models.V1SecretKeySelector.md) |  |  [optional]
**repo** | **String** | Repo is the git repository | 
**revision** | **String** | Revision is the git commit, tag, branch to checkout |  [optional]
**sshPrivateKeySecret** | [**io.kubernetes.client.models.V1SecretKeySelector**](io.kubernetes.client.models.V1SecretKeySelector.md) |  |  [optional]
**usernameSecret** | [**io.kubernetes.client.models.V1SecretKeySelector**](io.kubernetes.client.models.V1SecretKeySelector.md) |  |  [optional]


