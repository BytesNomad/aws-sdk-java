/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the build project's build output artifacts.
 * </p>
 */
public class ProjectArtifacts implements Serializable, Cloneable {

    /**
     * <p>
     * The build output artifact's type. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project with have build output generated through AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project will not produce any build output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project will store build output in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Information about the build output artifact location, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket. If <code>path</code> is
     * not also specified, then <code>location</code> can also specify the path of the output artifact in the output
     * bucket.
     * </p>
     * </li>
     * </ul>
     */
    private String location;
    /**
     * <p>
     * Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild will use to name and
     * store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If <code>path</code> is
     * not specified, then <code>path</code> will not be used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact would be
     * stored in the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     * </p>
     */
    private String path;
    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild will use to determine the name
     * and location to store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, then valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     * specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact
     * would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     */
    private String namespaceType;
    /**
     * <p>
     * Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild will use to name and
     * store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact
     * would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of build output artifact to create, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild will create in the output bucket a folder containing the build output. This is
     * the default if <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild will create in the output bucket a ZIP file containing the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String packaging;

    /**
     * <p>
     * The build output artifact's type. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project with have build output generated through AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project will not produce any build output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project will store build output in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The build output artifact's type. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The build project with have build output generated through AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_ARTIFACTS</code>: The build project will not produce any build output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The build project will store build output in Amazon Simple Storage Service (Amazon S3).
     *        </p>
     *        </li>
     * @see ArtifactsType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The build output artifact's type. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project with have build output generated through AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project will not produce any build output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project will store build output in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The build output artifact's type. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CODEPIPELINE</code>: The build project with have build output generated through AWS CodePipeline.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_ARTIFACTS</code>: The build project will not produce any build output.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code>: The build project will store build output in Amazon Simple Storage Service (Amazon S3).
     *         </p>
     *         </li>
     * @see ArtifactsType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The build output artifact's type. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project with have build output generated through AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project will not produce any build output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project will store build output in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The build output artifact's type. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The build project with have build output generated through AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_ARTIFACTS</code>: The build project will not produce any build output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The build project will store build output in Amazon Simple Storage Service (Amazon S3).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactsType
     */

    public ProjectArtifacts withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The build output artifact's type. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project with have build output generated through AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project will not produce any build output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project will store build output in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The build output artifact's type. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The build project with have build output generated through AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_ARTIFACTS</code>: The build project will not produce any build output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The build project will store build output in Amazon Simple Storage Service (Amazon S3).
     *        </p>
     *        </li>
     * @see ArtifactsType
     */

