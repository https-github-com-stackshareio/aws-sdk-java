/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDataQualityJobDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataQualityJobDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data quality monitoring job definition to describe.
     * </p>
     */
    private String jobDefinitionName;

    /**
     * <p>
     * The name of the data quality monitoring job definition to describe.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the data quality monitoring job definition to describe.
     */

    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    /**
     * <p>
     * The name of the data quality monitoring job definition to describe.
     * </p>
     * 
     * @return The name of the data quality monitoring job definition to describe.
     */

    public String getJobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * <p>
     * The name of the data quality monitoring job definition to describe.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the data quality monitoring job definition to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataQualityJobDefinitionRequest withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobDefinitionName() != null)
            sb.append("JobDefinitionName: ").append(getJobDefinitionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDataQualityJobDefinitionRequest == false)
            return false;
        DescribeDataQualityJobDefinitionRequest other = (DescribeDataQualityJobDefinitionRequest) obj;
        if (other.getJobDefinitionName() == null ^ this.getJobDefinitionName() == null)
            return false;
        if (other.getJobDefinitionName() != null && other.getJobDefinitionName().equals(this.getJobDefinitionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobDefinitionName() == null) ? 0 : getJobDefinitionName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataQualityJobDefinitionRequest clone() {
        return (DescribeDataQualityJobDefinitionRequest) super.clone();
    }

}
