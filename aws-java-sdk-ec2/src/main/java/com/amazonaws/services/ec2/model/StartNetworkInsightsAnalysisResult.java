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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartNetworkInsightsAnalysisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the network insights analysis.
     * </p>
     */
    private NetworkInsightsAnalysis networkInsightsAnalysis;

    /**
     * <p>
     * Information about the network insights analysis.
     * </p>
     * 
     * @param networkInsightsAnalysis
     *        Information about the network insights analysis.
     */

    public void setNetworkInsightsAnalysis(NetworkInsightsAnalysis networkInsightsAnalysis) {
        this.networkInsightsAnalysis = networkInsightsAnalysis;
    }

    /**
     * <p>
     * Information about the network insights analysis.
     * </p>
     * 
     * @return Information about the network insights analysis.
     */

    public NetworkInsightsAnalysis getNetworkInsightsAnalysis() {
        return this.networkInsightsAnalysis;
    }

    /**
     * <p>
     * Information about the network insights analysis.
     * </p>
     * 
     * @param networkInsightsAnalysis
     *        Information about the network insights analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNetworkInsightsAnalysisResult withNetworkInsightsAnalysis(NetworkInsightsAnalysis networkInsightsAnalysis) {
        setNetworkInsightsAnalysis(networkInsightsAnalysis);
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
        if (getNetworkInsightsAnalysis() != null)
            sb.append("NetworkInsightsAnalysis: ").append(getNetworkInsightsAnalysis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartNetworkInsightsAnalysisResult == false)
            return false;
        StartNetworkInsightsAnalysisResult other = (StartNetworkInsightsAnalysisResult) obj;
        if (other.getNetworkInsightsAnalysis() == null ^ this.getNetworkInsightsAnalysis() == null)
            return false;
        if (other.getNetworkInsightsAnalysis() != null && other.getNetworkInsightsAnalysis().equals(this.getNetworkInsightsAnalysis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInsightsAnalysis() == null) ? 0 : getNetworkInsightsAnalysis().hashCode());
        return hashCode;
    }

    @Override
    public StartNetworkInsightsAnalysisResult clone() {
        try {
            return (StartNetworkInsightsAnalysisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