    public void setType(ArtifactsType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The build output artifact's type. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project with have build output generated through AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project will not produce any build output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project will store build output in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The build output artifact's type. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The build project with have build output generated through AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_ARTIFACTS</code>: The build project will not produce any build output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The build project will store build output in Amazon Simple Storage Service (Amazon S3).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactsType
     */

    public ProjectArtifacts withType(ArtifactsType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Information about the build output artifact location, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket. If <code>path</code> is
     * not also specified, then <code>location</code> can also specify the path of the output artifact in the output
     * bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the build output artifact location, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket. If
     *        <code>path</code> is not also specified, then <code>location</code> can also specify the path of the
     *        output artifact in the output bucket.
     *        </p>
     *        </li>
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the build output artifact location, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket. If <code>path</code> is
     * not also specified, then <code>location</code> can also specify the path of the output artifact in the output
     * bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the build output artifact location, as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *         specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *         because no build output will be produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket. If
     *         <code>path</code> is not also specified, then <code>location</code> can also specify the path of the
     *         output artifact in the output bucket.
     *         </p>
     *         </li>
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the build output artifact location, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket. If <code>path</code> is
     * not also specified, then <code>location</code> can also specify the path of the output artifact in the output
     * bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the build output artifact location, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket. If
     *        <code>path</code> is not also specified, then <code>location</code> can also specify the path of the
     *        output artifact in the output bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectArtifacts withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild will use to name and
     * store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If <code>path</code> is
     * not specified, then <code>path</code> will not be used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact would be
     * stored in the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     * </p>
     * 
     * @param path
     *        Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild will use to
     *        name and store the output artifact, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If
     *        <code>path</code> is not specified, then <code>path</code> will not be used.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact
     *        would be stored in the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild will use to name and
     * store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If <code>path</code> is
     * not specified, then <code>path</code> will not be used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact would be
     * stored in the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     * </p>
     * 
     * @return Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild will use to
     *         name and store the output artifact, as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *         specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *         because no build output will be produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If
     *         <code>path</code> is not specified, then <code>path</code> will not be used.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set
     *         to <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     *         artifact would be stored in the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild will use to name and
     * store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If <code>path</code> is
     * not specified, then <code>path</code> will not be used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact would be
     * stored in the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     * </p>
     * 
     * @param path
     *        Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild will use to
     *        name and store the output artifact, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If
     *        <code>path</code> is not specified, then <code>path</code> will not be used.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact
     *        would be stored in the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectArtifacts withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild will use to determine the name
     * and location to store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, then valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     * specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact
     * would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @param namespaceType
     *        Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild will use to determine
     *        the name and location to store the output artifact, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, then valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     *        specified.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     *        artifact would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * @see ArtifactNamespace
     */

    public void setNamespaceType(String namespaceType) {
        this.namespaceType = namespaceType;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild will use to determine the name
     * and location to store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, then valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     * specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact
     * would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @return Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild will use to determine
     *         the name and location to store the output artifact, as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *         specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *         because no build output will be produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, then valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     *         specified.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set
     *         to <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     *         artifact would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * @see ArtifactNamespace
     */

    public String getNamespaceType() {
        return this.namespaceType;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild will use to determine the name
     * and location to store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, then valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     * specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact
     * would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @param namespaceType
     *        Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild will use to determine
     *        the name and location to store the output artifact, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, then valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     *        specified.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     *        artifact would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactNamespace
     */

    public ProjectArtifacts withNamespaceType(String namespaceType) {
        setNamespaceType(namespaceType);
        return this;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild will use to determine the name
     * and location to store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, then valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     * specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact
     * would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @param namespaceType
     *        Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild will use to determine
     *        the name and location to store the output artifact, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, then valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     *        specified.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     *        artifact would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * @see ArtifactNamespace
     */

    public void setNamespaceType(ArtifactNamespace namespaceType) {
        this.namespaceType = namespaceType.toString();
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild will use to determine the name
     * and location to store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, then valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     * specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact
     * would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @param namespaceType
     *        Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild will use to determine
     *        the name and location to store the output artifact, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, then valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     *        specified.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     *        artifact would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactNamespace
     */

    public ProjectArtifacts withNamespaceType(ArtifactNamespace namespaceType) {
        setNamespaceType(namespaceType);
        return this;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild will use to name and
     * store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact
     * would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @param name
     *        Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild will use to
     *        name and store the output artifact, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     *        artifact would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild will use to name and
     * store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact
     * would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @return Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild will use to
     *         name and store the output artifact, as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *         specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *         because no build output will be produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set
     *         to <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     *         artifact would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild will use to name and
     * store the output artifact, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact
     * would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @param name
     *        Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild will use to
     *        name and store the output artifact, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     *        artifact would be stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectArtifacts withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of build output artifact to create, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild will create in the output bucket a folder containing the build output. This is
     * the default if <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild will create in the output bucket a ZIP file containing the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param packaging
     *        The type of build output artifact to create, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: AWS CodeBuild will create in the output bucket a folder containing the build output.
     *        This is the default if <code>packaging</code> is not specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZIP</code>: AWS CodeBuild will create in the output bucket a ZIP file containing the build output.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see ArtifactPackaging
     */

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    /**
     * <p>
     * The type of build output artifact to create, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild will create in the output bucket a folder containing the build output. This is
     * the default if <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild will create in the output bucket a ZIP file containing the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The type of build output artifact to create, as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *         specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *         because no build output will be produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: AWS CodeBuild will create in the output bucket a folder containing the build output.
     *         This is the default if <code>packaging</code> is not specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ZIP</code>: AWS CodeBuild will create in the output bucket a ZIP file containing the build output.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see ArtifactPackaging
     */

    public String getPackaging() {
        return this.packaging;
    }

    /**
     * <p>
     * The type of build output artifact to create, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild will create in the output bucket a folder containing the build output. This is
     * the default if <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild will create in the output bucket a ZIP file containing the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param packaging
     *        The type of build output artifact to create, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: AWS CodeBuild will create in the output bucket a folder containing the build output.
     *        This is the default if <code>packaging</code> is not specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZIP</code>: AWS CodeBuild will create in the output bucket a ZIP file containing the build output.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactPackaging
     */

    public ProjectArtifacts withPackaging(String packaging) {
        setPackaging(packaging);
        return this;
    }

    /**
     * <p>
     * The type of build output artifact to create, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild will create in the output bucket a folder containing the build output. This is
     * the default if <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild will create in the output bucket a ZIP file containing the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param packaging
     *        The type of build output artifact to create, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: AWS CodeBuild will create in the output bucket a folder containing the build output.
     *        This is the default if <code>packaging</code> is not specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZIP</code>: AWS CodeBuild will create in the output bucket a ZIP file containing the build output.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see ArtifactPackaging
     */

    public void setPackaging(ArtifactPackaging packaging) {
        this.packaging = packaging.toString();
    }

    /**
     * <p>
     * The type of build output artifact to create, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     * specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified, because
     * no build output will be produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild will create in the output bucket a folder containing the build output. This is
     * the default if <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild will create in the output bucket a ZIP file containing the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param packaging
     *        The type of build output artifact to create, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, then AWS CodePipeline will ignore this value if
     *        specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, then this value will be ignored if specified,
     *        because no build output will be produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: AWS CodeBuild will create in the output bucket a folder containing the build output.
     *        This is the default if <code>packaging</code> is not specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZIP</code>: AWS CodeBuild will create in the output bucket a ZIP file containing the build output.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactPackaging
     */

    public ProjectArtifacts withPackaging(ArtifactPackaging packaging) {
        setPackaging(packaging);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getNamespaceType() != null)
            sb.append("NamespaceType: ").append(getNamespaceType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPackaging() != null)
            sb.append("Packaging: ").append(getPackaging());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectArtifacts == false)
            return false;
        ProjectArtifacts other = (ProjectArtifacts) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getNamespaceType() == null ^ this.getNamespaceType() == null)
            return false;
        if (other.getNamespaceType() != null && other.getNamespaceType().equals(this.getNamespaceType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPackaging() == null ^ this.getPackaging() == null)
            return false;
        if (other.getPackaging() != null && other.getPackaging().equals(this.getPackaging()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getNamespaceType() == null) ? 0 : getNamespaceType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPackaging() == null) ? 0 : getPackaging().hashCode());
        return hashCode;
    }

    @Override
    public ProjectArtifacts clone() {
        try {
            return (ProjectArtifacts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
