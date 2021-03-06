package co.elastic.code.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author poytr1
 */
public class ProjectInfo {
    /** Property Android */
    private Boolean android=false;

    /** Property androidSdkVersion */
    private String androidSdkVersion;

    private String path;

    private String name;

    private List<Repo> repos;

    private List<Dependency> dependencies;

    private List<String> srcDirs;

    private List<String> testSrcDirs;

    /**
     * Gets the isAndroid
     */
    public Boolean isAndroid() {
        return this.android;
    }

    /**
     * Sets the isAndroid
     */
    public void setAndroid(Boolean value) {
        this.android = value;
    }

    /**
     * Gets the androidSdkVersion
     */
    public String getAndroidSdkVersion() {
        return this.androidSdkVersion;
    }

    /**
     * Sets the androidSdkVersion
     */
    public void setAndroidSdkVersion(String value) {
        this.androidSdkVersion = value;
    }

    public void setRepos(List<Repo> repos) {
        this.repos = repos;
    }

    public List<Repo> getRepos() {
        return repos;
    }

    public void setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    public List<Dependency> getDependencies() {
        return dependencies;
    }

    public void setDefaultSrcDirs() {
        if (isAndroid()) {
            this.setSrcDirs(new ArrayList<>(
                    Arrays.asList("src/main/java",
                                  "build/generated/source/r/debug",
                                  "build/generated/source/buildConfig/debug",
                                  "build/generated/source/aidl/debug")));
        } else {
            this.setSrcDirs(Collections.singletonList("src/main/java"));
        }
    }

    public void setDefaultTestSrcDirs() {
        this.setTestSrcDirs(Collections.singletonList("src/test/java"));
    }

    public void setSrcDirs(List<String> srcDirs) {
        this.srcDirs = srcDirs;
    }

    public List<String> getSrcDirs() {
        return srcDirs;
    }

    public void setTestSrcDirs(List<String> testSrcDirs) {
        this.testSrcDirs = testSrcDirs;
    }

    public List<String> getTestSrcDirs() {
        return testSrcDirs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("android", android)
                .append("androidSdkVersion", androidSdkVersion)
                .append("repos", repos)
                .append("deps", dependencies)
                .append("path", path)
                .append("name", name)
                .append("srcDirs", srcDirs)
                .append("testSrcDirs", testSrcDirs)
                .toString();
    }
}
